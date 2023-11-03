package org;

public class Car {
String brand;
int cost;
Car(String brand) { //acccept the brand
	this.brand = brand; //local variable dominates. to avoid we go for this keyword
}
Car(int cost, String brand) { //in brand Audi is stored
	this(brand);
	this.cost = cost;
	
}
public static void main(String args[])
{
	Car c = new Car(2000,"Mercedes");
	System.out.println("brand: "+c.brand);
	System.out.println("cost: "+c.cost);
	//object is created to store non static member
	//current object 
}

}
