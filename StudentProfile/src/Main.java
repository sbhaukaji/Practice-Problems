/* This program creates a Student Profile from provided attributes
   It uses StudentProfile class to return student's graduation year and major
*/

public class Main {
    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Shyam", "Rajan", 2020, 3.89, "Biomedical Engineering");
        StudentProfile studentB = new StudentProfile("Jon", "Doe", 2021, 4.0, "ComputerScience");

        int studentAGraduateYear = studentA.incrementExpectedYearToGraduate();
        System.out.println("Student A was suppose to graduate in "+ studentA.expectedYearToGraduate + " but now he will graduate in " + studentAGraduateYear);

        String newMajor = studentB.changeMajor("Mathematics");
        System.out.println("Student B changed his major from " + studentA.declaredMajor + " to " + newMajor);
    }
}
