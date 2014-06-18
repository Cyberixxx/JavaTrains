/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 14:40
 */
public class Overload {
	void test() {
		System.out.println(">> WARNING! Without parameters!");
	}

	void test(int a) {
		System.out.println(">> Single integer a: " + a);
	}

	void test(int a, int b) {
		System.out.println(">> Double integers: a: " + a + "; b: " + b);
	}

	void test(double a) {
		System.out.println(">> Upscaling to double: a: " + a);
	}
}
