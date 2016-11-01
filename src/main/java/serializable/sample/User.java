package serializable.sample;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class User implements Serializable {

	private static final long serialVersionUID = 8276648076669784264L;

	private Integer id;
	private String name;
	private Integer age;
	private String address;
	private Date createdAt;

	public User() {
	}

	public User(Integer id, String name, Integer age, String address, Date createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}