/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankedua;

/**
 *
 * @author win 10
 */
public class PermainanTradisional extends JenisPermainan implements GobakSodor, PetakUmpet, LompatTali {
    private String lokasiPermainan;
    private String waktuPermainan;

    // Konstruktor
    public PermainanTradisional() {
        System.out.println("ini constructor jenis permainan");
        this.setlokasiPermainan("Halaman sekolah");
        this.setwaktuPermainan("Empat puluh menit");
        super.lokasiPermainan();
        super.waktuPermainan();
    }
    
    public String getlokasiPermainan() {
        return lokasiPermainan;
    }
    public void setlokasiPermainan(String lokasiPermainan) {
        this.lokasiPermainan = lokasiPermainan;
    }
    
    public String getwaktuPermainan() {
        return waktuPermainan;
    }
    public void setwaktuPermainan(String waktuPermainan) {
        this.waktuPermainan = waktuPermainan;
    }
    
    @Override
    public void menjaga() {
        System.out.println("menjaga lawan");
    }

    @Override
    public void sembunyi() {
        System.out.println("sembunyi dari yg jaga");
    }

    @Override
    public void lompat() {
        System.out.println("melompati tali");
    }
    public void cek(){
        super.sembunyi();
        this.sembunyi();
        super.menjaga();
        this.menjaga();
        super.lompat();
        this.lompat();
    }
}
