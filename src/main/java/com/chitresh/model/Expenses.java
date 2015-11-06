package com.chitresh.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXPENSES")
public class Expenses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "expense_id")
	private Long id;
	@Column(name = "expense_date", nullable = false, unique = true)
	private Date date;
	@Column(name = "expense_amount", nullable = false)
	private Double amount;
	@Column(name = "expense_reason", nullable = false)
	private String reason;
	@Column(name = "expense_vat", nullable = false)
	private Double vat;

	public Expenses() {
	}

	public Expenses(Long id, Date date, Double amount, String reason,Double vat) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.reason = reason;
		this.vat = vat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Double getVat() {
		return vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}
	
	

	

}
