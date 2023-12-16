public class Main {
    public static void main(String[] args) {
        profile Profile = new profile();
        Education education = new Education();
        Work work = new Work();
        Skill skill = new Skill();
        Project project = new Project();
        Certification certification = new Certification();
        Language language = new Language();
        Hobbies hobbies = new Hobbies();
        Reference reference = new Reference();
        Personal personal = new Personal();

        Profile.input();
        education.input();
        work.input();
        skill.input();
        project.input();
        certification.input();
        language.input();
        hobbies.input();
        reference.input();
        personal.input();
    }
}
