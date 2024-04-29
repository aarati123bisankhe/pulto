import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        int num1 = 0;
        while(num1 < 0){
            System.out.println("while checks condition first;");
        }

        /*do while checks condition after first iteraction */
        do{
            System.out.println("Do while check condition after");
        }while(num1 < 0);
        /*this means do while loop runs at least once */

        /*task
         * use a while loop to
         * ask user for an int value
         * if the user input positive value
         * promot user to input negative int value
         */
         Scanner scan = new Scanner(System.in);
         System.out.println("please enter a number");
         int input = scan.nextInt();
         while(input >=0 ){
            System.out.println("please enter negative number");
            input = scan.nextInt();

         }
         System.out.println("the negative value is " + input);
         scan.close();

         }
    }
    

