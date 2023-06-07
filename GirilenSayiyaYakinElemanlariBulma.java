import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayiyaYakinElemanlariBulma {
    public static void main(String[] args) {
        // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
        Scanner input= new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number=input.nextInt();

        int [] list={15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        int min=number;
        int max=number;
        for(int i : list){
           if (number <i){
               max=i;
               break;
           }
        for(int x= list.length-1; x>=0; x--){
            if(number >list[x]){
                min=list[x];
                break;
            }

        }


        }
        System.out.println("Dizi : " +Arrays.toString(list));
        System.out.println("Girilen Sayı : "+ number);
        System.out.println("Girdiğiniz sayıya en yakın maksimum değer : " +max);
        System.out.println("Girdiğiniz sayıya en yakın mainumum değer : " +min);



    }
}
