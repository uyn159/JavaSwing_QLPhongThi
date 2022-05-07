/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.PhongDao;
import DAO.SinhVienDao;
import DBQLSV.DataValidator;
import DBQLSV.MessageDLHelper;
import DTO.Phong;
import DTO.SinhVien;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class QuanLySinhVen extends javax.swing.JPanel {
    private MainForm parentForm;
    private DefaultTableModel tbModel;
    
    SinhVienDao dao = new SinhVienDao();
    SinhVien sv = new SinhVien();
    PhongDao p = new PhongDao();
    
    public QuanLySinhVen() {
        initComponents();
        
        initTable();
        getCBB();
        loaddata();
    }
    public void getCBB(){
        DefaultComboBoxModel codModel=(DefaultComboBoxModel) CBB.getModel();
        try {
            for (Phong phongma : p.findall()){
                codModel.addElement(phongma);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initTable(){
        tbModel = new DefaultTableModel();
        tbModel.setColumnIdentifiers(new String[]{"Mã Phòng","Mã sinh viên","Họ tên","Số DT","Nghe","Nói","Đọc","Viết"});
        tbStudent.setModel(tbModel);
    }
    private void loaddata(){
        try{
            dao = new SinhVienDao();
            List<SinhVien> list = dao.findall();
            tbModel.setRowCount(0);
            for(SinhVien it: list){
                tbModel.addRow(new Object[]{
                    it.getMaPhongThi(),
                    it.getMaSinhVien(),it.getHoTen(),
                    it.getSoDT(),
                    it.getNghe(), 
                    it.getNoi(),it.getDoc(), it.getViet()
                 });
        }
        }catch(Exception e){
            e.printStackTrace();
            MessageDLHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSDT = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNoi = new javax.swing.JTextField();
        txtNghe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        bxtDelete = new javax.swing.JButton();
        txtDoc = new javax.swing.JTextField();
        txtViet = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSo = new javax.swing.JTextField();
        CBB = new javax.swing.JComboBox<>();
        TimKiem = new javax.swing.JButton();
        TimKiemMaPhong = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý sinh viên");

        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbStudent);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Điểm Viết");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Điểm Đọc");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Điểm Nói");

        txtNoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNghe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Điểm Nghe");

        txtMaSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSVActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Số điện thoại");

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNew.setText("Tạo mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        bxtDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bxtDelete.setText("Xóa");
        bxtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxtDeleteActionPerformed(evt);
            }
        });

        txtDoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtViet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhongActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Mã Phòng");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Họ tên");

        txtSo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoActionPerformed(evt);
            }
        });

        CBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBActionPerformed(evt);
            }
        });

        TimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TimKiem.setText("Tìm kiếm");
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });

        TimKiemMaPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TimKiemMaPhong.setText("Tìm kiếm");
        TimKiemMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemMaPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtSDTLayout = new javax.swing.GroupLayout(txtSDT);
        txtSDT.setLayout(txtSDTLayout);
        txtSDTLayout.setHorizontalGroup(
            txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSDTLayout.createSequentialGroup()
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtSDTLayout.createSequentialGroup()
                        .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtSDTLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(txtSDTLayout.createSequentialGroup()
                                        .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel3)
                                            .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7)))
                                        .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(txtSDTLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(txtSDTLayout.createSequentialGroup()
                                                            .addComponent(btnNew)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(btnSave)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(btnUpdate)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(bxtDelete)
                                                            .addGap(17, 17, 17))
                                                        .addGroup(txtSDTLayout.createSequentialGroup()
                                                            .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(txtNghe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                                    .addComponent(txtNoi, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addComponent(txtViet, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(271, 271, 271)))
                                                    .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtSDTLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(18, 18, 18)
                                        .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(txtSDTLayout.createSequentialGroup()
                                                .addComponent(TimKiem)
                                                .addGap(33, 33, 33)
                                                .addComponent(CBB, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TimKiemMaPhong)))))
                            .addGroup(txtSDTLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtSDTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        txtSDTLayout.setVerticalGroup(
            txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSDTLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TimKiemMaPhong))
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtSDTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(TimKiem)))
                    .addGroup(txtSDTLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(CBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtSDTLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtNoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtSDTLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(txtNghe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew)
                    .addGroup(txtSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bxtDelete)
                        .addComponent(btnSave)
                        .addComponent(btnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSVActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtNghe.setText("");
        txtMaSV.setText("");
        txtPhong.setText("");
        txtNoi.setText("");
        txtName.setText("");
        txtSo.setText("");
        txtDoc.setText("");
        txtViet.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmty(txtPhong, sb, "Mã phòng thi không được để trống");
        DataValidator.validateEmty(txtMaSV, sb, "Mã sinh viên không được để trống");
        if(sb.length()>0){
            MessageDLHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try{
            sv.setMaPhongThi(txtPhong.getText());
            sv.setMaSinhVien(txtMaSV.getText()); 
            sv.setHoTen(txtName.getText());
            sv.setSoDT(txtSo.getText());
            sv.setNghe(Float.parseFloat(txtNghe.getText()));
            sv.setNoi(Float.parseFloat(txtNoi.getText()));
            sv.setDoc(Float.parseFloat(txtDoc.getText()));
            sv.setViet(Float.parseFloat(txtViet.getText()));
            if(dao.insert(sv)){
                MessageDLHelper.showMessageDialog(parentForm, "Sinh viên đã được lưu", "Thông báo");
                loaddata();
            }else{
                MessageDLHelper.showConfirmDialog(parentForm, "Sinh viên không được lưu", "Lỗi");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            MessageDLHelper.showErrorDialog(parentForm,e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();

        if(sb.length()>0){
            MessageDLHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if(MessageDLHelper.showConfirmDialog(parentForm,
                "Bạn có muốn cập nhật sinh viên hay không ?", "Hỏi") == JOptionPane.NO_OPTION){
            return;
        }
        try{
            sv.setMaPhongThi(txtPhong.getText());
            sv.setMaSinhVien(txtMaSV.getText()); 
            sv.setHoTen(txtName.getText());
            sv.setSoDT(txtSo.getText());
            sv.setNghe(Float.parseFloat(txtNghe.getText()));
            sv.setNoi(Float.parseFloat(txtNoi.getText()));
            sv.setDoc(Float.parseFloat(txtDoc.getText()));
            sv.setViet(Float.parseFloat(txtViet.getText()));
            if(dao.update(sv)){
                MessageDLHelper.showMessageDialog(parentForm, "Sinh viên đã được cập nhật", "Thông báo");
                loaddata();
            }else{
                MessageDLHelper.showConfirmDialog(parentForm, "Sinh viên không được cập nhật", "Lỗi");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            MessageDLHelper.showErrorDialog(parentForm,e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void bxtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxtDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmty(txtMaSV, sb, "Mã sinh viên không được để trống");
        
        if(sb.length()>0){
            MessageDLHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if(MessageDLHelper.showConfirmDialog(parentForm,
                "Bạn có muốn xóa sinh viên hay không ?", "Hỏi") == JOptionPane.NO_OPTION){
            return;
        }
        try{
            if(dao.delete(txtMaSV.getText())){
                MessageDLHelper.showMessageDialog(parentForm, "Sinh viên đã được xóa", "Thông báo");
                loaddata();
                btnNewActionPerformed(evt);
            }else{
                MessageDLHelper.showConfirmDialog(parentForm, "Sinh viên không được xóa", "Lỗi");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            MessageDLHelper.showErrorDialog(parentForm,e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_bxtDeleteActionPerformed

    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked
        try{
            int row= tbStudent.getSelectedRow();
            if(row>=0){
                String id = (String) tbStudent.getValueAt(row, 0);
                SinhVien sv = dao.find(id);
                if(sv != null){
                    txtPhong.setText(sv.getMaPhongThi());
                    txtMaSV.setText(sv.getMaSinhVien());
                    txtSo.setText(sv.getSoDT());
                    txtNghe.setText(String.format("%.2f", sv.getNghe()));
                    txtNoi.setText(String.format("%.2f", sv.getNoi()));
                    txtDoc.setText(String.format("%.2f", sv.getDoc()));
                    txtViet.setText(String.format("%.2f", sv.getViet()));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDLHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbStudentMouseClicked

    private void txtSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoActionPerformed

    private void txtPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhongActionPerformed

    private void CBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBActionPerformed
        
    }//GEN-LAST:event_CBBActionPerformed

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
        try{
            SinhVienDao dao = new SinhVienDao();
            SinhVien sv=dao.find(txtMaSV.getText());
            if(sv != null){
                txtPhong.setText(sv.getMaPhongThi());
                    txtMaSV.setText(sv.getMaSinhVien());
                    txtName.setText(sv.getHoTen());
                    txtSo.setText(sv.getSoDT());
                    txtNghe.setText(String.format("%.2f", sv.getNghe()));
                    txtNoi.setText(String.format("%.2f", sv.getNoi()));
                    txtDoc.setText(String.format("%.2f", sv.getDoc()));
                    txtViet.setText(String.format("%.2f", sv.getViet()));

            }else{
                MessageDLHelper.showMessageDialog(parentForm, "Không tìm thấy mã", "Thông báo");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDLHelper.showErrorDialog(parentForm,e.getMessage(), "Lỗi");
        } 
    }//GEN-LAST:event_TimKiemActionPerformed

    private void TimKiemMaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemMaPhongActionPerformed
       try{
            dao = new SinhVienDao();
            List<SinhVien> list = dao.findall2(txtPhong.getText());
            tbModel.setRowCount(0);
            
            for(SinhVien it: list){
               
                tbModel.addRow(new Object[]{
                    
                    it.getMaPhongThi(),
                    it.getMaSinhVien(),it.getHoTen(),
                    it.getSoDT(),
                    it.getNghe(), 
                    it.getNoi(),it.getDoc(), it.getViet()
                 });
                  }
        }catch(Exception e){
            e.printStackTrace();
            MessageDLHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_TimKiemMaPhongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBB;
    private javax.swing.JButton TimKiem;
    private javax.swing.JButton TimKiemMaPhong;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton bxtDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNghe;
    private javax.swing.JTextField txtNoi;
    private javax.swing.JTextField txtPhong;
    private javax.swing.JPanel txtSDT;
    private javax.swing.JTextField txtSo;
    private javax.swing.JTextField txtViet;
    // End of variables declaration//GEN-END:variables
}
