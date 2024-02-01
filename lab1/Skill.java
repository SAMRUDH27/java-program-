import java.util.Scanner;

public class Skill {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSkills:");
        System.out.print("Enter Programming Languages: ");
        String programminglanguages = scanner.nextLine();
        System.out.print("Enter Technical Skills : ");
        String technicalskills  = scanner.nextLine();
        System.out.print("Enter Soft Skills: ");
        String softskills  = scanner.nextLine();
        System.out.print("Enter Certifications: ");
        String certifications  = scanner.nextLine();
        System.out.print("Enter Language Proficiency : ");
        String languageproficiency = scanner.nextLine();
        System.out.print("Enter Project Management: ");
        String projectmanagement = scanner.nextLine();
        System.out.print("Enter Industry Knowledge: ");
        String industryknowledge = scanner.nextLine();
        System.out.print("Enter Tools and Technologies: ");
        String toolsandtechnologies = scanner.nextLine();
        System.out.print("Enter Collaboration Tools: ");
        String collaborationtools = scanner.nextLine();
        System.out.print("Enter Problem Solving: ");
        String problemsolving = scanner.nextLine();
        System.out.println("\nSkills:");
        System.out.println("Programming Languages: " + programminglanguages);
        System.out.println("Technical Skills: " + technicalskills);
        System.out.println("Soft Skills: " + softskills);
        System.out.println("Certifications: " + certifications);
        System.out.println("Language Proficiency: " + languageproficiency);
        System.out.println("Tools and Technologies: " + toolsandtechnologies);
        System.out.println("Industry Knowledge: " + industryknowledge);
        System.out.println("Project Management: " + projectmanagement);
        System.out.println("Collaboration Tools: " + collaborationtools);
        System.out.println("Problem Solving: " + problemsolving);
        
    }
}