package Problem2;

public class Main {

	public static void main(String[] args) {
		Data s = new Data();
		
		s.add(1);
		s.add(9);
		s.add(4);
		s.add(5);
		s.add(10);
		s.add(0);
		
		System.out.println("Call to getValue(0): " + s.getValue(0));
		System.out.println("Call to getValue(3): " + s.getValue(3));

	}

}
