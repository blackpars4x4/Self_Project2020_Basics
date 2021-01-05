package replitProjects.R232_Overriding1_Education;

public class EducationalInstitution {

    private int years;

    public EducationalInstitution(int years) {
        this.years = years;
    }

    public String graduationRequirements () {
        return years + " years of study";
    }


}

