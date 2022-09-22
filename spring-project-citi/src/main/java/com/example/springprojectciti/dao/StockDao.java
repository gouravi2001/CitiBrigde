package com.example.springprojectciti.dao;

import java.math.BigDecimal;
import java.util.Comparator;



public class StockDao implements Comparator<StockDao>{
	private String name;
	private BigDecimal price;
	private BigDecimal change;
	private String currency;
	private BigDecimal dividend2week;
	private BigDecimal changeper;
	private double volume2week;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getChange() {
		return change;
	}
	public void setChange(BigDecimal change) {
		this.change = change;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public BigDecimal getChangeper() {
		return changeper;
	}
	public void setChangeper(BigDecimal changeper) {
		this.changeper = changeper;
	}
	
	public double getVolume2week() {
		return volume2week;
	}
	public void setVolume2week(double volume2week) {
		this.volume2week = volume2week;
	}
	
	public BigDecimal getDividend2week() {
		return dividend2week;
	}
	public void setDividend2week(BigDecimal dividend2week) {
		this.dividend2week = dividend2week;
	}
	public StockDao(String name, BigDecimal price, BigDecimal change, String currency, BigDecimal dividend2week,
			BigDecimal changeper, double volume2week) {
		super();
		this.name = name;
		this.price = price;
		this.change = change;
		this.currency = currency;
		this.dividend2week = dividend2week;
		this.changeper = changeper;
		this.volume2week = volume2week;
	}
	public StockDao() {
		
	}
	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + ", change=" + change + ", currency=" + currency
				+ ", Dividend of 2 week=" + dividend2week + ", changeper=" + changeper + ", Volume of 2 weeks=" + volume2week;
	}
	
	
	
	
	@Override
	public int compare(StockDao o1, StockDao o2) {
		// TODO Auto-generated method stub
		if(o1.getDividend2week().compareTo(o2.getDividend2week())==-1) {
			return 1;
		}
		else if(o1.getDividend2week().compareTo(o2.getDividend2week())==1) {
			return -1;
		}
		return 0;
	}
}
