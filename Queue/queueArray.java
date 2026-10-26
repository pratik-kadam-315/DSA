public class queueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public queueArray(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = value;
            size++;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int value=arr[front];
        front=(front+1)%capacity;
        size--;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public int getSize(){
        return size;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)%capacity]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queueArray queue = new queueArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.getSize());
    }
}