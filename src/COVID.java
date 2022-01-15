
public class COVID {

	public static void main(String[] args) {
		System.out.println(getCases(3, 12)); //should print 69984
		System.out.println(getCases(3, 5));  //should print 108
		System.out.println(getCases(3, 0));  //should print -1

		System.out.println(getNumMonth(23328, 3)); //should print 11
		System.out.println(getNumMonth(324, 3)); //should print 6
		System.out.println(getNumMonth(123, 3)); //should throw IllegalArgumentException with message "Month not found"
	}

	// Method returns the number of cases given the start cases and the target month.
	public static int getCases(int startCase, int month) {
		//TODO write your code below.
		int totalCases = startCase;

		if(month == 1) {
			return startCase;
		} else if (month < 1) {
			return -1;
		}

		for(int i = 2; i <= month; i++) {
			if(i % 2 == 0) {
				totalCases *= 3;
			} else {
				totalCases *= 2;
			}
		}

		return totalCases;
	}
	
	
	//Recursive method that return the month of the cases collected
	public static int getNumMonth(int cases, int startCase) {
		//TODO write your code below. You must use recusion to solve this problem
		return 0;
	}

}
