/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 */
public class infoTambahan {
    private String NamaKucing, sound;
    private int umur;
    
        public void Kucing(String name){
		NamaKucing = name;
	}

	public void Suara(String suara){
		sound = suara;
	}

	public void Umur(int ageCat){
		umur = ageCat;
	}
        
        public void cingku(){
		System.out.println("Kucingku aku beri nama "+NamaKucing);
	}

	public void arasu(){
		System.out.println("Dia memiliki suara "+sound);
	}

	public void rumu(){
		System.out.println(NamaKucing+" Memiliki umur "+umur+" Bulan");
	}
}
