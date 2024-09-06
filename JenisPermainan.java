/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_pertemuankedua;

/**
 *
 * @author win 10
 */
public class JenisPermainan {
    String namaPermainan;
    private String lokasiPermainan;
    private String waktuPermainan;
    
    public void namaPermainan(){ // method 
        System.out.println("bermain bersama");
    }
    public void lokasiPermainan(){ // method 
        System.out.println("lapangan");
    }
    public void waktuPermainan(){ // method 
        System.out.println("jam 12 siang");
    }
    public String getnamaPermainan(){
        return namaPermainan;
    }
     public void setnamaPermainan(String nama){
        this.namaPermainan = nama;
    }
      public void menjaga() {
        System.out.println("menjaga");
    }

    
    public void sembunyi() {
        System.out.println("sembunyi");
    }

  
    public void lompat() {
        System.out.println("lompat");
    }
}
