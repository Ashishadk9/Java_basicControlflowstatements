
/**
 * Write a description of class EvenOddNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOddNumbers{
    public static void main(String[] args){
        int i=1;
           System.out.println("Even numbers from 1 to 100");
           while(i<=100){
               if(i%2==0){
                   System.out.print(i+ " ");
               }
               i++;
           }
           System.out.println("\nOdd numbers from 1 to 100");
           i=1;
              while(i<=100){
                  if(i%2!=0){
                      System.out.print(i+ " ");
                  }
                  i++;
              }
            }
}