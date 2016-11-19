package br.up.entities;

public class StockOption {
	
	private int id;
	private String company;
	private String ticket_simbol;
	private int quantity;
	private Double value;
	
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTicket_simbol() {
		return ticket_simbol;
	}

	public void setTicket_simbol(String ticket_simbol) {
		this.ticket_simbol = ticket_simbol;
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
