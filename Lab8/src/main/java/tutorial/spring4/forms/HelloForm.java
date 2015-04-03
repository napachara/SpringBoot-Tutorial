package tutorial.spring4.forms;

import java.io.Serializable;

public class HelloForm implements Serializable {

	private String say;
	private String name;
	
	public String getSay() {
		return say;
	}
	public void setSay(String say) {
		this.say = say;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
