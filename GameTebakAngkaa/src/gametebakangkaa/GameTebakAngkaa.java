/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaa;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class GameTebakAngkaa {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int random;
    int angka;

    
    random = (int) (Math.random() * 100);
    System.out.println("Hai.. nama saya Mr. Allen, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
    
    Scanner input = new Scanner(System.in);
    

       
    
    do{  System.out.println("Masukkan angka : ");
       angka =  input.nextInt();
       if (angka > random){
                System.out.println("Duh angkanya terlalu besar, coba lagi");  
            }
        else if (angka < random){
                System.out.println("Duh angkanya terlalu kecil, coba lagi");
            }   
        else {
                System.out.println("Yeeeey Tebakan Anda benar!");
            }
    }
     while(angka != random);
}
}