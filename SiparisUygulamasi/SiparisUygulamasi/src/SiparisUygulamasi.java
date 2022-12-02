
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class SiparisUygulamasi extends javax.swing.JFrame {
    Map<String,Integer> siparisler = new LinkedHashMap<String,Integer>();
    
    
    /**
     * Creates new form SiparisUygulamasi
     */
    public SiparisUygulamasi() {
        initComponents();
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
        iskender = new javax.swing.JCheckBox();
        beyti = new javax.swing.JCheckBox();
        salata = new javax.swing.JCheckBox();
        ayran = new javax.swing.JCheckBox();
        siparis_goster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipariş Uygulaması");

        jLabel1.setText("MENÜ");

        iskender.setText("İskender - 15 TL");

        beyti.setText("Beyti - 12 TL");

        salata.setText("Salata - 5 TL");

        ayran.setText("Ayran - 2 TL");

        siparis_goster.setText("Siparişleri Göster");
        siparis_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparis_gosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ayran)
                    .addComponent(salata)
                    .addComponent(beyti)
                    .addComponent(iskender)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siparis_goster, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(iskender)
                .addGap(18, 18, 18)
                .addComponent(beyti)
                .addGap(18, 18, 18)
                .addComponent(salata)
                .addGap(18, 18, 18)
                .addComponent(ayran)
                .addGap(26, 26, 26)
                .addComponent(siparis_goster)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void siparisleriGoster(){
        
        String message = "";
        int tutar = 0;
        
        if (siparisler.isEmpty()) {
            
            message = "Siparişiniz Bulunmamaktadır";
            
        }
        else {
            message += "Siparişler\n";
            
            
            for (Map.Entry<String,Integer> entry : siparisler.entrySet()) {
                
                message += entry.getKey() + "\n";
                tutar += entry.getValue();
                
            }
            message += "Toplam Tutar : " + tutar;
            
        }
        
        JOptionPane.showMessageDialog(this, message);
        
        
    }
    private void siparis_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparis_gosterActionPerformed
        
        if (iskender.isSelected()) {
            
            siparisler.put("İskender",15);
            
        }
        else {
            siparisler.remove("İskender");
            
        }
        if (beyti.isSelected()) {
            
            siparisler.put("Beyti",12);
            
        }
        else {
            siparisler.remove("Beyti");
            
        }
        if (salata.isSelected()) {
            
            siparisler.put("Salata",5);
            
        }
        else {
            siparisler.remove("Salata");
            
        }
        if (ayran.isSelected()) {
            
            siparisler.put("Ayran",2);
            
        }
        else {
            siparisler.remove("Ayran");
            
        }
        siparisleriGoster();
        
    }//GEN-LAST:event_siparis_gosterActionPerformed
    
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
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ayran;
    private javax.swing.JCheckBox beyti;
    private javax.swing.JCheckBox iskender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox salata;
    private javax.swing.JButton siparis_goster;
    // End of variables declaration//GEN-END:variables
}