/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankedua;

/**
 *
 * @author win 10
 */
public class Utama {
    public static void main(String[] args) {
        JenisPermainan permainan = new PermainanModern();
        System.out.println("nama permainan : " + permainan.getnamaPermainan());
        System.out.println("");

        PermainanTradisional main = new PermainanTradisional();
        System.out.println("Bermain di " + main.getlokasiPermainan());
        System.out.println("Lamanya permainan : " + main.getwaktuPermainan());
        System.out.println("super and this");
        main.cek();
        System.out.println("");
        
        JenisPermainan bermain = (JenisPermainan) main; // Casting 
        main.namaPermainan();
        System.out.println("");

        PermainanTradisional Tradisional = new PermainanTradisional(); // Interface 
        Tradisional.menjaga();
        Tradisional.sembunyi();
        Tradisional.lompat();
        System.out.println("");
    }
}
