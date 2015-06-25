package UI;

import BL.Articulo;
import java.awt.Component;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Mantenimiento extends javax.swing.JFrame {

    private List<Articulo> listaArticulos;
    private Articulos articulos;
    private static Mantenimiento mantenimiento = new Mantenimiento();

    public static Mantenimiento getInstanciaMantenimiento() {
        return mantenimiento;
    }

    public List<Articulo> getListaArticulos() {
        return this.listaArticulos;
    }

    public void setListaArticulos(List<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    private Mantenimiento() {
    }
    
    public void iniciarMantenimiento() {
        initComponents();
        setLocationRelativeTo(null);
        agregarProveedores();
        iniciarVariables();
        
        //Desabilitar funcion pegar
        desabilitarPegar();
    }
    
    public void iniciarVariables() {
        listaArticulos = new ArrayList<Articulo>();
        articulos = new Articulos(this, true);
    }
    
    public void desabilitarPegar(){
        List<JTextField> listaObjetos = new ArrayList<JTextField>();
        listaObjetos = agregarComponentesLista(listaObjetos);
        
        for (int i = 0; i < listaObjetos.size(); i++) {
            InputMap mapa = listaObjetos.get(i).getInputMap();
            mapa.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
            mapa.put(KeyStroke.getKeyStroke(KeyEvent.VK_INSERT, Event.SHIFT_MASK), "null");
        }

    }

    private List agregarComponentesLista(List<JTextField> listaObjetos) {
        listaObjetos.add(tf_upc_ean_isbn);
        listaObjetos.add(tf_categoria);
        listaObjetos.add(tf_costo);
        listaObjetos.add(tf_impuesto1);
        listaObjetos.add(tf_porcentaje1);
        listaObjetos.add(tf_cantidad);
        listaObjetos.add(tf_localizacion);
        listaObjetos.add(tf_nombreArticulo);
        listaObjetos.add(tf_precioUnitario);
        listaObjetos.add(tf_impuesto2);
        listaObjetos.add(tf_porcentaje2);
        listaObjetos.add(tf_nivelReordenamiento);        
        return listaObjetos;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_upc_ean_isbn = new javax.swing.JLabel();
        lb_categoria = new javax.swing.JLabel();
        lb_costo = new javax.swing.JLabel();
        lb_impuesto1 = new javax.swing.JLabel();
        lb_cantidad = new javax.swing.JLabel();
        lb_localizacion = new javax.swing.JLabel();
        lb_descripcion = new javax.swing.JLabel();
        lb_requeridos = new javax.swing.JLabel();
        lb_nombreArticulo = new javax.swing.JLabel();
        lb_proveedor = new javax.swing.JLabel();
        lb_precioUnitario = new javax.swing.JLabel();
        lb_impuesto2 = new javax.swing.JLabel();
        lb_nivelReordenamiento = new javax.swing.JLabel();
        lb_alterna = new javax.swing.JLabel();
        lb_permitirDescripcion = new javax.swing.JLabel();
        lb_articuloTiene = new javax.swing.JLabel();
        lb_numeroSerie = new javax.swing.JLabel();
        tf_upc_ean_isbn = new javax.swing.JTextField();
        tf_categoria = new javax.swing.JTextField();
        tf_porcentaje1 = new javax.swing.JTextField();
        tf_costo = new javax.swing.JTextField();
        tf_impuesto1 = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        tf_localizacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        lb_porcentaje1 = new javax.swing.JLabel();
        tf_nombreArticulo = new javax.swing.JTextField();
        tf_precioUnitario = new javax.swing.JTextField();
        tf_impuesto2 = new javax.swing.JTextField();
        tf_porcentaje2 = new javax.swing.JTextField();
        tf_nivelReordenamiento = new javax.swing.JTextField();
        lb_reordenamiento = new javax.swing.JLabel();
        cbox_proveedor = new javax.swing.JComboBox();
        cb_permitirDescripcion = new javax.swing.JCheckBox();
        cb_articuloNumeroSerie = new javax.swing.JCheckBox();
        bt_buscar = new javax.swing.JButton();
        bt_nuevo = new javax.swing.JButton();
        bt_guardar = new javax.swing.JButton();
        bt_cerrar = new javax.swing.JButton();
        lb_porcentaje2 = new javax.swing.JLabel();
        lb_numeroArticulo = new javax.swing.JLabel();
        tf_numeroArticulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento");
        setName("frame_mantenimiento"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lb_upc_ean_isbn.setText("UPC/EAN/ISBN:");

        lb_categoria.setBackground(new java.awt.Color(231, 28, 28));
        lb_categoria.setForeground(new java.awt.Color(255, 0, 0));
        lb_categoria.setText("Categoría:");

        lb_costo.setBackground(new java.awt.Color(231, 28, 28));
        lb_costo.setForeground(new java.awt.Color(255, 0, 0));
        lb_costo.setText("Costo:");

        lb_impuesto1.setText("Impuesto 1:");

        lb_cantidad.setBackground(new java.awt.Color(231, 28, 28));
        lb_cantidad.setForeground(new java.awt.Color(255, 0, 0));
        lb_cantidad.setText("Cantidad:");

        lb_localizacion.setText("Localización:");

        lb_descripcion.setText("Descripcion:");

        lb_requeridos.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        lb_requeridos.setText("Los campos en rojo son requeridos");

        lb_nombreArticulo.setBackground(new java.awt.Color(231, 28, 28));
        lb_nombreArticulo.setForeground(new java.awt.Color(255, 0, 0));
        lb_nombreArticulo.setText("Nombre del artículo:");

        lb_proveedor.setBackground(new java.awt.Color(231, 28, 28));
        lb_proveedor.setForeground(new java.awt.Color(255, 0, 0));
        lb_proveedor.setText("Proveedor:");

        lb_precioUnitario.setBackground(new java.awt.Color(231, 28, 28));
        lb_precioUnitario.setForeground(new java.awt.Color(255, 0, 0));
        lb_precioUnitario.setText("Precio Unitario:");

        lb_impuesto2.setText("Impuesto 2:");

        lb_nivelReordenamiento.setBackground(new java.awt.Color(231, 28, 28));
        lb_nivelReordenamiento.setForeground(new java.awt.Color(255, 0, 0));
        lb_nivelReordenamiento.setText("Nivel de");

        lb_alterna.setText("Alterna:");

        lb_permitirDescripcion.setText("Permitir descripción ");

        lb_articuloTiene.setText("El articulo tiene");

        lb_numeroSerie.setText("Número de serie:");

        tf_upc_ean_isbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_upc_ean_isbnFocusLost(evt);
            }
        });

        tf_categoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_categoriaFocusLost(evt);
            }
        });
        tf_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_categoriaKeyTyped(evt);
            }
        });

        tf_porcentaje1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_porcentaje1FocusLost(evt);
            }
        });
        tf_porcentaje1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_porcentaje1KeyTyped(evt);
            }
        });

        tf_costo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_costoFocusLost(evt);
            }
        });
        tf_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_costoKeyTyped(evt);
            }
        });

        tf_impuesto1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_impuesto1FocusLost(evt);
            }
        });

        tf_cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cantidadFocusLost(evt);
            }
        });
        tf_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cantidadKeyTyped(evt);
            }
        });

        tf_localizacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_localizacionFocusLost(evt);
            }
        });

        ta_descripcion.setColumns(20);
        ta_descripcion.setRows(5);
        ta_descripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ta_descripcionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(ta_descripcion);

        lb_porcentaje1.setText("%");

        tf_nombreArticulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nombreArticuloFocusLost(evt);
            }
        });

        tf_precioUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_precioUnitarioFocusLost(evt);
            }
        });
        tf_precioUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_precioUnitarioKeyTyped(evt);
            }
        });

        tf_impuesto2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_impuesto2FocusLost(evt);
            }
        });

        tf_porcentaje2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_porcentaje2FocusLost(evt);
            }
        });
        tf_porcentaje2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_porcentaje2KeyTyped(evt);
            }
        });

        tf_nivelReordenamiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nivelReordenamientoFocusLost(evt);
            }
        });
        tf_nivelReordenamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nivelReordenamientoKeyTyped(evt);
            }
        });

        lb_reordenamiento.setBackground(new java.awt.Color(231, 28, 28));
        lb_reordenamiento.setForeground(new java.awt.Color(255, 0, 0));
        lb_reordenamiento.setText("Reordenamiento:");

        cbox_proveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bt_buscar.setText("Buscar");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        bt_nuevo.setText("Nuevo");
        bt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoActionPerformed(evt);
            }
        });

        bt_guardar.setText("Guardar");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        bt_cerrar.setText("Salir");
        bt_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrarActionPerformed(evt);
            }
        });

        lb_porcentaje2.setText("%");

        lb_numeroArticulo.setText("Número Articulo:");

        tf_numeroArticulo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(301, 301, 301)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(bt_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bt_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(bt_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(372, 372, 372))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lb_requeridos)
                            .addGap(296, 296, 296)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb_upc_ean_isbn)
                                .addComponent(lb_categoria, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_costo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_impuesto1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_cantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_localizacion, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lb_descripcion)
                            .addComponent(lb_numeroArticulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_impuesto1)
                            .addComponent(tf_costo)
                            .addComponent(tf_categoria)
                            .addComponent(jScrollPane1)
                            .addComponent(tf_cantidad)
                            .addComponent(tf_localizacion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_porcentaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(lb_porcentaje1))
                            .addComponent(tf_upc_ean_isbn)
                            .addComponent(tf_numeroArticulo))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_alterna)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lb_nombreArticulo)
                                        .addGap(42, 42, 42))
                                    .addComponent(lb_proveedor)
                                    .addComponent(lb_precioUnitario)
                                    .addComponent(lb_impuesto2)
                                    .addComponent(lb_permitirDescripcion)
                                    .addComponent(lb_articuloTiene)
                                    .addComponent(lb_numeroSerie)
                                    .addComponent(lb_nivelReordenamiento)
                                    .addComponent(lb_reordenamiento))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nombreArticulo)
                                    .addComponent(tf_precioUnitario)
                                    .addComponent(tf_impuesto2)
                                    .addComponent(tf_nivelReordenamiento)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_porcentaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(lb_porcentaje2))
                                    .addComponent(cbox_proveedor, 0, 262, Short.MAX_VALUE)
                                    .addComponent(cb_permitirDescripcion)
                                    .addComponent(cb_articuloNumeroSerie))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lb_requeridos)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_numeroArticulo)
                    .addComponent(tf_numeroArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_upc_ean_isbn)
                    .addComponent(lb_nombreArticulo)
                    .addComponent(tf_upc_ean_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_categoria)
                            .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_costo)
                            .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_impuesto1)
                            .addComponent(tf_impuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_impuesto2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_porcentaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_porcentaje1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_cantidad)
                            .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_localizacion)
                            .addComponent(tf_localizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_descripcion)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_proveedor)
                            .addComponent(cbox_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_precioUnitario)
                            .addComponent(tf_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(tf_impuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_porcentaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_porcentaje2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nivelReordenamiento)
                            .addComponent(tf_nivelReordenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_reordenamiento)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_permitirDescripcion)
                            .addComponent(cb_permitirDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_alterna)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_articuloTiene)
                            .addComponent(cb_articuloNumeroSerie))
                        .addGap(18, 18, 18)
                        .addComponent(lb_numeroSerie)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_nuevo)
                    .addComponent(bt_guardar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_buscar)
                    .addComponent(bt_cerrar))
                .addGap(28, 28, 28))
        );

        lb_upc_ean_isbn.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProveedores() {
        cbox_proveedor.removeAllItems();
        cbox_proveedor.addItem("Inversiones Santa Catalina");
        cbox_proveedor.addItem("Inversiones Monte Olimpo");
        cbox_proveedor.addItem("Inversiones La Cima");
    }

    private void bt_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_cerrarActionPerformed

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        if (!tf_categoria.getText().equals("") && !tf_costo.getText().equals("") && !tf_cantidad.getText().equals("") && !tf_nombreArticulo.getText().equals("") && !tf_precioUnitario.getText().equals("") && !tf_nivelReordenamiento.getText().equals("")) {
                if (!existeCodigoProducto()) {
                    Articulo articulo = validarDatos(new Articulo());
                    insertarArticulo(articulo);
                } else {
                    Articulo articuloValidado = validarDatos(listaArticulos.get(Integer.parseInt(tf_numeroArticulo.getText())));
                    editarArticulo(articuloValidado);
                }
        } else {
            GestorIO.mostrarString("Debe llenar todos los campos requeridos");
        }
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void insertarArticulo(Articulo articulo) {
        //articulo = new Articulo(Integer.parseInt(tf_numeroArticulo.getText()), tf_upc_ean_isbn.getText(), tf_categoria.getText(), Double.parseDouble(tf_costo.getText()), tf_impuesto1.getText(), Integer.parseInt(tf_porcentaje1.getText()), Integer.parseInt(tf_cantidad.getText()), tf_localizacion.getText(), ta_descripcion.getText(), tf_nombreArticulo.getText(), cbox_proveedor.getSelectedItem() + "", Double.parseDouble(tf_precioUnitario.getText()), tf_impuesto2.getText(), Integer.parseInt(tf_porcentaje2.getText()), Integer.parseInt(tf_nivelReordenamiento.getText()), cb_permitirDescripcion.isSelected(), cb_articuloNumeroSerie.isSelected());
        listaArticulos.add(articulo);
        GestorIO.mostrarString("Articulo ingresado correctamente");
        nuevoRegistro();
    }
    
    private void editarArticulo(Articulo articuloAEditar) {

        if (tf_porcentaje1.getText().equals("")) 
            articuloAEditar.setPorcentaje1(0);
        else 
            articuloAEditar.setPorcentaje1(Integer.parseInt(tf_porcentaje1.getText()));
        if (tf_porcentaje2.getText().equals("")) 
            articuloAEditar.setPorcentaje2(0);
        else 
            articuloAEditar.setPorcentaje2(Integer.parseInt(tf_porcentaje2.getText()));
        
        articuloAEditar.editarArticulo(tf_upc_ean_isbn.getText(), tf_categoria.getText(), Double.parseDouble(tf_costo.getText()), tf_impuesto1.getText(), Integer.parseInt(tf_cantidad.getText()), tf_localizacion.getText(), ta_descripcion.getText(), tf_nombreArticulo.getText(), cbox_proveedor.getSelectedItem() + "", Double.parseDouble(tf_precioUnitario.getText()), tf_impuesto2.getText(), Integer.parseInt(tf_nivelReordenamiento.getText()), cb_permitirDescripcion.isSelected(), cb_articuloNumeroSerie.isSelected());
        
        GestorIO.mostrarString("Articulo editado correctamente");
        nuevoRegistro();
    }
    
    private boolean existeCodigoProducto() {
        for (int i = 0; i < listaArticulos.size(); i++) {
            if (Integer.parseInt(tf_numeroArticulo.getText()) == listaArticulos.get(i).getNumeroArticulo()) {
                return true;
            }
        }
        return false;
    }
    
    private Articulo validarDatos(Articulo articulo) {
        if (tf_porcentaje1.getText().equals("")) 
            articulo.setPorcentaje1(0);
        else 
            articulo.setPorcentaje1(Integer.parseInt(tf_porcentaje1.getText()));
        if (tf_porcentaje2.getText().equals("")) 
            articulo.setPorcentaje2(0);
        else 
            articulo.setPorcentaje2(Integer.parseInt(tf_porcentaje2.getText()));
        
        //Creamos el articulo
        articulo.setNumeroArticulo(Integer.parseInt(tf_numeroArticulo.getText()));
        articulo.setUpc_ean_isbn(tf_numeroArticulo.getText());
        articulo.setCategoria(tf_categoria.getText());
        articulo.setCosto(Double.parseDouble(tf_costo.getText()));
        articulo.setImpuesto1(tf_impuesto1.getText());
        articulo.setCantidad(Integer.parseInt(tf_cantidad.getText()));
        articulo.setLocalizacion(tf_localizacion.getText());
        articulo.setDescripcion(ta_descripcion.getText());
        articulo.setNombreArticulo(tf_nombreArticulo.getText());
        articulo.setProveedor(cbox_proveedor.getSelectedItem() + "");
        articulo.setPrecioUnitario(Double.parseDouble(tf_precioUnitario.getText()));
        articulo.setImpuesto2(tf_impuesto2.getText());
        articulo.setNivelReordenamiento(Integer.parseInt(tf_nivelReordenamiento.getText()));
        articulo.setDescripcionAlterna(cb_permitirDescripcion.isSelected());
        articulo.setArticuloTieneNumeroSerie(cb_articuloNumeroSerie.isSelected());
        return articulo;
    }
    
    private void bt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoActionPerformed
        nuevoRegistro();
    }//GEN-LAST:event_bt_nuevoActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        articulos.setVisible(true);
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tf_numeroArticulo.setText(listaArticulos.size()+"");
    }//GEN-LAST:event_formWindowOpened

    private void tf_upc_ean_isbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_upc_ean_isbnFocusLost
        validarEspaciosEnBlanco(tf_upc_ean_isbn);
    }//GEN-LAST:event_tf_upc_ean_isbnFocusLost

    private void tf_categoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_categoriaFocusLost
        validarEspaciosEnBlanco(tf_categoria);
    }//GEN-LAST:event_tf_categoriaFocusLost

    private void tf_costoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_costoFocusLost
        validarEspaciosEnBlanco(tf_costo);
        validarCantidadPuntos(tf_costo);
        validarPuntoAlFinal(tf_costo);
    }//GEN-LAST:event_tf_costoFocusLost

    private void tf_impuesto1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_impuesto1FocusLost
        validarEspaciosEnBlanco(tf_impuesto1);
    }//GEN-LAST:event_tf_impuesto1FocusLost

    private void tf_porcentaje1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_porcentaje1FocusLost
        validarEspaciosEnBlanco(tf_porcentaje1);
        if (!tf_porcentaje1.getText().equals("") && Integer.parseInt(tf_porcentaje1.getText()) > 100) {
            tf_porcentaje1.setText(100+"");
        }
    }//GEN-LAST:event_tf_porcentaje1FocusLost

    private void tf_cantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cantidadFocusLost
        validarEspaciosEnBlanco(tf_cantidad);
    }//GEN-LAST:event_tf_cantidadFocusLost

    private void tf_localizacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_localizacionFocusLost
        validarEspaciosEnBlanco(tf_localizacion);
    }//GEN-LAST:event_tf_localizacionFocusLost

    private void ta_descripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ta_descripcionFocusLost
        validarTextArea(ta_descripcion);
    }//GEN-LAST:event_ta_descripcionFocusLost

    private void tf_nombreArticuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nombreArticuloFocusLost
        validarEspaciosEnBlanco(tf_nombreArticulo);
    }//GEN-LAST:event_tf_nombreArticuloFocusLost

    private void tf_precioUnitarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_precioUnitarioFocusLost
        validarEspaciosEnBlanco(tf_precioUnitario);
        validarCantidadPuntos(tf_precioUnitario);
        validarPuntoAlFinal(tf_precioUnitario);
    }//GEN-LAST:event_tf_precioUnitarioFocusLost

    private void tf_impuesto2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_impuesto2FocusLost
        validarEspaciosEnBlanco(tf_impuesto2);
    }//GEN-LAST:event_tf_impuesto2FocusLost

    private void tf_porcentaje2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_porcentaje2FocusLost
        validarEspaciosEnBlanco(tf_porcentaje2);
        if (!tf_porcentaje2.getText().equals("") && Integer.parseInt(tf_porcentaje2.getText()) > 100) {
            tf_porcentaje2.setText(100+"");
        }
    }//GEN-LAST:event_tf_porcentaje2FocusLost

    private void tf_nivelReordenamientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nivelReordenamientoFocusLost
        validarEspaciosEnBlanco(tf_nivelReordenamiento);
    }//GEN-LAST:event_tf_nivelReordenamientoFocusLost

    private void tf_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadKeyTyped
       validarSoloNumeros(evt);
       
        if (!(tf_cantidad.getText().length() <= 3)) {  
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);  
        }
    }//GEN-LAST:event_tf_cantidadKeyTyped

    private void tf_nivelReordenamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nivelReordenamientoKeyTyped
        validarSoloNumeros(evt);
        
        if (!(tf_nivelReordenamiento.getText().length() <= 6)) {  
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);  
        }
    }//GEN-LAST:event_tf_nivelReordenamientoKeyTyped

    private void tf_categoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_categoriaKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_tf_categoriaKeyTyped

    private void tf_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_costoKeyTyped
        validarNumerosConPunto(evt);
    }//GEN-LAST:event_tf_costoKeyTyped

    private void tf_precioUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_precioUnitarioKeyTyped
        validarNumerosConPunto(evt);
        
        if (!(tf_precioUnitario.getText().length() <= 6)) {  
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_tf_precioUnitarioKeyTyped

    private void tf_porcentaje1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_porcentaje1KeyTyped
        validarSoloNumeros(evt);
        
        //Validar cantidad maxima
        if (!(tf_porcentaje1.getText().length() <= 2)) {  
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);  
        }
    }//GEN-LAST:event_tf_porcentaje1KeyTyped

    private void tf_porcentaje2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_porcentaje2KeyTyped
        validarSoloNumeros(evt);
         
        if (!(tf_porcentaje2.getText().length() <= 2)) {  
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);  
        }
    }//GEN-LAST:event_tf_porcentaje2KeyTyped

    private void validarSoloNumeros(java.awt.event.KeyEvent evt) {
         if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
    
    private void validarLetras(java.awt.event.KeyEvent evt) {
          if(!Character.isLetter(evt.getKeyChar())) {
              Toolkit.getDefaultToolkit().beep();
              evt.consume();
          } 
    }
    
    private void validarNumerosConPunto(java.awt.event.KeyEvent evt) {
        if(!(evt.getKeyChar() == '.') && !Character.isDigit(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
    
    private void validarEspaciosEnBlanco(JTextField textField) {
        String cadena = textField.getText().replace(" ", "");
        if (cadena.equals("")) {
            textField.setText("");
        }
    }
    
    private void validarTextArea(JTextArea textArea) {
        String cadena = textArea.getText().replace(" ", "");
        if (cadena.equals("")) {
            textArea.setText("");
        }
    }
    
    private void validarPuntoAlFinal(JTextField textField) {
        String cadena = textField.getText();
        if (!cadena.equals("") && cadena.charAt(cadena.length()-1) == '.') {
            GestorIO.mostrarString("No debe dejar puntos al final del numero");
            textField.requestFocus();
        }
    }
    
    private void validarCantidadPuntos(JTextField textField) {
        String cadena = textField.getText();
        int contadorPuntos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == '.') {
                contadorPuntos++;
            }
        }
        if (contadorPuntos > 1) {
            GestorIO.mostrarString("Error en la número por favor corregirlo para continuar");
            textField.requestFocus();
        }
    }
    
    public void mostrarDatosArticulo(int numeroArticulo) {
        Articulo articulo = ((Articulo)listaArticulos.get(numeroArticulo));
        tf_numeroArticulo.setText(articulo.getNumeroArticulo()+"");
        tf_upc_ean_isbn.setText(articulo.getUpc_ean_isbn());
        tf_categoria.setText(articulo.getCategoria());
        tf_costo.setText(articulo.getCosto()+"");
        tf_impuesto1.setText(articulo.getImpuesto1());
        tf_porcentaje1.setText(articulo.getPorcentaje1()+"");
        tf_cantidad.setText(articulo.getCantidad()+"");
        tf_localizacion.setText(articulo.getLocalizacion());
        ta_descripcion.setText(articulo.getDescripcion());
        tf_nombreArticulo.setText(articulo.getNombreArticulo());
        cbox_proveedor.setSelectedItem(articulo.getProveedor());
        tf_precioUnitario.setText(articulo.getPrecioUnitario()+"");
        tf_impuesto2.setText(articulo.getImpuesto2());
        tf_porcentaje2.setText(articulo.getPorcentaje2()+"");
        tf_nivelReordenamiento.setText(articulo.getNivelReordenamiento()+"");
        cb_permitirDescripcion.setSelected(articulo.isDescripcionAlterna());
        cb_articuloNumeroSerie.setSelected(articulo.isArticuloTieneNumeroSerie());
    }
    
    public void nuevoRegistro() {
        tf_numeroArticulo.setText(listaArticulos.size()+"");
        tf_upc_ean_isbn.setText("");
        tf_categoria.setText("");
        tf_costo.setText("");
        tf_impuesto1.setText("");
        tf_porcentaje1.setText("");
        tf_cantidad.setText("");
        tf_localizacion.setText("");
        ta_descripcion.setText("");
        tf_nombreArticulo.setText("");
        tf_precioUnitario.setText("");
        tf_impuesto2.setText("");
        tf_porcentaje2.setText("");
        tf_nivelReordenamiento.setText("");
        cb_articuloNumeroSerie.setSelected(false);
        cb_permitirDescripcion.setSelected(false);
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_cerrar;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton bt_nuevo;
    private javax.swing.JCheckBox cb_articuloNumeroSerie;
    private javax.swing.JCheckBox cb_permitirDescripcion;
    private javax.swing.JComboBox cbox_proveedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_alterna;
    private javax.swing.JLabel lb_articuloTiene;
    private javax.swing.JLabel lb_cantidad;
    private javax.swing.JLabel lb_categoria;
    private javax.swing.JLabel lb_costo;
    private javax.swing.JLabel lb_descripcion;
    private javax.swing.JLabel lb_impuesto1;
    private javax.swing.JLabel lb_impuesto2;
    private javax.swing.JLabel lb_localizacion;
    private javax.swing.JLabel lb_nivelReordenamiento;
    private javax.swing.JLabel lb_nombreArticulo;
    private javax.swing.JLabel lb_numeroArticulo;
    private javax.swing.JLabel lb_numeroSerie;
    private javax.swing.JLabel lb_permitirDescripcion;
    private javax.swing.JLabel lb_porcentaje1;
    private javax.swing.JLabel lb_porcentaje2;
    private javax.swing.JLabel lb_precioUnitario;
    private javax.swing.JLabel lb_proveedor;
    private javax.swing.JLabel lb_reordenamiento;
    private javax.swing.JLabel lb_requeridos;
    private javax.swing.JLabel lb_upc_ean_isbn;
    private javax.swing.JTextArea ta_descripcion;
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_categoria;
    private javax.swing.JTextField tf_costo;
    private javax.swing.JTextField tf_impuesto1;
    private javax.swing.JTextField tf_impuesto2;
    private javax.swing.JTextField tf_localizacion;
    private javax.swing.JTextField tf_nivelReordenamiento;
    private javax.swing.JTextField tf_nombreArticulo;
    private javax.swing.JTextField tf_numeroArticulo;
    private javax.swing.JTextField tf_porcentaje1;
    private javax.swing.JTextField tf_porcentaje2;
    private javax.swing.JTextField tf_precioUnitario;
    private javax.swing.JTextField tf_upc_ean_isbn;
    // End of variables declaration//GEN-END:variables
}
