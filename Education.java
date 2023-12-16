import java.util.Scanner;

public class Education {
    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEducation Details:");
        System.out.print("Enter Degree Name: ");
        String degreeName = scanner.nextLine();
        System.out.print("Enter University Name: ");
        String universityName = scanner.nextLine();
        System.out.print("Enter Major/Field of Study: ");
        String fieldOfStudy = scanner.nextLine();
        System.out.print("Enter Graduation Year: ");
        int graduationYear = scanner.nextInt();
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter Honors/Awards: ");
        String honorsAwards = scanner.nextLine();
        System.out.print("Enter Revelent courses: ");
        String revelentcourses = scanner.nextLine();
        System.out.print("Enter Thesis Title: ");
        String thesistitle = scanner.nextLine();
        System.out.print("Enter Educational Institution Location: ");
        String educationalinstitutionlocation = scanner.nextLine();
        System.out.print("Enter Extracurricular Activities : ");
        String extracurricularactivities  = scanner.nextLine();

        System.out.println("\nEducation Details:");
        System.out.println("Degree Name: " + degreeName);
        System.out.println("University Name: " + universityName);
        System.out.println("Major/Field of Study: " + fieldOfStudy);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("GPA: " + gpa);
        System.out.println("Honors/Awards: " + honorsAwards);
        System.out.println("Relevant Courses: " + revelentcourses);
        System.out.println("Thesis Title: " + thesistitle);
        System.out.println("Educational Institution Location: " + educationalinstitutionlocation);
        System.out.println("Extracurricular Activities: " + extracurricularactivities);
        scanner.close();
    }
}