    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBQLSV.DatabaseHelper;
import DTO.Phong;
import DTO.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhongDao {
    private Phong createPhong(final ResultSet rs) throws SQLException {
        Phong st = new Phong();
        st.setId(rs.getInt("Id"));
        st.setMaPhong(rs.getString("MaPhong"));

        return st;
    }
    public List<Phong> findall() throws SQLException{
        
            String sSQL="select * from Phong";
            try(
                Connection conn = DatabaseHelper.getDBConnect();
                PreparedStatement sttm = conn.prepareStatement(sSQL);
                ){
            try(ResultSet rs= sttm.executeQuery();){
                List<Phong> list = new ArrayList<>();
                while(rs.next()){
                    Phong st = createPhong(rs);
                    list.add(st);
                }return  list;
            } 
        }
    }
}
