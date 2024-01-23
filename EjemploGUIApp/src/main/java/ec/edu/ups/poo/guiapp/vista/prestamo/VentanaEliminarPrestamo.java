package ec.edu.ups.poo.guiapp.vista.prestamo;

import ec.edu.ups.poo.guiapp.controlador.LibroControlador;
import ec.edu.ups.poo.guiapp.controlador.PrestamoControlador;
import ec.edu.ups.poo.guiapp.controlador.UsuarioControlador;
import ec.edu.ups.poo.guiapp.modelo.Libro;
import ec.edu.ups.poo.guiapp.modelo.Prestamo;
import ec.edu.ups.poo.guiapp.modelo.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
/**
 *
 * @author sebas
 */
public class VentanaEliminarPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    private LibroControlador libroControlador;
    private UsuarioControlador usuarioControlador;
    private TitledBorder miBorder;
    private DefaultListModel listModelLibro;
    private DefaultListModel listModelUsuario;
    /**
     * Creates new form VentanaEliminarPrestamo
     */
    public VentanaEliminarPrestamo(PrestamoControlador prestamoControlador, LibroControlador libroControlador, UsuarioControlador usuarioControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
        this.libroControlador = libroControlador;
        this.usuarioControlador = usuarioControlador;
        listModelLibro = new DefaultListModel();
        lstLibros.setModel(listModelLibro);
        listModelUsuario = new DefaultListModel();
        lstUsuarios.setModel(listModelUsuario);
        miBorder = BorderFactory.createTitledBorder("Eliminar Datos");
        jPanel1.setBorder(miBorder);
    }
    
    public void cambiarIdioma(Locale locale){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
       
        miBorder.setTitle(mensajes.getString("TBEliminar"));
       jPanel1.repaint();
       lblCode.setText(mensajes.getString("lblCode"));
       lblLibro.setText(mensajes.getString("lblLibro"));
       lblUsuario.setText(mensajes.getString("lblUsuario"));
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

        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblLibro = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
<<<<<<< HEAD
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLibros = new javax.swing.JList<>();
        btnMostrarUsuarios = new javax.swing.JButton();
        btnMostrarLibros = new javax.swing.JButton();
=======
        txtLibro = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        ImageIcon icon=new ImageIcon(getClass().getResource("/imagenes/Delete.png"));
        Image image=icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent (Graphics g){
                g.drawImage(image,0,0, getWidth(), getHeight(),this);
            }
        };
>>>>>>> c9998e66668f4c6b9c0cca814d84ac4a69d59b38

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Datos"));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setText("Fecha");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotal.setText("Total");

        lblCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCode.setText("Código");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        lblLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLibro.setText("Libro");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario");

<<<<<<< HEAD
        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

=======
<<<<<<< HEAD
        jScrollPane2.setViewportView(lstUsuarios);

        jScrollPane1.setViewportView(lstLibros);

        btnMostrarUsuarios.setText("Mostrar");
        btnMostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuariosActionPerformed(evt);
            }
        });

        btnMostrarLibros.setText("Mostrar");
        btnMostrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibrosActionPerformed(evt);
            }
        });
=======
>>>>>>> 818ee77e80ad1c3103dac0de872839a7c2f660ad
        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
>>>>>>> c9998e66668f4c6b9c0cca814d84ac4a69d59b38

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCode)
                        .addGap(12, 12, 12)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFecha)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(btnEliminar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLibro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarLibros)
                            .addComponent(btnMostrarUsuarios))))
                .addGap(14, 14, 14))
=======
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLibro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
>>>>>>> c9998e66668f4c6b9c0cca814d84ac4a69d59b38
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar))
<<<<<<< HEAD
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnMostrarLibros)
                        .addGap(87, 87, 87)
                        .addComponent(btnMostrarUsuarios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
=======
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
>>>>>>> c9998e66668f4c6b9c0cca814d84ac4a69d59b38
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addContainerGap())
=======
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addGap(36, 36, 36))
>>>>>>> c9998e66668f4c6b9c0cca814d84ac4a69d59b38
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> c9998e66668f4c6b9c0cca814d84ac4a69d59b38
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar el prestamo?");
        if(respuesta == JOptionPane.YES_OPTION){
            String codigo = txtCode.getText();

            prestamoControlador.eliminarPrestamo(codigo);
            JOptionPane.showMessageDialog(this, "Préstamo eliminado exitosamente");
            limpiarDatos();
        }      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCode.getText();
        Prestamo prestamo = prestamoControlador.buscarPrestamoPorId(codigo);
        if(prestamo == null){
            JOptionPane.showMessageDialog(this, "No se a encontrado el prestamo");
        }else{
            String fechaString = formatearFecha(prestamo.getFechaPrestamo());
            
            lstLibros.setSelectedValue(prestamo.getLibros(), false);
            lstUsuarios.setSelectedValue(prestamo.getUsuarios(), false);
            txtFecha.setText(fechaString);
            txtFecha.setEditable(true);
            txtTotal.setText(Double.toString(prestamo.getTotal()));
            txtTotal.setEditable(true);
            txtCode.setEditable(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private String formatearFecha(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formato.format(fecha);
    }
    
    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnMostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsuariosActionPerformed
        List<Usuario> usuarios = usuarioControlador.listarUsuario();
        DefaultListModel modelo = (DefaultListModel) lstUsuarios.getModel();
        modelo.clear();
        for (Usuario usuario : usuarios) {
            modelo.addElement(usuario.getNombre());
        }
    }//GEN-LAST:event_btnMostrarUsuariosActionPerformed

    private void btnMostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosActionPerformed
        List<Libro> libros = libroControlador.listarLibro();
        DefaultListModel modelo = (DefaultListModel) lstLibros.getModel();
        modelo.clear();
        for (Libro libro : libros) {
            modelo.addElement(libro.getTitulo());
        }
    }//GEN-LAST:event_btnMostrarLibrosActionPerformed

    private void limpiarDatos(){
        txtCode.setEditable(true);
        txtCode.setText("");
        lstLibros.clearSelection();
        lstUsuarios.clearSelection();
        txtFecha.setText("");
        txtTotal.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
<<<<<<< HEAD
    private javax.swing.JButton btnMostrarLibros;
    private javax.swing.JButton btnMostrarUsuarios;
=======
    private javax.swing.JDesktopPane jDesktopPane1;
>>>>>>> c9998e66668f4c6b9c0cca814d84ac4a69d59b38
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList<String> lstLibros;
    private javax.swing.JList<String> lstUsuarios;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
