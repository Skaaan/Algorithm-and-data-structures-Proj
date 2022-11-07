 /*
  * Laboreinheit: Algorithmen und Datenstrukturen – Aufgabenblatt 1
  * @author Skander Ayari
  * @Matricule number : 579140
  *  created at 31.05.2021
  */

package Myapp;
import java.util.Scanner;


public class Console {



    private static final Scanner scan= new Scanner(System.in);

    public static Scanner getScanner(){
        return scan;
    }


    public static String ReadSurname() {
        Scanner scan = getScanner();
        System.out.print("Please enter surname:");

        return scan.nextLine();
        }

    public static String ReadPrename() {
        Scanner scan = getScanner();
        System.out.print("Please enter prename:");

        return scan.nextLine();
    }

    public static int ReadCourseNumber() {
        Scanner scan = getScanner();
        int x = -1 ;
        while(x < 0) {
            try {
                System.out.println("Please enter course number: ");
                String input = scan.nextLine();

                x = Integer.parseInt(input) ;
            }catch(NumberFormatException e) {
                x = -1;
            }
        }
        return x;
    }


    public static int ReadMatrikelNumber() {
        Scanner scan = getScanner();
        int x = -1 ;
        while(x < 0) {
            try {
                System.out.println("Please enter matriculation number: ");
                String input = scan.nextLine();

                x = Integer.parseInt(input) ;
            }catch(NumberFormatException e) {
                x = -1;
            }
        }
        return x;
    }





}