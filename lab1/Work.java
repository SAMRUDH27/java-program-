import java.util.Scanner;

public class Work {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWork Experience:");
        System.out.print("Enter Company Name: ");
        String companyName = scanner.nextLine();
        System.out.print("Enter Job Title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter Employment Period (YYYY-MM-DD to YYYY-MM-DD): ");
        String employmentPeriod = scanner.nextLine();
        System.out.print("Enter Job Description: ");
        String jobDescription = scanner.nextLine();
        System.out.print("Enter Achievements: ");
        String achievements = scanner.nextLine();
        System.out.print("Enter Responsibilities ");
        String responsibilities = scanner.nextLine();
        System.out.print("Enter Work Location ");
        String worklocation = scanner.nextLine();
        System.out.print("Enter Supervisor Name ");
        String supervisorname  = scanner.nextLine();
        System.out.print("Enter Contact Number of Supervisor ");
        String contactnumberofsupervisor  = scanner.nextLine();
        System.out.print("Enter Email of Supervisor ");
        String emailofsupervisor  = scanner.nextLine();
        System.out.println("\nWork Experience:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Employment Period: " + employmentPeriod);
        System.out.println("Job Description: " + jobDescription);
        System.out.println("Achievements: " + achievements);
        System.out.println("Responsibilities: " + responsibilities);
        System.out.println("Work Location: " + worklocation);
        System.out.println("Supervisor Name: " + supervisorname);
        System.out.println("Contact Number of Supervisor: " + contactnumberofsupervisor);
        System.out.println("Email of Supervisor: " + emailofsupervisor);

        
        }
    }