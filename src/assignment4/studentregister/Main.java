package assignment4.studentregister;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    StudentRegister register = new StudentRegister();
        System.out.println("Type anything and press enter to begin...");

        String userInput = sc.nextLine();
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/1000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/2000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/3000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/4000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/5000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/6000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/7000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/8000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/9000.json");
        register.readStudentsFromFile("C:/Github/Assignment4Mobile/src/assignment4/mockdata/10000.json");
        System.out.println("Size is: " +register.GetStudentList().size());



        List<StudentInfo> studentList = register.GetStudentList();
        Sorter sortingAlgorithms = new Sorter();
        long start = System.nanoTime();
        sortingAlgorithms.InsertionSort((studentList));
        //sortingAlgorithms.BubbleSort((studentList));
        long elapsedTime =  System.nanoTime() - start;
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;
        System.out.println("Nano: " + elapsedTime);
        System.out.println("Seconds: " + elapsedTimeInSecond);
    }
}
