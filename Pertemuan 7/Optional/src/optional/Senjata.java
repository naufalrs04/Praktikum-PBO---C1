/*Nama  : Naufal Rizki Saputra
NIM     : 24060122120011
Tanggal : 2 Mei 2024*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optional;

/**
 *
 * @author Naufal
 */

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
        System.out.println(getBunyi());
        System.out.println("Sisa Peluru: " + (getPeluru() - 1));
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
