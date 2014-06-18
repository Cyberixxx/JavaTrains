/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 27.03.2014
 * Time: 14:49
 */
public class AccessTest {
	public static void main(String[] args) {
		Access object1 = new Access();
		Access object2 = new Access();
		Access object3 = new Access();

		object1.a = 10;
		object2.b = 20;
		object3.setC(30);

		System.out.println("Object1 default a: " + object1.a);
		System.out.println("Object2 public b: " + object2.b);
		System.out.println("Object3 private c: " + object3.getC());
	}
}
