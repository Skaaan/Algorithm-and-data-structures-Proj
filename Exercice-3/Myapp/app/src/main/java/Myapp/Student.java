 /*
  * Laboreinheit: Algorithmen und Datenstrukturen – Aufgabenblatt 1
  * @author Skander Ayari
  * @Matricule number : 579140
  *  created at 31.05.2021
  */

package Myapp;

public class Student {
    private final String surname;
    private final String prename;
    private final int course; // TODO: ENUM
    private final int matriculationNumber;

    public Student(String surname, String prename, int course, int matriculationNumber) {
        super();
        this.surname = surname;
        this.prename = prename;
        this.course = course;
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public String toString() {
        return "Student [surname=" + surname + ", prename=" + prename + ", course=" + course + ", matriculationNumber="
                + matriculationNumber + "]";
    }



}