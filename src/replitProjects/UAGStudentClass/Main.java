package replitProjects.UAGStudentClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UAGStudent s1 = new UAGStudent("Muhammed",11);
        UAGStudent s2 = new UAGStudent("Alan",11);
        UAGStudent s3 = new UAGStudent("Sophie",11);

        assertEquals("Ms. McKoy", s1.principalName);
        assertEquals("M100",s1.studentID);
        assertEquals("A101",s2.studentID);
        assertEquals("S102",s3.studentID);

        UAGStudent.newPrincipal("Mr. McKoy");
        assertEquals("Mr. McKoy",s1.principalName);

        UAGStudent.resetID();
        UAGStudent s4 = new UAGStudent("kevin",11);
        assertEquals("K100",s4.studentID);
        assertEquals("kevin K100",s4.toString());
    }

    private static void assertEquals(String k100, String studentID) {
        System.out.println(k100 + "\n"+ studentID);
    }
}
