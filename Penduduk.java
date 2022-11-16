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
public class Penduduk {
    //mendefini atribut penduduk
    protected String NIK, Nama, Alamat;
    protected int Umur;
   
    //method seting penduduk
   public void Penduduk(String a,String b, int c, String d){
       System.out.println("Konstruktor Penduduk berjalan...");
       this.NIK = a;
       this.Nama = b;
       this.Umur = c;
       this.Alamat = d;
   }
    //method tampil
    public void tampilDataPenduduk(){
        System.out.println("NIK : "+NIK);
        System.out.println("Nama : "+Nama);
        System.out.println("Umur : "+Umur);
        System.out.println("Alamat : "+Alamat);
    }
}
