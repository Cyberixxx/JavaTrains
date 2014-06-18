/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 13:45
 */
public class BoxDemo04 {
	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		myBox1.setDimensions(10, 12, 15);
		myBox2.setDimensions(11, 12, 13);

		System.out.println("First volume is: " + myBox1.volume());
		System.out.println("Second volume is: " + myBox2.volume());
	}
}

class Box {
	int width;
	int height;
	int depth;

	int volume() {
		return width * height * depth;
	}

	void setDimensions(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}