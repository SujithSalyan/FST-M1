package activities;

public class Car {
	
String color;
String transmission;
int make;
int tyres;
int doors;

//Constructor 
Car()
{
tyres = 4;
doors = 4;
}

public void displayCharecteristics()
{
	System.out.println("Color of the Car:" +color);
	System.out.println("Transmission of the Car:" +transmission);
	System.out.println("Make of the Car:" +make);
	System.out.println("No of Tyres:" +tyres);
	System.out.println("No of Doors:" +doors);
}
public void accelarate()
{
	System.out.println("Car is moving forward");
	}
public void brake()
{
	System.out.println("Car has stopped");
	}

}




