/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 12:48
 */
public class BoxDemo01 {
	public static void main(String[] args) {
//  Creating new instances
		Box myBox1 = new Box();
		Box myBox2 = new Box();

//  Initializing dimensions
		myBox1.width = 10;
		myBox1.height = 20;
		myBox1.depth = 30;

		myBox2.width = 10;
		myBox2.height = 15;
		myBox2.depth = 12;

		System.out.println("First box volume is: " + myBox1.width * myBox1.height * myBox1.depth);
		System.out.println("Second box volume is: " + myBox2.width * myBox2.height * myBox2.depth);
	}
}

class Box {
	int width;
	int height;
	int depth;
}
