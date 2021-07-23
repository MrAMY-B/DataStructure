package ds.greaph;

import java.util.Scanner;

public class Graph {
	
	int AdjMat[][];
	int v;
	int vlist[];
	Scanner s = new Scanner(System.in);
	
	public Graph(int number) {
		
		this.v=number;
		this.AdjMat=new int[v][v];
		this.vlist=new int[v];
		
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				System.out.print("Enter value for row:"+i+",col:"+j+" : ");
				AdjMat[i][j]=s.nextInt();
			}
		}
	
	}
	
	//RESETTING VISITED PROPERTY WITH ZERO
		public void resetVisited() {
			for (int i = 0; i < v; i++) 
				vlist[i]=0;
			
		}
	
	//DEPTH FIRST SEARCH
	public void DFS(int start) {
		vlist[start]=1;
		System.out.print(start+", ");
		for(int i=0;i<v;i++) {
			if(AdjMat[start][i]==1 && vlist[i]!=1)
				DFS(i);
		}
	}
	
	//BREATH FIRST SERARCH
	public void BFS(int start) {
		
		int q[] = new int[v];
		int rear=-1;
		int front=0;
		int element=0;
		
		vlist[start]=1;		//visited
		q[++rear]=start;	//Enqueue
		
		System.out.println("ELEMENTS : ");
		while(front<=rear) {
			element=q[front++];
			System.out.print(element+", ");
			for (int i = 0; i < v; i++) {
				if(AdjMat[element][i]==1 && vlist[i]!=1) {	//if connected and not visited
					q[++rear]=i;
					vlist[i]=1;
				}
			}
		}
		
	}
	
	
	

}









