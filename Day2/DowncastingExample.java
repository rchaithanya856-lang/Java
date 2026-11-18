package Oops;

public class DowncastingExample {
	    public static void main(String[] args) {

	        Parent p = new Child();  // Upcasting

	        Child c = (Child) p;     // Downcasting

	        c.display();
	        c.show();
	    }
	}


