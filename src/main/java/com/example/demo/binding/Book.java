package com.example.demo.binding;

 
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Book {
private Integer id;
private String Name;
private double price;
public synchronized Integer getId() {
	return id;
}
public synchronized void setId(Integer id) {
	this.id = id;
}
public synchronized String getName() {
	return Name;
}
public synchronized void setName(String name) {
	Name = name;
}
public synchronized double getPrice() {
	return price;
}
public synchronized void setPrice(double price) {
	this.price = price;
}
}
