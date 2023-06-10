package Practical;

import java.util.Scanner;

public class PolyndromicWord {

    static  boolean isPolindromik (String str) {
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Kelime polindromik değil");
                return false;
            }
        i++;
        j--;
    }
        System.out.println("Kelime polindromik !");
        return true;
    }

    static boolean isPolindromik2(String str){
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("Kelime polindromik !!");
            return true;
        }
        System.out.println("Kelime polindromik değil !");
        return false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Polindromik kelime olup olmadığını merak ettiğiniz kelimeyi giriniz : ");
        String word= input.nextLine();

        isPolindromik(word);
        isPolindromik2("kavak");


    }
}
