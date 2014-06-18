/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 14:40
 */
public class OverloadTest {
	public static void main(String[] args) {
		Overload object1 = new Overload();
		System.out.print("Calling object1.test(): ");
		object1.test();
		Overload object2 = new Overload();
		System.out.print("Calling object2.test(1): ");
		object2.test(1);
		Overload object3 = new Overload();
		System.out.print("Calling object3.test(10, 20): ");
		object3.test(10, 20);
		Overload object4 = new Overload();
		System.out.print("Calling object4.test(10.00): ");
		object4.test(10.00);
	}
}
