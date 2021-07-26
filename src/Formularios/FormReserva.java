/////////////////////////////////////////
// Estudiante: Elizabeth Montes de Oca
// Asignatura: Lenguaje de Programación de la Web I
// Profesor: Julio Castillo
/////////////////////////////////////////

package Formularios;

import Conexion.ConexionSQL;
import TAD.Administrador;
import TAD.Cliente;
import TAD.Habitacion;
import TAD.Hotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormReserva extends javax.swing.JDialog {

    ConexionSQL con = new ConexionSQL();
    Connection conexion = con.getConexionSQL();
    PreparedStatement psInstruccion = null;
    ResultSet resultadoSetHotel, resultadoSetHabitacion, resultadoSetReserva;
    int administrador_id;
    int hotel_id;
    DefaultTableModel modelo = null;
    Cliente cliente = null;
    
    public FormReserva(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        this.cliente = cliente;

        initComponents();
        
        fldCliente.setText(cliente.getNombre()+' '+cliente.getApellido());
        fldFechaAlta.setText(cliente.getFechaAlta());
        fldUltimoAcceso.setText(cliente.getUltimoAcceso());

       // DEFINIMOS LAS ESTRUCTURA DEL COMPONENTE JTABLE
        modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Fecha Iniio");
        modelo.addColumn("Fecha Fin");
        modelo.addColumn("Precio");
        tablaReserva.setModel(modelo);

        cargarReservas();
        
        //cargarHoteles();
        //this.hotel_id = this.cmbHotel.getItemAt(this.cmbHotel.getSelectedIndex()).getId();
       // cargarHabitaciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        scroll = new javax.swing.JScrollPane();
        tablaReserva = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fldFechaAlta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fldUltimoAcceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fldCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel America");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("RESERVA DE HABITACIONES");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        scroll.setViewportView(tablaReserva);

        jScrollPane3.setViewportView(scroll);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente:");

        fldFechaAlta.setEditable(false);
        fldFechaAlta.setBackground(new java.awt.Color(0, 51, 51));
        fldFechaAlta.setForeground(new java.awt.Color(255, 255, 255));
        fldFechaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldFechaAltaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Creación");

        fldUltimoAcceso.setEditable(false);
        fldUltimoAcceso.setBackground(new java.awt.Color(0, 51, 51));
        fldUltimoAcceso.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Último Acceso");

        fldCliente.setEditable(false);
        fldCliente.setBackground(new java.awt.Color(0, 51, 51));
        fldCliente.setForeground(new java.awt.Color(255, 255, 255));
        fldCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fldFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldUltimoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(fldUltimoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(fldFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // LLAMAMOS EL FORMULARIO PARA AGREGAR UNA HABITACION
        FormAgregarReserva formAgregarReserva = new FormAgregarReserva(new javax.swing.JFrame(), true, cliente);
        formAgregarReserva.setVisible(true);
        cargarReservas();
    }//GEN-LAST:event_btnNuevoActionPerformed
    
    // NO SE PUDO TERMINAR
    public void editarReserva(){
        // LLAMAMOS AL FORMULARIO PARA EDITAR UNA RESERVA
        if (tablaReserva.getRowCount() > 0){
            int fila = tablaReserva.getSelectedRow();
            if (fila >= 0){
                // OBTENEMOS EL ID DE LA RESERVA, DE LA FILA SELECCIONADA
                int reserva_id = Integer.parseInt(tablaReserva.getValueAt(tablaReserva.getSelectedRow(),0).toString());
                
                int hotel_id = Integer.parseInt(tablaReserva.getValueAt(tablaReserva.getSelectedRow(),0).toString());
                int habitacion_id = Integer.parseInt(tablaReserva.getValueAt(tablaReserva.getSelectedRow(),0).toString());
                FormEditarReserva formEditarReserva = new FormEditarReserva(new javax.swing.JFrame(), true, cliente, reserva_id, hotel_id, habitacion_id);
                formEditarReserva.setVisible(true);
                cargarReservas();
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar un hotel.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No existen hoteles registrados.");
        }
    }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaReserva.getRowCount() > 0){
            int fila = tablaReserva.getSelectedRow();
            if (fila >= 0){
                // CONFIRMAMOS CON EL USUARIO SI ELIMINA LA RESERVA
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar la reservación?", "Pregunta...",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                // Yes = 0 , No = 1 , Cancel = 2
                if (respuesta == 0){
                    // OBTENEMOS EL ID DE LA RESERVACIÓN, DE LA FILA SELECCIONADA
                    int id = Integer.parseInt(tablaReserva.getValueAt(tablaReserva.getSelectedRow(),0).toString());
                    try {
                        psInstruccion = conexion.prepareStatement("DELETE FROM reserva WHERE id = ?");
                        psInstruccion.setInt(1, id);
                        psInstruccion.executeUpdate();
                        JOptionPane.showMessageDialog(null, "La reservación se elimino con éxito.");
                        cargarReservas();
                    }
                    catch(SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al eliminar la reservación: "+e.getMessage());
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar una reservación.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No existen reservaciones registradas.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void fldFechaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldFechaAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldFechaAltaActionPerformed

    private void fldClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldClienteActionPerformed

    public void cargarReservas(){
        try {
            // LIMPIAMOS EL MODELO Y CON ESO SE LIMPIA EL JTABLE
            modelo.setRowCount(0);
            // CONSULTAMOS LOS HOTELES EN LA BASE DE DATOS
            psInstruccion = conexion.prepareStatement("SELECT id, fecha_inicio, fecha_fin, precio FROM reserva WHERE cliente_id = ?");
            psInstruccion.setInt(1, cliente.getId()); 
            // Ejecutamos la instrucción SQL
            resultadoSetReserva = psInstruccion.executeQuery();
            // RECORREMOS EL RESULTSET Y COLOCAMOS LOS CAMPOS EN EL ARREGLO
            // Y LUEGO AGREGAMOS EL ARREGLO AL MODELO 
            while(resultadoSetReserva.next()){
                Object [] arrCampo = new Object[4]; // Hay cuatro campos en la tabla                
                // Se rellena el arreglo con los datos del ResulSet
                for (int i=0; i<4; i++){
                    arrCampo[i] = resultadoSetReserva.getObject ( i+1 );
                    // Se añade al modelo el arreglo            
                } 
                modelo.addRow(arrCampo);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar las reservas: "+e.getMessage());
        }
    }
    

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
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FormReserva dialog = new FormReserva(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTextField fldCliente;
    private javax.swing.JTextField fldFechaAlta;
    private javax.swing.JTextField fldUltimoAcceso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tablaReserva;
    // End of variables declaration//GEN-END:variables
}
