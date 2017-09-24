import java.util.Stack;

public class MinStack {
    public void minStack() {
    }


    Stack<Integer> stack1;
    Stack<Integer> stack2;


    public void push(int number) {
        stack1.push(number);
        if (stack2.isEmpty())
            stack2.push(number);
        else
            stack2.push(Math.min(number, stack2.peek()));
    }

    public int pop() {
        stack2.pop();
        return stack1.pop();
    }

    public int min() {
        return stack2.peek();
    }
}
