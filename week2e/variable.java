public class variable{

    public static void main(string[] args){
        /* Non primitive data type */
        /*Declaration */
        byte byteValue;
        /*Initiliation */
        byteValue = 100;
        /* Declarataion and initialization */
        short shortValue = 200;
        /* Multiple declaration */
        int intValue1, intValue2;
        intValue1 = 10000;
        intValue2 = 2000;
        /* multipe declation and initiztion */
        long longVal1 = -9000, longVal2 = 9000;
        float floatValue = 90.90f; // the letter 'f' is needed
        double doubleValue = 100.897d; // the letter 'd' is optional
        char  charValue = 'c'; // must use single quote  '
        boolean  booleanValue= false;
        /*Illegal  actions below */
        //byte  bytevalue =  100; // we cannot redeclare  the variable
        //bytevalue = 200; // instead use reassignment
        // boooolean bolvar2 = 'false'; // cannot use different type
        // byte byteValue2 = 10000000; // cannot exceed min amd max

        /* Non primitive data type */
        String StringValue  = "This  is String value";
        /*Using class */
        String StringValue2 = new String("This String uses class");
        System.out.println(StringValue2);
        /*object for this we can use the same public class  made */
        Variable VariableObject = new variable();
      }
}