import java.util.Scanner;
/**
 * Write a description of class StudentGrades here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentGrades{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the marks");
        int marks=input.nextInt();
        
        //The grade using if-else if
        if(marks <40){
            System.out.println("Grade=fail");
        }
        else if (marks >=40 && marks <50){
           System.out.println("Third division");
      }
        else if (marks >=50 && marks <60){
            System.out.println("Second division");
      }  
        else if (marks >=60 && marks <80){
            System.out.println("First division");
      }
         else if (marks >=80){
             System.out.println("Distinction");
      }   else {
             System.out.println("Invalid marks");
         }
  }
}