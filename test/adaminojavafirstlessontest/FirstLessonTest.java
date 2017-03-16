/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavafirstlessontest;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author gta1
 */
public class FirstLessonTest {

    public FirstLessonTest() {
    }

    @Test
    public void testArrayListOfSemesters() {
        FirstLesson instance = new FirstLesson();

        List<Integer> expResult = new ArrayList<>();
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        expResult.add(4);
        expResult.add(5);

        List<Integer> result = instance.getArrayListOfSemesters();

        assertTrue(expResult.equals(result));
    }

    @Test
    public void testArrayOfSemesters() {
        FirstLesson instance = new FirstLesson();

        int[] expResult = new int[]{1, 2, 3, 4, 5};

        int[] result = instance.getArrayOfSemesters();

        assertArrayEquals(expResult, result);
    }

    @Test
    public void testReturnOnSecondSemester() {
        FirstLesson instance = new FirstLesson();

        String expEmptyResult = "";
        int expResult = 1;
        String result1 = instance.returnOnSecondSemester(1);
        String result2 = instance.returnOnSecondSemester(2);
        String result3 = instance.returnOnSecondSemester(3);
        String result4 = instance.returnOnSecondSemester(4);
        String result5 = instance.returnOnSecondSemester(5);
        String resultDefault = instance.returnOnSecondSemester(1337);

        assertEquals("Failed switch case 1", expEmptyResult, result1);
        assertTrue("Failed switch case 2", expResult <= result2.length());
        assertEquals("Failed switch case 3", expEmptyResult, result3);
        assertEquals("Failed switch case 4", expEmptyResult, result4);
        assertEquals("Failed switch case 5", expEmptyResult, result5);
        assertEquals("Failed switch case default", expEmptyResult, resultDefault);
    }

    @Test
    public void testPrintStudent() {
        FirstLesson instance = new FirstLesson();

        instance.printStudentName();
    }

    @Test
    public void testPrintLearningStudent() {
        FirstLesson instance = new FirstLesson();

        instance.printLearningStudent();
    }

    @Test
    public void testCreateNewFirstYearStudent() {
        FirstLesson instance = new FirstLesson("Student");

        int expSemester = 1;
        int semesterResult = instance.getCurrentSemester();
        assertEquals(expSemester, semesterResult);

        boolean expIsLearning = false;
        boolean isLearningResult = instance.isIsLearning();
        assertEquals(expIsLearning, isLearningResult);
    }

    /**
     * Test of getStudentName method, of class FirstLesson.
     */
    @Test
    public void testGetStudentName() {
        FirstLesson instance = new FirstLesson();

        int amountOfCharInString = 0;
        String result = instance.getStudentName();

        assertTrue(amountOfCharInString < result.length());
    }

    /**
     * Test of isIsLearning method, of class FirstLesson.
     */
    @Test
    public void testIsIsLearning() {
        FirstLesson instance = new FirstLesson();
        boolean expResult = true;
        boolean result = instance.isIsLearning();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentSemester method, of class FirstLesson.
     */
    @Test
    public void testGetCurrentSemester() {
        FirstLesson instance = new FirstLesson();
        int expResult = 2;
        int result = instance.getCurrentSemester();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTEACHER method, of class FirstLesson.
     */
    @Test
    public void testGetTEACHER() {
        String expResult = "adam";
        String result = FirstLesson.getTEACHER().toLowerCase();
        assertEquals(expResult, result);
    }

}
