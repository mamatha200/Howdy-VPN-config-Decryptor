/*
 * To change this license header, choose License Headers in Project import javax.swing.JOptionPane;
Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howdydecryptor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Base64; 
import java.awt.Color;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import java.util.Base64; 
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher; 
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec; 
import javax.crypto.spec.SecretKeySpec; 
import sun.misc.*;

/**
 *
 * @author Samuel Muthembwa
 */
public class HowdyDecryptor extends javax.swing.JFrame {
    private static final String initVector = "r4tgv3b2zcmdW6ZZ";
    private static final String key = "poiuytrewqas+=~|"; 
    public static String server;
    /**
     * Creates new form MainPage
     */
    public HowdyDecryptor() {
        initComponents();
         setLocationRelativeTo(null);
         setTitle("Howdy VPN decryptor");
    }
    public void decrypt(String str) { 
            String str2 = "UTF-8"; 
            try { 
                IvParameterSpec ivParameterSpec = new IvParameterSpec(initVector.getBytes(str2)); 
                SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(str2), "AES"); 
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING"); 
                instance.init(2, secretKeySpec, ivParameterSpec); 
                HowdyDecryptor.server = new String(instance.doFinal(Base64.getDecoder().decode(str))); 
                System.out.println("SERVER NAME : "+server);
                serverTxt.setText(server);
            } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) { 
                System.out.println("SERVER NAME : "+server);
            } 
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        decryptBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        resLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        configTxt = new javax.swing.JTextArea();
        serverTxt = new javax.swing.JTextField();
        portTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Paste your Howdy Config Below");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 0), new java.awt.Color(102, 255, 102), new java.awt.Color(102, 255, 51), new java.awt.Color(0, 102, 0)));

        decryptBtn.setBackground(new java.awt.Color(51, 255, 0));
        decryptBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        decryptBtn.setText("Decrypt");
        decryptBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Server ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Port");

        jLabel6.setText("Credits ❤");

        jLabel7.setText("Owner: Samuel Munyoki Muthembwa");

        jLabel8.setText("Email: sammuthembwa926@gmail.com");

        jLabel9.setText("Tel: 0759439032");

        resLabel.setBackground(new java.awt.Color(0, 102, 0));
        resLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resLabel.setForeground(new java.awt.Color(0, 204, 0));
        resLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resLabel.setText("Waiting for Payload.");
        resLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        configTxt.setColumns(20);
        configTxt.setForeground(new java.awt.Color(0, 204, 51));
        configTxt.setLineWrap(true);
        configTxt.setRows(5);
        configTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(configTxt);

        serverTxt.setEditable(false);
        serverTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        portTxt.setEditable(false);
        portTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        usernameTxt.setEditable(false);
        usernameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        passwordTxt.setEditable(false);
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decryptBtn, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                .addComponent(serverTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(portTxt)
                                .addComponent(usernameTxt)
                                .addComponent(passwordTxt))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(resLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(serverTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void decryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptBtnActionPerformed
        // TODO add your handling code here:
        if(configTxt.getText().equals("")){
            
            JOptionPane.showMessageDialog(null ,"Enter your PAYLOAD in the text box.", "Empty Payload", JOptionPane.ERROR_MESSAGE);
        }else{
            String conf_ = configTxt.getText();
            String conf_payload = conf_.replace("howdy://", "");
            resLabel.setText("Results...");
            try {
                byte[] decbytes=Base64.getDecoder().decode(conf_payload);
                String decString = new String(decbytes);
                try {
                    JSONParser parser  = new JSONParser();
                    Object payload_obj = parser.parse(decString);
                    JSONObject obj = (JSONObject)payload_obj;
                    String server_payload = (String)obj.get("server");
                    String username_payload = (String)obj.get("username");
                    usernameTxt.setText(username_payload);
                    String password_payload = (String)obj.get("password");
                    passwordTxt.setText(password_payload);
                    String port_payload = (String)obj.get("port");
                    portTxt.setText(port_payload);
                    String server_payload_name = server_payload.replace("\n","");
                    this.decrypt(server_payload_name);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null ,"Invalid Payload or Couldn't be decrypted.", "Invalid Payload", JOptionPane.WARNING_MESSAGE);
                    
                }
              
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null ,"Invalid Payload or Couldn't be decrypted.", "Invalid Payload", JOptionPane.WARNING_MESSAGE);
            }
        
        
        }
    }//GEN-LAST:event_decryptBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HowdyDecryptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HowdyDecryptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HowdyDecryptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HowdyDecryptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HowdyDecryptor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea configTxt;
    private javax.swing.JButton decryptBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField portTxt;
    private javax.swing.JLabel resLabel;
    private javax.swing.JTextField serverTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
