/////////////////////////////////////////
// Estudiante: Elizabeth Montes de Oca
// Asignatura: Lenguaje de Programación de la Web I
// Profesor: Julio Castillo
/////////////////////////////////////////

package Formularios;

import TAD.Cliente;

import java.sql.ResultSet;
import Conexion.ConexionSQL;
import TAD.Cliente;
import TAD.Habitacion;
import TAD.Hotel;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormEditarReserva extends javax.swing.JDialog {
    ConexionSQL con = new ConexionSQL();
    Connection conexion = con.getConexionSQL();
    PreparedStatement psInstruccion = null;
    int administrador_id, hotel_id, habitacion_id;
    Cliente cliente = null;
    DefaultTableModel modelo = null;
    ResultSet resultadoSetHotel, resultadoSetHabitacion;    
    Habitacion habitacion = null;
    
    public FormEditarReserva(java.awt.Frame parent, boolean modal, Cliente cliente, int reserva_id, int hotel_id, int habitacion_id) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fldCliente = new javax.swing.JTextField();
        btnReservar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbHotel = new javax.swing.JComboBox<>();
        cmbHabitacion = new javax.swing.JComboBox<>();
        fldPrecio = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        dateFechaInicio = new com.toedter.calendar.JDateChooser();
        dateFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fldTotal = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        fldDias = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel America");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("EDITAR RESERVACIÓN");

        jLabel5.setText("Cliente:");

        jLabel6.setText("Hotel:");

        fldCliente.setEditable(false);

        btnReservar.setBackground(new java.awt.Color(0, 102, 102));
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Habitación:");

        jLabel8.setText("Precio:");

        cmbHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHotelActionPerformed(evt);
            }
        });

        cmbHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHabitacionActionPerformed(evt);
            }
        });

        fldPrecio.setEditable(false);
        fldPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dateFechaInicio.getDateEditor().addPropertyChangeListener(
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent e) {
                    calcularDias();
                    calcularPrecio();

                    //            if ("date".equals(e.getPropertyName())) {
                        //                System.out.println(e.getPropertyName()
                            //                    + ": " + (Date) e.getNewValue());
                        //            }
                }
            });
            /*
            dateFechaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    dateFechaInicioMouseClicked(evt);
                }
            });
            */

            dateFechaFin.getDateEditor().addPropertyChangeListener(
                new PropertyChangeListener() {
                    @Override
                    public void propertyChange(PropertyChangeEvent e) {
                        calcularDias();
                        calcularPrecio();

                        //            if ("date".equals(e.getPropertyName())) {
                            //                System.out.println(e.getPropertyName()
                                //                    + ": " + (Date) e.getNewValue());
                            //            }
                    }
                });
                /*
                dateFechaFin.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        dateFechaFinMouseClicked(evt);
                    }
                });
                */

                jLabel1.setText("Desde");

                jLabel2.setText("Hasta");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(dateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(dateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(172, 172, 172))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                );

                jLabel9.setText("Total:");

                fldTotal.setEditable(false);
                fldTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

                jLabel10.setText("Días:");

                fldDias.setEditable(false);
                fldDias.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(29, 29, 29)
                                                .addComponent(fldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fldDias, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9)
                                                .addGap(29, 29, 29)
                                                .addComponent(fldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cmbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(10, 10, 10))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(270, 270, 270)
                                .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(fldDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(fldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(fldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReservar)
                            .addComponent(btnLimpiar1))
                        .addContainerGap(7, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        ResultSet resultadoSet;
        try {
            this.hotel_id = this.cmbHotel.getItemAt(this.cmbHotel.getSelectedIndex()).getId();
            this.habitacion_id = this.cmbHabitacion.getItemAt(this.cmbHabitacion.getSelectedIndex()).getId();
            // VERIFICAMOS SI LA HABITACIÓN YA ESTA RESERVA EN ESE RANGO DE FECHAS
            // Preparamos la instrucción SQL
            psInstruccion = conexion.prepareStatement ("SELECT id FROM reserva WHERE tipo_habitacion_id = ? AND fecha_inicio >= ? AND fecha_fin <= ? LIMIT 1");
            psInstruccion.setInt(1, habitacion.getId() );
            psInstruccion.setString(2, obtFechaAAAAMMDD(dateFechaInicio));
            psInstruccion.setString(3, obtFechaAAAAMMDD(dateFechaFin));
            // Ejecutamos la instrucción SQL
            resultadoSet = psInstruccion.executeQuery();
            if(!resultadoSet.next()){
                // LA HABITACIÓN ESTA DISPONIBLE
                // REGISTRAMOS LA RESERVA
                // PREPARAMOS LA INSTRUCCIÓN SQL
                psInstruccion = conexion.prepareStatement("INSERT INTO reserva (cliente_id, tipo_habitacion_id, precio, fecha_inicio, fecha_fin) VALUES (?, ?, ?, ?, ?)");
                psInstruccion.setInt(1, cliente.getId());
                psInstruccion.setInt(2, this.habitacion_id);
                psInstruccion.setDouble(3, ((Number)fldTotal.getValue()).floatValue());
                psInstruccion.setString(4, obtFechaAAAAMMDD(dateFechaInicio));
                psInstruccion.setString(5, obtFechaAAAAMMDD(dateFechaInicio));
                // Ejecutamos la instrucción SQL
                psInstruccion.executeUpdate();
                JOptionPane.showMessageDialog(null, "La reserva se registro con éxito.");
                this.dispose();
                //fldPrecio.setValue(0.00);
                //fldDias.setValue(0);
                //fldTotal.setValue(0.00);
            }else{
                JOptionPane.showMessageDialog(null, "La habitación tiene reserva previa en el rango de fechas.");
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la reserva: "+e.getMessage());
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        cmbHotel.setSelectedItem(null);
        cmbHabitacion.setSelectedItem(null);        
        fldPrecio.setValue(0.00);
        fldTotal.setValue(0.00);
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void cmbHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHotelActionPerformed
        try{
            this.hotel_id = this.cmbHotel.getItemAt(this.cmbHotel.getSelectedIndex()).getId();
            cargarHabitaciones();
            calcularPrecio();
        }catch(Exception e){

        }
    }//GEN-LAST:event_cmbHotelActionPerformed

    private void cmbHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHabitacionActionPerformed
        try{
            habitacion = (Habitacion) this.cmbHabitacion.getItemAt(this.cmbHabitacion.getSelectedIndex());
            fldPrecio.setValue(habitacion.getPrecio());
            calcularPrecio();
        }catch(Exception e){

        }
    }//GEN-LAST:event_cmbHabitacionActionPerformed

    private void dateFechaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFechaInicioMouseClicked
        //        JOptionPane.showMessageDialog(null, "Entro a fecha inicio.");
        //        calcularDias();
    }//GEN-LAST:event_dateFechaInicioMouseClicked

    private void dateFechaFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFechaFinMouseClicked
        //        JOptionPane.showMessageDialog(null, "Entro a fecha fin.");
        //        calcularDias();
    }//GEN-LAST:event_dateFechaFinMouseClicked

    public void cargarHoteles(){
        int id;
        String nombre;
        Hotel hotel = null;
        try {     
            // CONSULTAMOS LOS HOTELES EN LA BASE DE DATOS
            psInstruccion = conexion.prepareStatement("SELECT id, nombre FROM hotel ORDER BY nombre");
            // Ejecutamos la instrucción SQL
            resultadoSetHotel = psInstruccion.executeQuery();
            // RECORREMOS EL RESULTSET Y COLOCAMOS LOS CAMPOS EN EL ARREGLO
            // Y LUEGO AGREGAMOS EL ARREGLO AL MODELO 
            while (resultadoSetHotel.next()){
                id = resultadoSetHotel.getInt("id");
                nombre = resultadoSetHotel.getString("nombre");
                hotel = new Hotel(id, nombre);
                // EL COMBOBOX DEBE CONFIGURARSE PARA QUE ACEPTE EL TIPO <HOTEL>
                // YA QUE POR DEFACTO VIENE PARA MANEJAR STRING.
                // VER PROPIEDADES->CODIGO->TIPO DE PARÁMETROS
                cmbHotel.addItem(hotel);
                //JOptionPane.showMessageDialog(null, "cargo: "+nombre);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar los hoteles: "+e.getMessage());
        }
    }

    public void cargarHabitaciones(){
        int id;
        String nombre;
        int capacidad;
        float precio;
        Habitacion habitacion = null;
        try {     
            cmbHabitacion.removeAllItems();
            // CONSULTAMOS LAS HABITACIONES DEL HOTEL SELECCIONADO (hoteh_id)
            psInstruccion = conexion.prepareStatement("SELECT id, nombre, capacidad, precio FROM tipo_habitacion WHERE hotel_id = ? ORDER BY precio");
            psInstruccion.setInt(1, this.hotel_id); 
            // Ejecutamos la instrucción SQL
            resultadoSetHabitacion = psInstruccion.executeQuery();
            // RECORREMOS EL RESULTSET Y COLOCAMOS LOS CAMPOS EN EL ARREGLO
            // Y LUEGO AGREGAMOS EL ARREGLO AL MODELO 
            while (resultadoSetHabitacion.next()){
                id = resultadoSetHabitacion.getInt("id");
                nombre = resultadoSetHabitacion.getString("nombre");
                capacidad = resultadoSetHabitacion.getInt("capacidad");
                precio = resultadoSetHabitacion.getInt("precio");
                habitacion = new Habitacion(id, nombre, capacidad, precio);
                // EL COMBOBOX DEBE CONFIGURARSE PARA QUE ACEPTE EL TIPO <HOTEL>
                // YA QUE POR DEFACTO VIENE PARA MANEJAR STRING.
                // VER PROPIEDADES->CODIGO->TIPO DE PARÁMETROS
                cmbHabitacion.addItem(habitacion);
                //JOptionPane.showMessageDialog(null, "cargo: "+nombre);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar los habitaciones: "+e.getMessage());
        }
    }

    public void calcularDias(){
        int dias = 0;
        fldDias.setValue(0);
        fldTotal.setValue(0.00);
        if (dateFechaInicio.getDate() != null && dateFechaFin.getDate() != null){
            Calendar fechaInicio = dateFechaInicio.getCalendar();
            Calendar fechaFin = dateFechaFin.getCalendar();
            if (fechaInicio.before(fechaFin) || fechaInicio.equals(fechaFin)){
                while (fechaInicio.before(fechaFin) || fechaInicio.equals(fechaFin)){
                    dias++;
                    fechaInicio.add(Calendar.DATE, 1);                
                }
                fldDias.setValue(dias);
            }else{
                //JOptionPane.showMessageDialog(null, "La fecha <Desde> debe ser menor o igual a la fecha <Hasta>.");
            }
        }
//        String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
//        String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
//        String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
//        String fecha = (year + "-" + mes+ "-" + dia);
//        txtfecha.setText(fecha);
    }
    
    public void calcularPrecio(){
        try{
            int dias = ((Number)fldDias.getValue()).intValue();
            float precio = habitacion.getPrecio();            
            fldTotal.setValue( (float) dias * precio);
        }catch(Exception e){
            
        }
        
        //float precio = ((Number)fldPrecio.getValue()).floatValue();
        
        //fldTotal.setValue( (float) fldDias.getValue() * habitacion.getPrecio());
    }

    public String obtFechaAAAAMMDD(JDateChooser fecha){
        String dia = Integer.toString(fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(fecha.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(fecha.getCalendar().get(Calendar.YEAR));
        return year + "-" + mes+ "-" + dia;
    }

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
            java.util.logging.Logger.getLogger(FormEditarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FormEditarReserva dialog = new FormEditarReserva(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<Habitacion> cmbHabitacion;
    private javax.swing.JComboBox<Hotel> cmbHotel;
    private com.toedter.calendar.JDateChooser dateFechaFin;
    private com.toedter.calendar.JDateChooser dateFechaInicio;
    private javax.swing.JTextField fldCliente;
    private javax.swing.JFormattedTextField fldDias;
    private javax.swing.JFormattedTextField fldPrecio;
    private javax.swing.JFormattedTextField fldTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
