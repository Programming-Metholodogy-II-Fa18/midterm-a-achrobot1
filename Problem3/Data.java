package Problem3;

public class Data {

	
	// fields
	//public Node head;
	public int[] stack;
	public int capacity;
	public int n;
	
	/*public class Node{
		public int data;
		public Node next;
		
		public Node(int data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}*/
	
	public Data()
	{
		//head = null;
		n=0;
		capacity = 10;
		stack = new int[10];
	}
	
	private void doubleCapacity()
	{
		int[] temp = new int[capacity*2];
		
		for(int i=0;i<capacity;i++)
		{
			temp[i]=stack[i];
		}
		
		stack = new int[capacity*2];
		
		for(int i=0;i<capacity;i++)
		{
			stack[i]=temp[i];
		}
		
		capacity*=2;
	}
	
	public void add(int a)
	{
		if(n+1>=capacity) doubleCapacity();
		
		stack[++n] = a;
		
		/*if(head == null)
		{
			head = new Node(a, null);
		}
		
		else
		{
			head = new Node(a, head);
		}*/
	}
	
	public int remove()
	{
		int returnVal;
		if(stack.length<1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			returnVal = stack[n--];
		}
		return returnVal;
	}
	
	public int getValue(int index)
	{
		if(index>n || index < 0)
		{
			return -1;
		}
		else
		{
			return stack[index];
		}
		
		/*Node cursor = head;
		for(int i=0;i<index;i++)
		{
			cursor = cursor.next;
		}
		
		return cursor.data;*/
	}
	
	public int[] toArray()
	{
		int[] returnArray = new int[n+1];
		for(int i=0;i<n+1;i++)
		{
			returnArray[i]=stack[i];
		}
		return returnArray;
	}
	
	
}
