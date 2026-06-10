package Tuprak1;

import java.util.Scanner;
public class No_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan Tanggal Lahir (dd-mm-yy) :");
        String tanggal= a.nextLine();
        String[] bagian = tanggal.split("-");
        int hari= Integer.parseInt(bagian[0]);
        if (hari<1 || hari > 31){
            System.out.println("Tanggal tidak valid");
        }
        int bulan = Integer.parseInt(bagian[1]);
        if (bulan <1||bulan>12){
            System.out.println("Bulan tidak valid");
            return;
        }
        String month = "";
        switch(bulan){
            case 1:
                month = "Januari";
                break;
            case 2:
                month = "Februari";
                break;
            case 3 :
                month = "Maret";
                break;
            case 4 :
                month = "April";
                break;
            case 5 :
                month = "Mei";
                break;
            case 6 :
                month = "Juni";
                break;
            case 7 :
                month = "Juli";
                break;
            case 8 :
                month = "Agustus";
                break;
            case 9 :
                month = "September";
                break;
            case 10 :
                month = "Oktober";
                break;
            case 11 :
                month = "November";
                break;
            case 12 :
                month = "Desember";
                break;
        }
        int tahun = Integer.parseInt(bagian[2]);
        if (tahun>26){
            tahun+=1900;
        }
        else if (tahun <=0){
            System.out.println("Tahun tidak valid");
        }
        else{
            tahun+=2000;
        }
        System.out.println(hari + " "+ month + " "+ tahun + " ");
    }
}

