import java.util.Scanner;

public class Language {
    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLanguages:");
        System.out.print("Enter Language Name: ");
        String languageName = scanner.nextLine();
        System.out.print("Enter Proficiency Level: ");
        String proficiencyLevel = scanner.nextLine();
        System.out.print("Enter Writing Proficiency: ");
        String writingProficiency = scanner.nextLine();
        System.out.print("Enter Speaking Proficiency: ");
        String speakingProficiency = scanner.nextLine();
        System.out.print("Enter Reading Proficiency: ");
        String readingProficiency = scanner.nextLine();
        System.out.print("Enter Listening Proficiency: ");
        String listeningProficiency = scanner.nextLine();
        System.out.print("Enter Certification in Language (true/false): ");
        boolean languageCertification = scanner.nextBoolean();
        scanner.nextLine(); 
        System.out.print("Enter Certification Authority: ");
        String languageCertificationAuthority = scanner.nextLine();
        System.out.print("Enter Certification Date (YYYY-MM-DD): ");
        String languageCertificationDate = scanner.nextLine();
        System.out.print("Enter Certification Level: ");
        String languageCertificationLevel = scanner.nextLine();

        System.out.println("\nLanguages:");
        System.out.println("Language Name: " + languageName);
        System.out.println("Proficiency Level: " + proficiencyLevel);
        System.out.println("Writing Proficiency: " + writingProficiency);
        System.out.println("Speaking Proficiency: " + speakingProficiency);
        System.out.println("Reading Proficiency: " + readingProficiency);
        System.out.println("Listening Proficiency: " + listeningProficiency);
        System.out.println("Certification in Language: " + languageCertification);
        System.out.println("Certification Authority: " + languageCertificationAuthority);
        System.out.println("Certification Date: " + languageCertificationDate);
        System.out.println("Certification Level: " + languageCertificationLevel);
      
    }
}