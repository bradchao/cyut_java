package tw.edu.cyut.myjava;

public class Cyut03 {

	public static void main(String[] args) {
		TWId id1 = TWId.createTWIdByString("A123456789");
		if (id1 != null) {
			System.out.println(id1.getId());
		}else {
			System.out.println("xxxxx");
		}
	}

}
