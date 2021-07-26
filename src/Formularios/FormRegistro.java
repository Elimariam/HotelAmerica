/////////////////////////////////////////
// Estudiante: Elizabeth Montes de Oca
// Asignatura: Lenguaje de Programación de la Web I
// Profesor: Julio Castillo
/////////////////////////////////////////

package Formularios;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class FormRegistro extends javax.swing.JDialog {

    ConexionSQL con = new ConexionSQL();
    Connection conexion = con.getConexionSQL();
    PreparedStatement psInstruccion = null;
    
    public FormRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        btnGrupoUsuario = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOpcionCliente = new javax.swing.JRadioButton();
        btnOpcionAdministrador = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        fldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fldApellido = new javax.swing.JTextField();
        fldEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fldDomicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fldPoblacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fldProvincia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fldCodPostal = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        fldTelefono = new javax.swing.JTextField();
        fldPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel America");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE USUARIO");

        btnGrupoUsuario.add(btnOpcionCliente);
        btnOpcionCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOpcionCliente.setSelected(true);
        btnOpcionCliente.setText("Cliente");
        btnOpcionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionClienteActionPerformed(evt);
            }
        });

        btnGrupoUsuario.add(btnOpcionAdministrador);
        btnOpcionAdministrador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOpcionAdministrador.setText("Administrador");
        btnOpcionAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpcionAdministradorMouseClicked(evt);
            }
        });
        btnOpcionAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionAdministradorActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido");

        jLabel4.setText("Email:");

        jLabel5.setText("Contraseña:");

        jLabel6.setText("Domicilio:");

        jLabel7.setText("Población:");

        jLabel8.setText("Provincia:");

        jLabel9.setText("Código Postal:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel11.setText("Teléfono:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnOpcionCliente)
                        .addGap(78, 78, 78)
                        .addComponent(btnOpcionAdministrador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(fldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addComponent(fldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(fldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(fldPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addComponent(fldProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(fldCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11)
                        .addGap(35, 35, 35)
                        .addComponent(fldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnAceptar)
                        .addGap(95, 95, 95)
                        .addComponent(btnLimpiar)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpcionCliente)
                    .addComponent(btnOpcionAdministrador))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(fldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(fldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(fldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(fldPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(fldProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(fldCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(fldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addComponent(btnLimpiar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcionAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionAdministradorMouseClicked
        fldPassword.setEnabled(false);
        fldDomicilio.setEnabled(false);
        fldPoblacion.setEnabled(false);
        fldProvincia.setEnabled(false);
        fldCodPostal.setEnabled(false);
        fldPassword.setText("");
        fldDomicilio.setText("");
        fldPoblacion.setText("");
        fldProvincia.setText("");
        fldCodPostal.setText("");
    }//GEN-LAST:event_btnOpcionAdministradorMouseClicked

    private void limpiar(){
        fldNombre.setText("");
        fldApellido.setText("");
        fldEmail.setText("");
        fldPassword.setText("");
        fldDomicilio.setText("");
        fldPoblacion.setText("");
        fldProvincia.setText("");
        fldCodPostal.setText("");
        fldTelefono.setText("");
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnOpcionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionClienteActionPerformed
        fldPassword.setEnabled(true);
        fldDomicilio.setEnabled(true);
        fldPoblacion.setEnabled(true);
        fldProvincia.setEnabled(true);
        fldCodPostal.setEnabled(true);
        fldPassword.setText("");
        fldDomicilio.setText("");
        fldPoblacion.setText("");
        fldProvincia.setText("");
        fldCodPostal.setText("");

    }//GEN-LAST:event_btnOpcionClienteActionPerformed

    private void btnOpcionAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOpcionAdministradorActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        ResultSet resultadoSet;
        ResultSet resultado;
        int id = 0;
        
        if (fldNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El nombre es obligarorio.");
        }else if (fldApellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El apellido es obligarorio.");
        }else if (fldEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El email es obligarorio.");
        }else if (String.valueOf(fldPassword.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "La contraseña es obligaroria.");
        }else {
            try {
                // VERIFICAMOS SI EL EMAIL YA EXISTE PARA NO AGREGAR USUARIOS DUPLICADOS
                psInstruccion = conexion.prepareStatement ("SELECT id FROM usuario WHERE email = ? LIMIT 1");
                psInstruccion.setString(1, fldEmail.getText()); 
                // Ejecutamos la instrucción SQL
                resultado = psInstruccion.executeQuery();
                if(!resultado.next()){                
                    // REGISTRAMOS EL USUARIO
                    // PREPARAMOS LA INSTRUCCIÓN SQL
                    String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    psInstruccion = conexion.prepareStatement("INSERT INTO usuario (email, password, fecha_alta) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
                    psInstruccion.setString(1, fldEmail.getText()); 
                    psInstruccion.setString(2, String.valueOf(fldPassword.getPassword())); 
                    psInstruccion.setString(3, now); 
                    // Ejecutamos la instrucción SQL
                    psInstruccion.executeUpdate();
                    // BUSCAMOS EL id DEL USUARIO (AUTO_INCREMENT)
                    ResultSet rs = psInstruccion.getGeneratedKeys();
                    if (rs.next()){
                        id = rs.getInt(1);                                  
                        if (btnOpcionCliente.isSelected()){                    
                            // REGISTRAMOS EL CLIENTE
                            // PREPARAMOS LA INSTRUCCIÓN SQL
                            psInstruccion = conexion.prepareStatement("INSERT INTO cliente (usuario_id, nombre, apellido, domicilio, poblacion, provincia, cod_postal, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                            psInstruccion.setInt(1, id); 
                            psInstruccion.setString(2, fldNombre.getText()); 
                            psInstruccion.setString(3, fldApellido.getText()); 
                            psInstruccion.setString(4, fldDomicilio.getText()); 
                            psInstruccion.setString(5, fldPoblacion.getText()); 
                            psInstruccion.setString(6, fldProvincia.getText()); 
                            psInstruccion.setString(7, fldCodPostal.getText()); 
                            psInstruccion.setString(8, fldTelefono.getText()); 
                            // Ejecutamos la instrucción SQL
                            psInstruccion.executeUpdate();
                            JOptionPane.showMessageDialog(null, "El cliente se registro con éxito.");
                            limpiar();
                        }else if (btnOpcionAdministrador.isSelected()){
                            // REGISTRAMOS EL ADMINISTRADOR
                            // PREPARAMOS LA INSTRUCCIÓN SQL
                            psInstruccion = conexion.prepareStatement("INSERT INTO cliente (usuario_id, nombre, apellido) VALUES (?, ?, ?)");
                            psInstruccion.setInt(1, id); 
                            psInstruccion.setString(2, fldNombre.getText()); 
                            psInstruccion.setString(3, fldApellido.getText()); 
                            // Ejecutamos la instrucción SQL
                            psInstruccion.executeUpdate();
                            JOptionPane.showMessageDialog(null, "El administrador se registro con éxito.");
                            limpiar();
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El email ya esta siendo usado por otro usuario.");
                    fldEmail.setText("");
                }                 
            }catch (SQLException e) {
                if (btnOpcionCliente.isSelected()){ 
                    JOptionPane.showMessageDialog(null, "Error al registrar el cliente: "+e.getMessage());
                }else if (btnOpcionAdministrador.isSelected()){
                    JOptionPane.showMessageDialog(null, "Error al registrar el administrador: "+e.getMessage());
                }
            }
        }                   
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormRegistro dialog = new FormRegistro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup btnGrupoUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JRadioButton btnOpcionAdministrador;
    private javax.swing.JRadioButton btnOpcionCliente;
    private javax.swing.JTextField fldApellido;
    private javax.swing.JTextField fldCodPostal;
    private javax.swing.JTextField fldDomicilio;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JTextField fldNombre;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JTextField fldPoblacion;
    private javax.swing.JTextField fldProvincia;
    private javax.swing.JTextField fldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}