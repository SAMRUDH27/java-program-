import java.util.Scanner;

public class Certification {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCertifications:");
        System.out.print("Enter Certification Name: ");
        String certificationName = scanner.nextLine();
        System.out.print("Enter Certification Authority: ");
        String certificationAuthority = scanner.nextLine();
        System.out.print("Enter Date Obtained (YYYY-MM-DD): ");
        String dateObtained = scanner.nextLine();
        System.out.print("Enter Certification URL: ");
        String certificationURL = scanner.nextLine();
        System.out.print("Enter Validity Period (YYYY-MM-DD): ");
        String validityPeriod = scanner.nextLine();
        System.out.print("Enter Credential ID: ");
        String credentialID = scanner.nextLine();
        System.out.print("Enter Additional Information: ");
        String additionalInformation = scanner.nextLine();
        System.out.print("Enter Renewal Requirements: ");
        String renewalRequirements = scanner.nextLine();
        System.out.print("Enter Renewal Deadline (YYYY-MM-DD): ");
        String renewalDeadline = scanner.nextLine();
        System.out.print("Enter Renewal Status (true/false): ");
        boolean renewalStatus = scanner.nextBoolean();
        scanner.nextLine(); 
        System.out.println("\nCertifications:");
        System.out.println("Certification Name: " + certificationName);
        System.out.println("Certification Authority: " + certificationAuthority);
        System.out.println("Date Obtained: " + dateObtained);
        System.out.println("Certification URL: " + certificationURL);
        System.out.println("Validity Period: " + validityPeriod);
        System.out.println("Credential ID: " + credentialID);
        System.out.println("Additional Information: " + additionalInformation);
        System.out.println("Renewal Requirements: " + renewalRequirements);
        System.out.println("Renewal Deadline: " + renewalDeadline);
        System.out.println("Renewal Status: " + renewalStatus);
        
    }
}