package com.valtech.tx.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class TransferTx extends Tx {
private long transactionId; 

public long getTransactionId() {
	return transactionId;
}

public void setTransactionId(long transactionId) {
	this.transactionId = transactionId;
}
private String teller;
private String branch;


public TransferTx(String teller, String branch) {
	super();
	this.teller = teller;
	this.branch = branch;
}



public String getTeller() {
	return teller;
}
public void setTeller(String teller) {
	this.teller = teller;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "TransferTx [teller=" + teller + ", branch=" + branch + "]";
}





}
