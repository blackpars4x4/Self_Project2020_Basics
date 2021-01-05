package replitProjects.R232_Overriding1_Education;

public class LawSchool extends EducationalInstitution {


    public LawSchool() {
        super(3);
    }

    public String graduationRequirements() {
        return  super.graduationRequirements() + " passing the bar";
    }
}
