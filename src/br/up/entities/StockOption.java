package br.up.entities;

public class StockOption {
	
	private int id;
	private String company;
	private String ticker_simbol;
	private int quantity;
	private Double value;
	
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTicker_simbol() {
		return ticker_simbol;
	}

	public void setTicker_simbol(String ticket_simbol) {
		this.ticker_simbol = ticket_simbol;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
