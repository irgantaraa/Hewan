/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 
 */
public class Animal {

    /**
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            Binatang kucing = new Binatang();
            kucing.setNama("Hamtaro");
            kucing.setSuara("Meaww");
            kucing.setJenis("Kucing");
            kucing.setUmur(6);            
            
            System.out.println("==============================");
            System.out.println("MENU PROGRAM");
            System.out.println("==============================");
            System.out.println("1. Nama Binatang");
            System.out.println("2. Jenis Binatang");
            System.out.println("3. Suara Binatang");
            System.out.println("4. Umur Binatang");
            System.out.println("5. Tampilkan semua");
            System.out.println("6. Info tambahan");
            System.out.println("==============================");
            System.out.println();
            System.out.print("Tentukan pilihan : ");
            
            Integer pilih = Integer.parseInt(br.readLine());
            
            switch(pilih)
            {
                case 1 :
                    System.out.println("Nama binatang ini adalah "+kucing.getNama());
                    
                    break;
                case 2 :
                    System.out.println("Jenis binatang ini adalah "+kucing.getJenis());
                    
                    break;
                case 3 :
                    System.out.println("Binatang ini memiliki suara "+kucing.getSuara());
                    
                    break;
                case 4 :
                    System.out.println("Binatang ini berumur "+kucing.getUmur()+" bulan");
                    
                    break;
                case 5 :
                    System.out.println("Nama : "+kucing.getNama());
                    System.out.println("Jenis : "+kucing.getJenis());
                    System.out.println("Suara : "+kucing.getSuara());
                    System.out.println("Umur : "+kucing.getUmur()+" bulan");
                    
                    break;
                case 6 :
                    kucing.infoTambahan();
                    break;
            }
                        
	}
    
    
}

