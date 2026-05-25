public class Strings {
    public static void main (String args[]){
        String text = "Hellooooo";

        //length() method: to find the length of the string
        System.out.println(text.length());

//        toUpperCase() method converts a string to upper case letters
//        toLowerCase() method converts a string to lower case letters.

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        //indexOf() : returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
        String txt1 = "   Please locate where 'locate' occurs!    ";
        System.out.println(txt1.indexOf("locate"));

        //charAt() method to access a character at a specific position in a string
        System.out.println(text.charAt(1));

        //To compare two strings, you can use the equals() method
        System.out.println(text.equals(txt1));

        //trim() method removes whitespace from the beginning and the end of a string
        System.out.println(txt1.trim());
        }

}
