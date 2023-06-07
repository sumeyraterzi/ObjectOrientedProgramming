public class FrekansArray {
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] kontrol = new boolean[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            int count = 0;
            if (!kontrol[i]) {
                for (int j = i; j < dizi.length; j++) {
                    if (i != j && dizi[i] == dizi[j]) {
                        count++;
                        kontrol[j]=true; // Elemanın tekrar ettiği indeksler kontrol edildi olarak işaretlenir
                    }
                    }

                }
                if (count > 0)
                    System.out.println(dizi[i] + " sayısı " + count + " kere tekrar edildi. ");


            }
        }
    }
}
