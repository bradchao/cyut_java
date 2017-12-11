package tw.edu.cyut.myjava;

public class Cyut01 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		System.out.println(b1.getSpeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		System.out.println(b1.getSpeed());
		b1.downSpeed();
		System.out.println(b1.getSpeed());
		//b1.speed = 100;
		System.out.println(b1.getSpeed());
		
		
	}

}

class Bike {
	private double speed;
	
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

