public class IfElse {
    public static void main (String[] args){
        int time = 13;
        if (time<12){
            System.out.println("Good Morning");
        }else if (time == 12){
            System.out.println("Good afternoon");

        }else{
            System.out.println("Good evening");
        }
        //Ternary Operator
        int num = 5;
        String result = (num>4) ? "greater than 4" : "smaller than 4";
        System.out.println(result);
    }




}
