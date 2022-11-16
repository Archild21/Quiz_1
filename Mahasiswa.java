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

public class Mahasiswa extends Penduduk{
    //definisi atribut pada mahasiswa
    private String NIM;
    private double IPK;
    Scanner Sc = new Scanner(System.in); 
    
    //method setting mahasiswa 
    public void setMahasiswa(){
        System.out.println("Masukkan NIK");
        super.NIK = Sc.nextLine();
        System.out.println("Masukkan Nama : ");
        super.Nama = Sc.nextLine();  
        System.out.println("Masukkan Alamat : ");
        super.Alamat = Sc.nextLine();
        System.out.println("Masukkan NIM : ");
        NIM = Sc.nextLine();
        System.out.println("Masukkan Umur : ");
        super.Umur = Sc.nextInt();
        System.out.println("Masukkan IPK : ");
        IPK = Sc.nextDouble();
    }
    //method mencari beasiswa
    public void dataBeasiswa(){
          if(IPK > 3.5){
              System.out.println("Mahasiswa bernama "+Nama+" berhak mendapatkan beasiswa");
          }else{
              System.out.println("Mahasiswa bernama "+Nama+" tidak berhak mendapatkan beasiswa");
          }
      }
    //mehotd cetak data mahasiswa
    public void cetakMahasiswa(){
        super.tampilDataPenduduk();
        System.out.println("NIM : "+ NIM);
        System.out.println("IPK : "+ IPK);
        dataBeasiswa();
    }
}
