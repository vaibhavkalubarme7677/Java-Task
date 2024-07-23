package Task_03_5;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int evencount=0, oddcount=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				evencount++;	
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("no of even numbers :"+evencount);
		System.out.println("no of odd numbers :"+oddcount);
		
		
	}

}
