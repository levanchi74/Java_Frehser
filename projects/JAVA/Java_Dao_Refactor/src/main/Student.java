package main;

public class Student {

	private int id;
	private String name;
	
	Student(){};
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
