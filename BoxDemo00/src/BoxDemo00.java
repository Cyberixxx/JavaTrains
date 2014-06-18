/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 11:44
 */
public class BoxDemo00 {
	public static void main(String[] args) {
		Box myBox = new Box();
		int volume;

		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 30;

		volume = myBox.width * myBox.height * myBox.depth;
		System.out.println("The volume of box with dimensions: width: " + myBox.width + "; height: " + myBox.height + "; depth: " + myBox.depth + "; is: " + volume);
	}
}

class Box {
	int width;
	int height;
	int depth;
}
