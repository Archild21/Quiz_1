/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz1_C_3077;

/**
 * @author Nicodemus
 * 21103077
 * SIS105C
 */
import java.util.Scanner;
public class Dosen extends Penduduk{
    protected String NIDN,Gol;
    protected int GajiPokok,TotalGaji;
    Scanner Sc = new Scanner(System .in);
    
    void setDosen(){
        System.out.println("Masukkan NIK");
        super.NIK = Sc.nextLine();
        System.out.println("Masukkan Nama : ");
        super.Nama = Sc.nextLine();
        System.out.println("Masukkan Alamat : ");
        super.Alamat = Sc.nextLine();
        System.out.println("Masukkan NIDN : ");
        NIDN = Sc.nextLine();
        System.out.println("Masukkan Golongan : ");
        Gol = Sc.nextLine();
        System.out.println("Masukkan Umur : ");
        super.Umur = Sc.nextInt();
        System.out.println("Masukkan Gaji Pokok : ");
        GajiPokok = Sc.nextInt();
    }
    //method menghitung tunjangan
    void Tunjangan(){
        if("IIIA".equals(Gol)){
            TotalGaji = GajiPokok +300000;
        }else if("IIIB".equals(Gol)){
            TotalGaji =  GajiPokok + 500000;
        }else if("IIIC".equals(Gol)){
            TotalGaji = GajiPokok + 700000;
        }
    }
    // method tampil data dosen        
    void tampilDataDosen(){
        super.tampilDataPenduduk();
        System.out.println("NIDN : "+NIDN);
        System.out.println("Golongan : "+Gol);
        System.out.println("Total Gaji : "+TotalGaji);
        
    }
}
