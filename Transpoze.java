import java.lang.reflect.Array;

public class Transpoze {
    public static void main(String[] args) {
        // Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
        int [][] matris= {
                {1,2,3},
                {4,5,6}
        };

        int [][] transpoze = new int[matris[0].length][matris.length];

        for (int i =0; i<matris.length; i++){
            for( int j=0; j<matris[0].length; j++) {
                transpoze[j][i] = matris[i][j];
            }

        }
        for ( int[] row: transpoze){
            System.out.print("{");
            for (int col: row){

                System.out.print(" " + col + " ");

            }System.out.print("}");
            System.out.println();
        }

    }
}
