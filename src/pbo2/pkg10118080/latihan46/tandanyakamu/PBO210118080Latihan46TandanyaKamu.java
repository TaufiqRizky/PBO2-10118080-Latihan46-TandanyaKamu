/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(year);
        System.out.print("Masukan Tahun Lahir Kamu : ");
        Scanner a = new Scanner(System.in);
        age.setYearBirth(a.nextInt());
        
        //output
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda\t: "+age.getYearBirth());
        System.out.println("Hari Ini Tahun\t\t: "+age.getYearNow());
        System.out.println("Umur Kamu Sampai Hari Ini Adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+ age.tandanyaKamu(age.hitungUmur()));
    }
    
}
