import java.awt.*;
import java.util.Scanner;
public class Strings {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String aze = "my name is azeer";
        System.out.println("main function input and outputs are : ");
        System.out.println(str);
        System.out.println(aze);
        System.out.println(aze.length());
        System.out.println(aze.charAt(1));
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,5));
        System.out.println("String_of function input and outputs are : ");
        String_of(aze,str);
        System.out.println("buffer_builder() input and outputs are : ");
        buffer_builder(str);
    }
    public static void String_of(String a, String r){
        String aa = a;
        String rr = r;
        System.out.println(a.contains(r));
        System.out.println(a.equals(r));
        System.out.println(a.compareTo(r));
        System.out.println(a.indexOf(r));
        System.out.println(a.toUpperCase());
    }
    public static void buffer_builder(String aa){
        StringBuilder string_1= new StringBuilder(aa);
        StringBuilder String_2 = string_1;
        string_1 = string_1.append("azeersk");
        System.out.println(string_1);
        System.out.println(String_2);
    }
}
