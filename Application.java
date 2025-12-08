import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

private void txtcustKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcustKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            try {
                String procod =txtcust.getText(); 
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject","root","");
                insert = con1.prepareStatement("select * from customer where cust_id = ? ");
                insert.setString(1,procod);
                rs1 = insert.executeQuery();
 
                if(rs1.next()==false)
                {
                    JOptionPane.showMessageDialog(null, "Customer Id not Found");
                }
                else
                {
                    String firstname = rs1.getString("firstname");
                    txtfname.setText(firstname.trim());               
                }
				#feature102 changes by ethan in october2024
				 private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Users");

        jLabel6.setText("Name");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
		#end of feature102 changes
                