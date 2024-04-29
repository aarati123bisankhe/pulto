public class jumpstatement {
    public static void main(String[] args){
        /*break and continue are jump statemnt in java
         * break will terminate the loop
         */
        for(int index = 0; index < 5; index++ ){
            if(index == 3){
                break; // this line will break the loop scope
            }
            System.out.println("Index " + index);
        }
        /*can be used in any loop */
        int count = 0;
        while(count <=10 ) {
            if(count == 1) {
                break;
            }
            System.out.print("Count " + count);
            count++;
        }
        /*continue statemnt will skip the loop */
        for(int index = 0; index < 5; index ++){
            if(index == 3) {
                continue;
            }
            System.out.println("continue index" + index);
         }

         /*task wap to eun for loop from -5 to 5
          * break the loop if the index is postive
          */

          for(int i = -5; i <=5;  i++) {
            System.out.println("current index: " + i);
            if (i >= 0){
                System.out.println("Index is postive. Breaking the loop.");
                break;

            }

          }

          /*task 2
           * loop from 1 - 20 using for loop
           * only print the value if it is even
           * use continue to do this task
           */
          for(int i = 1; i<=20; i++){
                 if(i % 2 == 0){
                    System.out.println("the number is" + i);
                 }
                 else{
                    continue;
                 }
          }

    }
    
}
