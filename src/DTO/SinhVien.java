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
public class SinhVien {
    private String MaSinhVien,HoTen,SoDT,MaPhongThi;
    private float Nghe,Noi,Doc,Viet;
    public SinhVien(){
        
    }

    public SinhVien(String MaSinhVien, String HoTen, String SoDT, String MaPhongThi, float Nghe, float Noi, float Doc, float Viet) {
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
        this.SoDT = SoDT;
        this.MaPhongThi = MaPhongThi;
        this.Nghe = Nghe;
        this.Noi = Noi;
        this.Doc = Doc;
        this.Viet = Viet;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getMaPhongThi() {
        return MaPhongThi;
    }

    public void setMaPhongThi(String MaPhongThi) {
        this.MaPhongThi = MaPhongThi;
    }

    public float getNghe() {
        return Nghe;
    }

    public void setNghe(float Nghe) {
        this.Nghe = Nghe;
    }

    public float getNoi() {
        return Noi;
    }

    public void setNoi(float Noi) {
        this.Noi = Noi;
    }

    public float getDoc() {
        return Doc;
    }

    public void setDoc(float Doc) {
        this.Doc = Doc;
    }

    public float getViet() {
        return Viet;
    }

    public void setViet(float Viet) {
        this.Viet = Viet;
    }

    

    
    
}
