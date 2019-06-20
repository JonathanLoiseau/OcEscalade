package org.oc.escalade.modele;

public class Utilisateur {
	private String firstname;
	private String name;
	private String username;
	private String password;
	private String birthPlace;
	private String sex;
	private String birthDate;
	private int id;
	
	public Utilisateur() {
		
	}
	
	public Utilisateur (String name, String firstname, String username,String password) {
		
		this.firstname = firstname;
		this.name = name;
		this.username=username;
		this.password = password;
	}
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public synchronized String getBirthPlace() {
		return birthPlace;
	}

	public synchronized void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public synchronized String getSex() {
		return sex;
	}

	public synchronized void setSex(String sex) {
		this.sex = sex;
	}

	public synchronized String getBirthDate() {
		return birthDate;
	}

	public synchronized void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Utilisateur [firstname=" + firstname + ", name=" + name + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
	
	
}



