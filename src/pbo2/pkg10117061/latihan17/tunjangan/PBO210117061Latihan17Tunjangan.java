/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan17.tunjangan;

import java.util.Scanner;

/**
 *Nama              :Fachrian Harits Pratama
 *NIM               :10117061  
 *kelas             :if2
 *Deskripsi program :menampilkan total gaji
 */
public class PBO210117061Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double gajiPkk;
        double tunjangan;
        double totalGaji;
        String status;
        String statusSatu = "menikah" ;
        String statusDua = "belum";
        tunjangan = 0;  
        
        Scanner masuk = new Scanner(System.in);
        System.out.println("============Program Tunjangan Gaji===============");
        System.out.print("Berapa gaji pokok anda perbulan?\t: ");
        gajiPkk = masuk.nextDouble();
        System.out.print("status anda (menikah/belum)\t\t: ");
        status  =  masuk.next();//belum ada negasi lowercase
        System.out.println("==========Hasil Perhitungan Gaji Anda============");
        System.out.println("Gaji Pokok\t:" + gajiPkk );
        if(status.equals(statusDua) ){
            System.out.println("Tunjangan\t:" + tunjangan );
        }else{
        tunjangan = gajiPkk*0.35;
            System.out.println("Tunjangan\t:" + tunjangan );
        }
        totalGaji = tunjangan + gajiPkk;
        System.out.println("Gaji Total\t:" + totalGaji );
    }
}
