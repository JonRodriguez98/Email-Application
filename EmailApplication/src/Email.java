import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String companySuffix = "xpanxion.com";
	private int mailboxCapacity = 500;
	private int defaultPass = 10;
	
	
	
	
	//constructor to recieve fname and lname
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPass);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		this.email = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
	
	}
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	//change password
	public void changePassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	//ask for department
	private String setDepartment() {
		System.out.println("New worker: " + this.firstName + ". " + "DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nEnter department code: ");
		
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {
			return "sales";
		}
		
		else if (depChoice == 2) {
			return "development";
		}
		
		else if(depChoice == 3) {
			return "accounting";
		}
		
		else {
			return "";
		}
	}
	
	//generate random pass
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for (int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	

	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
}
