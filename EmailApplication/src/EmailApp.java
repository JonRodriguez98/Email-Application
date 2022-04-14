/*
 * Jon Rodriguez 
 * 14 April 2022
 * This Program will create an email for a new worker based on the department that the
 * new worker is assigned to. The application allows for editing passwords, providing
 * alternate email and editing the mailbox capacity. 
 */
public class EmailApp {
	
	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		System.out.println(em1.showInfo());
	}

}
