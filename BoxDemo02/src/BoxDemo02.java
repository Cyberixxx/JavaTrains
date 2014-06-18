/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 13:25
 */
public class BoxDemo02 {
	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		myBox1.width = 5;
		myBox1.height = 10;
		myBox1.depth = 15;

		myBox2.width = 10;
		myBox2.height = 15;
		myBox2.depth = 20;

		myBox1.volume();
		myBox2.volume();
	}
}

class Box {
	int width;
	int height;
	int depth;

	int volume;

	void volume() {
		volume = width * height * depth;
		System.out.println("The volume is: " + volume);
	}
}
