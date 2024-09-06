/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankedua;

/**
 *
 * @author win 10
 */
public class PermainanModern extends JenisPermainan {
    private String platform;  
    private String genre;    
    private int tahunRilis; 
    
    public PermainanModern() {
       System.out.println("ini constructor jenis permainan");
        this.setnamaPermainan("Mobile Legend");
        this.setPlatform("PC");
        this.setGenre("Battle");
        this.setTahunRilis(2016);
        super.namaPermainan();
    }
    
    public String getPlatform() {
        return platform;
    }
     public void setPlatform(String platform) {
        this.platform = platform;
    }
     
    public String getGenre() {
        return genre;
    }
     public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }
     public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }


}

    
 