import java.util.Scanner;

public class Personal {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPersonal Statement:");
        System.out.print("Enter Introduction: ");
        String introduction = scanner.nextLine();
        System.out.print("Enter Career Objective: ");
        String careerObjective = scanner.nextLine();
        System.out.print("Enter Strengths: ");
        String strengths = scanner.nextLine();
        System.out.print("Enter Weaknesses: ");
        String weaknesses = scanner.nextLine();
        System.out.print("Enter Professional Achievements: ");
        String professionalAchievements = scanner.nextLine();
        System.out.print("Enter Career Aspirations: ");
        String careerAspirations = scanner.nextLine();
        System.out.print("Enter Work Philosophy: ");
        String workPhilosophy = scanner.nextLine();
        System.out.print("Enter Motivation for Career Change: ");
        String motivationForCareerChange = scanner.nextLine();
        System.out.print("Enter Long-term Goals: ");
        String longTermGoals = scanner.nextLine();
        System.out.print("Enter Short-term Goals: ");
        String shortTermGoals = scanner.nextLine();
        System.out.println("\nPersonal Statement:");
        System.out.println("Introduction: " + introduction);
        System.out.println("Career Objective: " + careerObjective);
        System.out.println("Strengths: " + strengths);
        System.out.println("Weaknesses: " + weaknesses);
        System.out.println("Professional Achievements: " + professionalAchievements);
        System.out.println("Career Aspirations: " + careerAspirations);
        System.out.println("Work Philosophy: " + workPhilosophy);
        System.out.println("Motivation for Career Change: " + motivationForCareerChange);
        System.out.println("Long-term Goals: " + longTermGoals);
        System.out.println("Short-term Goals: " + shortTermGoals);

       
    }
}