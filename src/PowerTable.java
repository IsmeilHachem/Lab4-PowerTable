import java.util.Scanner;

public class PowerTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// Welcome user
		System.out.println("Learn your squares and cubes!");
		System.out.println(" ");
		
		char choice; 
		
		do 
		{ 
			//get inut from user
			System.out.println("Enter an integer: ");
			int integer = scnr.nextInt();
			
			// create a header
			String header = "Number  " + "Squared " + "Cubed  " + "\n"
						  + "======  " + "======= " + "=====  ";
			System.out.println(header);
			
			// declare and init square and cube
			int square = 0;
			int cube = 0;
			
			String row = "";
			for (int i = 1; i <= integer; i++) {
				
				square = i * i;
				cube = i * i * i;
				
				row = i + "       " + square + "       " + cube;
				System.out.println(row);
			}
			// see if they want to continue
			System.out.println("Continue? (y/n)");
			choice = scnr.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		
		System.out.print("Peace out bruh");
	}

}




/* public boolean nearHundred(int n) {
	  if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)){
	    return true;
	  }
	  return false;
	} */
