package ds._searching_sorting;

import java.util.Scanner;

public class SearchingSorting {
	
	static Scanner in = new Scanner(System.in);
	int arr[];
	
	
	public static void main(String[] args) {
		
			
		SearchingSorting ss=new SearchingSorting();
		
		int choice=0;
		
		
		do {
			int index=0;
			System.out.println("\n----------------"
					+ "\n1. ADD NEW"
					+ "\n2. LENEAR SEARCH"
					+ "\n3. BINARY SEARCH"
					+ "\n4. BUBBLE SORT"
					+ "\n5. SELECTION SORT"
					+ "\n6. INSERTION SORT"
					+ "\n7. MERGE SORT"
					+ "\n8. QUICK SORT"
					+ "\n9. PRINT ARRAY"
					+ "\n0.EXIT");
			System.out.print("ENTER CHOICE : ");
			choice=in.nextInt();
			
			switch(choice) {
			
			case 1: ss.addData();
					break;
					
					
			case 2:	System.out.println("Enter element to search : ");
					index=ss.linearSearch(in.nextInt());
					if(index!=-1)
						System.out.println("ELEMENT FOUND AT : "+(index+1));
					else
						System.out.println("ELEMENT NOT FOUND");
					ss.printArray();
					System.out.println("----DONE WITH SEARCH---");
					break;
					
					
			case 3:	System.out.println("Enter element to search : ");
					index=ss.binarySearch(0, ss.arr.length, in.nextInt());
					if(index!=-1)
						System.out.println("\nELEMENT FOUND AT : "+(index+1));
					else
						System.out.println("\nELEMENT NOT FOUND");
					ss.printArray();
					System.out.println("3");
					break;
					
					
			case 4:	ss.bubbleSort();
					System.out.println("\nDONE WITH SORTING");
					break;
			case 5:	ss.selectionSort();
					System.out.println("\n");
					break;
					
			case 6: System.out.println("----INSERTION SORT----");
					ss.insertionSort();
					System.out.println("\nDONE WITH SORTING");
					break;
					
			case 7: System.out.println("----MERGE SORT----");
					ss.mergeSort(0,ss.arr.length-1);
					System.out.println("\nDONE WITH SORTING");
					break;
					
			case 8: System.out.println("----QUICK SORT----");
					ss.quickSort(0, ss.arr.length-1);
					System.out.println("\nDONE WITH SORTING");
					break;
					
			case 9:	System.out.println("----ARRAY----");
					ss.printArray();
					System.out.println("DONW WITH PRINTING");
					break;
					
			case 0:
					System.out.println("0. BYE BYE");
					break;
					
			default:System.out.println("WRONG CHOICE");
					break;
					
			
			}
			
			
		}while(choice!=0);
		
		
	}
	
	public void addData() {
		
		
		System.out.println("Enter size of array");
		int n=in.nextInt();
		arr=new int[n];
		System.out.println("Enter "+n+" elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("----ARRAY IS CREATED----");
		
	}
	
	public void printArray() {
		
		System.out.print("->");
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+", ");
		System.out.println("");
		
	}
	
	//------------------------ SEARCHING -----------------------
	public int linearSearch(int data) {
		
		for (int i = 0; i < arr.length; i++) 
			if(arr[i]==data)
				return i;
		return -1;
	}
	
	public int binarySearch(int start,int end,int data) {
		
		if(start==end) {
			if(data==arr[start])
				return start;
			else
				return -1;
		}
		else {
			int mid=(start+end)/2;
			if(data==arr[mid])
				return mid;
			else {
				if(data<arr[mid])
					return binarySearch(start, mid-1, data);
				else
					return binarySearch(mid+1, end, data);
			}
		}
				
	}
	
	//------------------------ SORTING -----------------------
	
	public void bubbleSort() {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					printArray();
					try { Thread.sleep(100); }catch (Exception e) { }
				}
			}
		}
	}
	
	public void selectionSort() {
		int min,pos;
		for (int i = 0; i < arr.length-1; i++) {
			min=arr[i];
			pos=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			arr[pos]=arr[i];
			arr[i]=min;
			
			printArray();
			try { Thread.sleep(100); }catch (Exception e) { }
		}
	}
	
	public void insertionSort() {
		int newele;
		for (int i = 0; i < arr.length-1; i++) {
			newele=arr[i+1];
			int j=i+1;
			while(j>0 && newele<arr[j-1]) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=newele;
			printArray();
			try { Thread.sleep(100); }catch (Exception e) { }
		}
	}
	
	public void mergeSort(int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			
			merger(start, mid, end);
			
			printArray();
			try { Thread.sleep(100); }catch (Exception e) { }
		}
	}
	
	public void merger(int start,int mid,int end) {
		int i,j,temp[],ti;
		i=start;
		j=mid+1;
		temp=new int[arr.length];
		ti=start;
		
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j])
				temp[ti++]=arr[i++];
			else
				temp[ti++]=arr[j++];
		}
		
		while(j<=end)
			temp[ti++]=arr[j++];
		while(i<=mid)
			temp[ti++]=arr[i++];
		
		for (int k = start; k <= end; k++) {
			arr[k]=temp[k];
		}
	}
	
	public void quickSort(int start,int end) {
		int i,j,pivot;
		i=start;
		j=end;
		pivot=(start+end)/2;
		
		while(i<j) {
			while(arr[i]<arr[pivot])
				i++;
			while(arr[j]>arr[pivot])
				j--;
			if(i<j) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
			if(i<end)
				quickSort(i+1, end);
			if(start<j)
				quickSort(start, j-1);
		}
		printArray();
		try { Thread.sleep(100); }catch (Exception e) { }
	}
	
	

}




















