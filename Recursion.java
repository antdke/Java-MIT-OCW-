// First Java Recursion
public class Recursion {
	
	public static void main(String[] args){

		Recursion recursionTool = new Recursion();

		System.out.println("TN: " + recursionTool.getTriangularNumR(6));
	}


	public int getTriangularNumR(int number){
		
		System.out.println("Method " + number);

		// base case = condition that leads to the method not making another 
		//call on itself

		if (number == 1){

			System.out.println("Returned 1"); // to show what's going on

			return 1;

		} else { // if a 1 is not entered

			int result = number + getTriangularNumR(number - 1);
			// Method calling upon itself


			// to show the method in action
			System.out.println("Returned " + result);
			System.out.println(" : " + number + " + getTN(" + number + " - 1)");

			return result;


		}

	}

}
