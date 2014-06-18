/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 13:57
 */
public class BoxDemo05 {
	public static void main(String[] args) {
		Box myBox1 = new Box(10, 15, 20);
		Box myBox2 = new Box(11, 12, 13);

		Box myCube = new Box(12);

		Box myEmptyBox = new Box();

		Box myPBox = new Box(10, 20);

		Box myObjectBox = new Box(myBox1);

		System.out.println("myBox1: width: "
				+ myBox1.width + "; height: "
				+ myBox1.height + "; depth: "
				+ myBox1.depth + "; volume is: "
				+ myBox1.volume());
		System.out.println("myBox2: width: "
				+ myBox2.width + "; height: "
				+ myBox2.height + "; depth: "
				+ myBox2.depth + "; volume is: "
				+ myBox2.volume());

		System.out.println("myCube: width: "
				+ myCube.width + "; height: "
				+ myCube.height + "; depth: "
				+ myCube.depth + "; volume is: "
				+ myCube.volume());

		System.out.println("myEmptyBox: width: "
				+ myEmptyBox.width + "; height: "
				+ myEmptyBox.height + "; depth: "
				+ myEmptyBox.depth + "; volume is: "
				+ myEmptyBox.volume());

		System.out.println("myPBox: width: "
				+ myPBox.width + "; height: "
				+ myPBox.height + "; depth: "
				+ myPBox.depth + "; volume is: "
				+ myPBox.volume());

		System.out.println("myObjectBox: width: "
				+ myObjectBox.width + "; height: "
				+ myObjectBox.height + "; depth: "
				+ myObjectBox.depth + "; volume is: "
				+ myObjectBox.volume());
	}
}

class Box {
	int width;
	int height;
	int depth;

	//  Non-initialized box with zero dimensions
	Box() {
		width = 0;
		height = 0;
		depth = 0;
	}

	//	Cube
	Box(int side) {
		width = height = depth = side;
	}

	//	Parallelepiped
	Box(int side, int depth) {
		width = height = side;
		this.depth = depth;
	}

	//	Custom box
	Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box(Box object) {
		width = object.width;
		height = object.height;
		depth = object.depth;
	}

	int volume() {
		return width * height * depth;
	}
}
