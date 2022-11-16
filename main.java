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


public class main {
    public static void main(String[] args){
        //array objet mahasiswa
        Mahasiswa Ma[] = new Mahasiswa[2];
        Ma[0] = new Mahasiswa();
        Ma[1] = new Mahasiswa();
        //array object dosen
        Dosen Do[] = new Dosen[2];
        Do[0] = new Dosen();
        Do[1] = new Dosen();
        //loop atur mahasiswa
        System.out.println("==========Input Mahasiswa==========");
        for(int x = 0;x < 2;x++){
            Ma[x].setMahasiswa();
            System.out.println("");
        }
        //loop tampil mahasiswa
        System.out.println("===========Data Mahasiswa==========");
        for(int x = 0;x < 2;x++){
            Ma[x].cetakMahasiswa();
            System.out.println("");
        }
        //atur dosen
        System.out.println("=============Input Dosen===========");
        for(int x = 0;x < 2;x++){
            Do[x].setDosen();
            Do[x].Tunjangan();
            System.out.println("");
        }
        //loop tampil dosen
        System.out.println("=============Data Dosen============");
        for(int x = 0;x < 2;x++){
            Do[x].tampilDataDosen();
            System.out.println("");
        }
    }
}
