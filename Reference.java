import java.util.Scanner;

public class Reference {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nReferences:");
        System.out.print("Enter Reference Name: ");
        String referenceName = scanner.nextLine();
        System.out.print("Enter Relationship: ");
        String relationship = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String referenceContactNumber = scanner.nextLine();
        System.out.print("Enter Email Address: ");
        String referenceEmailAddress = scanner.nextLine();
        System.out.print("Enter Company Name: ");
        String referenceCompanyName = scanner.nextLine();
        System.out.print("Enter Position in Company: ");
        String referencePosition = scanner.nextLine();
        System.out.print("Enter How You Know the Reference: ");
        String howYouKnowReference = scanner.nextLine();
        System.out.print("Enter Years Known: ");
        int yearsKnown = scanner.nextInt();
        System.out.println("\nReferences:");
        System.out.println("Reference Name: " + referenceName);
        System.out.println("Relationship: " + relationship);
        System.out.println("Contact Number: " + referenceContactNumber);
        System.out.println("Email Address: " + referenceEmailAddress);
        System.out.println("Company Name: " + referenceCompanyName);
        System.out.println("Position in Company: " + referencePosition);
        System.out.println("How You Know the Reference: " + howYouKnowReference);
        System.out.println("Years Known: " + yearsKnown);    
        scanner.close();
    }
} 