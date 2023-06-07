public class AvarageArray {
    public static void main(String[] args) {
        int [] list= {1,2,3,4,5,6,7,8};
        double sum =0.0;
        double hsum=0.0;
        double avarege=0.0;

        for (int i =0; i< list.length; i++){
            sum += list[i];
            hsum +=1.0/list[i];
        }
        System.out.println("Dizideeki elemanların toplamı : "+ sum);
        avarege= sum / list.length;
        double hAvarage = list.length / hsum;
        System.out.println("Dizideki elemanların ortalaması : "+ avarege);
        System.out.println("Dizideki elemanların harmonik ortalaması : "+ hAvarage);


    }
}
