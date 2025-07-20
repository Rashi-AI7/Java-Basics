public class QueueC {
    static class Queue{
        int arr[];
        int size;
        int rear = -1;
        int front= -1;

        Queue(int size){
            this.size = size;
            arr = new int [size];
            rear = -1;
            front= -1;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Overflow");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int res = arr[front];
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1)%size;
            }
            return res;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];

        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(14);
        q.add(21);
        q.add(34);
        q.add(67);
        System.out.println(q.remove());
        q.add(7);
        System.out.println(q.peek());
        
    }
}
