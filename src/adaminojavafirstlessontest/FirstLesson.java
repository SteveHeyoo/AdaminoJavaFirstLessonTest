/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavafirstlessontest;

import java.util.ArrayList;
import java.util.List;

public class FirstLesson {

    //Create field to hold studentFirstName, initialize it to your first name
    private final String studentName;
    //Create field to hold the value isLearning, initialize it to true
    private boolean isLearning;
    //Create field to hold an int called currentSemester, initialize it to 2
    private int currentSemester;
    //Create a public constant field to hold a name called TEACHER, initialize to Adam
    private static final String TEACHER = "Adam";

    private int[] arrayOfSemesters;

    private List<Integer> arrayListOfSemesters;

    public FirstLesson() {
        studentName = "Student";
        isLearning = true;
        currentSemester = 2;
        arrayOfSemesters = new int[]{1, 2, 3, 4, 5};
        arrayListOfSemesters = new ArrayList<>();
        arrayListOfSemesters.add(1);
        arrayListOfSemesters.add(2);
        arrayListOfSemesters.add(3);
        arrayListOfSemesters.add(4);
        arrayListOfSemesters.add(5);
    }

    //Create a constructor which can take studentFirstName as argument and sets the value of isLearning to false and currentSemester to 1
    public FirstLesson(String studentName) {
        this.studentName = studentName;
        isLearning = false;
        currentSemester = 1;
    }

    //Create a method to print studentName to the console called printStudentName
    public void printStudentName() {
        System.out.println(studentName);
    }

    //Create a method to print studentName if the value isLearning is true, call it printLearningStudent
    public void printLearningStudent() {
        if (isLearning) {
            printStudentName();
        }
    }

    /*
     * Create a method that takes an int "semester" as argument
     * and returns studentName in case the int equals 2 and returns an empty
     * value in case semester is 1, 3, 4, 5 or default
     * Call it returnOnSecondSemester
     */
    public String returnOnSecondSemester(int semester) {
        String emptyString = "";
        switch (semester) {
            case 2:
                return studentName;
            default:
                return emptyString;
        }
    }

    /*
     * Create an int Array field which contains numbers from 1 to 5,
     * call it arrayOfSemesters
     * remember to create a getter for it afterwards!
     */
 /*
     * Create an Integer ArrayList field that also contains the numbers from 1
     * to 5,
     * call it arrayListOfSemesters
     * remember to create a getter for it afterwards
     */
    //Create a method to set the value isLearning to a new value
    public void setIsLearning(boolean isLearning) {
        this.isLearning = isLearning;
    }

    //Create methods to get all the fields from this class
    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getStudentName() {
        return studentName;
    }

    public boolean isIsLearning() {
        return isLearning;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public static String getTEACHER() {
        return TEACHER;
    }

    public int[] getArrayOfSemesters() {
        return arrayOfSemesters;
    }

    public List<Integer> getArrayListOfSemesters() {
        return arrayListOfSemesters;
    }

}
