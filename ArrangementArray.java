import java.util.Arrays;
import java.util.Scanner;

public class ArrangementArray {
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        //Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
        System.out.print("Dizinin boyutu n : ");
        Scanner input= new Scanner(System.in);
        int sayi = input.nextInt();

        int [] list = new int[sayi];
        for (int i=0; i<list.length; i++){
            int arr = input.nextInt();
            list[i]=arr;
            System.out.println((i+1) +". Elamanı : " + arr);
        }

        Arrays.sort(list);
        System.out.println("Sıralama : "+ Arrays.toString(list));



    }





}
