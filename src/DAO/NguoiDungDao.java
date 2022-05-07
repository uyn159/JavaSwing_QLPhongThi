/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBQLSV.DatabaseHelper;
import DTO.Nguoidung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NguoiDungDao {
//    Connection conn = null;
//    PreparedStatement sttm= null;
    public static List<Nguoidung> ls = new ArrayList<>();
    public Nguoidung checklogin(String TenDangNhap,String MatKhau) throws Exception{
        String sql="select TenDangNhap,MatKhau, VaiTro from NguoiDung where TenDangNhap=? and MatKhau= ?";
        try(
            Connection conn = DatabaseHelper.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sql);
        ){
            sttm.setString(1,TenDangNhap);
            sttm.setString(2,MatKhau);
            
            try(ResultSet rs = sttm.executeQuery();){
                if(rs.next()){
                    Nguoidung nd = new Nguoidung();
                    nd.setTenDangNhap(TenDangNhap);
                    nd.setVaiTro(rs.getString("VaiTro"));
                    return nd;
                }
            }return null;
        }
    }
}
