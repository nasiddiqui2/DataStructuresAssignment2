import java.util.Scanner;
public class ReverseOrder
{
 public static void main(String[] args)
 {
     System.out.println("Enter 5 words/numbers: ");
     String array[] = new String [5];
     String temp;
     for (int i = 0; i < 5; i++)
     {
         Scanner scan = new Scanner (System.in);
         array[i] = scan.nextLine();
     }
   
    for (int i = 0; i < array.length/2; i++)
    {
        temp = array [i];
        array [i] = array[array.length-1 - i];
        array[array.length-1 -i] = temp;
    }
    for (int i = 0; i < array.length; i++)
    {
        System.out.println(array[i]);
    }
 }
}
