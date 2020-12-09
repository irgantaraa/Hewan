/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 */
public class Hewan extends infoTambahan {// Biar bisa mengabil data dari class infoTambahan

     
   
    
    public static void main(String[] args) {

            infoTambahan mykucing = new infoTambahan();
            mykucing.Kucing("Hamtaro");
            mykucing.Suara("Mbee");
            mykucing.Umur(10);
            
            mykucing.cingku();
            mykucing.arasu();
            mykucing.rumu();
	}
    
}
