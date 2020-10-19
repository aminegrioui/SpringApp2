package org.javaBrian.programming;

public class Personn {

	private Adresse adresse;
	private Adresse adresse2;
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Adresse getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(Adresse adresse2) {
		this.adresse2 = adresse2;
	}

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void describ() {
		System.out.println("His name is : "+this.name + " age is "+this.age);
		System.out.println(" Adresse 1 "+ adresse.getSteet() + " "+ adresse.getNummer());
		System.out.println(" Adresse 2 "+ adresse2.getSteet() + " "+ adresse2.getNummer());
	}
}
