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
				#feature101 code changes by vivek on october 2024
				 public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
		#end of feature101changes
		

                