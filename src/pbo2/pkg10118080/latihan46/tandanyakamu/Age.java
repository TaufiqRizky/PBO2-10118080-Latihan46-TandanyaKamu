/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan46.tandanyakamu;

/**
 *
 * @author USER
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private static final String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return this.yearNow-this.yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        if ((umur >= 0) && (umur <= 5)) {
            return this.red+"LAGI LUCU-LUCU NYA";
        } else if ((umur > 5) && (umur <= 10)) {
            return this.red+"MASIH ANAK-ANAK";
        }else if ((umur > 10) && (umur <= 13)) {
            return this.red+"MASIH REMADJA";
        }else if ((umur > 13) && (umur <= 19)) {
            return this.red+"ALAY";
        }else if ((umur > 19) && (umur <= 29)) {
            return this.red+"LAGI GALAU NYARI JODOH";
        }else if ((umur > 29) && (umur <= 35)) {
            return this.red+"LAGI SIBUK NYARI UANG";
        }else if ((umur > 35) && (umur <= 150)) {
            return this.red+"SUDAH TUA";
        }else  {
            return this.red+"TIDAK TERDETEKSI DI KEHIDUPAN";
        }
    }
    
    
}
