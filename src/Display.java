import java.util.Scanner;

public class Display {
	public String name;
	public int age;
	public long acctNum;
	public String dob;
	public int type;
	public void display() {
		System.out.println("|||Welcome to The Bank of India|||");
		System.out.println("---ONLINE BANK AVAILABLE OPTIONS---");
		System.out.println("1) OPENING NEW ACCOUT");
		System.out.println("2) LOAN");
		System.out.println("3) BALANCE ENQUIRY");
		System.out.println("4) WITHDRAW");
		System.out.println("5) ATM CARD REQUEST");
		System.out.println("6) PASSBOOK");
		System.out.print("ENTER THE OPTION: ");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		if (ch == 1) {
			NewAccount newcus = new NewAccount();
		}
		else {
			PassBook pass = new PassBook();
			String name = ;
			this.name = name;
			int age;
			String dob;
			int type;
			pass.passbook(name, age, dob, type);
		}
	}
}
