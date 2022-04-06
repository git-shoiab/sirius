package onetomany;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String street;
	private String city;
	
	@ManyToOne()
	@JoinColumn(name="student_sid")
	private Student student;
	
	@Override
	public int hashCode() {
		return Objects.hash(aid, city, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return aid == other.aid && Objects.equals(city, other.city) && Objects.equals(street, other.street)
				&& Objects.equals(student, other.student);
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
