package Task_01_5;

public class do_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2;
		do {
			System.out.println("Table Of " + a);
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(a + " * " + i + " = " + (a*i));
				}
			}
			a++;
		}while(a<=10);
		
	}

}
