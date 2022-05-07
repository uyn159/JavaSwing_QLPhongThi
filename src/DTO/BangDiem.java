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
public class BangDiem {
    private int Ma;
    private String MaSinhVien;
    private float TiengAnh,LapTrinh,GiaoDucTheChat;

    public BangDiem() {
    }

    public BangDiem(int Ma, String MaSinhVien, float TiengAnh, float LapTrinh, float GiaoDucTheChat) {
        this.Ma = Ma;
        this.MaSinhVien = MaSinhVien;
        this.TiengAnh = TiengAnh;
        this.LapTrinh = LapTrinh;
        this.GiaoDucTheChat = GiaoDucTheChat;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int Ma) {
        this.Ma = Ma;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public float getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(float TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public float getLapTrinh() {
        return LapTrinh;
    }

    public void setLapTrinh(float LapTrinh) {
        this.LapTrinh = LapTrinh;
    }

    public float getGiaoDucTheChat() {
        return GiaoDucTheChat;
    }

    public void setGiaoDucTheChat(float GiaoDucTheChat) {
        this.GiaoDucTheChat = GiaoDucTheChat;
    }
    
}
