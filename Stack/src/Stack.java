/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 25.03.2014
 * Time: 18:21
 */
public class Stack {
	int stack[] = new int[10];
	int tos;

	Stack() {
		tos = -1;
	}

	int push(int item) {
		if (tos == stack.length - 1) {
			System.out.println("Stack is full");
			return stack.length - 1;
		} else {
			stack[++tos] = item;
		}
		return stack[tos];
	}

	int pop() {
		if (tos < 0) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			return stack[tos--];
		}
	}
}
