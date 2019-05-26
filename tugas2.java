/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class tugas2 {
    static boolean data (String data, String cari){
        boolean dat1=false;
        if (data.equals(cari)){
            dat1 = true;
        }else if(data.equals(cari)){
            dat1 = true;
        }
        return dat1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        String cari;
        String []data=new String [2];
        data[0] = "bisection";
        data[1] = "secant";
        
        System.out.print("Masukan (bisection/secant) : ");
        cari = input.next();
        
        for (int i=0; i<=1; i++){
            if (data(data[i], cari) == true){
                System.out.println("\nData DITEMUKAN");
                System.out.println("kata : "+cari);
                i+=5;
            }else if(i==1){
                System.out.println("\nData TIDAK ditemukan");
                System.out.println("kata : "+cari);
                System.out.println("\nMasukan bisection/secant");
            }
        }
        
            
            
    }
}
