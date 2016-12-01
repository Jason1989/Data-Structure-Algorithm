package com.coursera;

public class QuickFindUF {
	
	private int[] arr;
	
	public QuickFindUF(int[] arr){
		this.arr = arr;
	}
	
	public boolean connected(int p, int q){
		return arr[p] == arr[q];
	}
	
	public void union(int p, int q){
		int pid = arr[p];
		int qid = arr[q];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == pid){
				arr[i] = qid;
			}
		}
	}
	
}
