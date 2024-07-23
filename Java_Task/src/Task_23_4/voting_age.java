package Task_23_4;

public class voting_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int age=25;
			
	      if (age >= 18 && age <= 60) 
	      {
            System.out.println("You are eligible for voting.");
          } 
	      else if (age < 18) 
	      {
            System.out.println("You are underage for voting.");
          } 
	      else 
	      {
            System.out.println("You are over the voting age limit 60.");
          }
		
	}

}
