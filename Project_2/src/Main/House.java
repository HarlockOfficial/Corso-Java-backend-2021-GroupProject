package Main;


import java.time.Period;
import java.util.UUID;

public class House {

private UUID id;
private String name;
private int nRooms;
private int nBeds;
private int nFloors;
private double price;
private Period availability;

public House(UUID id,String name,int nRooms,int nBeds,int nFloors) {
	       this.id=id;
	       this.name=name;
	       this.nRooms=nRooms;
	       this.nBeds=nBeds;
	       this.nFloors=nFloors;
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

public int getnFloors() {
	  return nFloors;
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



}
