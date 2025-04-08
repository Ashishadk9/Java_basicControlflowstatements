import java.util.Scanner;
/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       
        System.out.print("Enter a number to multiplication table");
        int num=input.nextInt();
        System.out.println("\n multiplication table to "+ num +" ");
          for(int i=1;i<=20;i++){
              System.out.println(num + " x " + i +"="+(num * i));
          } 
        
    }
} 
