package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Luas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi
        Double pi, r , luas;
        
        // Deskripsi
        r = 10.0;
        pi = 3.14;
        
        // Proses
        luas = pi * r * r;
        
        // Output
        System.out.print("Luas lingkaran= ");
        System.out.println(luas);
    }
    
}
