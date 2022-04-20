package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name="b_id")
public class cheque extends Bank {
	@Column(name="cheque_no")
	private int chequeno;
	@Column
	private int amount;
	public int getChequeno() {
		return chequeno;
	}
	public void setChequeno(int chequeno) {
		this.chequeno = chequeno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
