/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 27.03.2014
 * Time: 13:28
 */
public class RecursionArray {
	int values[];

	RecursionArray(int i) {
		values = new int[i];
	}

	void printArray(int i) {
		if (i != 0) {
			printArray(i - 1);
			System.out.println("[" + (i - 1) + "]" + values[i - 1]);
		}
	}
}
