package tutorial.spring4.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PUBLISHER")
public class Publisher implements Serializable {

	@Id
	@Column(name = "PUBLISHER_CODE")
	private String publisherCode;

	@Column(name = "PUBLISHER_NAME")
	private String publisherName;

	@Column(name = "CITY")
	private String city;

	public String getPublisherCode() {
		return publisherCode;
	}

	public void setPublisherCode(String publisherCode) {
		this.publisherCode = publisherCode;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
