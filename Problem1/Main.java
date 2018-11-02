package Problem1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Merge sort can be used
		int[] test = {15,9,60,44,12,1,4};
		
		ExamSort(test,test.length);
		
		System.out.println(Arrays.toString(test));
	}
	
	public static void ExamSort(int[] a, int size)
	{
		int[] temp = new int[a.length];
		mergeSort(a, temp, 0, a.length-1);
	}
	
	private static void mergeSort(int[] a, int[] aux, int lo, int hi)
	{
		if(hi<=lo) return;
		
		int mid = lo + (hi-lo)/2;
		mergeSort(a,aux,lo,mid);
		mergeSort(a,aux,mid+1,hi);
		merge(a,aux,lo,mid,hi);
	}
	
	private static void merge(int[] a, int[] aux, int lo, int mid, int hi)
	{
		if(a[mid]<a[mid+1]) return;
		int i=lo, j=mid+1;
		
		for(int k=lo;k<=hi;k++)
		{
			aux[k]=a[k];
		}
		
		for(int k=lo;k<=hi;k++)
		{
			if(i>mid)		a[k]=aux[j++];
			else if(j>hi)	a[k]=aux[i++];
			else if(aux[i]<aux[j])	a[k]=aux[i++];
			else			a[k]=aux[j++];
		}
	}

}
