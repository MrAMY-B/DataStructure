package ds.circuler_queue;

public class CirculerQueue {
	
	int cq[];
	int front;
	int rear;
	int size;
	int count;
	
	public CirculerQueue(int size) {
		this.size=size;
		this.front=0;
		this.rear=-1;
		this.count=0;
		cq=new int[size];
	}
	
	public void enqueue(int data) {
		this.count++;
		rear=(rear+1)%size;
		cq[rear]=data;
	}
	
	public int dequeue() {
		this.count--;
		int data = cq[front];
		front=(front+1)%size;
		return data;
	}
	
	public boolean isEmpty() {
		if(count==0)
			return true;
		else 
			return false;
	}
	
	public int getFront() {
		return cq[front];
	}
	
	public int getRear() {
		return cq[rear];
	}
	
	public boolean ifFull() {
		if(count==size)
			return true;
		else 
			return false;
	}
	
	public void printCirculerQueue() {
		System.out.println("----------------------------\nCirculerQueue");
		int c=0;
		int i=front;
		while(c<count) {
			System.out.print(cq[i]+", ");
			i=(i+1)%size;
			c++;
		}
		System.out.println("\n----------------------------");
	}

}
