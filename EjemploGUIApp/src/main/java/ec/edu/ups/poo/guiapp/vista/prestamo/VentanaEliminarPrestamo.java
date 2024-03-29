/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.poo.guiapp.vista.prestamo;

import ec.edu.ups.poo.guiapp.controlador.PrestamoControlador;
import ec.edu.ups.poo.guiapp.modelo.Libro;
import ec.edu.ups.poo.guiapp.modelo.Prestamo;
import ec.edu.ups.poo.guiapp.modelo.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author sebas
 */
public class VentanaEliminarPrestamo extends javax.swing.JInternalFrame {
    
    private PrestamoControlador prestamoControlador;
    private TitledBorder TBEliminar;
    private Locale idiomaSeleccionado = Locale.getDefault();
    /**
     * Creates new form VentanaEliminar
     */
    public VentanaEliminarPrestamo(PrestamoControlador prestamoControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
        TBEliminar = BorderFactory.createTitledBorder("Eliminar Datos");
        this.setBorder(TBEliminar);
    }
    public void cambiarIdioma(Locale locale){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        idiomaSeleccionado = locale;

       TBEliminar.setTitle(mensajes.getString("TBEliminar"));
       lblCode.setText(mensajes.getString("lblCode"));
       lblLibros.setText(mensajes.getString("lblLibros"));
       lblUsuarios.setText(mensajes.getString("lblUsuarios"));
       lblFecha.setText(mensajes.getString("lblFecha"));
       lblTotal.setText(mensajes.getString("lblTotal"));
       btnEliminar.setText(mensajes.getString("btnEliminar"));
       btnCancelar.setText(mensajes.getString("btnCancelar"));
       btnBuscar.setText(mensajes.getString("btnBuscar"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFecha = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblUsuarios = new javax.swing.JLabel();
        lblLibros = new javax.swing.JLabel();
        txtLibros = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtUsuarios = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Datos"));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblFecha.setText("Fecha");

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtFecha.setEditable(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        lblCode.setText("Código");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        lblUsuarios.setText("Usuarios");

        lblLibros.setText("Libros");

        txtLibros.setEditable(false);
        txtLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibrosActionPerformed(evt);
            }
        });

        lblTotal.setText("Total");

        txtUsuarios.setEditable(false);
        txtUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuariosActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblUsuarios)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblFecha)
                                .addComponent(lblTotal)
                                .addComponent(lblLibros))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCode)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLibros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibrosActionPerformed

    private void txtUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuariosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCode.getText();
        Prestamo prestamo = prestamoControlador.buscarPrestamoPorId(codigo);
        if(prestamo == null){
            String mensajeBiblioteca = ResourceBundle.getBundle("mensajes.mensajes", idiomaSeleccionado).getString("mensajeNOPrestamo");
            JOptionPane.showMessageDialog(this, mensajeBiblioteca);
        }else{
            String fechaString = formatearFecha(prestamo.getFechaPrestamo());
            txtFecha.setText(fechaString);
            txtFecha.setEditable(true);
            txtTotal.setText(Double.toString(prestamo.getTotal()));
            txtTotal.setEditable(true);
            txtLibros.setText(convertirAStringLibro(prestamo.getLibros()));
            txtLibros.setEditable(true);
            txtUsuarios.setText(convertirAStringUsuario(prestamo.getUsuarios()));
            txtUsuarios.setEditable(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar el prestamo?");
        if(respuesta == JOptionPane.YES_OPTION){
            String codigo = txtCode.getText();
            prestamoControlador.eliminarPrestamo(codigo);
            String mensajeBiblioteca = ResourceBundle.getBundle("mensajes.mensajes", idiomaSeleccionado).getString("mensajeEliminacionExitosa");
            JOptionPane.showMessageDialog(this, mensajeBiblioteca);

            limpiarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private String formatearFecha(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formato.format(fecha);
    }
    
    private void limpiarDatos(){
        txtCode.setEditable(true);
        txtCode.setText("");
        txtFecha.setText("");
        txtTotal.setText("");
        txtLibros.setText("");
        txtUsuarios.setText("");
    }
    
    private String convertirAStringLibro(List<Libro> libro) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Object objeto : libro) {
            stringBuilder.append(objeto.toString()).append("\n");
        }

        return stringBuilder.toString();
    }
    
    private String convertirAStringUsuario(List<Usuario> usuario) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Object objeto : usuario) {
            stringBuilder.append(objeto.toString()).append("\n");
        }

        return stringBuilder.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLibros;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLibros;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUsuarios;
    // End of variables declaration//GEN-END:variables
}
