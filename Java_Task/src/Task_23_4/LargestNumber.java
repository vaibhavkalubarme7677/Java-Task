package Task_23_4;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=20;
		int num3=15;
		
		if (num1>= num2 && num1 >=num3)
		{
			System.out.println(num1+" is the largest");
		}
		else if (num2>=num1 && num2>=num3)
		{
			System.out.println(num2+" is the largest");
		}
		else 
		{
			System.out.println(num3+" is the largest");
		}
		
	}

}
