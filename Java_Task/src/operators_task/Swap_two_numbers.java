package operators_task;

public class Swap_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		    int a=20 , b=50;
			
			//Before Swapping
			System.out.println("Before Swapping");
			System.out.println("Value of a is" + a);
			System.out.println("Value of b is" + b);
			
			//After Swapping
			
			int temp = a;
			a= b;
			b= temp;
			System.out.println("After Swapping");
			System.out.println("Value of a is" + a);
			System.out.println("Value of b is" + b);
	}

}
