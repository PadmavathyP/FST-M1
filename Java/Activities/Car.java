package Activities;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){
     tyres=4;
     doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color of the car is:" +color);
		System.out.println("Transmission of the car is:" +transmission);
		System.out.println("Make of the car is:" +make);
		System.out.println("Number of Tyres in the car is:" +tyres);
		System.out.println("Number of Doors in the car is:" + doors);
		
		}
	public void accelerate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}
}

