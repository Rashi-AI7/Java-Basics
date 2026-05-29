//To calculate minimum element in stack

class SpecialStack {
    class ele{
        int val;
        int min;
        
        ele(int val, int min){
          this.val = val;
          this.min = min;
        }
    }
    Stack <ele> st;
    public SpecialStack() {
        // Define Stack
        st = new Stack<>();
    }
    
    
    public void push(int x) {
        if(st.isEmpty()){
            st.push(new ele(x, x));
        }else{
            int currMin = Math.min(st.peek().min, x);
        st.push(new ele(x, currMin));
        }
        
    }

    public void pop() {
        st.pop();
    }

    public int peek() {
        if(st.isEmpty()) return -1;
        return st.peek().val;
    }

    boolean isEmpty() {
        
        return st.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(st.isEmpty()) return -1;
        return st.peek().min;
    }
}
