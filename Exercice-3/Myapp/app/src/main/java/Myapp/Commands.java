 /*
  * Laboreinheit: Algorithmen und Datenstrukturen – Aufgabenblatt 1
  * @author Skander Ayari
  * @Matricule number : 579140
  *  created at 31.05.2021
  */

package Myapp;

import java.util.Scanner;

// This class is for the input of all Keys to start the different classes
public class Commands {

    public static void main() {

        String key;
        Scanner input = new Scanner(System.in);

        for (int x = 0; x < Integer.MAX_VALUE; x++) {
            key = input.next();

                switch (key) {
                    case "1" -> {
                        String a = Console.ReadPrename();
                        String b = Console.ReadSurname();
                        int c = Console.ReadCourseNumber();
                        int d = Console.ReadMatrikelNumber();
                        Student s = new Student(a, b, c, d);
                        Stack.push(s);
                    }
                    case "2" -> Stack.pop();
                    case "3" -> Stack.peek();
                    case "4" -> Stack.empty();
                    case "5" -> Stack.clear();
                    case "6" -> Stack.print();
                    case "7" -> System.out.println("Anzahl der Elemente im Stack ist:" + Stack.size());
                    case "0" -> System.exit(0);
                    }
                }

            }

            }

