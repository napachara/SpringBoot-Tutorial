package tutorial.spring4.services;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tutorial.spring4.entities.User;
import tutorial.spring4.repositories.UserRepository;

@Service
public class BasicUserDetailService implements UserDetailsService {

	private static final Logger LOG = LoggerFactory.getLogger(BasicUserDetailService.class);

	@Resource(name="userRepository")
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LOG.debug("loadUserByUsername(String username<{}>)", username);
		User user = userRepository.findOne(username);

		org.springframework.security.core.userdetails.User userSpring = new org.springframework.security.core.userdetails.User(
				user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));

		return userSpring;
	}

}
