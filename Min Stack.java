Solution : use two stack, one main stack and another stack is used to store the min value, make sure the elemnets in the min stack is decreasing
class MinStack {
    Stack<Integer> main = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public void push(int x) {
        main.push(x);
        if(min.empty() || x <= min.peek()){min.push(x);}
    }

    public void pop() {
        if(main.peek().equals(min.peek())){min.pop();}
        main.pop();
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
