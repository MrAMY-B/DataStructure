package ds.queue;

public class Queue {
	
	int q[];
	int front;
	int rear;
	int size;
	
	public Queue(int size) {
		this.size=size;
		front=0;
		rear=-1;
		q=new int[size];
	}
	
	public void enqueue(int data) {
		System.out.println("Enqueue:"+data);
		q[++rear]=data;
	}
	
	public int dequeue() {
		System.out.println("Dequeue:"+q[front]);
		return q[front++];
	}
	
	public boolean isEmpty() {
		if(front>rear)
			return true;
		else 
			return false;
	}
	
	public boolean isFull() {
		if(rear==size-1)
			return true;
		else
			return false;
	}
	public int getFront() {
		return q[front];
	}
	public int getRear() {
		return q[rear];
	}
	
	public void printQueue() {
		System.out.println("-----------------\nQUEUE:");
		for (int i = front; i <= rear; i++) 
			System.out.print(q[i]+",");
		System.out.println("\n-----------------");
	}

}


















