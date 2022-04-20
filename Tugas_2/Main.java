package Tugas_2;
import java.util.Scanner;

public class Main {
    static void info_pakaian(){
        Scanner input = new Scanner(System.in);
        int pilihan;
        Kaos jenis1= new Kaos();
        Kemeja jenis2= new Kemeja();
        Erigo merk1_a= new Erigo();
        Greenlight merk1_b= new Greenlight();
        Poshboy merk2_a= new Poshboy();
        Levis merk2_b= new Levis();
        pakaian induk= new pakaian();

        induk.tampilan1();

        System.out.print("Masukan nomor pilihan anda : ");
        pilihan = input.nextInt();

        if(pilihan == 1)
        {
            jenis1.tampilan2();
            merk1_a.tampilan3();
            merk1_b.tampilan3();
        }
        else if(pilihan == 2)
        {
            jenis2.tampilan2();
            merk2_a.tampilan3();
            merk2_b.tampilan3();
        }
        else
        {
            System.out.println("Input Salah!");
        }
    }
}
