package Main;


import java.time.Period;
import java.util.UUID;

public class House implements Comparable<House>{

private final UUID id;
private String name;
private int nRooms;
private int nBeds;
private final int floor;
private double price;
private Period availability;

public House(UUID id,String name,int nRooms,int nBeds,int floor) {
	       this.id=id;
	       this.name=name;
	       this.nRooms=nRooms;
	       this.nBeds=nBeds;
	       this.floor = floor;
}

public House(String name, int nRooms, int nBeds, int floor, double price){
	id = UUID.randomUUID();
	this.name=name;
	this.nRooms=nRooms;
	this.nBeds=nBeds;
	this.floor = floor;
	setPrice(price);
}

public House(String name, int nRooms, int nBeds, int floor){
	id = UUID.randomUUID();
	this.name=name;
	this.nRooms=nRooms;
	this.nBeds=nBeds;
	this.floor = floor;
}

public House(String name, int nRooms, int nBeds, int floor, Period availability){
	id = UUID.randomUUID();
	this.name=name;
	this.nRooms=nRooms;
	this.nBeds=nBeds;
	this.floor = floor;
	setAvailability(availability);
}

public House(String name, int nRooms, int nBeds, int floor, double price, Period availability){
	id = UUID.randomUUID();
	this.name=name;
	this.nRooms=nRooms;
	this.nBeds=nBeds;
	this.floor = floor;
	setPrice(price);
	setAvailability(availability);
}

public UUID getId() {
	  return id;
}

public String getName() {
	  return name;
}

public int getNrooms() {
	   return nRooms;
}

public int getNbeds() {
	  return nBeds;
}

public int getFloor() {
	  return floor;
}
	
//Getter and Setter
public double getPrice() {
	return price;
}

//Getter and Setter	
public Period getAvailability() {
	return availability;
}

public void setPrice(double price) {
	this.price=price;
}

public void setAvailability(Period availability) {
	this.availability=availability;
	return;
}


	@Override
	public int compareTo(House o) {
		return this.id.compareTo(o.id);
	}
}
