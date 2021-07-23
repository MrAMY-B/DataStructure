package ds.greaph;

import java.util.Scanner;

public class AmyGraph {
	
	int AdjMat[][];
	int v;
	int vlist[];
	
	public AmyGraph(int num) {
		v=num;
		vlist=new int[v];
		AdjMat=new int[v][v];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				System.out.println("Value of ["+i+"]["+j+"] : ");
			}
		}
		
		sc.close();
	}
	
	//DEPTH FIRST SEARCH
	public void DFS(int start) {
		vlist[start]=1;
		System.out.print(start+", ");
		for (int i = 0; i < v; i++)
			if(AdjMat[start][i]==1 && vlist[v]!=1)
				DFS(i);
	}
	
	//BREATH FIRST SEARCH
	public void BFS(int start) {
		
		int q[]=new int[v];
		int front=0,rear=-1;
		int element=0;
		
		vlist[start]=1;
		q[++rear]=start;
		
		
		while(front<=rear) {
			
			element=q[front++];
			System.out.print(element+", ");
			
			for (int i = 0; i < v; i++) {
				if(AdjMat[element][i]==1 && vlist[element]!=1) {
					q[++rear]=i;
					vlist[i]=1;
				}
			}
			
		}
		
	}
	
	//RESETE VISITED(1) to UNVISITED(0)
	public void resetVisited() {
		for (int i = 0; i < v; i++)
				vlist[i]=0;
	}
	
	
	public void DFSearch(int start) {
		vlist[start]=1;
		System.out.println(start+", ");
		
		for(int i=0;i<v;i++) {
			if(AdjMat[start][i]==1 && vlist[i]!=1)
				DFSearch(i);
		}
	}
	
	public void BFSearch(int num) {
		
		int q[]=new int[v];
		int front=0,rear=-1,ele=0;
		
		q[++rear]=num;
		vlist[num]=1;
		System.out.println(num+", ");
		
		while(front<=rear) {
			ele=q[front++];
			System.out.println(ele+", ");
			
			for (int i = 0; i < v; i++) {
				if(AdjMat[ele][i]==1 && vlist[i]!=1) {
					q[++rear]=i;
					vlist[i]=1;
				}
			}
			
			
		}
		
	}
	
	
	
	

}





















