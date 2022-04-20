package hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="instud")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="i_id")),
	@AttributeOverride(name="iname",column=@Column(name="i_name"))
	
})
public class Student1 extends institute {
	@Column
	private int fee;
	@Column
	private String sname;
	@Column
	private String course;
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	

}
