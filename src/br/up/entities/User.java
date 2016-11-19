package br.up.entities;

public class User {
	
	private int iduser;
	
	private String name;
	private String login;
	private String password;
	
	
	
	public int getId() {
		return iduser;
	}
	public void setId(int id) {
		this.iduser = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	

}
