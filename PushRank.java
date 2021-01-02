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
public class PushRank {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] ranked = new int[n];
        for (int i = 0; i < n; i++) {
            ranked[i] = scanner.nextInt();
        }
        
        int m = scanner.nextInt();
        int[] player = new int[m];
        for (int i = 0; i < m; i++) {
            player[i] = scanner.nextInt();
        }
        
        /*
        contoh input
        
4
200 150 150 90
3
80 90 210
        
        */
        
//        int n = 5;
//        int ranked[] = {200, 150, 150, 90, 60};
//        int m = 5;
//        int[] player = {70, 80, 90, 210, 400};
        
        getLatestRank(n, m, ranked, player);
    }
    
    static void getLatestRank(int n, int m, int[] ranked, int[] player){
        
        //arr untuk menyimpan arr ranked yang tidak ada duplikasi
        int[] newRanked = new int[n];
        
        int newN = 1;
        newRanked[0] = ranked[0];
        
        //hapus duplikasi di arr ranked
        for (int i = 1; i < n; i++) {
            if(ranked[i-1]!=ranked[i]){
                newRanked[newN] = ranked[i];
                newN++;
            }
        }
        
        //mencari rank sesuai score
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < newN; j++) {
                if(player[i] >= newRanked[j] ){
                    System.out.println(j+1);
                    break;
                } else if (j+1 == newN) {
                    System.out.println(j+2);
                }
            }
        }
    }
}
