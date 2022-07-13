package com.verduleria;
import java.util.Arrays;


public final class Verduleria extends javax.swing.JFrame {
    
    String[] verduras = new String[]{"Uva","Uva","Manzana","Manzana"};
    public String[] stock(){ return verduras;}
    public static String compra = "";
    public static String precios = "1 racimo de uvas 1000 CLP\n 1 manzana 200 CLP";
    

    public Verduleria() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        MostrarStock = new javax.swing.JButton();
        botonComprar = new javax.swing.JButton();
        Manzana = new javax.swing.JRadioButton();
        Uva = new javax.swing.JRadioButton();
        fotoManzana = new javax.swing.JLabel();
        fotoUva = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        PreciosContenido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Verduleria");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("¿Qué desea comprar?");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        MostrarStock.setText("Ver Productos");
        System.out.println(Arrays.toString(stock()));
        MostrarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarStockActionPerformed(evt);
            }
        });

        botonComprar.setText("Comprar");
        botonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarActionPerformed(evt);
            }
        });

        Manzana.setText("Manzana");
        Manzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManzanaActionPerformed(evt);
            }
        });

        Uva.setText("Uva");
        Uva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UvaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Precio:");

        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(fotoUva, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PreciosContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Precio, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addGap(2, 2, 2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel1)))
                .addGap(66, 66, 66)
                .addComponent(fotoManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(MostrarStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonComprar)
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(346, 346, 346))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cantidad))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Uva)
                            .addGap(18, 18, 18)
                            .addComponent(Manzana))))
                .addGap(369, 369, 369))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarStock)
                    .addComponent(botonComprar))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Manzana)
                    .addComponent(Uva))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fotoManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fotoUva, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PreciosContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed
        // TODO add your handling code here:
        // Abrir una nueva ventana y escribir:
        int cantidad=0;
        int precio = 0;
        int valor  = 0;
        String precioString = Precio.getText();
        String texto = Cantidad.getText();
    
        try {
            cantidad = Integer.parseInt(texto);
            precio   = Integer.parseInt(precioString); 
            if(Manzana.isSelected()==true){
                //valor = Integer.parseString(texto);

                if(cantidad == 1){
                    compra = "";
                    compra = "Usted debe cancelar"+precio+"por 1 manzana";
                    System.out.println("Usted ha comprado 1 manzanas"); 
                    ventana2 v2 = new ventana2();
                    v2.setVisible(true);
                    

                }
                else if(cantidad > 1){
                    compra = "";
                    compra = "Usted debe cancelar "+cantidad*precio+" por "+cantidad+" manzanas";
                    System.out.println("Usted ha comprado "+cantidad+" manzanas");
                    ventana2 v2 = new ventana2();
                    v2.setVisible(true);

                }
            }
            cantidad = Integer.parseInt(texto);
            if(Uva.isSelected()==true){
                //valor = Integer.parseString(texto);

                if(cantidad == 1){
                    compra = "";
                    compra = "Usted debe cancelar"+precio+"por 1 racimo de uva";
                    System.out.println("Usted ha comprado 1 uvas");
                    ventana2 v2 = new ventana2();
                    v2.setVisible(true);

                }
                else if(cantidad > 1){
                    compra = "";
                    compra = "Usted debe cancelar "+cantidad*precio+" por "+cantidad+" racimos de uvas";
                    System.out.println("Usted ha comprado "+cantidad+" uvas");
                    ventana2 v2 = new ventana2();
                    v2.setVisible(true);

                }
            }   
            
            
            
        } 
        catch (NumberFormatException e) {
           compra = "La cantidad ingresada No corresponde a un numero";
           ventana2 v2 = new ventana2();
           v2.setVisible(true);
           System.err.println("La cantidad ingresada No corresponde a un numero");
           e.printStackTrace();
        }
        

    }//GEN-LAST:event_botonComprarActionPerformed

    private void MostrarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarStockActionPerformed
        //FotoVerdura.setText((Arrays.toString(stock())));
        //Productos.setKeymap((Keymap) stock());
        Productos.setText(Arrays.toString(stock()));
        
    }//GEN-LAST:event_MostrarStockActionPerformed

    private void ManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManzanaActionPerformed
        // TODO add your handling code here:
        if(Manzana.isSelected()==true)
        {
            // Poner la imagen de la uva
            System.out.print("Seleccionó opción 2");

            fotoManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/manzanas.jpg")));
         
        }
        else{
            fotoManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));

        }
    }//GEN-LAST:event_ManzanaActionPerformed

    private void UvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UvaActionPerformed
        // TODO add your handling code here:
        if(Uva.isSelected()==true)
        {
            // Poner la imagen de la uva
            System.out.print("Seleccionó opción 1");

            fotoUva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/uvas.jpg")));
         
        }
        else{
            fotoUva.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));

        }
    }//GEN-LAST:event_UvaActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Verduleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verduleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verduleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verduleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verduleria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JRadioButton Manzana;
    private javax.swing.JButton MostrarStock;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel PreciosContenido;
    private javax.swing.JLabel Productos;
    private javax.swing.JRadioButton Uva;
    private javax.swing.JButton botonComprar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fotoManzana;
    private javax.swing.JLabel fotoUva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
