package ds.stack;

public class Stack {
	
	int s[];
	int tos;
	int size;
	
	public Stack(int size) {
		this.size=size;
		tos=-1;
		s=new int[size];
	}
	
	public void push(int data) {
		s[++tos]=data;
	}
	
	public int pop() {
		return s[tos--];
	}
	
	public int peak() {
		return s[tos];
	}
	
	public boolean isEmpty() {
		if(tos==-1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(tos==(size-1))
			return true;
		else
			return false;
	}
	
	public void printStack() {
		for (int i = 0; i <=tos ; i++) {
			System.out.print(s[i]+", ");
		}
	}
	
	

}
