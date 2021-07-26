/////////////////////////////////////////
// Estudiante: Elizabeth Montes de Oca
// Asignatura: Lenguaje de Programación de la Web I
// Profesor: Julio Castillo
/////////////////////////////////////////

package Formularios;

import Conexion.ConexionSQL;
import TAD.Administrador;
import TAD.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

    ConexionSQL con = new ConexionSQL();
    Connection conexion = con.getConexionSQL();
    PreparedStatement psInstruccion = null;
    
    public FormLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fldEmail = new javax.swing.JTextField();
        fldPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel America");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("INICIO DE SESIÓN");

        jLabel2.setText("Email:");

        jLabel3.setText("Contraseña:");

        btnIngresar.setBackground(new java.awt.Color(0, 102, 102));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnRegistrarse))
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(fldPassword))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnRegistrarse))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ResultSet resultadoSet;
        ResultSet resultado;
        int id;
        String fechaAlta;
        String ultimoAcceso;
        try {
            // BUSCAMOS EL USUARIO
            // Preparamos la instrucción SQL
            psInstruccion = conexion.prepareStatement ("SELECT id, fecha_alta, ultimo_acceso FROM usuario WHERE email = ? AND password = ? LIMIT 1");
            psInstruccion.setString(1, fldEmail.getText()); 
            psInstruccion.setString(2, String.valueOf(fldPassword.getPassword())); 
            // Ejecutamos la instrucción SQL
            resultado = psInstruccion.executeQuery();
            if(resultado.next()){
                // ACTUALIZAMOS EL ULTIMO ACCESO DEL USUARIO
                id = resultado.getInt("id");
                fechaAlta = resultado.getString("fecha_alta");
                ultimoAcceso = resultado.getString("ultimo_acceso");
                String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
                psInstruccion = conexion.prepareStatement ("UPDATE usuario SET ultimo_acceso = ? WHERE id = ? LIMIT 1");
                psInstruccion.setString(1, now); 
                psInstruccion.setInt(2, id); 
                // Ejecutamos la instrucción SQL
                psInstruccion.executeUpdate();

                // BUSCAMOS EL CLIENTE
                // Preparamos la instrucción SQL
                psInstruccion = conexion.prepareStatement ("SELECT id, nombre, apellido FROM cliente WHERE usuario_id = ? LIMIT 1");
                psInstruccion.setInt(1, id); 
                // Ejecutamos la instrucción SQL
                resultado = psInstruccion.executeQuery();
                if(resultado.next()){    
                    Cliente cliente = new Cliente(resultado.getInt("id"), fldEmail.getText(), resultado.getString("nombre"), resultado.getString("apellido"), fechaAlta, ultimoAcceso);
                    // LLAMAMOS A LA VENTANA DEL CLIENTE (SOLO RESERVA)
                    //JOptionPane.showMessageDialog(null, resultado.getString("nombre")+" "+resultado.getString("apellido") );
                    FormReserva formReserva = new FormReserva(this, true, cliente);
                    formReserva.setVisible(true);                    
                    //this.dispose();
                }else{
                    // BUSCAMOS EL ADMINISTRADOR
                    // Preparamos la instrucción SQL
                    psInstruccion = conexion.prepareStatement ("SELECT id, nombre, apellido FROM administrador WHERE usuario_id = ? LIMIT 1");
                    psInstruccion.setInt(1, id); 
                    // Ejecutamos la instrucción SQL
                    resultado = psInstruccion.executeQuery();
                    if(resultado.next()){
                        // LLAMAMOS A LA VENTANA DEL ADMINISTRADOR
                        Administrador administrador = new Administrador(resultado.getInt("id"),resultado.getString("nombre"),  resultado.getString("apellido"),  fechaAlta,  ultimoAcceso);
                        FormPrincipalAdministrador formPrincipal = new FormPrincipalAdministrador(administrador);
                        formPrincipal.setVisible(true);
                        this.dispose();
                        //this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "No se pudo encontar el usuario ó administrador.");
                    }
                }
                fldEmail.setText("");
                fldPassword.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Las credenciales son inválidas.");
            }                 
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar el inicio de sesión: "+e.getMessage());
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        fldEmail.setText("");
        fldPassword.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        FormRegistro formRegistro = new FormRegistro(this, true);
        formRegistro.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
