/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesprogrammingnbs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class RotasiKiri {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        int arrLength = scanner.nextInt();
        int[] arrAngka = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arrAngka[i] = scanner.nextInt();
        }
        
        int jumlahRotasi = scanner.nextInt();
        
        /*
        contoh input 

7
2 1 3 4 5 1 2
10        
        
        */
      
//      int[] arrAngka = {2, 1, 3 , 4, 5 ,1 ,2};
//      int jumlahRotasi = 10;
      
        rotateLeft(arrAngka,jumlahRotasi);
    }

    static void rotateLeft(int[] arrAngka, int jumlahRotasi){
        int[] arrAngkaHasil = new int[arrAngka.length];
        
        int j = jumlahRotasi % arrAngka.length;
        
        for(int i = 0; i<arrAngka.length; i++){
            
            if(j == arrAngka.length){
                j = 0;
            } 
            
            arrAngkaHasil[i] = arrAngka[j];
            j++;
        }
        
        System.out.println(Arrays.toString(arrAngkaHasil));
    }
    
}
