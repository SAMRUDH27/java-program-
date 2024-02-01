import java.util.Scanner;

public class Education {

    private String degreeName;
    private String universityName;
    private String fieldOfStudy;
    private int graduationYear;
    private double gpa;
    private String honorsAwards;
    private String relevantCourses;
    private String thesisTitle;
    private String educationalInstitutionLocation;
    private String extracurricularActivities;

    // Default constructor
    public Education() {
        this.degreeName = "Not Specified";
        this.universityName = "Not Specified";
        this.fieldOfStudy = "Not Specified";
        this.graduationYear = 0;
        this.gpa = 0.0;
        this.honorsAwards = "Not Specified";
        this.relevantCourses = "Not Specified";
        this.thesisTitle = "Not Specified";
        this.educationalInstitutionLocation = "Not Specified";
        this.extracurricularActivities = "Not Specified";
    }

    // Constructor with parameters
    public Education(String degreeName, String universityName, String fieldOfStudy, int graduationYear,
                     double gpa, String honorsAwards, String relevantCourses, String thesisTitle,
                     String educationalInstitutionLocation, String extracurricularActivities) {
        this.degreeName = degreeName;
        this.universityName = universityName;
        this.fieldOfStudy = fieldOfStudy;
        this.graduationYear = graduationYear;
        this.gpa = gpa;
        this.honorsAwards = honorsAwards;
        this.relevantCourses = relevantCourses;
        this.thesisTitle = thesisTitle;
        this.educationalInstitutionLocation = educationalInstitutionLocation;
        this.extracurricularActivities = extracurricularActivities;
    }

    // Function overloading
    public void input() {
        input(true);
    }

    public void input(boolean askDegreeName) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEducation Details:");

        if (askDegreeName) {
            while (true) {
                System.out.print("Enter Degree Name: ");
                degreeName = scanner.nextLine();
                if (!degreeName.trim().isEmpty()) {
                    break;
                } else {
                    System.out.println("Degree Name cannot be empty. Please enter a valid value.");
                }
            }
        }

        System.out.print("Enter University Name: ");
        universityName = scanner.nextLine();
        System.out.print("Enter Major/Field of Study: ");
        fieldOfStudy = scanner.nextLine();
        System.out.print("Enter Graduation Year: ");
        graduationYear = scanner.nextInt();
        System.out.print("Enter GPA: ");
        gpa = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter Honors/Awards: ");
        honorsAwards = scanner.nextLine();
        System.out.print("Enter Relevant Courses: ");
        relevantCourses = scanner.nextLine();
        System.out.print("Enter Thesis Title: ");
        thesisTitle = scanner.nextLine();
        System.out.print("Enter Educational Institution Location: ");
        educationalInstitutionLocation = scanner.nextLine();
        System.out.print("Enter Extracurricular Activities: ");
        extracurricularActivities = scanner.nextLine();
    }

    
    public void display() {
        System.out.println("\nEducation Details:");
        System.out.println("Degree Name: " + degreeName);
        System.out.println("University Name: " + universityName);
        System.out.println("Major/Field of Study: " + fieldOfStudy);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("GPA: " + gpa);
        System.out.println("Honors/Awards: " + honorsAwards);
        System.out.println("Relevant Courses: " + relevantCourses);
        System.out.println("Thesis Title: " + thesisTitle);
        System.out.println("Educational Institution Location: " + educationalInstitutionLocation);
        System.out.println("Extracurricular Activities: " + extracurricularActivities);
    }

    public static void main(String[] args) {
        
        Education educationDefault = new Education();
        educationDefault.input();
        educationDefault.display();

        
        Education educationParameterized = new Education("Bca in Computer Science", "jain University", "Computer Science", 2022,
                3.8, "dean List", "Data Structures, Algorithms", "Efficient Sorting Algorithms",
                "City, Country", "Programming Club");
        educationParameterized.display();

        
        Education educationFunctionOverloading = new Education();
        educationFunctionOverloading.input(false); 
        educationFunctionOverloading.display();
    }
}
