package hibersirius2022;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@NamedQuery(name="myquery1", query = "from Employee")
@NamedQueries({
		@NamedQuery (name = "myquery2", query="from Employee e where e.eid=2"),
		@NamedQuery (name = "myquery3", query="from Employee e where e.eid=?"),
		@NamedQuery (name = "myquery4", query="from Employee e where e.eid=:eid"),
		@NamedQuery (name = "myquery5", query="select e.ename from Employee e where e.eid=:eid"),
		@NamedQuery (name = "myquery6", query="select e.ename,e.esal from Employee e where e.eid=:eid"),
		}
		)
@Entity//(name = "emp")
@Table(name = "MYEMPLOYEE")
public class Employee implements Comparable<Employee>,Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	@Column(name="empname",length = 100)
	private String ename;
	private String epass;
	
	public Employee() {
		System.out.println("emp object called...."+this.hashCode());
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.ename.compareTo(o.ename);
	}
	public String getEname() {
		return ename;
	}

	public  void setEname(String ename) {
		this.ename = ename;
	}

	public String getEpass() {
		return epass;
	}

	public  void setEpass(String epass) {
		this.epass = epass;
	}

	public  float getEsal() {
		return esal;
	}

	public  void setEsal(float esal) {
		this.esal = esal;
	}

	private float esal;

	public final int getEid() {
		return eid;
	}

	public  void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", epass=" + epass + ", esal=" + esal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(eid, ename, epass, esal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename) && Objects.equals(epass, other.epass)
				&& Float.floatToIntBits(esal) == Float.floatToIntBits(other.esal);
	}
	
}
