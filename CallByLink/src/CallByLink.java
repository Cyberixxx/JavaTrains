/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 27.03.2014
 * Time: 12:03
 */
public class CallByLink {
	public static void main(String[] args) {
		Item object = new Item(15, 20);

		System.out.println("before calling method: a: " + object.a + " b: " + object.b);
		object.method(object);
		System.out.println("after calling method: a: " + object.a + " b: " + object.b);
	}
}

class Item {
	int a, b;

	Item(int i, int j) {
		a = i;
		b = j;
	}

	void method(Item object) {
		object.a *= 2;
		object.b /= 2;
	}
}
