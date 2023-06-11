package MinesweeperGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("HOŞGELDİNİZ ! lütfen kendi maYın tarlanızın kaç boyutlu olacağını giriniz!");
        Scanner input = new Scanner(System.in);
        System.out.print("Boyut __*__ = " );

        int boardSize =input.nextInt();

        Random rand= new Random();
        int [][] board = new int[boardSize][boardSize];
        boolean[][] revealed = new boolean[boardSize][boardSize];

        String  [][] matrixMineMAp = new String [boardSize][boardSize];

        placeMines(board);
        System.out.println("  MAYIN TARLASI OYUNUNA");
        System.out.println( "===== HOŞ GELDİNİZ =====");
        printBoard(board,revealed);
        System.out.println( "========== START ==========");

        boolean gameOver = false;
        while (!gameOver) {
            System.out.print("Satır Girin (0 - " + (boardSize-1 ) + "): ");
            int row = input.nextInt();

            System.out.print("Sütun Girin (0 - " + (boardSize-1) + "): ");
            int col = input.nextInt();

            // Hücreyi kontrol et
            if (checkMine(board, row, col)) {
                System.out.println("Mayına Denk Geldiniz! Oyun Bitti.");
                gameOver = true;
            } else {
                revealed[row][col] = true;
                printBoard(board, revealed);

                // Kazanma kontrolü
                if (checkWin(board, revealed)) {
                    System.out.println("Tebrikler! Oyunu Kazandınız.");
                    gameOver = true;
                }
            }


        }


    }

    //Mayınları yerleştir.
    public static void placeMines(int[][] board) {
        int numMines = (board.length * board.length)/4;  // mayın sayısı: tüm alanın çeyreği kadar.
        int minesPlaced = 0;
        System.out.println();
        System.out.println("MAYINLARIN KONUMU");

        while (minesPlaced < numMines) {
            int row = (int) (Math.random() * board.length);
            int col = (int) (Math.random() * board.length);

            if (board[row][col] != -1) {
                board[row][col] = -1;
                minesPlaced++;
            }
        }
        for (int row=0; row<board.length; row++){
            for (int col=0; col<board.length; col++){
                if(board[row][col] != -1){
                System.out.print(" - ");
            }else System.out.print(" * ");

        }
            System.out.println();
    }
        System.out.println();
    }

    //Oyun tahtasını ekrana yazdır.
    public static void printBoard(int[][] board, boolean[][] revealed) {
        int boardSize = board.length;

        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if (revealed[row][col]) {
                    if (board[row][col] == -1) {
                        System.out.print(" * "); // Mayın görüntüsü
                    } else {
                        System.out.print(board[row][col] + "   "); // Mayın olmayan hücrenin değeri
                    }
                } else {
                    System.out.print(" - "); // Açılmamış hücre
                }
            }
            System.out.println();
        }
    }
    // Konumu kontrol et ve mayına denk gelip gelmediğini döndür
    public static boolean checkMine(int[][] board, int row, int col) {
        return board[row][col] == -1;
    }


    public static boolean checkWin(int[][] board, boolean[][] revealed) {
        int numMines = (board.length * board.length)/4;
        int boardSize = board.length;
        int numCells = (boardSize * boardSize)-numMines;
        int numRevealed = 0;

        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if (revealed[row][col]) {
                    numRevealed++;
                }
            }
        }

        return numRevealed == numCells;
    }


    }


