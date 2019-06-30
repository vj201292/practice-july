package interview;

import java.util.Arrays;

public class ReverseTest {

    public static void main(String[] args) {

        System.out.println(  reverse("madam i am adam"));
        System.out.println("-----------------");
         reverse2("madam i am adam");

         reverse3("abcd");

    }

    private static void reverse3(String str) {

        String strArray[] = str.split("");
        for(int i=strArray.length-1;i>=0;i--){
            System.out.print(strArray[i]+"");
        }


    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void reverse2(String str){
        char chars[]=str.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]);
        }



    }
}
