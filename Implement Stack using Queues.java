Solution: 
Method 2 (By making pop operation costly)
In push operation, the new element is always enqueued to q1. In pop() operation, if q2 is empty then all the elements except the last, are moved to q2. Finally the last element is dequeued from q1 and returned.
class MyStack {
    // Push element x onto stack.
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    public void push(int x) {
        queue1.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
            while(queue1.size() > 1){
                int x = queue1.poll();
                queue2.offer(x);
            }
        queue1.poll();
        queue1 = queue2;
        queue2 = new LinkedList<Integer>();
    }

    // Get the top element.
    public int top() {
        while(queue1.size() > 1){
                int x = queue1.poll();
                queue2.offer(x);
            }
        int result = queue1.peek();
        queue2.offer(result);
        queue1 = queue2;
        queue2 = new LinkedList<Integer>();
        return result;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
