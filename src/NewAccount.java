import java.util.Scanner;

public class NewAccount extends Display{
	
	NewAccount() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER YOUR NAME: ");
		this.name = scan.nextLine();
		System.out.print("ENTER YOUR AGE: ");
		this.age = scan.nextInt();
		System.out.print("ENTER YOUR DATE OF BIRTH: ");
		this.dob = scan.nextLine();
		System.out.println("TICK TYPE OF ACCOUT: 1)CURRENT ACCOUNT & 2)SAVINGS ACCOUNT");
		this.type = scan.nextInt();
		
		System.out.println("TO BACK 1");
		int go = scan.nextInt();
		if (go == 1) {
			Display disp = new Display();
			disp.display();
		}
	}
	
}
