/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_db;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class College_Db {
    JFrame f3 = new JFrame("Login Successful");
    JPanel jPanel2 = new javax.swing.JPanel();
    JButton jButton2 = new javax.swing.JButton();
    JButton jButton3 = new javax.swing.JButton();
    JButton jButton4 = new javax.swing.JButton();
    JButton jButton5 = new javax.swing.JButton();
    
    //Admin Login Panel
    JFrame f2 = new JFrame("Admin Login");
    JPanel jPanel1 = new javax.swing.JPanel();
    JLabel jLabel1 = new javax.swing.JLabel();
    JTextField jTextField1 = new javax.swing.JTextField();
    JLabel jLabel2 = new javax.swing.JLabel();
    JTextField jTextField2 = new javax.swing.JTextField();
    JButton jButton1 = new javax.swing.JButton();
    
    JFrame f4 = new JFrame("DEPARTMENTS");
    JPanel jPanel3 = new javax.swing.JPanel();
    JLabel jLabel3 = new javax.swing.JLabel();
    JTextField jTextField3 = new javax.swing.JTextField();
    JLabel jLabel4 = new javax.swing.JLabel();
    JTextField jTextField4 = new javax.swing.JTextField();
    JLabel jLabel5 = new javax.swing.JLabel();
    JTextField jTextField5 = new javax.swing.JTextField();
    JButton jButton6 = new javax.swing.JButton();
    JButton jButton7 = new javax.swing.JButton();
    JButton jButton8 = new javax.swing.JButton();
    JButton jButton9 = new javax.swing.JButton();
    
    //For Dept Table
    JFrame dept_frame = new JFrame();
 
    JTable dept_table = new JTable(new DefaultTableModel(new Object[]{"dept_id","dept_name","dept_head"},0));
    DefaultTableModel d_model = (DefaultTableModel) dept_table.getModel();
    
    
    
    JFrame f5 = new JFrame("COURSES");
    JPanel jPanel4 = new javax.swing.JPanel();
    JLabel jLabel6 = new javax.swing.JLabel();
    JLabel jLabel7 = new javax.swing.JLabel();
    JLabel jLabel8 = new javax.swing.JLabel();
    JLabel jLabel9 = new javax.swing.JLabel();
    JLabel jLabel10 = new javax.swing.JLabel();
    JTextField jTextField6 = new javax.swing.JTextField();
    JTextField jTextField7 = new javax.swing.JTextField();
    JTextField jTextField8 = new javax.swing.JTextField();
    JTextField jTextField9 = new javax.swing.JTextField();
    JTextField jTextField10 = new javax.swing.JTextField();
    JButton jButton10 = new javax.swing.JButton();
    JButton jButton11 = new javax.swing.JButton();
    JButton jButton12 = new javax.swing.JButton();
    JButton jButton13 = new javax.swing.JButton();
   
    JTable course_table = new JTable(new DefaultTableModel(new Object[]{"course_id","course_name","course_credit","dept_id","instructor_id"},0));
    DefaultTableModel c_model = (DefaultTableModel) course_table.getModel();
    
    
    
    
    JFrame f6 = new JFrame("INSTRUCTOR");
    JPanel jPanel5 = new javax.swing.JPanel();
    JLabel    jLabel11 = new javax.swing.JLabel();
    JLabel    jLabel12 = new javax.swing.JLabel();
    JLabel    jLabel13 = new javax.swing.JLabel();
    JLabel    jLabel14 = new javax.swing.JLabel();
    JLabel    jLabel15 = new javax.swing.JLabel();
    JLabel    jLabel16 = new javax.swing.JLabel();
    JTextField    jTextField11 = new javax.swing.JTextField();
    JTextField     jTextField12 = new javax.swing.JTextField();
    JTextField     jTextField13 = new javax.swing.JTextField();
    JTextField     jTextField14 = new javax.swing.JTextField();
    JTextField     jTextField15 = new javax.swing.JTextField();
    JTextField     jTextField16 = new javax.swing.JTextField();
    JButton    jButton14 = new javax.swing.JButton();
    JButton     jButton15 = new javax.swing.JButton();
    JButton     jButton16 = new javax.swing.JButton();
    JButton     jButton17 = new javax.swing.JButton();
    
    JTable instructor_table = new JTable(new DefaultTableModel(new Object[]{"instructor_id", "instructor_name", "instructor_salary", "instructor_age","instructor_contact","dept_id"},0));
    DefaultTableModel i_model = (DefaultTableModel) instructor_table.getModel();
    
    
    
    
    JFrame f7= new JFrame("STUDENT");
    JPanel   jPanel6 = new javax.swing.JPanel();
    JLabel    jLabel17 = new javax.swing.JLabel();
    JLabel    jLabel18 = new javax.swing.JLabel();
    JLabel    jLabel19 = new javax.swing.JLabel();
    JLabel    jLabel20 = new javax.swing.JLabel();
    JLabel    jLabel21 = new javax.swing.JLabel();
    JLabel    jLabel22 = new javax.swing.JLabel();
    JTextField    jTextField17 = new javax.swing.JTextField();
    JTextField     jTextField18 = new javax.swing.JTextField();
    JTextField     jTextField19 = new javax.swing.JTextField();
    JTextField     jTextField20 = new javax.swing.JTextField();
    JTextField     jTextField21 = new javax.swing.JTextField();
    JTextField     jTextField22 = new javax.swing.JTextField();
    JButton    jButton18 = new javax.swing.JButton();
    JButton    jButton19 = new javax.swing.JButton();
    JButton    jButton20 = new javax.swing.JButton();
    JButton    jButton21 = new javax.swing.JButton();
    
    JTable student_table = new JTable(new DefaultTableModel(new Object[]{"instructor_id", "instructor_name", "instructor_salary", "instructor_age","instructor_contact"},0));
    DefaultTableModel s_model = (DefaultTableModel) student_table.getModel();
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        College_Db obj=new College_Db();
        
        

        
        JFrame f1 = new JFrame("College Database");
        ImageIcon img1 = new ImageIcon("C:/Users/admin/Pictures/WelcomePage2.jpg");
        JLabel l1 = new JLabel(img1);
        f1.setSize(1500,800);
        f1.add(l1);
        f1.setVisible(true);
        
        try{
        Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        f1.setVisible(false);
        
       
        
        
        
        //Copied Code for admin login
        
        obj.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel1.setText("User Id :");
        obj.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel2.setText("Password :");
        
        obj.jButton1.setText("LOGIN");
       /* obj.jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obj.jButton1ActionPerformed(evt,obj);
            }
        });*/
        
        
        //Copied Panel Layout
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(obj.jPanel1);
        obj.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(obj.jLabel1)
                    .addComponent(obj.jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(obj.jButton1)
                    .addComponent(obj.jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obj.jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obj.jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel2)
                    .addComponent(obj.jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(obj.jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(obj.f2.getContentPane());
        obj.f2.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(obj.jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(obj.jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        
        obj.f2.add(obj.jPanel1);
        obj.f2.setSize(1500,800);
        obj.f2.setVisible(true);  
       
        
        //copied code for successful login
        
        obj.jButton2.setText("DEPARTMENTS");
        obj.jButton3.setText("COURSES");
        obj.jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }

            private void jButton3ActionPerformed(ActionEvent evt) {
                    obj.f3.setVisible(false);
                    obj.f5.setVisible(true);
                    obj.jPanel4.setVisible(true);
                    
                }
            
        });
        obj.jButton4.setText("INSTRUCTORS");
                obj.jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }

            private void jButton4ActionPerformed(ActionEvent evt) {
                    obj.f3.setVisible(false);
                    obj.f6.setVisible(true);
                    obj.jPanel5.setVisible(true);
                }
            
        });
        obj.jButton5.setText("STUDENTS");
         obj.jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }

            private void jButton5ActionPerformed(ActionEvent evt) {
                    obj.f3.setVisible(false);
                    obj.f7.setVisible(true);
                    obj.jPanel6.setVisible(true);
                }
            
        });
               
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(obj.jPanel2);
        obj.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(obj.jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(obj.jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(obj.jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(obj.jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(obj.jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(obj.jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(obj.jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(obj.jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(obj.f3.getContentPane());
        obj.f3.getContentPane().setLayout(layout1);
        layout1.setHorizontalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout1.createSequentialGroup()
                .addContainerGap()
                .addComponent(obj.jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout1.setVerticalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout1.createSequentialGroup()
                .addContainerGap()
                .addComponent(obj.jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        obj.f3.add(obj.jPanel2);
        obj.f3.setSize(1500,800);
        obj.jPanel2.setVisible(false);
        obj.f3.setVisible(false);
        
        
        //copied Instructor Layout
        
        obj.jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel3.setText("ID :");
        obj.jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel4.setText("Name :");

        obj.jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel5.setText("Head :");

        obj.jButton6.setText("DISPLAY ALL");
        obj.jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }

            private void jButton6ActionPerformed(ActionEvent evt) {
                
                obj.f4.setVisible(false);
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    Statement pst = con.createStatement();
                    ResultSet rs = pst.executeQuery("SELECT * FROM `dept_table` WHERE 1");
                    obj.d_model.addRow(new Object[]{"dept_id","dept_name","dept_head"});
                    while(rs.next()){
                        obj.d_model.addRow(new Object[]{rs.getInt("dept_id"),rs.getString("dept_name"),rs.getString("dept_head")});
                    }
                    obj.dept_frame.add(obj.dept_table);
                    obj.dept_frame.setSize(750,400);
                    obj.dept_frame.setVisible(true);
                    
                   
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
            
        });

        obj.jButton7.setText("INSERT");
        obj.jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }

            private void jButton7ActionPerformed(ActionEvent evt) {
                int id = Integer.parseInt(obj.jTextField3.getText());
                String uname = obj.jTextField4.getText();
                String head = obj.jTextField5.getText();
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("INSERT INTO `dept_table`(`dept_id`, `dept_name`, `dept_head`) VALUES (?,?,?)");
                    pst.setInt(1,id);
                    pst.setString(2,uname);
                    pst.setString(3,head);
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("INSERTED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(SQLIntegrityConstraintViolationException ie)
                {
                   JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("ENTRY ALREADY EXISTS");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);     
                }
                catch(Exception e){
                        e.printStackTrace();
                   }
            

            }
        });

        obj.jButton8.setText("UPDATE");
        obj.jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }

            private void jButton8ActionPerformed(ActionEvent evt) {
                int id = Integer.parseInt(obj.jTextField3.getText());
                String uname = obj.jTextField4.getText();
                String head = obj.jTextField5.getText();
                if(id==0||uname.isEmpty()||head.isEmpty()){
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("CHECK INPUT & TRY AGAIN");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);    
                }
                else{
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("UPDATE `dept_table` SET `dept_id`=?,`dept_name`=?,`dept_head`=? WHERE `dept_id`=?");
                    pst.setInt(1,id);
                    pst.setString(2,uname);
                    pst.setString(3,head);
                    pst.setInt(4,id);
                    
                    int i = pst.executeUpdate();
                    
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("UPDATED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
            }
        });
        obj.jButton9.setText("DELETE");
        obj.jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }

            private void jButton9ActionPerformed(ActionEvent evt) {
                int id = Integer.parseInt(obj.jTextField3.getText());
                if(id==0){
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("Please enter ID");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);    
                }
                else{
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("DELETE from `dept_table` WHERE `dept_id`=?");
                    pst.setInt(1,id);
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("DELETED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(obj.jPanel3);
        obj.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(obj.jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obj.jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(obj.jLabel4)
                                    .addComponent(obj.jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(obj.jTextField4)
                                    .addComponent(obj.jTextField5)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(obj.jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton9)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obj.jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel4)
                    .addComponent(obj.jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel5)
                    .addComponent(obj.jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jButton6)
                    .addComponent(obj.jButton7)
                    .addComponent(obj.jButton8)
                    .addComponent(obj.jButton9))
                .addGap(77, 77, 77))
        );
        
        
        javax.swing.GroupLayout layout2 = new javax.swing.GroupLayout(obj.f4.getContentPane());
        obj.f4.getContentPane().setLayout(layout2);
        layout2.setHorizontalGroup(
            layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout2.createSequentialGroup()
            .addContainerGap()
            .addComponent(obj.jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
        );
        layout2.setVerticalGroup(
            layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout2.createSequentialGroup()
                .addContainerGap()
                .addComponent(obj.jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );  
        
        
        
        
        
        
  
        obj.f4.setSize(1500,800);
        obj.f4.add(obj.jPanel3);
        
        
        
        
        
        
        obj.jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obj.jButton1ActionPerformed(evt,obj);
            }
        });
        
         obj.jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obj.jButton2ActionPerformed(evt,obj);
            }
        });
         
         
         
         
         
         //Cousrse Page
        obj.jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel6.setText("Course ID:");

        obj.jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel7.setText("Name:");

        obj.jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel8.setText("Credits:");

        obj.jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel9.setText("Instructor ID:");

        obj.jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel10.setText("Department ID:");
        
        obj.jButton10.setText("DISPLAY ALL");
        obj.jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obj.jButton10ActionPerformed(evt,obj);
            }
            
            
            
            
            
        });

        obj.jButton11.setText("INSERT");
            obj.jButton11.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                obj.jButton11ActionPerformed(evt,obj);
            }
            
            
            
            
            
        });

        obj.jButton12.setText("UPDATE");
           obj.jButton12.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                obj.jButton12ActionPerformed(evt,obj);
            }
            
            
            
            
            
        });
         

        obj.jButton13.setText("DELETE");
         obj.jButton13.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                obj.jButton13ActionPerformed(evt,obj);
            }
            
            
            
            
            
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(obj.jPanel4);
        obj.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(obj.jLabel6)
                                            .addGap(76, 76, 76))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(obj.jLabel7)
                                            .addGap(106, 106, 106)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(obj.jLabel8)
                                        .addGap(97, 97, 97)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(obj.jLabel9)
                                    .addGap(53, 53, 53)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(obj.jLabel10)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(obj.jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(obj.jTextField9)
                            .addComponent(obj.jTextField8)
                            .addComponent(obj.jTextField7)
                            .addComponent(obj.jTextField6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(obj.jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton11)
                        .addGap(28, 28, 28)
                        .addComponent(obj.jButton12)
                        .addGap(18,18,18)
                        .addComponent(obj.jButton13)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(obj.jLabel6)
                    .addComponent(obj.jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel7)
                    .addComponent(obj.jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel8)
                    .addComponent(obj.jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel9)
                    .addComponent(obj.jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel10)
                    .addComponent(obj.jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100,100,100)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jButton10)
                    .addComponent(obj.jButton11)
                    .addComponent(obj.jButton12)
                    .addComponent(obj.jButton13))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout3 = new javax.swing.GroupLayout(obj.f5.getContentPane());
        obj.f5.getContentPane().setLayout(layout3);
        layout3.setHorizontalGroup(
            layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout3.createSequentialGroup()
                .addContainerGap()
                .addComponent(obj.jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout3.setVerticalGroup(
            layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout3.createSequentialGroup()
                .addContainerGap()
                .addComponent(obj.jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        obj.f5.add(obj.jPanel4);
        obj.f5.setSize(1500,800);
        
        
        
        
        //Instructor Page
        obj.jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel11.setText("Instructor ID:");

        obj.jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel12.setText("Name:");

        obj.jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel13.setText("Salary:");

        obj.jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel14.setText("Age:");

        obj.jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel15.setText("Contact:");

        obj.jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel16.setText("Department ID:");

        obj.jButton14.setText("DISPLAY ALL");
        obj.jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }

            private void jButton14ActionPerformed(ActionEvent evt) {
                
                
                obj.f4.setVisible(false);
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    Statement pst = con.createStatement();
                    ResultSet rs = pst.executeQuery("SELECT * FROM `instructor_table` WHERE 1");
                    obj.i_model.addRow(new Object[]{"instructor_id","instructor_name","instructor_salary","instructor_age","instructor_contact","dept_id"});
                    while(rs.next()){
                        obj.i_model.addRow(new Object[]{rs.getInt("instructor_id"),rs.getString("instructor_name"),rs.getInt("instructor_salary"),rs.getInt("instructor_age"),rs.getInt("instructor_contact"),rs.getInt("dept_id")});
                    }
                    obj.dept_frame.add(obj.instructor_table);
                    obj.dept_frame.setSize(750,400);
                    obj.dept_frame.setVisible(true);
                    
                   
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
            
      
                
            }
        );

        obj.jButton15.setText("INSERT");
         obj.jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }

            private void jButton15ActionPerformed(ActionEvent evt) {
                int ins_id = Integer.parseInt(obj.jTextField11.getText());
                String ins_name = obj.jTextField12.getText();
                int sal = Integer.parseInt(obj.jTextField13.getText());
                int age = Integer.parseInt(obj.jTextField14.getText());
                int contact = Integer.parseInt(obj.jTextField15.getText());
                int dep_id = Integer.parseInt(obj.jTextField16.getText());
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("INSERT INTO `instructor_table`(`instructor_id`, `instructor_name`, `instructor_salary`, `instructor_age`,`instructor_contact`,`dept_id`) VALUES (?,?,?,?,?,?)");
                    pst.setInt(1,ins_id);
                    pst.setString(2,ins_name);
                    pst.setInt(3,sal);
                    pst.setInt(4,age);
                    pst.setInt(5,contact);
                    pst.setInt(6,dep_id);
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("INSERTED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(SQLIntegrityConstraintViolationException ie)
                {
                   JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("ENTRY ALREADY EXISTS");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);     
                }
                catch(Exception e){
                        e.printStackTrace();
                   }
            }
        });

        obj.jButton16.setText("UPDATE");
         obj.jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }

            private void jButton16ActionPerformed(ActionEvent evt) {
                int ins_id = Integer.parseInt(obj.jTextField11.getText());
                String ins_name = obj.jTextField12.getText();
                int sal = Integer.parseInt(obj.jTextField13.getText());
                int age = Integer.parseInt(obj.jTextField14.getText());
                int contact = Integer.parseInt(obj.jTextField15.getText());
                int dep_id = Integer.parseInt(obj.jTextField16.getText());
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("UPDATE `instructor_table` SET `instructor_id`=?,`instructor_name`=?,`instructor_salary`=?,`instructor_age`=?,`instructor_contact`=?,`dept_id`=? WHERE `instructor_id`=?");
                    pst.setInt(1,ins_id);
                    pst.setString(2,ins_name);
                    pst.setInt(3,sal);
                    pst.setInt(4,age);
                    pst.setInt(5,contact);
                    pst.setInt(6,dep_id);
                    pst.setInt(7,ins_id);
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("UPDATED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }
                catch(Exception e){
                        e.printStackTrace();
                   }
            }
        });

        obj.jButton17.setText("DELETE");
            obj.jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }

            private void jButton17ActionPerformed(ActionEvent evt) {
                int id = Integer.parseInt(obj.jTextField11.getText());
                        if(id==0){
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("Please enter ID");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);    
                }
                else{
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("DELETE from `instructor_table` WHERE `instructor_id`=?");
                    pst.setInt(1,id);
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("DELETED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
                
                
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(obj.jPanel5);
        obj.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obj.jLabel11)
                            .addComponent(obj.jLabel12)
                            .addComponent(obj.jLabel13)
                            .addComponent(obj.jLabel14)
                            .addComponent(obj.jLabel15)
                            .addComponent(obj.jLabel16))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(obj.jTextField11)
                            .addComponent(obj.jTextField12)
                            .addComponent(obj.jTextField13)
                            .addComponent(obj.jTextField14)
                            .addComponent(obj.jTextField15)
                            .addComponent(obj.jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(obj.jButton14)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton15)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton16)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton17)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(obj.jLabel11)
                    .addComponent(obj.jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel12)
                    .addComponent(obj.jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel13)
                    .addComponent(obj.jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel14)
                    .addComponent(obj.jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel15)
                    .addComponent(obj.jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel16)
                    .addComponent(obj.jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jButton14)
                    .addComponent(obj.jButton15)
                    .addComponent(obj.jButton16)
                    .addComponent(obj.jButton17))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout4 = new javax.swing.GroupLayout(obj.f6.getContentPane());
        obj.f6.getContentPane().setLayout(layout4);
        layout4.setHorizontalGroup(
            layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout4.createSequentialGroup()
                .addContainerGap()
                .addComponent(obj.jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout4.setVerticalGroup(
            layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout4.createSequentialGroup()
                .addContainerGap()
                .addComponent(obj.jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        obj.f6.add(obj.jPanel5);
        obj.f6.setSize(1500,800);
        
        
        
        
        
        
        //Student Page
        obj.jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel17.setText("Student ID:");

        obj.jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel18.setText("Name:");

        obj.jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel19.setText("Age:");

        obj.jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel20.setText("Fees:");

        obj.jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel21.setText("Contact:");

        obj.jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        obj.jLabel22.setText("Course ID:");

        obj.jButton18.setText("DISPLAY ALL");
                obj.jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }

            private void jButton18ActionPerformed(ActionEvent evt) {
                
                
                obj.f4.setVisible(false);
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    Statement pst = con.createStatement();
                    ResultSet rs = pst.executeQuery("SELECT * FROM `student_table` WHERE 1");
                    obj.s_model.addRow(new Object[]{"student_id","student_name","student_age","student_fees","student_contact"});
                    while(rs.next()){
                        obj.s_model.addRow(new Object[]{rs.getInt("student_id"),rs.getString("student_name"),rs.getInt("student_age"),rs.getInt("student_fees"),rs.getInt("student_contact")});
                    }
                    obj.dept_frame.add(obj.student_table);
                    obj.dept_frame.setSize(750,400);
                    obj.dept_frame.setVisible(true);
                    
                   
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
                });                                                                                             
        
        

        obj.jButton19.setText("INSERT");
        obj.jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }

            private void jButton19ActionPerformed(ActionEvent evt) {
                int stu_id = Integer.parseInt(obj.jTextField17.getText());
                String s_name = obj.jTextField18.getText();
                int age = Integer.parseInt(obj.jTextField19.getText());
                int fees = Integer.parseInt(obj.jTextField20.getText());
                int contact = Integer.parseInt(obj.jTextField21.getText());
                int course_id = Integer.parseInt(obj.jTextField22.getText());
                
                 try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("INSERT INTO `student_table`(`student_id`, `student_name`, `student_age`, `student_fees`, `student_contact`) VALUES (?,?,?,?,?)");
                    pst.setInt(1,stu_id);
                    pst.setString(2,s_name);
                    pst.setInt(3,age);
                    pst.setInt(4,fees);
                    pst.setInt(5,contact);
                    
                    PreparedStatement pst1 = con.prepareStatement("INSERT INTO `stud_course_table`(`student_id`, `course_id`) VALUES (?,?)");
                    pst1.setInt(1,stu_id);
                    pst1.setInt(2,course_id);
                    
                    int i = pst.executeUpdate();
                    int j = pst1.executeUpdate();

                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("INSERTED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(SQLIntegrityConstraintViolationException ie)
                {
                   JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("ENTRY ALREADY EXISTS");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);     
                }
                catch(Exception e){
                        e.printStackTrace();
                   }
                
                
            }
        });


        obj.jButton20.setText("UPDATE");
                obj.jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }

            private void jButton20ActionPerformed(ActionEvent evt) {
                int stu_id = Integer.parseInt(obj.jTextField17.getText());
                String s_name = obj.jTextField18.getText();
                int age = Integer.parseInt(obj.jTextField19.getText());
                int fees = Integer.parseInt(obj.jTextField20.getText());
                int contact = Integer.parseInt(obj.jTextField21.getText());
                int course_id = Integer.parseInt(obj.jTextField22.getText());
                
                 try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("UPDATE `student_table` SET `student_id`=?,`student_name`=?,`student_age`=?,`student_fees`=?,`student_contact`=? WHERE `student_id`=?");
                    pst.setInt(1,stu_id);
                    pst.setString(2,s_name);
                    pst.setInt(3,age);
                    pst.setInt(4,fees);
                    pst.setInt(5,contact);
                    pst.setInt(6,stu_id);
                    PreparedStatement pst1 = con.prepareStatement("INSERT INTO `stud_course_table`(`student_id`, `course_id`) VALUES (?,?)");
                    pst1.setInt(1,stu_id);
                    pst1.setInt(2,course_id);
                    
                    int i = pst.executeUpdate();
                    int j = pst1.executeUpdate();

                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("UPDATED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }
                catch(Exception e){
                        e.printStackTrace();
                   }
                
                
            }
        });

        obj.jButton21.setText("DELETE");
                       obj.jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }

            private void jButton21ActionPerformed(ActionEvent evt) {
                     int id = Integer.parseInt(obj.jTextField17.getText());
                if(id==0){
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("Please enter ID");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);    
                }
                else{
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("DELETE from `student_table` WHERE `student_id`=?");
                    pst.setInt(1,id);
                    PreparedStatement pst1 = con.prepareStatement("DELETE from `stud_course_table` WHERE `student_id`=?");
                    pst1.setInt(1,id);
                    int j = pst1.executeUpdate();
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("DELETED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
                
                
            }
        });

        

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(obj.jPanel6);
        obj.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(obj.jLabel17)
                    .addComponent(obj.jLabel18)
                    .addComponent(obj.jLabel19)
                    .addComponent(obj.jLabel20)
                    .addComponent(obj.jLabel21)
                    .addComponent(obj.jButton18)
                    .addComponent(obj.jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(obj.jTextField17)
                        .addComponent(obj.jTextField18)
                        .addComponent(obj.jTextField19)
                        .addComponent(obj.jTextField20)
                        .addComponent(obj.jTextField21)
                        .addComponent(obj.jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(obj.jButton19)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton20)
                        .addGap(18, 18, 18)
                        .addComponent(obj.jButton21)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(obj.jLabel17)
                            .addComponent(obj.jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(obj.jLabel18)
                            .addComponent(obj.jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(obj.jLabel19)
                            .addComponent(obj.jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(obj.jLabel20))
                    .addComponent(obj.jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel21)
                    .addComponent(obj.jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jLabel22)
                    .addComponent(obj.jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obj.jButton18)
                    .addComponent(obj.jButton19)
                    .addComponent(obj.jButton20)
                    .addComponent(obj.jButton21))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout5 = new javax.swing.GroupLayout(obj.f7.getContentPane());
        obj.f7.getContentPane().setLayout(layout5);
        layout5.setHorizontalGroup(
            layout5.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(obj.jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout5.setVerticalGroup(
            layout5.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(obj.jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
            
        obj.f7.add(obj.jPanel6);
        obj.f7.setSize(1500,800);
        
        
         
         
          
         
    }
    //login button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, College_Db obj) {
        
        
        
        try{
            ConnectionClass conn = new ConnectionClass();
            int uid = Integer.parseInt(jTextField1.getText());
            String pass = jTextField2.getText();
            Connection con = conn.connectionClass();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM `admin_table` where `admin_id`=? AND `admin_password`=?");
            pst.setInt(1,uid);
            pst.setString(2,pass);
            ResultSet rst = pst.executeQuery();
            if(rst.next()){
                
                try{
                obj.f2.setVisible(false);
                JDialog jd = new JDialog();
                JLabel lb = new JLabel("Login Successful");
                jd.add(lb);
                jd.setLocationRelativeTo(null);
                jd.setSize(400,200);
                jd.setVisible(true);
                Thread.sleep(2000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                obj.jPanel2.setVisible(true);
                obj.f3.setVisible(true);
            //obj.f2.setVisible(false);
            
                
                
            }
            else{
                JDialog jd = new JDialog();
                JLabel lb = new JLabel("Please Try again");
                jd.add(lb);
                jd.setLocationRelativeTo(null);
                jd.setSize(400,200);
                jd.setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    //Successful-Login Activity Buttons

    private void jButton2ActionPerformed(ActionEvent evt, College_Db obj) {
        obj.jPanel2.setVisible(false);
        obj.f3.setVisible(false);
        obj.jPanel3.setVisible(true);
        obj.f4.setVisible(true);
        
        
        
        
    }

    private void jButton10ActionPerformed(ActionEvent evt, College_Db obj) {
                

            
                
                obj.f4.setVisible(false);
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    Statement pst = con.createStatement();
                    ResultSet rs = pst.executeQuery("SELECT * FROM `course_table` WHERE 1");
                    obj.c_model.addRow(new Object[]{"course_id","course_name","course_credit","dept_id","instructor_id"});
                    while(rs.next()){
                        obj.c_model.addRow(new Object[]{rs.getInt("course_id"),rs.getString("course_name"),rs.getString("course_credit"),rs.getString("dept_id"),rs.getString("instructor_id")});
                    }
                    obj.dept_frame.add(obj.course_table);
                    obj.dept_frame.setSize(750,400);
                    obj.dept_frame.setVisible(true);
                    
                   
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
            
        

    private void jButton11ActionPerformed(ActionEvent evt, College_Db obj) {
        int id = Integer.parseInt(obj.jTextField6.getText());
               String cname = obj.jTextField7.getText();
               int credit = Integer.parseInt(obj.jTextField8.getText());
               int ins_id = Integer.parseInt(obj.jTextField9.getText());
               int dep_id = Integer.parseInt(obj.jTextField10.getText());
               
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("INSERT INTO `course_table`(`course_id`, `course_name`, `course_credit`, `dept_id`, `instructor_id`) VALUES (?,?,?,?,?)");
                    pst.setInt(1,id);
                    pst.setString(2,cname);
                    pst.setInt(3,credit);
                    pst.setInt(4,dep_id);
                    pst.setInt(5,ins_id);
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("INSERTED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(SQLIntegrityConstraintViolationException ie)
                {
                   JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("ENTRY ALREADY EXISTS");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);     
                }
                catch(Exception e){
                    e.printStackTrace();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel(e.toString());
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true); 
                   }
    }

    private void jButton12ActionPerformed(ActionEvent evt, College_Db obj) {
         int id = Integer.parseInt(obj.jTextField6.getText());
               String cname = obj.jTextField7.getText();
               int credit = Integer.parseInt(obj.jTextField8.getText());
               int ins_id = Integer.parseInt(obj.jTextField9.getText());
               int dep_id = Integer.parseInt(obj.jTextField10.getText());
               
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("UPDATE `course_table` SET `course_id`=?,`course_name`=?,`course_credit`=?,`dept_id`=?,`instructor_id`=? WHERE `course_id`=?");
                    pst.setInt(1,id);
                    pst.setString(2,cname);
                    pst.setInt(3,credit);
                    pst.setInt(4,dep_id);
                    pst.setInt(5,ins_id);
                    pst.setInt(6,id);
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("UPDATED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(SQLIntegrityConstraintViolationException ie)
                {
                   JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("ENTRY ALREADY EXISTS");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);     
                }
                catch(Exception e){
                    e.printStackTrace();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel(e.toString());
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true); 
                   }
    }

    private void jButton13ActionPerformed(ActionEvent evt, College_Db obj) {
         int id = Integer.parseInt(obj.jTextField6.getText());
                if(id==0){
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("Please enter ID");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);    
                }
                else{
                try{
                    ConnectionClass conn = new ConnectionClass();
                    Connection con = conn.connectionClass();
                    PreparedStatement pst = con.prepareStatement("DELETE from `course_table` WHERE `course_id`=?");
                    pst.setInt(1,id);
                    int i = pst.executeUpdate();
                    JDialog jd1 = new JDialog();
                    JLabel lb1 = new JLabel("DELETED SUCCESSFULY");
                    jd1.setLocationRelativeTo(null);
                    jd1.add(lb1);
                    jd1.setSize(400,200);
                    jd1.setVisible(true);
                    
                    
                    
                }catch(Exception e){
                        e.printStackTrace();
                        JDialog jd1 = new JDialog();
                        JLabel lb2 = new JLabel(e.toString());
                        jd1.add(lb2);
                        jd1.setSize(400,200);
                        jd1.setVisible(true);
                        
                   }
            
                }
        
    }
    
    
    
    
}
