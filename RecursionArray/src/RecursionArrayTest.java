/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 27.03.2014
 * Time: 13:28
 */
public class RecursionArrayTest {
	public static void main(String[] args) {
		RecursionArray rArray = new RecursionArray(10);

		for (int i = 0; i < 10; i++) {
			rArray.values[i] = i;
		}

		rArray.printArray(10);
	}
}
