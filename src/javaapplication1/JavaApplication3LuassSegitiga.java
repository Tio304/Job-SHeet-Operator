/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication3LuassSegitiga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi
        double luas;
        int alas, tinggi;
        
        // memuat scanner baru
            Scanner read = new Scanner(System.in);
        
        // Input
        System.out.println("== Program hitung luas segituga ==");
        System.out.print("Input alas: ");
        alas = read.nextInt ();
        System.out.print("Input tinggi: ");
        tinggi = read.nextInt();
        
        // proses
        luas = Double.valueOf(alas * tinggi / 2);
        
        // output
        System.out.println("Luas = " +  luas);
    }
    
}
