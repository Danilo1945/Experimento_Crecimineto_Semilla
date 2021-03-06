/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas_paneles;

import Modelo.Datos;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabla.MyScrollbarUI;

import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Danilo
 */
public class DatosExperimentos extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Home
     */
    public DatosExperimentos() {
        initComponents();
        // jLabel6.setBorder(no);

        docente_menu.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu.getHorizontalScrollBar().setUI(new MyScrollbarUI());

      consultar_semillas(cbox_nom_semilla);
        control_botones();
        nofocus();
        vaciar_cajas();

    }

    ////conex
    Datos d = new Datos();
    String direccionBD = d.getDireccionBD();
    String usuarioBD = d.getUsuarioBD();
    String contraBD = d.getContraBD();
    // Instanciamos la clase conectar 
    Modelo.conectar cone1 = new Modelo.conectar();
    // realizamos la conexion
    public Connection cn = cone1.conexion(direccionBD, usuarioBD, contraBD);
    // la conexion se hereda en cn

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_refrescar = new rojerusan.RSButtonMetro();
        docente_menu = new javax.swing.JScrollPane();
        Tabla_Semillas = new rojerusan.RSTableMetro();
        cbox_nom_semilla = new rojerusan.RSComboMetro();
        cbox_Num_experi = new rojerusan.RSComboMetro();
        txt_titu = new javax.swing.JLabel();
        txt_num_exp = new javax.swing.JLabel();
        txt_titu1 = new javax.swing.JLabel();
        txt_nombre_semilla = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(21, 96, 136));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Data_View_52px.png"))); // NOI18N
        jLabel1.setText("       Semilla");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_refrescar.setBackground(new java.awt.Color(21, 96, 136));
        btn_refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/refrescar52px.png"))); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        docente_menu.setBackground(new java.awt.Color(21, 96, 136));

        Tabla_Semillas.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla_Semillas.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_Semillas.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_Semillas.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_Semillas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_Semillas.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_Semillas.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_Semillas.setColorSelBackgound(new java.awt.Color(27, 108, 155));
        Tabla_Semillas.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_Semillas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_SemillasMouseClicked(evt);
            }
        });
        docente_menu.setViewportView(Tabla_Semillas);

        cbox_nom_semilla.setBackground(new java.awt.Color(21, 96, 136));
        cbox_nom_semilla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre de la Semilla" }));
        cbox_nom_semilla.setActionCommand("comboBoxChanged\nd\nd\nd\nd\nd");
        cbox_nom_semilla.setColorArrow(new java.awt.Color(21, 96, 136));
        cbox_nom_semilla.setColorBorde(new java.awt.Color(27, 108, 155));
        cbox_nom_semilla.setColorFondo(new java.awt.Color(21, 96, 136));
        cbox_nom_semilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbox_nom_semilla.setName(""); // NOI18N
        cbox_nom_semilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_nom_semillaActionPerformed(evt);
            }
        });

        cbox_Num_experi.setBackground(new java.awt.Color(21, 96, 136));
        cbox_Num_experi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Numero de Experimentos" }));
        cbox_Num_experi.setActionCommand("comboBoxChanged\nd\nd\nd\nd\nd");
        cbox_Num_experi.setColorArrow(new java.awt.Color(21, 96, 136));
        cbox_Num_experi.setColorBorde(new java.awt.Color(27, 108, 155));
        cbox_Num_experi.setColorFondo(new java.awt.Color(21, 96, 136));
        cbox_Num_experi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbox_Num_experi.setName(""); // NOI18N
        cbox_Num_experi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_Num_experiActionPerformed(evt);
            }
        });

        txt_titu.setBackground(new java.awt.Color(21, 96, 136));
        txt_titu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_titu.setForeground(new java.awt.Color(21, 96, 136));
        txt_titu.setText("# Experimento:");

        txt_num_exp.setBackground(new java.awt.Color(21, 96, 136));
        txt_num_exp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_num_exp.setForeground(new java.awt.Color(21, 96, 136));

        txt_titu1.setBackground(new java.awt.Color(21, 96, 136));
        txt_titu1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_titu1.setForeground(new java.awt.Color(21, 96, 136));
        txt_titu1.setText("Semilla=");

        txt_nombre_semilla.setBackground(new java.awt.Color(21, 96, 136));
        txt_nombre_semilla.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_nombre_semilla.setForeground(new java.awt.Color(21, 96, 136));
        txt_nombre_semilla.setText("S/N");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbox_nom_semilla, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_Num_experi, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(docente_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txt_titu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_semilla, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_titu)
                        .addGap(18, 18, 18)
                        .addComponent(txt_num_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_titu)
                    .addComponent(txt_titu1)
                    .addComponent(txt_nombre_semilla)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txt_num_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(docente_menu)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbox_nom_semilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbox_Num_experi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(433, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_Num_experiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_Num_experiActionPerformed
       try {

            String comparacion = cbox_nom_semilla.getSelectedItem().toString();

            //   cbox_horarios.removeAllItems();
            //        cbox_horarios.addItem("Horarios:");
            String Captura = cbox_Num_experi.getSelectedItem().toString();
            String[] parts = Captura.split("/");
            String Captura2 = parts[0];
            consultaExp(Captura2);
            
           
              txt_num_exp.setText(String.valueOf(cbox_Num_experi.getSelectedIndex()));
           
            cbox_Num_experi.setEnabled(true);

        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_cbox_Num_experiActionPerformed

    private void cbox_nom_semillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_nom_semillaActionPerformed
        // TODO add your handling code here:
        try {

            String comparacion = cbox_nom_semilla.getSelectedItem().toString();

            //   cbox_horarios.removeAllItems();
            //        cbox_horarios.addItem("Horarios:");
            String Captura = cbox_nom_semilla.getSelectedItem().toString();

            String[] parts = Captura.split("/");
            String Captura2 = parts[0];
            txt_nombre_semilla.setText(parts[1]);
            //JOptionPane.showMessageDialog(null, Captura2 );
            limpiar_combo(cbox_Num_experi);
            consultarNumExp(Captura2);
            cbox_Num_experi.setEnabled(true);

        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cbox_nom_semillaActionPerformed

    private void Tabla_SemillasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SemillasMouseClicked
        //        try {
            //            // TODO add your handling code here:
            //
            //            int fila = Tabla_Semillas.getSelectedRow();
            //
            //            if (fila > -1) {
                //                //  Txt_Codigo.setText(Integer.toString(fila));
                //                txt_codigo.setText(Tabla_Semillas.getValueAt(fila, 0).toString());
                //                txt_nombre.setText(Tabla_Semillas.getValueAt(fila, 1).toString());
                //                txt_n_experimentos.setSelectedIndex(Integer.parseInt(Tabla_Semillas.getValueAt(fila, 2).toString()));
                //                String strFecha = Tabla_Semillas.getValueAt(fila, 3).toString();
                //                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                //                Date fecha = null;
                //                fecha = formatoDelTexto.parse(strFecha);
                //
                //                Txt_fecha.setDatoFecha(fecha);  // para insertar fecha
                //
                //
                //
                //
                //
                //            }
            //
            //        } catch (ParseException ex) {
            //            // Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            //            alerta("Error", "No a seleccionado la opcion Nuevo" + ex, "/Img_alertas/Error_100px.png");
            //        }
    }//GEN-LAST:event_Tabla_SemillasMouseClicked

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        // TODO add your handling code here:
        consutarTabla_Estudiantes();
        control_botones();
//        txt_buscar.setText("");
//        cbox_buscar.setSelectedIndex(0);
    }//GEN-LAST:event_btn_refrescarActionPerformed

    public void consultarNumExp(String seleccion) {
   
        try {
            //            cbox_periodo_aca.removeAllItems();
//            cbox_periodo_aca.addItem("Periodo Académico:");
            Statement estado;
          
            String codigo = "";

/// hacemos consulata sql
            estado = cn.createStatement();
            String sql="SELECT * FROM `num_experimentos` WHERE cod_exp_sec='"+seleccion+"'";
          //   JOptionPane.showMessageDialog(null,sql );
            ResultSet resultado = estado.executeQuery(sql);
           
            while (resultado.next()) {
                codigo = resultado.getString(1);
                //JOptionPane.showMessageDialog(null,codigo );
                cbox_Num_experi.addItem(codigo );

            }
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"ocurrio un fallo "+ ex);
        }
        
        
        
        
        
        
        
        
        

    }
 public void consultaExp(String seleccion) {
 
 


            String sql_consulta = "SELECT * FROM `medicion` WHERE cod_num_exp='"+seleccion+"'";
          // JOptionPane.showMessageDialog(null, sql_consulta);
            
              String cabesera[] = {"#", "Tiempo", "Masa", "Per.Masa(g)", "Per.Masa(%)", "Humedad", "Velocidad Per. Peso"};
            cone1.GetTabla_Sincabeseras_sql_bd(cn, sql_consulta , Tabla_Semillas, cabesera);
            
        
 }
    
    void limpiar_combo(rojerusan.RSComboMetro combo) {
        for (int i = combo.getItemCount() - 1; i > 0; i--) {
            combo.removeItemAt(i);
        }
    }

    public void consutarTabla_Estudiantes() {

        String consultaBD = "SELECT * FROM `experimento_secado` ";
        javax.swing.JTable Tabla = this.Tabla_Semillas;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
        String cabesera[] = {"Código", "Nombre de la Semilla", "Numero Experimentos", "Fecha"};
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);

    }

    public void consutaBD(String Campo, String txtSQL) {

        //String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + "='" + txtSQL + "'";
        String consultaBD = "SELECT * FROM `experimento_secado` WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
        //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = this.Tabla_Semillas;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
        String cabesera[] = {"Código", "Nombre de la Semilla", "Numero Experimentos", "Fecha"};
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);

    }

    public void consutaBD_sinfiltros(String Campo, String txtSQL) {

        String consultaBD = "SELECT * FROM `experimento_secado` WHERE " + Campo + "='" + txtSQL + "'";
        // String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
        //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = this.Tabla_Semillas;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
        String cabesera[] = {"Código", "Nombre de la Semilla", "Numero Experimentos", "Fecha"};
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);

    }

    public void consultar_semillas(rojerusan.RSComboMetro semilla) {

        try {
            //            cbox_periodo_aca.removeAllItems();
//            cbox_periodo_aca.addItem("Periodo Académico:");
            Statement estado;
            String Nombre_semi = "";
            String codigo = "";

/// hacemos consulata sql
            estado = cn.createStatement();
            ResultSet resultado = estado.executeQuery(" SELECT * FROM `experimento_secado` ");

            while (resultado.next()) {
                codigo = resultado.getString(1);
                Nombre_semi = resultado.getString(2);
                semilla.addItem(codigo + "/" + Nombre_semi);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosExperimentos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void control_botones() {
//        btn_guardar.setEnabled(false);
//        btn_nuevo.setEnabled(true);
//        btn_actualizar.setEnabled(false);
//        btn_eliminar.setEnabled(false);

        btn_refrescar.setEnabled(true);
    }

    public void alerta(String titulo, String texto, String dir_img) {

        Alertas wa = new Alertas(null, true);
        wa.txt_titu.setText(titulo);
        wa.txt_txt.setText(texto);

        wa.txt_img.setIcon(new javax.swing.ImageIcon(getClass().getResource(dir_img)));

        wa.setVisible(true);
    }

    public int confirmar(String titulo, String texto, String dir_img) {

        int estatus = 9;
        Alertas wa = new Alertas(null, true);
        wa.txt_titu.setText(titulo);
        wa.txt_txt.setText(texto);

        wa.txt_img.setIcon(new javax.swing.ImageIcon(getClass().getResource(dir_img)));

        wa.setVisible(true);

        estatus = wa.respuesta;

        return estatus;
    }

    private void nofocus() {
//        btn_nuevo.setFocusPainted(false);
//        btn_actualizar.setFocusPainted(false);
//        btn_eliminar.setFocusPainted(false);

        btn_refrescar.setFocusPainted(false);
//        btn_guardar.setFocusPainted(false);

    }

    private void vaciar_cajas() {
//        txt_nombre.setText("");
//       
//        Txt_fecha.setDatoFecha(null);
//        txt_n_experimentos.setSelectedIndex(0);

//        Txt_fecha.setDatoFecha(null);
//        txt_codigo.setText("");
//
//        txt_nombre.setEnabled(false);
//        txt_n_experimentos.setEnabled(false);
//         
//        Txt_fecha.setEnabled(false);
//        txt_codigo.setEnabled(false);
        Tabla_Semillas.setEnabled(false);
//        txt_buscar.setEnabled(false);

    }

    private void btn_True_false() {
//        btn_guardar.setEnabled(false);
//        btn_nuevo.setEnabled(true);
//        btn_actualizar.setEnabled(false);
//        btn_eliminar.setEnabled(false);

        btn_refrescar.setEnabled(true);
        Tabla_Semillas.setEnabled(false);

    }

    private void nuevo() {
//        btn_guardar.setEnabled(true);
//        btn_nuevo.setEnabled(false);
//        btn_actualizar.setEnabled(true);
//        btn_eliminar.setEnabled(true);
        //btn_reportes.setEnabled(true);
        btn_refrescar.setEnabled(true);

//        txt_nombre.setEnabled(true);
//        txt_n_experimentos.setEnabled(true);
//        Txt_fecha.setEnabled(true);
//        txt_codigo.setEnabled(true);
        Tabla_Semillas.setEnabled(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro Tabla_Semillas;
    private rojerusan.RSButtonMetro btn_refrescar;
    private rojerusan.RSComboMetro cbox_Num_experi;
    private rojerusan.RSComboMetro cbox_nom_semilla;
    private javax.swing.JScrollPane docente_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel txt_nombre_semilla;
    private javax.swing.JLabel txt_num_exp;
    public javax.swing.JLabel txt_titu;
    public javax.swing.JLabel txt_titu1;
    // End of variables declaration//GEN-END:variables
}
