/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan46.tandanyakamu;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program masa manusia berdasarkan umur
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private static String red;
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        if (umur>=0 && umur<=5) {
            red = "LAGI LUCU-LUCUNYA";
        } else if (umur>5 && umur<=10) {
            red = "MASIH ANAK-ANAK";
        } else if (umur>10 && umur<=13) {
             red = "MASIH REMAJA";
        } else if (umur>13 && umur<=19) {
            red = "ALAY";
        } else if (umur>19 && umur<=29) {
            red = "LAGI GALAU NYARI JODOH";
        } else if (umur>29 && umur<=35) {
            red = "LAGI SIBUK NYARI UANG";
        } else if (umur>35 && umur<=150) {
            red = "SUDAH TUA";
        } else {
            red = "TIDAK TERDETEKSI KEHIDUPAN";
        } 
        return red;
    }
}