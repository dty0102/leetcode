Solution: use two stack to accomplish the queue
class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!stack2.isEmpty()){stack2.pop();}
        else {
        while(!stack1.isEmpty()){
            int cur = stack1.pop();
            stack2.push(cur);
        }
        stack2.pop();
    }
    }

    // Get the front element.
    public int peek() {
        if (!stack2.isEmpty()){return stack2.peek();}
        else {
        while(!stack1.isEmpty()){
            int cur = stack1.pop();
            stack2.push(cur);
        }
        return stack2.peek();
    }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
