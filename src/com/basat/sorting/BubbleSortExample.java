package com.basat.sorting;

public class BubbleSortExample {

	
	public static void main(String args []){

		int arr [] = {9,1,10,5,2,7,4,3,6,8,901};
	
		new BubbleSortExample().bubbleSort(arr);

       for(int i=0;i<arr.length;i++)
    	   System.out.println(arr[i]);
       
	
	}
	
	
	public void bubbleSort(int [] arr){
		
		
		for(int m=arr.length;m>0;m--){
			 for(int i=0;i<arr.length-1;i++){
				  if(arr[i]>arr[i+1]){
					  
					  System.out.println(arr[i]+" swap "+arr[i+1]);
					  int temp = arr[i+1];
					  arr[i+1] = arr[i];
					  arr[i] = temp ;
				  }else
					  System.out.println(arr[i]+" skipped "+arr[i+1]);
					
			 }
		}
	}
}
