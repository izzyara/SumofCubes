import java.util.*;
public class sumofcubes{

/*
        Izzy Arabe
        9/9/24
        sum of cubes 
        calculate sum of cubes of all digits inputted by user
*/
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();
        int digit;
        int sum;
        int cubed;

        while(num>10){
            digit = num%10;
            cubed = digit*digit*digit;
            sum = cubed
            num = (num - digit)/10;
        }
    


        System.out.println("The sum of the cubes of each digit is: " + sum);

        input.close();
    }
}