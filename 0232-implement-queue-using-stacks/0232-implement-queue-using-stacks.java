class MyQueue {
    Stack<Integer> S1;
    Stack<Integer> S2;

    public MyQueue() {
        S1 = new Stack<>();
        S2 = new Stack<>();
    }

    public void push(int x) {
        S1.push(x);
    }

    void ShiftStack() {
        if (S2.isEmpty()) {
            while (!S1.isEmpty()) {
                S2.push(S1.pop());
            }
        }
    }

    int pop() {
        ShiftStack();
        return S2.pop();
    }

    int peek() {
        ShiftStack();
        return S2.peek();
    }

    boolean empty() {
        return S1.isEmpty() && S2.isEmpty();
    }
}