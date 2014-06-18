/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 13:31
 */
public class BoxDemo03 {
	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		myBox1.width = 5;
		myBox1.height = 10;
		myBox1.depth = 15;

		myBox2.width = 10;
		myBox2.height = 12;
		myBox2.depth = 15;

		System.out.println("First box volume is: " + myBox1.volume());
		System.out.println("Second box volume is: " + myBox2.volume());
	}
}

class Box {
	int width;
	int height;
	int depth;

	int volume() {
		return width * height * depth;
	}
}