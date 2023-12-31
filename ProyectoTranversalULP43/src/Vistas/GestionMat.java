/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.MateriaData;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectotranversalulp.Entidades.Materia;

/**
 *
 * @author kalema
 */
public class GestionMat extends javax.swing.JInternalFrame {

    public DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form GestionMateria
     */
    public GestionMat() {
        initComponents();
        armoTabla();
        armoCombo();
        campoInicial();
    }
    List<Materia> listaMateria = null;
    MateriaData abmMateria = new MateriaData();
    Materia temp = null;
    boolean editar = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMateria = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtMateriaAnio = new javax.swing.JTextField();
        jcbMateriaEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jbtModificar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jbtNuevaMateria = new javax.swing.JButton();
        jbtAgregoMat = new javax.swing.JButton();
        Codigo = new javax.swing.JLabel();
        jEtiquetaCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtEdicionMateria = new javax.swing.JTextField();
        jbtCancelar = new javax.swing.JButton();
        jEtiquetaAnio = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("GESTIÓN DE MATERIAS");
        jLabel1.setFocusable(false);

        jLabel2.setText("Búsqueda por Nombre");
        jLabel2.setFocusable(false);

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });

        jTablaMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaMateria);

        jLabel4.setText("Año");
        jLabel4.setFocusable(false);

        jtMateriaAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMateriaAnioKeyReleased(evt);
            }
        });

        jcbMateriaEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbMateriaEstadoFocusGained(evt);
            }
        });

        jLabel5.setText("Estado");
        jLabel5.setFocusable(false);

        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jbtNuevaMateria.setText("Nueva Materia");
        jbtNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNuevaMateriaActionPerformed(evt);
            }
        });

        jbtAgregoMat.setText("Agregar");
        jbtAgregoMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregoMatActionPerformed(evt);
            }
        });

        Codigo.setText("Código");
        Codigo.setFocusable(false);

        jEtiquetaCodigo.setFocusable(false);

        jLabel3.setText("Nombre Materia");
        jLabel3.setFocusable(false);

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jEtiquetaAnio.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtEdicionMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Codigo)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jEtiquetaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(43, 43, 43)
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jtMateriaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jEtiquetaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(263, 263, 263)
                                        .addComponent(jbtAgregoMat)))
                                .addGap(18, 18, 18)
                                .addComponent(jbtModificar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtNuevaMateria)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbMateriaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 221, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtNuevaMateria))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtEdicionMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtMateriaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Codigo)
                        .addComponent(jEtiquetaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbMateriaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEtiquetaAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtModificar)
                    .addComponent(jbtSalir)
                    .addComponent(jbtAgregoMat)
                    .addComponent(jbtCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
        // Inicio la búsqueda de las materias por id de la materia
        String buscoNom = jtBuscar.getText().toLowerCase();
        listaMateria = abmMateria.listarMatera();
        borroFilas();
        for (Materia mat : listaMateria) {
            String evaluo = mat.getNombre().toLowerCase();
//            evaluo.toCharArray();
            if (buscoNom.isEmpty()) {
                borroFilas();
                campoInicial();
            } else if (evaluo.contains(buscoNom)) {
                if (jbtAgregoMat.isEnabled()) {
                    jbtAgregoMat.setEnabled(false);
                }
                modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnio(), mat.isEstado()});
            } else {
                if (modelo.getRowCount() == 0) {
                    jbtNuevaMateria.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jbtNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNuevaMateriaActionPerformed
        // Este procedimiento habilita los campos para cargar la nueva materia
        jtEdicionMateria.setText(jtBuscar.getText());
        jtEdicionMateria.setEnabled(true);
        jtMateriaAnio.setEnabled(true);
        jtMateriaAnio.requestFocus();
    }//GEN-LAST:event_jbtNuevaMateriaActionPerformed

    private void jcbMateriaEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbMateriaEstadoFocusGained
        // Este procedimietno chequea que el campo año no este vacío
        if (jtMateriaAnio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo AÑO no puede estar vacío");
            jtMateriaAnio.requestFocus();
        } else {
            if (editar == false) {
                jbtAgregoMat.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jcbMateriaEstadoFocusGained

    private void jTablaMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMateriaMouseClicked
        // Este procedimiento carga los datos de la tabla en los campos para ser editados
        editar = true;
        jbtNuevaMateria.setEnabled(false);
        jtBuscar.setEnabled(false);
        jbtAgregoMat.setEnabled(false);
        int valor = jTablaMateria.getSelectedRow();

        jtEdicionMateria.setText((String) modelo.getValueAt(valor, 1));
        jEtiquetaCodigo.setText(String.valueOf(modelo.getValueAt(valor, 0)));
        jtMateriaAnio.setText(String.valueOf(modelo.getValueAt(valor, 2)));
        String estado = (String.valueOf(modelo.getValueAt(valor, 3)));
        if (estado.equals("true")) {
            jcbMateriaEstado.setSelectedIndex(0);
        } else {
            jcbMateriaEstado.setSelectedIndex(1);
        }
        habilitoCampos();
        jtBuscar.requestFocus();
    }//GEN-LAST:event_jTablaMateriaMouseClicked

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        // Este procedimiento actualiza los datos de la materia
        temp = new Materia();
        int valorID = Integer.parseInt(jEtiquetaCodigo.getText());
        int valorAnio = Integer.parseInt(jtMateriaAnio.getText());
        temp.setIdMateria(valorID);
        temp.setNombre(jtEdicionMateria.getText());
        temp.setAnio(valorAnio);
        int valorEstado = jcbMateriaEstado.getSelectedIndex();
        if (valorEstado == 0) {
            temp.setEstado(true);
        } else {
            temp.setEstado(false);
        }
        abmMateria.modificarMateria(temp);
        campoInicial();
        borroFilas();
        jtBuscar.setEnabled(true);
        editar = false;
        jtBuscar.requestFocus();
        jtBuscar.selectAll();
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void jbtAgregoMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregoMatActionPerformed
        // Este procedimiento agrega una materia nueva
        temp = new Materia();
        temp.setNombre(jtEdicionMateria.getText());
        temp.setAnio(Integer.parseInt(jtMateriaAnio.getText()));
        int valorEstado = jcbMateriaEstado.getSelectedIndex();
        if (valorEstado == 0) {
            temp.setEstado(true);
        } else {
            temp.setEstado(false);
        }
        abmMateria.guardarMateria(temp);
        armoFilas();
        //borroFilas();
        campoInicial();
        jtBuscar.setText("");
        jtBuscar.requestFocus();
    }//GEN-LAST:event_jbtAgregoMatActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        // Este procedimiento borra todos los campos, la búsqueda y habilita el campo de texto para hacer una nueva búsqueda
        campoInicial();
        borroFilas();
        jtBuscar.selectAll();
        jtBuscar.requestFocus();

    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        // Ese procedimiento sale de el formulario
        this.setVisible(false);
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jtMateriaAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMateriaAnioKeyReleased
        // Este procedimieto habilita el combo box para elegir si la materia va a estar activa o no
        char[] valorAnio = jtMateriaAnio.getText().toCharArray();
        if (valorAnio.length == 0) {
            jEtiquetaAnio.setText("");
        } else {
            for (int i = 0; i < valorAnio.length; i++) {
                //jEtiquetaAnio.setText("");
                String anioEnFor = String.valueOf(valorAnio[i]);
                if (!anioEnFor.toLowerCase().matches("[0-9]*")) {
                    jEtiquetaAnio.setVisible(true);
                    jEtiquetaAnio.setForeground(Color.red.darker());
                    jEtiquetaAnio.setText("Solo números de 0 a 9");
                    jcbMateriaEstado.setEnabled(false);
                    jbtModificar.setEnabled(false);
                    break;
                } else {
                    jEtiquetaAnio.setVisible(false);
                    jcbMateriaEstado.setEnabled(true);
                    jbtModificar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_jtMateriaAnioKeyReleased

    public void funcionSinSentido(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel jEtiquetaAnio;
    private javax.swing.JLabel jEtiquetaCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaMateria;
    private javax.swing.JButton jbtAgregoMat;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JButton jbtNuevaMateria;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JComboBox<String> jcbMateriaEstado;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtEdicionMateria;
    private javax.swing.JTextField jtMateriaAnio;
    // End of variables declaration//GEN-END:variables

    private void armoTabla() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Estado");
        jTablaMateria.setModel(modelo);
    }

    private void campoInicial() {
        jtMateriaAnio.setEnabled(false);
        jtMateriaAnio.setText("");
        jEtiquetaCodigo.setText("");
        jcbMateriaEstado.setEnabled(false);
        jbtModificar.setEnabled(false);
        jbtNuevaMateria.setEnabled(false);
        jtEdicionMateria.setEnabled(false);
        jtEdicionMateria.setText("");
        jbtAgregoMat.setEnabled(false);
        jtBuscar.setEnabled(true);
    }

    private void habilitoCampos() {
        jtMateriaAnio.setEnabled(true);
        jcbMateriaEstado.setEnabled(true);
        jbtModificar.setEnabled(true);
        jtEdicionMateria.setEnabled(true);
    }

    private void armoCombo() {
        jcbMateriaEstado.addItem("Activo");
        jcbMateriaEstado.addItem("Inactivo");
    }

    private void armoFilas() {
        String elID = String.valueOf(temp.getIdMateria());
        //String elAnio=String.valueOf(temp.getAnio());
        String elEstado = "";
        if (jcbMateriaEstado.getSelectedIndex() == 0) {
            elEstado = "Activo";
        } else {
            elEstado = "Inactivo";
        }
        modelo.addRow(new Object[]{elID, jtEdicionMateria.getText(), jtMateriaAnio.getText(), elEstado});
    }

    private void borroFilas() {
        int f = modelo.getRowCount() - 1;
//        int num = modelo.getRowCount() - 1;
//         for (int i = num; i >= 0; i--) {
//            modelo.removeRow(i);
//        }

        for (int i = f; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
