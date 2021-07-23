package ds.priority_queue;

public class PriorityQueue {
	
	int front;
	int rear;
	int size;
	int pq[];
	
	public PriorityQueue(int size) {
		this.size=size;
		this.front=0;
		this.rear=-1;
		pq=new int[size];
	}
	
	
	public void enqueue(int data) {
		pq[++rear]=data;
		
		
		//FOR ASSENDING ORDER/PRIORITY
		for (int i = front; i < rear; i++) //Bubble Sort
			for (int j =i+1; j <= rear; j++) 
				if(pq[i]>pq[j]) {
					int temp = pq[i];
					pq[i]=pq[j];
					pq[j]=temp;
					
				}
		//FOR DECENDING ORDER/PRIORITY
//		for (int i = front; i < rear; i++) //Bubble Sort
//			for (int j =i+1; j <= rear; j++) 
//				if(pq[i]>pq[j]) {
//					int temp = pq[i];
//					pq[i]=pq[j];
//					pq[j]=temp;
//					
//				}
	}
	
	public int dequeue() {
		return pq[front--];
	}
	
	public boolean isFull() {
		if(front==size-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(front==rear)
			return true;
		else
			return false;
	}
	
	public int getFront() {
		return pq[front];
	}
	
	public int getRear() {
		return pq[rear];
	}
	
	public void printPriorityQueue() {
		System.out.println("--------------------------\nP-QUEUE:");
		for (int i = front; i <= rear; i++) {
			System.out.print(pq[i]+",");
		}
		System.out.println("\n--------------------------");
	}
	
	
	
	
}









