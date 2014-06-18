/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 27.03.2014
 * Time: 11:53
 */
public class CallByValue {
	public static void main(String[] args) {
		Item object = new Item();
		int a = 15;
		int b = 20;

		System.out.println("before calling method: a: " + a + " b: " + b);
		object.method(a, b);
		System.out.println("after calling method: a: " + a + " b: " + b);
	}
}

class Item {
	void method(int i, int j) {
		i *= 2;
		j /= 2;
		System.out.println("in method: a: " + i + " b: " + j);
	}
}