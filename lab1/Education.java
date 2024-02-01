import java.util.Scanner;

//  abstractclas
abstract class EducationBase {
    
    protected String degreeName;
    protected String universityName;
    protected String fieldOfStudy;
    protected int graduationYear;
    protected double gpa;
    protected String honorsAwards;
    protected String relevantCourses;
    protected String thesisTitle;
    protected String educationalInstitutionLocation;
    protected String extracurricularActivities;

    // Parameterconstructor 
    public EducationBase(String degreeName, String universityName, String fieldOfStudy, int graduationYear,
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

    // Abstractmethod 
    abstract void display();
}

//  extendsEducationBase
public class Education extends EducationBase {

    // Default constructor using super keywordcall the supclass
    public Education() {
        super("Not Specified", "Not Specified", "Not Specified", 0, 0.0,
              "Not Specified", "Not Specified", "Not Specified", "Not Specified", "Not Specified");
    }

    
    public Education(String degreeName, String universityName, String fieldOfStudy, int graduationYear,
                     double gpa, String honorsAwards, String relevantCourses, String thesisTitle,
                     String educationalInstitutionLocation, String extracurricularActivities) {
        super(degreeName, universityName, fieldOfStudy, graduationYear, gpa,
              honorsAwards, relevantCourses, thesisTitle, educationalInstitutionLocation, extracurricularActivities);
    }

    // Overridefromabstract
    @Override
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

    // Function overloading final 
    public final void input() {
        input(true);
    }

    public final void input(boolean askDegreeName) {
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

    public static void main(String[] args) {
        // Creating an array of object
        Education[] educationArray = new Education[3];
        educationArray[0] = new Education();
        educationArray[0].input();
        educationArray[1] = new Education("Bca in Computer Science", "jain University", "Computer Science", 2022,
                3.8, "dean List", "Data Structures, Algorithms", "Efficient Sorting Algorithms",
                "City, Country", "Programming Club");
        educationArray[2] = new Education();
        educationArray[2].input(false);

        for (Education education : educationArray) {
            education.display();
        }
    }
}