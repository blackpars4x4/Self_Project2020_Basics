package replitProjects.PersonClass;

public class Person {
    private String firstName, lastName, ssn;
    private int birthMonth, birthDay, birthYear;

    public Person(String firstName, String lastName, String ssn, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getBirthDay() {
        return birthMonth + "/" + birthDay + "/" + birthYear;
    }

    public boolean verifySSN(String inputSSN) {
        return ssn.equalsIgnoreCase(inputSSN);
    }


}
