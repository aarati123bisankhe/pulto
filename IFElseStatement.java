public class IFElseStatement {
    public static void main(String[] args) {
        /*simple if example */
        if(true){
            System.out.println("True statement");
        }
        /*if takes an expression with boolean value */
        int num1 = 10, num2 = 20;
        if(num1 > num2){
            System.out.println("Greater");
        }else{
            System.out.println("Lesser");
        }
        /*if else if, two condition */
        if(num2 == num2){
            System.out.println("Equals");
        }else if(num1 < num2){
            System.out.println("Lesser num2");
        }else{
            System.out.println("Greater");
        }
        /*note that else should be at last and is not mandatory */

        /* if else if ladder multiple condition */
        if(num1 < 0){
            System.out.println("Num1 is negative");
        }else if(num2 < 0){
            System.out.println("Num2 is negative");
        }else if(num1 != num2){
            System.out.println("Not equal");
        }else if(num1 > num2){
            System.out.println("Greater");
        }else{
            System.out.println("Default statement");
        }
        /*If any condition matches it will skip all the remaining
         * conditional including else, condition will be checked from
         * top-bottom
         */

         /* nested if condition */
         if(num1 > 0){
            if(num1 > num2){
                System.out.println("positive and greater");
            }else{
                System.out.println("positive and lessar");
            }
            {else{
                if(num1 > num2){
                    System.out.println("negative and greater");
                }else{
                    System.out.println("Negative and lesser");
                }
            }

            }
         }
    }
    
}
