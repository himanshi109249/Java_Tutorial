public class Variables {
    public static void main (String args[]){
        int rollNumber = 23;
        System.out.println(rollNumber);
        String name = "Kiara";
        System.out.println(name);
        System.out.println(name + ": " + rollNumber );


        final int myNum = 53;
        //myNum = 45; //Error: cannot assign a value to final variable myNum
        // a variable should only be declared final if its value will not change in future
        System.out.println(myNum);
    }
}
