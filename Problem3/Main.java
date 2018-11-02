package Problem3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data s = new Data();
		
		s.add(1);
		s.add(5);
		s.add(8);
		s.add(10);
		s.add(12);
		s.add(14);
		s.add(18);
		s.add(20);
		s.add(33);
		s.add(41);
		
		System.out.println(Arrays.toString(s.toArray()));
		
		System.out.println("Index of 8: " +ProblemThree(s, 8));
		System.out.println("Index of 33: " +ProblemThree(s, 33));

	}
	
	public static int ProblemThree(Data data, int value)
	{
		int[] array = data.toArray();
		
		// binary search can achieve O(lgN) time
		int index = Arrays.binarySearch(array, value);
		
		return index;
	}

}
