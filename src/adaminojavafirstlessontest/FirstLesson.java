/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavafirstlessontest;

public class FirstLesson 
{
    //Access level modifiers (below), when you make something private, you encapsulat it. Instance variables or fields.
    
    private String studentFirstName;
    private boolean isLearning;
    private int currentSemester;
    public static final String TEACHER = "Adam";//Constant, public static final, helps other programmers identify. Access it via .teacher, we use less memory via using a static variable.
    
    
    //Create field to hold studentFirstName, initialize it to your first name
    //Create field to hold the value isLearning, initialize it to true
    //Create field to hold an int called currentSemester, initialize it to 2
    //Create a public constant field to hold a name called TEACHER, initialize to Adam
    
    
    
    public FirstLesson() 
    {
        studentFirstName = "Bo";//instantiated the variables
        isLearning = true;
        currentSemester = 2;
        
        
        
    }
    
    //Create a constructor which can studentFirstName as argument and sets the value of isLearning to false and currentSemester to 1
    //Brackets give you the option to method overload, via providing parameters
    public FirstLesson(String name) //Method overloading, if you make more methods with the same name (Polymorphism)
    {
        studentFirstName = name; //Dependancy injection, flexability, which means I can make whatever names I want.
        isLearning = false;
        currentSemester = 1;
        
    }
    

    
    //Create a method to print studentName to the console called printStudentName
    
    public void printStudentName()//method declaration, void doesn't return anything, otherwise you'd need a return method "return; blah blah"      
    {
        String name = "bo";//Local variable, only exsists when we run this method
        System.out.println(studentFirstName);
    }
    
    //Create a method to print studentName if the value isLearning is true, call it printLearningStudent
    public void printLearningStudent()
    {
        if (isLearning)//Would normally consider this is true, with having to write (isLearning = true), if you place an "!" infront of isLearning like so !isLearning, it is a reverse operator.
        {
            printStudentName();//Reusability
        }
        
    }
    
    
    /*Create a method that takes an int "semester" as argument
    and returns studentName in case the int equals 2 and returns an empty value in case semester is 1, 3, 4, 5 or default
    Call it returnOnSecondSemester
    */
    public String returnOnSecondSemester(int semester)//Has an int as an arguement and returns a string.
    {
        switch (semester)//Condition, what it validates between your brackets //Switch statement, better than if or else statements, but only if the method you are creating has millions of requirements for if or else.
        { 
            case 2:
                return studentFirstName; //Remember to either return or break for a case, else you'll recieve a fall through.
            default:
                return ""; //Are always required a default value.
        }
        
    }
    
    
    /*Create an int Array field which contains numbers from 1 to 5,
    call it arrayOfSemesters
    remember to create a getter for it afterwards!
     */
 /*Create an Integer ArrayList field that also contains the numbers from 1 to 5,
call it arrayListOfSemesters
remember to create a getter for it afterwards*/
    //Create a method to set the value isLearning to a new value
    //Create methods to get all the fields from this class
}
