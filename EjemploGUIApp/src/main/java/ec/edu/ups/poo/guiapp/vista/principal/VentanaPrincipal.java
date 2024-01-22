package ec.edu.ups.poo.guiapp.vista.principal;

import ec.edu.ups.poo.guiapp.controlador.BibliotecaControlador;
import ec.edu.ups.poo.guiapp.controlador.LibroControlador;
import ec.edu.ups.poo.guiapp.controlador.PrestamoControlador;
import ec.edu.ups.poo.guiapp.controlador.UsuarioControlador;
import ec.edu.ups.poo.guiapp.dao.BibliotecaDAO;
import ec.edu.ups.poo.guiapp.dao.LibroDAO;
import ec.edu.ups.poo.guiapp.dao.PrestamoDAO;
import ec.edu.ups.poo.guiapp.dao.UsuarioDAO;
import ec.edu.ups.poo.guiapp.vista.biblioteca.VentanaActualizarBiblioteca;
import ec.edu.ups.poo.guiapp.vista.biblioteca.VentanaListarBiblioteca;
import ec.edu.ups.poo.guiapp.vista.biblioteca.VentanaEliminarBiblioteca;
import ec.edu.ups.poo.guiapp.vista.biblioteca.VentanaBuscarBiblioteca;
import ec.edu.ups.poo.guiapp.vista.biblioteca.VentanaCrearBiblioteca;
import ec.edu.ups.poo.guiapp.idao.IBibliotecaDAO;
import ec.edu.ups.poo.guiapp.idao.ILibroDAO;
import ec.edu.ups.poo.guiapp.idao.IPrestamoDAO;
import ec.edu.ups.poo.guiapp.idao.IUsuarioDAO;
import ec.edu.ups.poo.guiapp.vista.libro.VentanaActualizarLibro;
import ec.edu.ups.poo.guiapp.vista.libro.VentanaBuscarLibro;
import ec.edu.ups.poo.guiapp.vista.libro.VentanaCrearLibro;
import ec.edu.ups.poo.guiapp.vista.libro.VentanaEliminarLibro;
import ec.edu.ups.poo.guiapp.vista.libro.VentanaListarLibro;
import ec.edu.ups.poo.guiapp.vista.prestamo.VentanaActualizarPrestamo;
import ec.edu.ups.poo.guiapp.vista.prestamo.VentanaBuscarPrestamo;
import ec.edu.ups.poo.guiapp.vista.prestamo.VentanaCrearPrestamo;
import ec.edu.ups.poo.guiapp.vista.prestamo.VentanaEliminarPrestamo;
import ec.edu.ups.poo.guiapp.vista.prestamo.VentanaListarPrestamo;
import ec.edu.ups.poo.guiapp.vista.usuario.VentanaActualizarUsuario;
import ec.edu.ups.poo.guiapp.vista.usuario.VentanaBuscarUsuario;
import ec.edu.ups.poo.guiapp.vista.usuario.VentanaCrearUsuario;
import ec.edu.ups.poo.guiapp.vista.usuario.VentanaEliminarUsuario;
import ec.edu.ups.poo.guiapp.vista.usuario.VentanaListarUsuario;
import ec.edu.ups.poo.guiapp.modelo.Libro;
import ec.edu.ups.poo.guiapp.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author sebas
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private VentanaCrearBiblioteca ventanaCrearBiblioteca;
    private VentanaActualizarBiblioteca ventanaActualizarBiblioteca;
    private VentanaBuscarBiblioteca ventanaBuscarBiblioteca;
    private VentanaEliminarBiblioteca ventanaEliminarBiblioteca;
    private VentanaListarBiblioteca ventanaListarBiblioteca;
    private VentanaCrearUsuario ventanaCrearUsuario;
    private VentanaActualizarUsuario ventanaActualizarUsuario;
    private VentanaBuscarUsuario ventanaBuscarUsuario;
    private VentanaEliminarUsuario ventanaEliminarUsuario;
    private VentanaListarUsuario ventanaListarUsuario;
    private VentanaCrearLibro ventanaCrearLibro;
    private VentanaActualizarLibro ventanaActualizarLibro;
    private VentanaBuscarLibro ventanaBuscarLibro;
    private VentanaEliminarLibro ventanaEliminarLibro;
    private VentanaListarLibro ventanaListarLibro;
    private VentanaCrearPrestamo ventanaCrearPrestamo;
    private VentanaActualizarPrestamo ventanaActualizarPrestamo;
    private VentanaBuscarPrestamo ventanaBuscarPrestamo;
    private VentanaEliminarPrestamo ventanaEliminarPrestamo;
    private VentanaListarPrestamo ventanaListarPrestamo;
    private Locale locale;
    
    private IBibliotecaDAO bibliotecaDAO;
    private BibliotecaControlador bibliotecaControlador;
    private IUsuarioDAO usuarioDAO;
    private UsuarioControlador usuarioControlador;
    private ILibroDAO libroDAO;
    private LibroControlador libroControlador;
    private IPrestamoDAO prestamoDAO;
    private PrestamoControlador prestamoControlador;
    private List<Libro> listaLibros = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        bibliotecaDAO = new BibliotecaDAO();
        bibliotecaControlador = new BibliotecaControlador(bibliotecaDAO);
        usuarioDAO = new UsuarioDAO();
        usuarioControlador = new UsuarioControlador(usuarioDAO);
        libroDAO = new LibroDAO();
        libroControlador = new LibroControlador(libroDAO);
        prestamoDAO = new PrestamoDAO();
        prestamoControlador = new PrestamoControlador(prestamoDAO, libroDAO, usuarioDAO);
        locale = new Locale("es", "EC");
        
        String rutaImagen = "/imagenes/imagenJava2.png";
        
        // Crea un ImageIcon con la imagen
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaImagen));
        
        // Crea un JLabel y asigna el ImageIcon
        JLabel labelImagen = new JLabel(icono);
        
        // Establece el tamaño y la posición del JLabel
        labelImagen.setBounds(10, 10, icono.getIconWidth(), icono.getIconHeight());
        
        // Agrega el JLabel al JInternalFrame
        getContentPane().add(labelImagen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        biblioMenu = new javax.swing.JMenu();
        crearBiblioItem = new javax.swing.JMenuItem();
        buscarBiblioItem = new javax.swing.JMenuItem();
        actualizarBiblioItem = new javax.swing.JMenuItem();
        listarBiblioItem = new javax.swing.JMenuItem();
        eliminarBiblioItem = new javax.swing.JMenuItem();
        libroMenu = new javax.swing.JMenu();
        crearLibroItem = new javax.swing.JMenuItem();
        buscarLibroItem = new javax.swing.JMenuItem();
        actualizarLibroItem = new javax.swing.JMenuItem();
        listarLibroItem = new javax.swing.JMenuItem();
        eliminarLibroItem = new javax.swing.JMenuItem();
        clienteMenu = new javax.swing.JMenu();
        crearClienteItem = new javax.swing.JMenuItem();
        buscarClienteItem = new javax.swing.JMenuItem();
        actualizarClienteItem = new javax.swing.JMenuItem();
        listarClienteItem = new javax.swing.JMenuItem();
        eliminarClienteItem = new javax.swing.JMenuItem();
        prestamoMenu = new javax.swing.JMenu();
        crearPrestamoItem = new javax.swing.JMenuItem();
        buscarPrestamoItem = new javax.swing.JMenuItem();
        actualizarPrestamoItem = new javax.swing.JMenuItem();
        listarPrestamoItem = new javax.swing.JMenuItem();
        eliminarPrestamoItem = new javax.swing.JMenuItem();
        lenguajeMenu = new javax.swing.JMenu();
        menuItemIdiomaFrances = new javax.swing.JMenuItem();
        menuItemIdiomaIngles = new javax.swing.JMenuItem();
        menuItemIdiomaEspanol = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        biblioMenu.setMnemonic('f');
        biblioMenu.setText("Biblioteca");
        biblioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biblioMenuActionPerformed(evt);
            }
        });

        crearBiblioItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        crearBiblioItem.setMnemonic('o');
        crearBiblioItem.setText("Crear");
        crearBiblioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBiblioItemActionPerformed(evt);
            }
        });
        biblioMenu.add(crearBiblioItem);

        buscarBiblioItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        buscarBiblioItem.setMnemonic('s');
        buscarBiblioItem.setText("Buscar");
        buscarBiblioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBiblioItemActionPerformed(evt);
            }
        });
        biblioMenu.add(buscarBiblioItem);

        actualizarBiblioItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        actualizarBiblioItem.setMnemonic('a');
        actualizarBiblioItem.setText("Actualizar");
        actualizarBiblioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBiblioItemActionPerformed(evt);
            }
        });
        biblioMenu.add(actualizarBiblioItem);

        listarBiblioItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarBiblioItem.setText("Listar");
        listarBiblioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBiblioItemActionPerformed(evt);
            }
        });
        biblioMenu.add(listarBiblioItem);

        eliminarBiblioItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        eliminarBiblioItem.setMnemonic('x');
        eliminarBiblioItem.setText("Eliminar");
        eliminarBiblioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBiblioItemActionPerformed(evt);
            }
        });
        biblioMenu.add(eliminarBiblioItem);

        menuBar.add(biblioMenu);

        libroMenu.setMnemonic('f');
        libroMenu.setText("Libro");

        crearLibroItem.setMnemonic('o');
        crearLibroItem.setText("Crear");
        crearLibroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearLibroItemActionPerformed(evt);
            }
        });
        libroMenu.add(crearLibroItem);

        buscarLibroItem.setMnemonic('s');
        buscarLibroItem.setText("Buscar");
        buscarLibroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLibroItemActionPerformed(evt);
            }
        });
        libroMenu.add(buscarLibroItem);

        actualizarLibroItem.setMnemonic('a');
        actualizarLibroItem.setText("Actualizar");
        actualizarLibroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarLibroItemActionPerformed(evt);
            }
        });
        libroMenu.add(actualizarLibroItem);

        listarLibroItem.setText("Listar");
        listarLibroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarLibroItemActionPerformed(evt);
            }
        });
        libroMenu.add(listarLibroItem);

        eliminarLibroItem.setMnemonic('x');
        eliminarLibroItem.setText("Eliminar");
        eliminarLibroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLibroItemActionPerformed(evt);
            }
        });
        libroMenu.add(eliminarLibroItem);

        menuBar.add(libroMenu);

        clienteMenu.setMnemonic('f');
        clienteMenu.setText("Cliente");

        crearClienteItem.setMnemonic('o');
        crearClienteItem.setText("Crear");
        crearClienteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteItemActionPerformed(evt);
            }
        });
        clienteMenu.add(crearClienteItem);

        buscarClienteItem.setMnemonic('s');
        buscarClienteItem.setText("Buscar");
        buscarClienteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteItemActionPerformed(evt);
            }
        });
        clienteMenu.add(buscarClienteItem);

        actualizarClienteItem.setMnemonic('a');
        actualizarClienteItem.setText("Actualizar");
        actualizarClienteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarClienteItemActionPerformed(evt);
            }
        });
        clienteMenu.add(actualizarClienteItem);

        listarClienteItem.setText("Listar");
        listarClienteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClienteItemActionPerformed(evt);
            }
        });
        clienteMenu.add(listarClienteItem);

        eliminarClienteItem.setMnemonic('x');
        eliminarClienteItem.setText("Eliminar");
        eliminarClienteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteItemActionPerformed(evt);
            }
        });
        clienteMenu.add(eliminarClienteItem);

        menuBar.add(clienteMenu);

        prestamoMenu.setMnemonic('f');
        prestamoMenu.setText("Prestamo");

        crearPrestamoItem.setMnemonic('o');
        crearPrestamoItem.setText("Crear");
        crearPrestamoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPrestamoItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(crearPrestamoItem);

        buscarPrestamoItem.setMnemonic('s');
        buscarPrestamoItem.setText("Buscar");
        buscarPrestamoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPrestamoItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(buscarPrestamoItem);

        actualizarPrestamoItem.setMnemonic('a');
        actualizarPrestamoItem.setText("Actualizar");
        actualizarPrestamoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPrestamoItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(actualizarPrestamoItem);

        listarPrestamoItem.setText("Listar");
        listarPrestamoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPrestamoItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(listarPrestamoItem);

        eliminarPrestamoItem.setMnemonic('x');
        eliminarPrestamoItem.setText("Eliminar");
        eliminarPrestamoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPrestamoItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(eliminarPrestamoItem);

        menuBar.add(prestamoMenu);

        lenguajeMenu.setMnemonic('e');
        lenguajeMenu.setText("Lenguaje");

        menuItemIdiomaFrances.setMnemonic('y');
        menuItemIdiomaFrances.setText("Francés");
        menuItemIdiomaFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIdiomaFrancesActionPerformed(evt);
            }
        });
        lenguajeMenu.add(menuItemIdiomaFrances);

        menuItemIdiomaIngles.setText("Inglés");
        menuItemIdiomaIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIdiomaInglesActionPerformed(evt);
            }
        });
        lenguajeMenu.add(menuItemIdiomaIngles);

        menuItemIdiomaEspanol.setText("Español");
        menuItemIdiomaEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIdiomaEspanolActionPerformed(evt);
            }
        });
        lenguajeMenu.add(menuItemIdiomaEspanol);

        menuBar.add(lenguajeMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBiblioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBiblioItemActionPerformed
        if(ventanaCrearBiblioteca == null){
        ventanaCrearBiblioteca = new VentanaCrearBiblioteca(bibliotecaControlador);
        ventanaCrearBiblioteca.cambiarIdioma(locale);
        }
        if(!ventanaCrearBiblioteca.isVisible()){
                ventanaCrearBiblioteca.setVisible(true);
                desktopPane.add(ventanaCrearBiblioteca);
        }
    }//GEN-LAST:event_crearBiblioItemActionPerformed

    private void actualizarBiblioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBiblioItemActionPerformed
        if(ventanaActualizarBiblioteca == null){
        ventanaActualizarBiblioteca = new VentanaActualizarBiblioteca(bibliotecaControlador);
        ventanaActualizarBiblioteca.cambiarIdioma(locale);
        }
        if(!ventanaActualizarBiblioteca.isVisible()){
                ventanaActualizarBiblioteca.setVisible(true);
                desktopPane.add(ventanaActualizarBiblioteca);
        }
    }//GEN-LAST:event_actualizarBiblioItemActionPerformed

    private void crearLibroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearLibroItemActionPerformed
        if(ventanaCrearLibro == null){
        ventanaCrearLibro = new VentanaCrearLibro(libroControlador);
        ventanaCrearLibro.cambiarIdioma(locale);
        }
        if(!ventanaCrearLibro.isVisible()){
                ventanaCrearLibro.setVisible(true);
                desktopPane.add(ventanaCrearLibro);
        }
    }//GEN-LAST:event_crearLibroItemActionPerformed

    private void actualizarLibroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarLibroItemActionPerformed
        if(ventanaActualizarLibro == null){
        ventanaActualizarLibro = new VentanaActualizarLibro(libroControlador);
        ventanaActualizarLibro.cambiarIdioma(locale);
        }
        if(!ventanaActualizarLibro.isVisible()){
                ventanaActualizarLibro.setVisible(true);
                desktopPane.add(ventanaActualizarLibro);
        }
    }//GEN-LAST:event_actualizarLibroItemActionPerformed

    private void eliminarLibroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLibroItemActionPerformed
        if(ventanaEliminarLibro == null){
        ventanaEliminarLibro = new VentanaEliminarLibro(libroControlador);
        ventanaEliminarLibro.cambiarIdioma(locale);
        }
        if(!ventanaEliminarLibro.isVisible()){
                ventanaEliminarLibro.setVisible(true);
                desktopPane.add(ventanaEliminarLibro);
        }
    }//GEN-LAST:event_eliminarLibroItemActionPerformed

    private void crearClienteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteItemActionPerformed
        if(ventanaCrearUsuario == null){
        ventanaCrearUsuario = new VentanaCrearUsuario(usuarioControlador);
        ventanaCrearUsuario.cambiarIdioma(locale);
        }
        if(!ventanaCrearUsuario.isVisible()){
                ventanaCrearUsuario.setVisible(true);
                desktopPane.add(ventanaCrearUsuario);
        }
    }//GEN-LAST:event_crearClienteItemActionPerformed

    private void actualizarClienteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarClienteItemActionPerformed
        if(ventanaActualizarUsuario == null){
        ventanaActualizarUsuario = new VentanaActualizarUsuario(usuarioControlador);
        ventanaActualizarUsuario.cambiarIdioma(locale);
        }
        if(!ventanaActualizarUsuario.isVisible()){
                ventanaActualizarUsuario.setVisible(true);
                desktopPane.add(ventanaActualizarUsuario);
        }
    }//GEN-LAST:event_actualizarClienteItemActionPerformed

    private void eliminarClienteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteItemActionPerformed
        if(ventanaEliminarUsuario == null){
        ventanaEliminarUsuario = new VentanaEliminarUsuario(usuarioControlador);
        ventanaEliminarUsuario.cambiarIdioma(locale);
        }
        if(!ventanaEliminarUsuario.isVisible()){
                ventanaEliminarUsuario.setVisible(true);
                desktopPane.add(ventanaEliminarUsuario);
        }
    }//GEN-LAST:event_eliminarClienteItemActionPerformed

    private void biblioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biblioMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biblioMenuActionPerformed

    private void buscarBiblioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBiblioItemActionPerformed
        if(ventanaBuscarBiblioteca == null){
        ventanaBuscarBiblioteca = new VentanaBuscarBiblioteca(bibliotecaControlador);
        ventanaBuscarBiblioteca.cambiarIdioma(locale);
        }
        if(!ventanaBuscarBiblioteca.isVisible()){
                ventanaBuscarBiblioteca.setVisible(true);
                desktopPane.add(ventanaBuscarBiblioteca);
        }
    }//GEN-LAST:event_buscarBiblioItemActionPerformed

    private void listarBiblioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBiblioItemActionPerformed
        if(ventanaListarBiblioteca == null){
        ventanaListarBiblioteca = new VentanaListarBiblioteca(bibliotecaControlador);
        ventanaListarBiblioteca.cambiarIdioma(locale);
        }
        if(!ventanaListarBiblioteca.isVisible()){
                ventanaListarBiblioteca.setVisible(true);
                desktopPane.add(ventanaListarBiblioteca);
        }
    }//GEN-LAST:event_listarBiblioItemActionPerformed

    private void eliminarBiblioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBiblioItemActionPerformed
        if(ventanaEliminarBiblioteca == null){
        ventanaEliminarBiblioteca = new VentanaEliminarBiblioteca(bibliotecaControlador);
        ventanaEliminarBiblioteca.cambiarIdioma(locale);
        }
        if(!ventanaEliminarBiblioteca.isVisible()){
                ventanaEliminarBiblioteca.setVisible(true);
                desktopPane.add(ventanaEliminarBiblioteca);
        }
    }//GEN-LAST:event_eliminarBiblioItemActionPerformed

    private void menuItemIdiomaInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIdiomaInglesActionPerformed
       locale = new Locale("en", "US");
       cambiarIdioma();
    }//GEN-LAST:event_menuItemIdiomaInglesActionPerformed

    private void menuItemIdiomaEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIdiomaEspanolActionPerformed
        locale = new Locale("es", "EC");
       cambiarIdioma();
    }//GEN-LAST:event_menuItemIdiomaEspanolActionPerformed

    private void menuItemIdiomaFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIdiomaFrancesActionPerformed
        locale = new Locale("fr", "FR");
       cambiarIdioma();
    }//GEN-LAST:event_menuItemIdiomaFrancesActionPerformed

    private void buscarLibroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLibroItemActionPerformed
        if(ventanaBuscarLibro == null){
        ventanaBuscarLibro = new VentanaBuscarLibro(libroControlador);
        ventanaBuscarLibro.cambiarIdioma(locale);
        }
        if(!ventanaBuscarLibro.isVisible()){
                ventanaBuscarLibro.setVisible(true);
                desktopPane.add(ventanaBuscarLibro);
        }
    }//GEN-LAST:event_buscarLibroItemActionPerformed

    private void listarLibroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarLibroItemActionPerformed
        if(ventanaListarLibro == null){
        ventanaListarLibro = new VentanaListarLibro(libroControlador);
        ventanaListarLibro.cambiarIdioma(locale);
        }
        if(!ventanaListarLibro.isVisible()){
                ventanaListarLibro.setVisible(true);
                desktopPane.add(ventanaListarLibro);
        }
    }//GEN-LAST:event_listarLibroItemActionPerformed

    private void buscarClienteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteItemActionPerformed
        if(ventanaBuscarUsuario == null){
        ventanaBuscarUsuario = new VentanaBuscarUsuario(usuarioControlador);
        ventanaActualizarUsuario.cambiarIdioma(locale);
        }
        if(!ventanaBuscarUsuario.isVisible()){
                ventanaBuscarUsuario.setVisible(true);
                desktopPane.add(ventanaBuscarUsuario);
        }
    }//GEN-LAST:event_buscarClienteItemActionPerformed

    private void listarClienteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClienteItemActionPerformed
        if(ventanaListarUsuario == null){
        ventanaListarUsuario = new VentanaListarUsuario(usuarioControlador);
        ventanaListarUsuario.cambiarIdioma(locale);
        }
        if(!ventanaListarUsuario.isVisible()){
                ventanaListarUsuario.setVisible(true);
                desktopPane.add(ventanaListarUsuario);
        }
    }//GEN-LAST:event_listarClienteItemActionPerformed

    private void crearPrestamoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPrestamoItemActionPerformed
        if(ventanaCrearPrestamo == null){
<<<<<<< HEAD:EjemploGUIApp/src/main/java/ec/edu/ups/poo/ejemploguiapp/vista/VentanaPrincipal.java

        ventanaCrearPrestamo = new VentanaCrearPrestamo(prestamoControlador,listaLibros,listaUsuarios);
        ventanaCrearPrestamo.cambiarIdioma(locale);
        ventanaCrearPrestamo = new VentanaCrearPrestamo(prestamoControlador, listaLibros, listaUsuarios);

=======
        ventanaCrearPrestamo = new VentanaCrearPrestamo(prestamoControlador,listaLibros,listaUsuarios);
        ventanaCrearPrestamo.cambiarIdioma(locale);
        ventanaCrearPrestamo = new VentanaCrearPrestamo(prestamoControlador, listaLibros, listaUsuarios);
        }
>>>>>>> 60470713e1aeaaec22244b0bbe7ca7fa625a93b4:EjemploGUIApp/src/main/java/ec/edu/ups/poo/guiapp/vista/principal/VentanaPrincipal.java
        if(!ventanaCrearPrestamo.isVisible()){
                ventanaCrearPrestamo.setVisible(true);
                desktopPane.add(ventanaCrearPrestamo);
        }
    }//GEN-LAST:event_crearPrestamoItemActionPerformed

    private void buscarPrestamoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPrestamoItemActionPerformed
        if(ventanaBuscarPrestamo == null){
        ventanaBuscarPrestamo = new VentanaBuscarPrestamo(prestamoControlador);
        ventanaBuscarPrestamo.cambiarIdioma(locale);
        }
        if(!ventanaBuscarPrestamo.isVisible()){
                ventanaBuscarPrestamo.setVisible(true);
                desktopPane.add(ventanaBuscarPrestamo);
        }
    }//GEN-LAST:event_buscarPrestamoItemActionPerformed

    private void actualizarPrestamoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPrestamoItemActionPerformed
        if(ventanaActualizarPrestamo == null){
        ventanaActualizarPrestamo = new VentanaActualizarPrestamo(prestamoControlador,listaLibros,listaUsuarios);
        ventanaActualizarPrestamo.cambiarIdioma(locale);
        }
        if(!ventanaActualizarPrestamo.isVisible()){
                ventanaActualizarPrestamo.setVisible(true);
                desktopPane.add(ventanaActualizarPrestamo);
        }
    }//GEN-LAST:event_actualizarPrestamoItemActionPerformed

    private void listarPrestamoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPrestamoItemActionPerformed
        if(ventanaListarPrestamo == null){
        ventanaListarPrestamo = new VentanaListarPrestamo(prestamoControlador);
        ventanaListarPrestamo.cambiarIdioma(locale);
        }
        if(!ventanaListarPrestamo.isVisible()){
                ventanaListarPrestamo.setVisible(true);
                desktopPane.add(ventanaListarPrestamo);
        }
    }//GEN-LAST:event_listarPrestamoItemActionPerformed

    private void eliminarPrestamoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPrestamoItemActionPerformed
        if(ventanaEliminarPrestamo == null){
        ventanaEliminarPrestamo = new VentanaEliminarPrestamo(prestamoControlador);
        ventanaEliminarPrestamo.cambiarIdioma(locale);
        }
        if(!ventanaEliminarPrestamo.isVisible()){
                ventanaEliminarPrestamo.setVisible(true);
                desktopPane.add(ventanaEliminarPrestamo);
        }
    }//GEN-LAST:event_eliminarPrestamoItemActionPerformed

    public void cambiarIdioma(){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
       
       biblioMenu.setText(mensajes.getString("bibliotecaMenu"));
       libroMenu.setText(mensajes.getString("libroMenu"));
       clienteMenu.setText(mensajes.getString("clienteMenu"));
       prestamoMenu.setText(mensajes.getString("prestamoMenu"));
       lenguajeMenu.setText(mensajes.getString("lenguajeMenu"));
       crearBiblioItem.setText(mensajes.getString("crearBiblioItem"));
       buscarBiblioItem.setText(mensajes.getString("buscarBiblioItem"));
       actualizarBiblioItem.setText(mensajes.getString("actualizarBiblioItem"));
       listarBiblioItem.setText(mensajes.getString("listarBiblioItem"));
       eliminarBiblioItem.setText(mensajes.getString("eliminarBiblioItem"));
       crearLibroItem.setText(mensajes.getString("crearLibroItem"));
       buscarLibroItem.setText(mensajes.getString("buscarLibroItem"));
       actualizarLibroItem.setText(mensajes.getString("actualizarLibroItem"));
       listarLibroItem.setText(mensajes.getString("listarLibroItem"));
       eliminarLibroItem.setText(mensajes.getString("eliminarLibroItem"));
       crearClienteItem.setText(mensajes.getString("crearClienteItem"));
       buscarClienteItem.setText(mensajes.getString("buscarClienteItem"));
       actualizarClienteItem.setText(mensajes.getString("actualizarClienteItem"));
       listarClienteItem.setText(mensajes.getString("listarClienteItem"));
       eliminarClienteItem.setText(mensajes.getString("eliminarClienteItem"));
       crearPrestamoItem.setText(mensajes.getString("crearPrestamoItem"));
       buscarPrestamoItem.setText(mensajes.getString("buscarPrestamoItem"));
       actualizarPrestamoItem.setText(mensajes.getString("actualizarPrestamoItem"));
       listarPrestamoItem.setText(mensajes.getString("listarPrestamoItem"));
       eliminarPrestamoItem.setText(mensajes.getString("eliminarPrestamoItem"));
       
       
       if(ventanaCrearBiblioteca!= null){
           ventanaCrearBiblioteca.cambiarIdioma(locale);
       }
       if(ventanaActualizarBiblioteca!= null){
           ventanaActualizarBiblioteca.cambiarIdioma(locale);
       }
       if(ventanaBuscarBiblioteca!= null){
           ventanaBuscarBiblioteca.cambiarIdioma(locale);
       }
       if(ventanaEliminarBiblioteca!= null){
           ventanaEliminarBiblioteca.cambiarIdioma(locale);
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarBiblioItem;
    private javax.swing.JMenuItem actualizarClienteItem;
    private javax.swing.JMenuItem actualizarLibroItem;
    private javax.swing.JMenuItem actualizarPrestamoItem;
    private javax.swing.JMenu biblioMenu;
    private javax.swing.JMenuItem buscarBiblioItem;
    private javax.swing.JMenuItem buscarClienteItem;
    private javax.swing.JMenuItem buscarLibroItem;
    private javax.swing.JMenuItem buscarPrestamoItem;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JMenuItem crearBiblioItem;
    private javax.swing.JMenuItem crearClienteItem;
    private javax.swing.JMenuItem crearLibroItem;
    private javax.swing.JMenuItem crearPrestamoItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem eliminarBiblioItem;
    private javax.swing.JMenuItem eliminarClienteItem;
    private javax.swing.JMenuItem eliminarLibroItem;
    private javax.swing.JMenuItem eliminarPrestamoItem;
    private javax.swing.JMenu lenguajeMenu;
    private javax.swing.JMenu libroMenu;
    private javax.swing.JMenuItem listarBiblioItem;
    private javax.swing.JMenuItem listarClienteItem;
    private javax.swing.JMenuItem listarLibroItem;
    private javax.swing.JMenuItem listarPrestamoItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemIdiomaEspanol;
    private javax.swing.JMenuItem menuItemIdiomaFrances;
    private javax.swing.JMenuItem menuItemIdiomaIngles;
    private javax.swing.JMenu prestamoMenu;
    // End of variables declaration//GEN-END:variables

}