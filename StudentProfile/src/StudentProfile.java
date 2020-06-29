public class StudentProfile {

    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double cGPA;
    String declaredMajor;

    //Constructor
    public StudentProfile(String firstName, String lastName, int expectedYearToGraduate,
                               double cGPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.cGPA = cGPA;
        this.declaredMajor = declaredMajor;
    }

    //Behavior 1
    public int incrementExpectedYearToGraduate(){
        return this.expectedYearToGraduate + 1;
    }

    // Behavior 2
    public String changeMajor(String newMajor){
        return this.declaredMajor =  newMajor;
    }

}
