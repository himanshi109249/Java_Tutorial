public class TypeCasting {
    public static void main(String args[]){
//        Widening Casting (automatic) - converting a smaller type to a larger type size
//        byte -> short -> char -> int -> long -> float -> double

        int num = 23;
        double doubleNum = num;
        System.out.println(doubleNum);

//        Narrowing Casting (manual) - converting a larger type to a smaller type size
//        double -> float -> long -> int -> char -> short -> byte
//        in explicit conversion, it loses some value
        double percentage = 56.89d;
        int percentageInInteger = (int)percentage;
        System.out.println(percentageInInteger);

    }
}
