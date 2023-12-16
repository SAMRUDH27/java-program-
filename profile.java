import java.util.Scanner;

public class profile {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("User Profile:");
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();
        System.out.print("Enter Email Address: ");
        String emailAddress = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();
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

        scanner.close();
    }
}