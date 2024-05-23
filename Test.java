package traning_project;
import java.util.Scanner;

public class Test {

	 public static void main(String[] args) {
	        String Password = "JAVA";
	        int attempts = 3;
	        boolean authenticated = false;
	        Scanner scanner = new Scanner(System.in);
	        while (attempts > 0) {
	            System.out.print("Enter password: ");
	            String enteredPassword = scanner.nextLine();

	            if (enteredPassword.equals(Password)) {
	                authenticated = true;
	                break;
	            } else {
	                attempts--;
	                System.out.println("Incorrect password. Attempts left: " + attempts);
	            }
	        }

	        if (authenticated) {
	            while (true) {
	                System.out.println("\nMenu:");
	                System.out.println("1. Factorial Calculation");
	                System.out.println("2. Fibonacci Sequence");
	                System.out.println("3. Prime number Check");
	                System.out.println("4. Sum of Digits");
	                System.out.println("5. Reverse Number");
	                System.out.print("Choose an option: ");
	                int choice = scanner.nextInt();
	                if (choice == 5) {
	                    System.out.println("Exiting...");
	                    break;
	                }
	                
	            }
	                }
            scanner.close();

	            }
	        
	            
	        
	        
	 }
                
            
		
	                       

	         

	

	
