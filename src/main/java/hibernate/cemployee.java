package hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cemp")
public class cemployee extends Employee1{
	@Column
	private int salary;
	@Column
	private String cperiod;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCperiod() {
		return cperiod;
	}
	public void setCperiod(String cperiod) {
		this.cperiod = cperiod;
	}
	

}
