package Polymorphism_Task_10_5;

public class Runtime_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal myAnimal = new Animal(); 
        Animal myDog = new Dog();       
        Animal myCat = new Cat(); 
        
        myAnimal.sound(); 
        myDog.sound();    
        myCat.sound();
		
	}

}
