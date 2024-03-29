package ec.edu.ups.poo.guiapp.vista.prestamo;

import ec.edu.ups.poo.guiapp.controlador.LibroControlador;
import ec.edu.ups.poo.guiapp.controlador.PrestamoControlador;
import ec.edu.ups.poo.guiapp.controlador.UsuarioControlador;
import ec.edu.ups.poo.guiapp.modelo.Libro;
import ec.edu.ups.poo.guiapp.modelo.Prestamo;
import ec.edu.ups.poo.guiapp.modelo.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class VentanaActualizarPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    private LibroControlador libroControlador;
    private UsuarioControlador usuarioControlador;
    private TitledBorder miBorder;
    private DefaultListModel listModelLibro;
    private DefaultListModel listModelUsuario;
    private Locale idiomaSeleccionado = Locale.getDefault();
    
    /**
     * Creates new form VentanaCrearBilblioteca
     */
    public VentanaActualizarPrestamo(PrestamoControlador prestamoControlador, LibroControlador libroControlador, UsuarioControlador usuarioControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
        this.libroControlador = libroControlador;
        this.usuarioControlador = usuarioControlador;
        listModelLibro = new DefaultListModel();
        lstLibros.setModel(listModelLibro);
        listModelUsuario = new DefaultListModel();
        lstUsuarios.setModel(listModelUsuario);
        miBorder = BorderFactory.createTitledBorder("Actualizar Datos");
        jPanel1.setBorder(miBorder);
    }
    
    public void cambiarIdioma(Locale locale){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        idiomaSeleccionado = locale;
       
       miBorder.setTitle(mensajes.getString("TBActualizar"));
       jPanel1.repaint();
       lblCode.setText(mensajes.getString("lblCode"));
       lblLibros.setText(mensajes.getString("lblLibros"));
       lblUsuarios.setText(mensajes.getString("lblUsuarios"));
       lblFecha.setText(mensajes.getString("lblFecha"));
       lblTotal.setText(mensajes.getString("lblTotal"));
       lblLibrosDisponibles.setText(mensajes.getString("lblLibrosDisponibles"));
       lblUsuariosDisponibles.setText(mensajes.getString("lblUsuariosDisponibles"));
       btnMostrarLibros.setText(mensajes.getString("btnMostrarLibros"));
       btnMostrarUsuarios.setText(mensajes.getString("btnMostrarUsuarios"));
       btnBuscar.setText(mensajes.getString("btnBuscar"));
       btnActualizar.setText(mensajes.getString("btnActualizar"));
       btnCancelar.setText(mensajes.getString("btnCancelar"));
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
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnMostrarLibros = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblLibrosDisponibles = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList<>();
        lblUsuariosDisponibles = new javax.swing.JLabel();
        btnMostrarUsuarios = new javax.swing.JButton();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstLibros = new javax.swing.JList<>();
        lblUsuarios = new javax.swing.JLabel();
        lblLibros = new javax.swing.JLabel();
        txtLibros = new javax.swing.JTextField();
        txtUsuarios = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Datos"));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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

        btnMostrarLibros.setText("Mostrar");
        btnMostrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibrosActionPerformed(evt);
            }
        });

        lblFecha.setText("Fecha (yyyy-MM-dd HH:mm:ss)");

        lblLibrosDisponibles.setText("Libros Disponibles");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        lblTotal.setText("Total");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstUsuarios);

        lblUsuariosDisponibles.setText("Usuarios Disponibles");

        btnMostrarUsuarios.setText("Mostrar");
        btnMostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuariosActionPerformed(evt);
            }
        });

        lblCode.setText("Código");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstLibros);

        lblUsuarios.setText("Usuarios");

        lblLibros.setText("Libros");

        txtLibros.setEditable(false);
        txtLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibrosActionPerformed(evt);
            }
        });

        txtUsuarios.setEditable(false);
        txtUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtFecha))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUsuarios)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(lblLibros)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnActualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblLibrosDisponibles)
                                            .addComponent(lblUsuariosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMostrarLibros)
                                    .addComponent(btnMostrarUsuarios)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLibros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuarios))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblLibrosDisponibles)
                        .addGap(93, 93, 93)
                        .addComponent(lblUsuariosDisponibles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnMostrarLibros)
                        .addGap(93, 93, 93)
                        .addComponent(btnMostrarUsuarios)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String id = txtCode.getText();
        
        List<String> librosSeleccionadosComoString = lstLibros.getSelectedValuesList();
        List<String> usuariosSeleccionadosComoString = lstUsuarios.getSelectedValuesList();
        
        List<Libro> librosSeleccionados = new ArrayList<>();
            for (String libroString : librosSeleccionadosComoString) {
                Libro libro = libroControlador.buscarLibroPorTitulo(libroString);
                if (libro != null) {
                    librosSeleccionados.add(libro);
                }
            }
            
        List<Usuario> usuariosSeleccionados = new ArrayList<>();
            for (String usuarioString : usuariosSeleccionadosComoString) {
                Usuario usuario = usuarioControlador.buscarUsuarioPorNombre(usuarioString);
                if (usuario != null) {
                    usuariosSeleccionados.add(usuario);
                }
            }
            
        String textoFecha = txtFecha.getText();
        Date fecha = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            fecha = formato.parse(textoFecha);

        } catch (ParseException e) {
            e.printStackTrace();
            String mensajeBiblioteca = ResourceBundle.getBundle("mensajes.mensajes", idiomaSeleccionado).getString("mensajeErrorFecha");
            JOptionPane.showMessageDialog(this, mensajeBiblioteca);
            return;
        }
        double total = Double.parseDouble(txtTotal.getText());
        
        prestamoControlador.actualizarPrestamo(id, librosSeleccionados, usuariosSeleccionados, fecha, total);
        
        String mensajeBiblioteca = ResourceBundle.getBundle("mensajes.mensajes", idiomaSeleccionado).getString("mensajeActualizarPrestamo");
            JOptionPane.showMessageDialog(this, mensajeBiblioteca);
        
        limpiarDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            txtUsuarios.setText(convertirAStringUsuario(prestamo.getUsuarios()));
            txtCode.setEditable(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private String formatearFecha(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formato.format(fecha);
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosActionPerformed
        List<Libro> libros = libroControlador.listarLibro();
        DefaultListModel modelo = (DefaultListModel) lstLibros.getModel();
        modelo.clear();
        for (Libro libro : libros) {
            modelo.addElement(libro.getTitulo());
        }
    }//GEN-LAST:event_btnMostrarLibrosActionPerformed

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

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibrosActionPerformed

    private void txtUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuariosActionPerformed


    private void limpiarDatos(){
        txtCode.setEditable(true);
        txtCode.setText("");
        lstLibros.clearSelection();
        lstUsuarios.clearSelection();
        txtFecha.setText("");
        txtTotal.setText("");
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMostrarLibros;
    private javax.swing.JButton btnMostrarUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLibros;
    private javax.swing.JLabel lblLibrosDisponibles;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel lblUsuariosDisponibles;
    private javax.swing.JList<String> lstLibros;
    private javax.swing.JList<String> lstUsuarios;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLibros;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUsuarios;
    // End of variables declaration//GEN-END:variables

}
