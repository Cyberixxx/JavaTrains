/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 18:21
 */
public class StackTest {
	public static void main(String[] args) {
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();

		System.out.println("Pushing");
		System.out.println("Pushing to First stack");
		for (int i = 0; i < 10; i++) {
			System.out.println(myStack1.push(i));
		}
		System.out.println("");
		System.out.println("Pushing to Second stack");
		for (int i = 10; i < 20; i++) {
			System.out.println(myStack2.push(i));
		}

		System.out.println("");
		System.out.println("Poping");
		System.out.println("Poping from First stack");
		for (int i = 0; i < 10; i++) {
			System.out.println(myStack1.pop());
		}
		System.out.println("");
		System.out.println("Poping from Second stack");
		for (int i = 0; i < 10; i++) {
			System.out.println(myStack2.pop());
		}

	}
}
