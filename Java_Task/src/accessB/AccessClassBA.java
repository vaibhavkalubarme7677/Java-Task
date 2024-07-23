package accessB;

import accessA.AccessClassAA;

public class AccessClassBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("=======Variables=======");
		    AccessClassAA obj = new AccessClassAA();
	    	System.out.println(obj.publicint);
	    //	System.out.println(obj.privateint);
	    //	System.out.println(obj.protectedint);
	    //	System.out.println(obj.defaultint);
	    	System.out.println("=======Methods=======");
	    	obj.PublicMethod();
	    //	obj.PrivateMethod();
	    //	obj.ProtectedMethod();
	    //	obj.DefaultMethod();
		
		
	}

}
