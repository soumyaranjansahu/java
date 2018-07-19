package spring;

public class Address {
private String city;
private String state;
private String country;
public Address(){}
public Address(String city,String state,String country){
	System.out.println("Address constructor");
	this.city=city;
	this.state=state;
	this.country=country;
}
public String toString(){
	return city+" "+state+" "+country;
	
}
}
