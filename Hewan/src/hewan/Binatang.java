/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 *
 */

  public class Binatang extends infoTambahan{
    
        private String nama, sound, jenis;
        private int umur;
        
        //Constructor
        public Binatang(){
            this.nama = "Unknown";
            this.sound = "Unknown";
            this.umur = 0;
            this.jenis = "Unknown";
        }
        
        //setter    
        public void setNama(String name){
		this.nama = name;
	}

	public void setSuara(String suara){
		this.sound = suara;
	}

	public void setUmur(int ageCat){
		this.umur = ageCat;
	}
        
        public void setJenis(String jenis){
            this.jenis = jenis;
        }
        
        //getter
        public String getNama(){
		return nama;
	}

	public String getSuara(){
		return sound;
	}

	public Integer getUmur(){
		return umur;
	}
        
        public String getJenis(){
            return jenis;
        }
    
}
