
package com.ProducerGroceryPOS.Entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Transactional
public class ProducerGrocery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
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

	public long getNumOfProducts() {
		return numOfProducts;
	}

	public void setNumOfProducts(long numOfProducts) {
		this.numOfProducts = numOfProducts;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhnum() {
		return phnum;
	}

	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}

	public long getPurchasecount() {
		return purchasecount;
	}

	public void setPurchasecount(long purchasecount) {
		this.purchasecount = purchasecount;
	}

	public long getDiscount() {
		return Discount;
	}

	public void setDiscount(long discount) {
		Discount = discount;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column
	private String name;
	
	@Column(nullable=false)
	private long numOfProducts;
	
	@Column(unique=true)
	private String email;
	
	@Column(unique=true,nullable=false)
	private long phnum;
	
	@Column
	private long purchasecount;
	
	@Column
	private long Discount;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
    private Date timestamp;
	
	@PrePersist
	private void onCreate() {
	    timestamp = new Date();
	}

}
