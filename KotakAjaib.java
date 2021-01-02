import java.util.Arrays;
import java.util.Scanner;

public class KotakAjaib {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        /*
        contoh input 
        
1 2 3
1 2 3
1 2 3
        
        */
        
//        int[][] matrix = {
//            {1, 2, 7}, 
//            {1, 2, 9}, 
//            {1, 2, 9}
//        };
        
        makeMagicSquare(matrix);
    }
    
    static void makeMagicSquare(int[][] matrix){
        int max = matrix[0][0] + matrix[1][0] + matrix[2][0];
        int hasil;
        
        // cari nilai max
        for (int i = 0; i < 3; i++) {
            hasil = matrix[0][i] + matrix[1][i] + matrix[2][i];
            if(max < hasil){
                max = hasil;
            }
            
            hasil = matrix[i][0] + matrix[i][1] + matrix[i][2];
            if(max < hasil){
                max = hasil;
            }
        }
        
        //print max 
        System.out.println(max);
        
        //membuat kotak ajaib 
        int angkaA = max / 3;
        int angkaB = angkaA+1;
        int modMax = max % 3;
        
         if(modMax == 0){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = angkaA;
                }
            }
        } else if (modMax == 1) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = angkaA;
                }
            }
            
            matrix[0][0] = angkaB;
            matrix[1][2] = angkaB;
            matrix[2][1] = angkaB;
            
        } else if(modMax == 2){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = angkaB;
                }
            }
            
            matrix[0][0] = angkaA;
            matrix[1][2] = angkaA;
            matrix[2][1] = angkaA;
        }
        
        //print matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
