package Aug30;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Computer c1 = new Computer("Dell", "XPS 13", 1239854, 1525);
	        Computer c2 = new Computer("HP", "Pavilion", 702162, 1235);

	        // Display computer information
	        System.out.println("Computer 1:\n" + c1);
	        System.out.println("\nComputer 2:\n" + c2);

	        // Modify computer attributes
	        c1.setPrice(1198);
	        c2.setBrand("Lenovo");

	        // Display modified information
	        System.out.println("\nModified Computer 1:\n" + c1);
	        System.out.println("\nModified Computer 2:\n" + c2);

	        // Compare computers for equality
	        System.out.println("\nAre Computer 1 and Computer 2 equal? " + c1.equals(c2));

	        // Find the number of created Computer objects
	        System.out.println("\nNumber of created Computer objects: " + Computer.findNumberOfCreatedComputers());
	    }

}
