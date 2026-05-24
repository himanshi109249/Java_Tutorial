public class Operators {
    public static void main (String args[]){
        int num1 = 12;
        int num2 = 14;

        //Arithmetic Operators
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        //Post increment Operator a++ : first print the value then increments the number
        //Pre increment operator ++a : first increment the number then prints the value
        int a= 5;
        a++;
        --a;
        System.out.println(a); //o/p: 5

        //Assignment Operators
        num1 += 5;
        num2 -= 6;
        System.out.println(num1 + " " + num2);

        //Comparison Operators
        System.out.println(num1 == num2);
        System.out.println(num1 > num2);
        System.out.println(num1 <= num2);

        //Logical Operators
        int age = 25;

        System.out.println(age > 18 && age < 30);
        System.out.println(age > 30 || age == 25);
        System.out.println(!(age == 25));
    }
}
