/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBQLSV.DatabaseHelper;
import DTO.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SinhVienDao {
    
    public boolean insert(SinhVien st) throws SQLException{
        
            String sSQL="INSERT INTO [dbo].[SinhVien]([MaPhongThi],[MaSinhVien],[HoTen],[SoDT],[Nghe],[Noi],[Doc],[Viet])"
                    + "values(?,?,?,?,?,?,?,?)";
            try(
                Connection conn = DatabaseHelper.getDBConnect();
                PreparedStatement sttm = conn.prepareStatement(sSQL);
                ){
            sttm.setString(1,st.getMaPhongThi());
            sttm.setString(2,st.getMaSinhVien());
            sttm.setString(3,st.getHoTen());
            sttm.setString(4,st.getSoDT());
            sttm.setFloat(5,st.getNghe());
            sttm.setFloat(6,st.getNoi());
            sttm.setFloat(7,st.getDoc());
            sttm.setFloat(8,st.getViet());

            
        return sttm.executeUpdate()>0;
            }
    }
    public boolean update(SinhVien st) throws SQLException{
        
            String sSQL="UPDATE dbo.SinhVien"
                    + " SET HoTen=?,SoDT=?,Nghe=?,Noi=?,Doc=?,Viet=?"
                    + " where MaSinhVien= ?";
            try(
                Connection conn = DatabaseHelper.getDBConnect();
                PreparedStatement sttm = conn.prepareStatement(sSQL);
                ){
            sttm.setString(1,st.getMaPhongThi());
            sttm.setString(2,st.getMaSinhVien());
            sttm.setString(3,st.getHoTen());
            sttm.setString(4,st.getSoDT());
            sttm.setFloat(5,st.getNghe());
            sttm.setFloat(6,st.getNoi());
            sttm.setFloat(7,st.getDoc());
            sttm.setFloat(8,st.getViet());
            return sttm.executeUpdate()>0;
            }
    }
    public boolean delete(String MaSinhVien) throws SQLException{
        
            String sSQL="delete from dbo.SinhVien"
                    + " where MaSinhVien= ?";
            try(
                Connection conn = DatabaseHelper.getDBConnect();
                PreparedStatement sttm = conn.prepareStatement(sSQL);
                ){
            sttm.setString(1,MaSinhVien);
            return sttm.executeUpdate()>0;
            }
    }
    public SinhVien find(String MaSinhVien) throws SQLException{
        
            String sSQL="select * from SinhVien"
                    + " where MaSinhVien= ?";
            try(
                Connection conn = DatabaseHelper.getDBConnect();
                PreparedStatement sttm = conn.prepareStatement(sSQL);
                ){
            sttm.setString(1,MaSinhVien);
            try(ResultSet rs= sttm.executeQuery();){
                if(rs.next()){
                    SinhVien st = createSinhVien(rs);
                    return st;
                }
            }
            return null;
        }
    }
    public SinhVien find2(String MaSinhVien) throws SQLException{
        
            String sSQL="select * from SinhVien"
                    + " where MaPhongThi= ?";
            try(
                Connection conn = DatabaseHelper.getDBConnect();
                PreparedStatement sttm = conn.prepareStatement(sSQL);
                ){
            sttm.setString(1,MaSinhVien);
            try(ResultSet rs= sttm.executeQuery();){
                if(rs.next()){
                    SinhVien st = createSinhVien(rs);
                    return st;
                }
            }
            return null;
        }
    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien st = new SinhVien();
        st.setMaPhongThi(rs.getString("MaPhongThi"));
        st.setMaSinhVien(rs.getString("MaSinhVien"));
        st.setHoTen(rs.getString("HoTen"));
        st.setSoDT(rs.getString("SoDT"));
        st.setNghe(rs.getFloat("Nghe"));
        st.setNoi(rs.getFloat("Noi"));
        st.setDoc(rs.getFloat("Doc"));
        st.setViet(rs.getFloat("Viet"));
        return st;
    }
    public List<SinhVien> findall() throws SQLException{
        
            String sSQL="select * from SinhVien";
            try(
                Connection conn = DatabaseHelper.getDBConnect();
                PreparedStatement sttm = conn.prepareStatement(sSQL);
                ){
            try(ResultSet rs= sttm.executeQuery();){
                List<SinhVien> list = new ArrayList<>();
                while(rs.next()){
                    SinhVien st = createSinhVien(rs);
                    list.add(st);
                }return  list;
            } 
        }
    }
    public List<SinhVien> findall2(String MaPhongThi) throws SQLException{
        
            String sSQL="select * from MaPhongThi=?";
            try(
                Connection conn = DatabaseHelper.getDBConnect();
                PreparedStatement sttm = conn.prepareStatement(sSQL);
                ){
            try(ResultSet rs= sttm.executeQuery();){
                List<SinhVien> list = new ArrayList<>();
                while(rs.next()){
                    SinhVien st = createSinhVien(rs);
                    list.add(st);
                }return  list;
            } 
        }
    }
}
