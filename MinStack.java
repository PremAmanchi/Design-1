// Time Complexity : o(1)
// Space Complexity :o(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO
class MinStack {
    Stack<Integer> s;
    int min;

    public MinStack() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val <= min) {
            s.push(min);
            min = val;
        }
        s.push(val);
    }

    public void pop() {
        int val = s.peek();
        if (val <= min) {
            s.pop();
            min = s.peek();
        }
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */