/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 27.03.2014
 * Time: 11:38
 */
public class ReturnNewObject {
	public static void main(String[] args) {
		Modifier object1 = new Modifier(10);
		Modifier object2 = object1;

		System.out.println("original object1: " + object1.a);
		System.out.println("original object2: " + object2.a);

		object2 = object2.incrementByTen();

		System.out.println("original object1: " + object1.a);
		System.out.println("incrementByTen object2: " + object2.a);

		object2 = object2.multiplyByTen();

		System.out.println("original object1: " + object1.a);
		System.out.println("multiplyByTen object2: " + object2.a);
	}
}

class Modifier {
	int a;

	Modifier(int i) {
		a = i;
	}

	Modifier incrementByTen() {
		Modifier result;
		result = new Modifier(a + 10);
		return result;
	}

	Modifier multiplyByTen() {
		Modifier result;
		result = new Modifier(a * 10);
		return result;
	}
}