public class MaxMinArray {
    public static void main(String[] args) {
        int [] list = {56,67, 34,1,101,-2,-33};
        int min = list[0];
        int max = list[0];

        //forEach
        for(int i:list){
           if (min > i){
               min=i;
           }
           if (max < i){
               max=i;
           }
        }
        System.out.println("En küçük eleman : " + min);
        System.out.println("En büyük eleman : " + max);

        for(int i =0; i< list.length; i++){
            if (min>list[i]){
                min =list[i];
            }if(max<list[i]){
                max=list[i];
            }
        }
        System.out.println("En küçük eleman : " + min);
        System.out.println("En büyük eleman : " + max);
    }
}
