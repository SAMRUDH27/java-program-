import java.util.Scanner;

public class profile {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("User Profile:");
        String fullName;
        while (true) {
            System.out.print("Enter Full Name: ");
            fullName = scanner.nextLine();

            if (!fullName.trim().isEmpty() && !fullName.matches(".\\d.")) {
                break;
            } else {
                System.out.println("Invalid  name. Please enter a valid name .");
            }
        }
        
        String contactNumber;
        
        while (true) {
            System.out.print("Enter Contact Number: ");
            contactNumber = scanner.nextLine();

            
            if (!contactNumber.trim().isEmpty() && contactNumber.matches("\\d+")) {
                break;  
            } else {
                System.out.println("Invalid contact number. Please enter a valid number.");
            }
        }

        System.out.print("Enter Email Address: ");
        String emailAddress = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        String dateOfBirth;
        while (true) {
            System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
            dateOfBirth = scanner.nextLine();

            if (dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}")) {
                break;
            } else {
                System.out.println("Invalid date format.");
            }
        }
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Nationality: ");
        String nationality = scanner.nextLine();
        System.out.print("Enter LinkedIn Profile URL: ");
        String linkedInProfileURL = scanner.nextLine();
        System.out.print("Enter GitHub Profile URL: ");
        String gitHubProfileURL = scanner.nextLine();
        System.out.print("Enter Profile Image Path: ");
        String profileImagePath = scanner.nextLine();

         System.out.println("\nUser Profile:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("Nationality: " + nationality);
        System.out.println("LinkedIn Profile URL: " + linkedInProfileURL);
        System.out.println("GitHub Profile URL: " + gitHubProfileURL);
        System.out.println("Profile Image Path: " + profileImagePath);

        
    }
}