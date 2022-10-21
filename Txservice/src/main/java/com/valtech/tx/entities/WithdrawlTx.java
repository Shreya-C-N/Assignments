package com.valtech.tx.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class WithdrawlTx extends Tx{
	private int atm;
	private String location;
	
	
	
	public WithdrawlTx() {
		super();
		// TODO Auto-generated constructor stub
	}



	public WithdrawlTx(float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}



	public WithdrawlTx(int atm, String location) {
		super();
		this.atm = atm;
		this.location = location;
	}



	public int getAtm() {
		return atm;
	}



	public void setAtm(int atm) {
		this.atm = atm;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	@Override
	public String toString() {
		return "WithdrawlTx [atm=" + atm + ", location=" + location + "]";
	}
	
	
}
