package tw.edu.cyut.myjava;

public class Cyut01 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		System.out.println(b1.getSpeed());
		Bike b2 = new Bike(12);
		System.out.println(b2.getSpeed());
		
		
	}

}

class Bike extends Object{
	private double speed;
	
	Bike(){
	}
	Bike(double speed){
		this.speed = speed;
	}
	
	void upSpeed() {
		speed = (speed<1)?1:speed*1.2;
	}
	
	void downSpeed() {
		speed = (speed<1)?0:speed*0.7;
	}
	
	double getSpeed() {
		return speed;
	}
	
}

