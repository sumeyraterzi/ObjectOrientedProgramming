package Practical;

import BoxingGame.Match;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number= rand.nextInt(100);
        //int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int right=0;
        int selected;
        int [] wrong= new int [5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while( right<5) {
            System.out.println("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println(" Lütfen 0-100 arası bir değer giriniz !");

                if (isWrong) {
                    right++;
                    System.out.println(" Çok hatalı giriş yaptınız . Kalan hakkınız : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("bir sonraki hatalı girişinizde hakkınızdan düşüşecektir ! ");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler ! Tahmininz doğru !");
                System.out.println("Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz . ");
                if (selected < number) {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür .");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür .");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }
            if(!isWin) {
                System.out.println("kaybettiniz !");
            if(!isWrong){
                System.out.println("Tahminleriniz : "+ Arrays.toString(wrong));
            }
        }


    }
}
