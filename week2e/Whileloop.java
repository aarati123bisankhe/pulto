import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args){
        int Count = 0;
        /*while takes boolean expression inside()
         * the loop will run repeatattively when the boolean is true 
         * if the boolean is false the loop will end
         */
        while(Count < 5){
        System.out.println("While Loop " + Count);
            ++Count;
        }
        /*in while loop the condition  is checked at the begining
         * if the condition is false in initial check the loop will not run
         */
        System.out.println("please type the value between o-100");
        Scanner scan = new Scanner(System.in);
        int inputvalue = scan.nextInt();
        while(inputvalue < 0 || inputvalue > 100) {
            System.out.println("please input between 0-100");
            inputvalue = scan.nextInt();
            
        }
        System.out.println("End loop");
        scan.close();



    }
    
}
