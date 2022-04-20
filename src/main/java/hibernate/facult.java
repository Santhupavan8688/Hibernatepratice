package hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="infac")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="i_id")),
	@AttributeOverride(name="iname",column=@Column(name="i_name"))
	
})
public class facult extends institute {
	@Column
	private String fname;
	@Column
	private String exp;
	@Column
	private int salary;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
