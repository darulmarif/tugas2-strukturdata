/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author user
 */
public class main {
     public static void main (String[] arg){
        calonPegawai a = new  calonPegawai();
         a.isiBiodata();
         a.interview();
        
        
        System.out.println("\nnama saya            : "+a.nama);
        System.out.println("Tempat tanggal lahir : "+a.ttl);
        System.out.println("jenis Kelamin        : "+a.jenisKelamin);
        System.out.println("umur saya            : "+a.umur + " tahun");
        System.out.println("tinggi berat badan   : "+a.TB + "cm  " +a.BB+ "kg" );
        System.out.println("pendidikan terakhir  : "+a.pendidikan); 
        System.out.println("kemampuan/keahlian   : "+a.kemampuan);
        System.out.println("pengalaman kerja     : "+a.pengalaman);
       
    }
}

