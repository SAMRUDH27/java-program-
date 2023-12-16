import java.util.Scanner;

public class Project {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nProjects:");
        System.out.print("Enter Project Title: ");
        String projectTitle = scanner.nextLine();
        System.out.print("Enter Project Description: ");
        String projectDescription = scanner.nextLine();
        System.out.print("Enter Project Duration (YYYY-MM-DD to YYYY-MM-DD): ");
        String projectDuration = scanner.nextLine();
        System.out.print("Enter Team Size: ");
        int teamSize = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Your Role in Project: ");
        String roleInProject = scanner.nextLine();
        System.out.print("Enter Technologies Used: ");
        String technologiesUsed = scanner.nextLine();
        System.out.print("Enter Project Link: ");
        String projectLink = scanner.nextLine();
        System.out.print("Enter Project Outcome: ");
        String projectOutcome = scanner.nextLine();
        System.out.print("Enter Challenges Faced: ");
        String challengesFaced = scanner.nextLine();
        System.out.print("Enter Lessons Learned: ");
        String lessonsLearned = scanner.nextLine();

        System.out.println("\nProjects:");
        System.out.println("Project Title: " + projectTitle);
        System.out.println("Project Description: " + projectDescription);
        System.out.println("Project Duration: " + projectDuration);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Role in Project: " + roleInProject);
        System.out.println("Technologies Used: " + technologiesUsed);
        System.out.println("Project Link: " + projectLink);
        System.out.println("Project Outcome: " + projectOutcome);
        System.out.println("Challenges Faced: " + challengesFaced);
        System.out.println("Lessons Learned: " + lessonsLearned);
        scanner.close();
    }
}