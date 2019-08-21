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
public class KonversiSuhu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi
        double celcius, fahrenheit;
        
       // memuat sacnner baru
        Scanner read = new Scanner(System.in);
        
        // input
        System.out.println("== Program hitung konversi suhu ==");
        System.out.print("Input suhu fahrenheit: ");
        fahrenheit = read.nextDouble();
     
        
        // proses
        celcius = ((fahrenheit - 32) * 5/9);
        
        // output
        System.out.println("celcius = " + celcius );
        
     
        
               
    }
    
}
