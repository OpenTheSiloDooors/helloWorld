public class helloWorld {
    public static void main(String[] args) throws Exception {
        //declaring my variables
        String myNameIs;
        byte myAgeIs;

        myNameIs = "Jacob";
        myAgeIs = 16;
        
        //declaring Mom's variables
        String momNameIs;
        String momAgeIs;

        momNameIs = "Leslie";
        momAgeIs = "null";

        //declaring Dad's variables

        String dadNameIs;
        String dadAgeIs;

        dadNameIs = "David";
        dadAgeIs = "null";

        //declaring Sister's variables

        String sisterNameIs; 
        byte sisterAgeIs;

        sisterNameIs = "Lucy";
        sisterAgeIs = 13;

        //Hello world - print my variables
        System.out.println("Hi, my name is " + myNameIs + ", I am " + myAgeIs + " years old. ");
        
        //Hello world - print Mom's variables
        System.out.println("\nMy mom's name is " + momNameIs + ", she is " + momAgeIs + " years old. ");

        //Hello world - print Dad's variables
        System.out.println("\nMy dad's name is " + dadNameIs + ", he is " + dadAgeIs + " years old.");

        //Hello world - print Sister's variables
        System.out.println("\nMy sister's name is " + sisterNameIs + ", she is " + sisterAgeIs + " years old.");
    }
}