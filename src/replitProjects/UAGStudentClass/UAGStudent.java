package replitProjects.UAGStudentClass;

public class UAGStudent {
    public String name, studentID;
    public int grade;
    public static String principalName;
    public static int nextID;

    static{
        principalName = "Ms. McKoy";
        nextID = 100;
    }

    public UAGStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
        studentID = name.toUpperCase().substring(0,1)+nextID;
    }
    public static void newPrincipal(String newPrincipalName) {
        principalName = newPrincipalName;
    }
    public static void resetID() {
        nextID = 100;
    }


    public String toString() {
        return "Student's Name: " + name +
                " StudentID: " + studentID;
    }
}
