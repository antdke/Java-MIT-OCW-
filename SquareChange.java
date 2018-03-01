// Variable Scope Practice
// Understanding how var calls between methods are independent w/in each 
//block until they are affected thru method params

class SquareChange{
	public static void printSquare(int x){
		System.out.println(x); // Result: 5
		x *= x;
		System.out.println(x); // Result: 25

	}

	public static void main(String[] args){
		int x = 5;
		System.out.println(x); // Result: 5
		printSquare(x); // Result: 5 & 25 (from the printSquare method)
		System.out.println(x); // Result: 5 (tried to trick me I see haha)

	}
}