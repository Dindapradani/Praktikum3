/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skorgame;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Skorgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int random = (int)(Math.random()*101);
        int angka;
        int score=100;
        int jumlah=0;
        
    System.out.println("Hai.. nama saya Mr. Allen, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
           Scanner input =new Scanner(System.in);
        
        do {
            jumlah++;
            System.out.println("Masukan Angka");
            angka=input.nextInt();
            if (angka<random){
                score-=2;
                System.out.println("Duh angkanya terlalu kecil, coba lagi");
                if (score<=0){
                    System.out.println("Yah scorenya 0");
                    break;
                }
            }else if(angka>random){
                score-=2;
                System.out.println("Duh angkanya terlalu besar, coba lagi");
                if (score<=0){
                    System.out.println("Yah scorenya 0");
                    break;
                }
            }else if (angka==random){
                if(jumlah<=5){
                    score+=50;
                    int total=score-50;
                    System.out.println("Yeyyyy Tebakan Anda Benar");
                    System.out.println("Score Anda:"+ total);
                    System.out.println("Bonus : "+ 50);
                    System.out.println("Total Score :"+ score);
                    System.out.println("coba"+ jumlah);
                }else{
                    System.out.println("Yeyyyy Tebakan Anda Benar");
                    System.out.println("Score Anda"+ score);
                    System.out.println("coba "+ jumlah);
                }
            }
        }
        while(angka != random);    
    }     
}

