import java.util.Scanner;

/**
 * Write a description of class ClassDayname here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DayName{
 public static void main(String[] args){
    Scanner input=new Scanner(System.in);
        System.out.print("Enter the no of the day ");
        int day =input.nextInt();
        
        //Determine the day using switchcase
        switch (day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invaild day number");
            break;
        }
    }
}

