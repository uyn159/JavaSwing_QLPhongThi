/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class Phong {
    private int id;
    private String MaPhong;
    public Phong(){
        
    }

    public Phong(int id, String MaPhong) {
        this.id = id;
        this.MaPhong = MaPhong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    @Override
    public String toString(){
        return getMaPhong();
    }
    
    
}
