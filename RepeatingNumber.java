import java.util.Arrays;

public class RepeatingNumber {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int starIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (isFind(duplicate, list[i])) {
                        duplicate[starIndex++] = list[i];
                        break;
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(duplicate));
        System.out.print("Tekrar Eden Tüm Sayılar  : ");
        for (int value: duplicate){
            if(value!=0){
                System.out.print( +value + " ");
            }
        }
        System.out.println();
        System.out.print("Tekrar Eden ÇİFT Sayılar :  ");
        for (int value: duplicate){
            if(value!=0 &&  value%2==0){
                System.out.print(+value + " ");
            }
        }

    }
}
