import java.util.Scanner;

public class Hobbies {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHobbies and Interests:");
        System.out.print("Enter Hobby/Interest Name: ");
        String hobbyName = scanner.nextLine();
        System.out.print("Enter Description: ");
        String hobbyDescription = scanner.nextLine();
        System.out.print("Enter Skill Level: ");
        String skillLevel = scanner.nextLine();
        System.out.print("Enter Time Spent Weekly: ");
        int timeSpentWeekly = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Participation in Groups/Clubs: ");
        String participationInGroups = scanner.nextLine();
        System.out.print("Enter Achievements in Hobby/Interest: ");
        String hobbyAchievements = scanner.nextLine();
        System.out.print("Enter Related Certifications (true/false): ");
        boolean hobbyCertification = scanner.nextBoolean();
        scanner.nextLine(); 
        System.out.print("Enter Certification Authority: ");
        String hobbyCertificationAuthority = scanner.nextLine();
        System.out.print("Enter Certification Date (YYYY-MM-DD): ");
        String hobbyCertificationDate = scanner.nextLine();
        System.out.print("Enter Certification Level: ");
        String hobbyCertificationLevel = scanner.nextLine();
        System.out.println("\nHobbies and Interests:");
        System.out.println("Hobby/Interest Name: " + hobbyName);
        System.out.println("Description: " + hobbyDescription);
        System.out.println("Skill Level: " + skillLevel);
        System.out.println("Time Spent Weekly: " + timeSpentWeekly);
        System.out.println("Participation in Groups/Clubs: " + participationInGroups);
        System.out.println("Achievements in Hobby/Interest: " + hobbyAchievements);
        System.out.println("Related Certifications: " + hobbyCertification);
        System.out.println("Certification Authority: " + hobbyCertificationAuthority);
        System.out.println("Certification Date: " + hobbyCertificationDate);
        System.out.println("Certification Level: " + hobbyCertificationLevel);
        scanner.close();
    }
}