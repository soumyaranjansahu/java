package spring;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
private int id; 
private String name; 
private Address address12;

@Autowired
public Employee(int id, String name, Address address12) {   
    this.id = id; 
    this.name = name; 
    this.address12 = address12; 
} 
 
void show(){ 
    System.out.println(id+" "+name); 
    System.out.println(address12); 
}  
}