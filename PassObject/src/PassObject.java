/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 27.03.2014
 * Time: 12:08
 */
public class PassObject {
	public static void main(String[] args) {
		Tester object1 = new Tester(100, 22);
		Tester object2 = new Tester(100, 22);
		Tester object3 = new Tester(10, 20);

		System.out.println("Object1: a: " + object1.a + " b: " + object1.b);
		System.out.println("Object2: a: " + object2.a + " b: " + object2.b);
		System.out.println("Object3: a: " + object3.a + " b: " + object3.b);

		System.out.println("Object1 is equal to Object2: " + object1.isEqual(object2));
		System.out.println("Object1 is equal to Object3: " + object1.isEqual(object3));
		System.out.println("Object2 is equal to Object3: " + object2.isEqual(object3));
	}
}

class Tester {
	int a, b;

	Tester(int i, int j) {
		a = i;
		b = j;
	}

	boolean isEqual(Tester object) {
		return object.a == a && object.b == b;
	}
}