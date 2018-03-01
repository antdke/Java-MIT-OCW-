/* 
Phase 1 Results: 
262.5
385.4
730.0

Phase 2 Results:
262.5
414.1 Right Answer :)
895.0

Phase 3 Results:
ERROR! Salary below min wage!
414.1
895.0

Phase 4 Results:
ERROR! Salary below min wage!
414.1
ERROR! You're working too much!

Awesome :)

*/
class FooCorporation {
	public static void Employee1(double bp, int hrs){
		// double paid = (bp * hrs); Might not be needed
		if (hrs > 40 && hrs < 60){
			int otHrs = hrs - 40;
			double otPay = (otHrs * (bp * 1.5));
			double totalpay = (bp * 40) + (otPay);
			System.out.println(totalpay);

		} else if (bp < 8.0){
			System.out.println("ERROR! Salary below min wage!");

		} else if (hrs > 60){
			System.out.println("ERROR! You're working too much!");

		} else {
			System.out.println(bp * hrs);
		}
		

	}
	public static void Employee2(double bp, int hrs){
		// double paid = (bp * hrs); Might not be needed
		if (hrs > 40 && hrs < 60){
			int otHrs = hrs - 40;
			double otPay = (otHrs * (bp * 1.5));
			double totalpay = (bp * 40) + (otPay);
			System.out.println(totalpay);

		} else if (hrs > 60){
			System.out.println("ERROR! You're working too much!");

		} else if (bp < 8.0){
			System.out.println("ERROR! Salary below min wage!");

		} else {
			System.out.println(bp * hrs);
		}

	}
	public static void Employee3(double bp, int hrs){
		// double paid = (bp * hrs); Might not be needed
		if (hrs > 40 && hrs < 60){
			int otHrs = hrs - 40;
			double otPay = (otHrs * (bp * 1.5));
			double totalpay = (bp * 40) + (otPay);
			System.out.println(totalpay);

		} else if (hrs > 60){
			System.out.println("ERROR! You're working too much!");

		} else if (bp < 8.0){
			System.out.println("ERROR! Salary below min wage!");

		} else {
			System.out.println(bp * hrs);
		}

		
	}

	public static void main(String[] arguments){
		// Call shit here
		Employee1(7.5, 35);
		Employee2(8.2, 47);
		Employee3(10.0, 73);


	}
}