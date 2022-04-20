package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="facl")
public class Faculty {
	@Id
	@Column(name="fid")
	private int id;
	
	@Column(name="fnmae")
	private String name;
	@Column
	private String course;
	@Column
	private float salary;
	@Version
	@Column
	private int ucl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getUcl() {
		return ucl;
	}
	public void setUcl(int ucl) {
		this.ucl = ucl;
	}
	
	
	

}
