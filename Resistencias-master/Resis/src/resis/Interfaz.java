package resis;

import java.awt.Color;
import javax.swing.JOptionPane;
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        negro = new javax.swing.JButton();
        cafe = new javax.swing.JButton();
        rojo = new javax.swing.JButton();
        naranja = new javax.swing.JButton();
        amarillo = new javax.swing.JButton();
        verde = new javax.swing.JButton();
        azul = new javax.swing.JButton();
        morado = new javax.swing.JButton();
        gris = new javax.swing.JButton();
        blanco = new javax.swing.JButton();
        titulo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        secciones = new javax.swing.JTextArea();
        Reset = new javax.swing.JButton();
        OK = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        secciones2 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        blanco1 = new javax.swing.JButton();
        negro1 = new javax.swing.JButton();
        cafe1 = new javax.swing.JButton();
        rojo1 = new javax.swing.JButton();
        naranja1 = new javax.swing.JButton();
        amarillo1 = new javax.swing.JButton();
        verde1 = new javax.swing.JButton();
        azul1 = new javax.swing.JButton();
        morado1 = new javax.swing.JButton();
        gris1 = new javax.swing.JButton();
        negro2 = new javax.swing.JButton();
        cafe2 = new javax.swing.JButton();
        rojo2 = new javax.swing.JButton();
        naranja2 = new javax.swing.JButton();
        amarillo2 = new javax.swing.JButton();
        verde2 = new javax.swing.JButton();
        azul2 = new javax.swing.JButton();
        firstspace = new javax.swing.JTextField();
        secondspace = new javax.swing.JTextField();
        thirdspace = new javax.swing.JTextField();
        FC1 = new javax.swing.JTextField();
        FC2 = new javax.swing.JTextField();
        FC3 = new javax.swing.JTextField();
        FC4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        fourthspace = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        negro.setBackground(new java.awt.Color(0, 0, 0));
        negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negroActionPerformed(evt);
            }
        });

        cafe.setBackground(new java.awt.Color(102, 51, 0));
        cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeActionPerformed(evt);
            }
        });

        rojo.setBackground(new java.awt.Color(153, 0, 0));
        rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActionPerformed(evt);
            }
        });

        naranja.setBackground(new java.awt.Color(255, 102, 0));
        naranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naranjaActionPerformed(evt);
            }
        });

        amarillo.setBackground(new java.awt.Color(255, 255, 0));
        amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarilloActionPerformed(evt);
            }
        });

        verde.setBackground(new java.awt.Color(0, 153, 0));
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });

        azul.setBackground(new java.awt.Color(0, 153, 255));
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });

        morado.setBackground(new java.awt.Color(153, 0, 204));
        morado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moradoActionPerformed(evt);
            }
        });

        gris.setBackground(new java.awt.Color(102, 102, 102));
        gris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grisActionPerformed(evt);
            }
        });

        blanco.setBackground(new java.awt.Color(255, 255, 255));
        blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blancoActionPerformed(evt);
            }
        });

        titulo.setEditable(false);
        titulo.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        titulo.setText("SELECCIONE EN ORDEN EL COLOR DE LAS RESISTENCIAS");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextField1.setText("El valor de la resistencia es de:");

        secciones.setEditable(false);
        secciones.setColumns(20);
        secciones.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        secciones.setRows(5);
        secciones.setText("1ra Franja: Valor.\n2da Franja: Valor.\n3ra Franja: Multiplicador.\n4ta Franja: Tolerancia.");
        jScrollPane1.setViewportView(secciones);

        Reset.setBackground(new java.awt.Color(204, 0, 0));
        Reset.setText("REINICIAR");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        OK.setBackground(new java.awt.Color(0, 153, 0));
        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("NEGRO ----- 0\nCAFÉ  ----- 1\nROJO  ----- 2\nNARANJA --- 3\nAMARILLO -- 4\nVERDE ----- 5\nAZUL  ----- 6\nMORADO ---- 7\nGRIS  ----- 8\nBLANCO -----9");
        jScrollPane2.setViewportView(jTextArea2);

        secciones2.setColumns(20);
        secciones2.setRows(5);
        secciones2.setText("   TOLERANCIAS\nDORADO ----- ±5\nPLATEADO --- ±10\n ");
        jScrollPane3.setViewportView(secciones2);

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        blanco1.setBackground(new java.awt.Color(255, 255, 255));
        blanco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blanco1ActionPerformed(evt);
            }
        });

        negro1.setBackground(new java.awt.Color(0, 0, 0));
        negro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negro1ActionPerformed(evt);
            }
        });

        cafe1.setBackground(new java.awt.Color(102, 51, 0));
        cafe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafe1ActionPerformed(evt);
            }
        });

        rojo1.setBackground(new java.awt.Color(153, 0, 0));
        rojo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojo1ActionPerformed(evt);
            }
        });

        naranja1.setBackground(new java.awt.Color(255, 102, 0));
        naranja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naranja1ActionPerformed(evt);
            }
        });

        amarillo1.setBackground(new java.awt.Color(255, 255, 0));
        amarillo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarillo1ActionPerformed(evt);
            }
        });

        verde1.setBackground(new java.awt.Color(0, 153, 0));
        verde1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verde1ActionPerformed(evt);
            }
        });

        azul1.setBackground(new java.awt.Color(0, 153, 255));
        azul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azul1ActionPerformed(evt);
            }
        });

        morado1.setBackground(new java.awt.Color(153, 0, 204));
        morado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                morado1ActionPerformed(evt);
            }
        });

        gris1.setBackground(new java.awt.Color(102, 102, 102));
        gris1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gris1ActionPerformed(evt);
            }
        });

        negro2.setBackground(new java.awt.Color(0, 0, 0));
        negro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negro2ActionPerformed(evt);
            }
        });

        cafe2.setBackground(new java.awt.Color(102, 51, 0));
        cafe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafe2ActionPerformed(evt);
            }
        });

        rojo2.setBackground(new java.awt.Color(153, 0, 0));
        rojo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojo2ActionPerformed(evt);
            }
        });

        naranja2.setBackground(new java.awt.Color(255, 102, 0));
        naranja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naranja2ActionPerformed(evt);
            }
        });

        amarillo2.setBackground(new java.awt.Color(255, 255, 0));
        amarillo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarillo2ActionPerformed(evt);
            }
        });

        verde2.setBackground(new java.awt.Color(0, 153, 0));
        verde2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verde2ActionPerformed(evt);
            }
        });

        azul2.setBackground(new java.awt.Color(0, 153, 255));
        azul2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azul2ActionPerformed(evt);
            }
        });

        firstspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstspaceActionPerformed(evt);
            }
        });

        secondspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondspaceActionPerformed(evt);
            }
        });

        thirdspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdspaceActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setText("x");

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane4.setViewportView(resultado);

        fourthspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(gris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(morado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(verde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(amarillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(naranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(negro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(gris1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(morado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(azul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(verde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cafe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rojo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(amarillo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(naranja1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(negro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(blanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(azul2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(verde2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cafe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rojo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(amarillo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(naranja2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(negro2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstspace, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(secondspace, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(thirdspace, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fourthspace, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(FC1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(FC2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FC4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FC3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FC1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FC2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FC3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FC4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(thirdspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secondspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fourthspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(negro1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cafe1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(rojo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(naranja1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(amarillo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(verde1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(azul1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(negro2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cafe2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(rojo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(naranja2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(amarillo2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(verde2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(azul2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(morado1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(gris1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(blanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(negro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(azul, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(morado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(gris, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Reset)
                                            .addComponent(OK)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void negroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negroActionPerformed
        negro.setBackground(java.awt.Color.black);
        FC1.setBackground(Color.black);
        int c=0;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_negroActionPerformed

    private void rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActionPerformed
        FC1.setBackground(Color.red);
        int c=2;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_rojoActionPerformed

    private void negro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negro1ActionPerformed
        FC2.setBackground(Color.black);
        int c=0;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_negro1ActionPerformed

    private void rojo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojo1ActionPerformed
        FC2.setBackground(Color.red);
        int c=2;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_rojo1ActionPerformed

    private void negro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negro2ActionPerformed
        FC3.setBackground(Color.black);
        int m=1;
        String caja;
        caja=Integer.toString(m);
        thirdspace.setText(caja);
    }//GEN-LAST:event_negro2ActionPerformed

    private void rojo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojo2ActionPerformed
        FC3.setBackground(Color.red);
        int m=100;
        String caja;
        caja=Integer.toString(m);
        thirdspace.setText(caja);
    }//GEN-LAST:event_rojo2ActionPerformed

    private void firstspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstspaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstspaceActionPerformed

    private void secondspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondspaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondspaceActionPerformed

    private void thirdspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdspaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thirdspaceActionPerformed

    private void cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeActionPerformed
        FC1.setBackground(new Color(153,51,0));
        int c=1;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_cafeActionPerformed

    private void naranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naranjaActionPerformed
        FC1.setBackground(Color.orange);
        int c=3;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_naranjaActionPerformed

    private void amarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarilloActionPerformed
        FC1.setBackground(Color.yellow);
        int c=4;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_amarilloActionPerformed

    private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
        FC1.setBackground(Color.green);
        int c=5;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_verdeActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        FC1.setBackground(Color.blue);
        int c=6;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_azulActionPerformed

    private void moradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moradoActionPerformed
        FC1.setBackground(Color.MAGENTA);
        int c=7;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_moradoActionPerformed

    private void grisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grisActionPerformed
        FC1.setBackground(Color.LIGHT_GRAY);
        int c=8;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_grisActionPerformed

    private void blancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blancoActionPerformed
        FC1.setBackground(Color.white);
        int c=9;
        String caja;
        caja=Integer.toString(c);
        firstspace.setText(caja);
    }//GEN-LAST:event_blancoActionPerformed

    private void cafe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafe1ActionPerformed
        FC2.setBackground(new Color(153,51,0));
        int c=1;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_cafe1ActionPerformed

    private void naranja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naranja1ActionPerformed
        FC2.setBackground(Color.orange);
        int c=3;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_naranja1ActionPerformed

    private void amarillo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarillo1ActionPerformed
        FC2.setBackground(Color.yellow);
        int c=4;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_amarillo1ActionPerformed

    private void verde1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verde1ActionPerformed
        FC2.setBackground(Color.green);
        int c=5;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_verde1ActionPerformed

    private void azul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azul1ActionPerformed
        FC2.setBackground(Color.blue);
        int c=6;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_azul1ActionPerformed

    private void morado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morado1ActionPerformed
        FC2.setBackground(Color.magenta);
        int c=7;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_morado1ActionPerformed

    private void gris1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gris1ActionPerformed
        FC2.setBackground(Color.LIGHT_GRAY);
        int c=8;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_gris1ActionPerformed

    private void blanco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blanco1ActionPerformed
        FC2.setBackground(Color.white);
        int c=9;
        String caja;
        caja=Integer.toString(c);
        secondspace.setText(caja);
    }//GEN-LAST:event_blanco1ActionPerformed

    private void cafe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafe2ActionPerformed
        FC3.setBackground(new Color(153,51,0));
        int m=10;
        String caja;
        caja=Integer.toString(m);
        thirdspace.setText(caja);
    }//GEN-LAST:event_cafe2ActionPerformed

    private void naranja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naranja2ActionPerformed
        FC3.setBackground(Color.orange);
        int m=1000;
        String caja;
        caja=Integer.toString(m);
        thirdspace.setText(caja);
    }//GEN-LAST:event_naranja2ActionPerformed

    private void amarillo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarillo2ActionPerformed
        FC3.setBackground(Color.yellow);
        int m=10000;
        String caja;
        caja=Integer.toString(m);
        thirdspace.setText(caja);
    }//GEN-LAST:event_amarillo2ActionPerformed

    private void verde2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verde2ActionPerformed
        FC3.setBackground(Color.green);
        int m=100000;
        String caja;
        caja=Integer.toString(m);
        thirdspace.setText(caja);
    }//GEN-LAST:event_verde2ActionPerformed

    private void azul2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azul2ActionPerformed
        FC3.setBackground(Color.blue);
        int m=1000000;
        String caja;
        caja=Integer.toString(m);
        thirdspace.setText(caja);
    }//GEN-LAST:event_azul2ActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        resultado.setText(" ");
        int space = Integer.parseInt(firstspace.getText());
        int spacio = Integer.parseInt(secondspace.getText());
        int espace = Integer.parseInt(thirdspace.getText());
        double espacio = Double.parseDouble(fourthspace.getText());
        
        String first = Integer.toString(space);
        String second = Integer.toString(spacio);
        String third = Integer.toString(espace);
        String fourth = Double.toString(espacio);
        
        String co = first.concat(second);
        int r = Integer.parseInt(co);
        double resultao = r*espace;
        double resulta2 = resultao*espacio;
        String respuesta = Double.toString(resultao);
        String answer = Double.toString(resulta2);
        resultado.append(respuesta+" +/- "+answer+" Ω ");
    }//GEN-LAST:event_OKActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FC4.setBackground(new Color (153, 153, 0));
        double t=0.05;
        String caja;
        caja=Double.toString(t);
        fourthspace.setText(caja);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FC4.setBackground(new Color (153, 153, 153));
        double t=0.1;
        String caja;
        caja=Double.toString(t);
        fourthspace.setText(caja);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void fourthspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthspaceActionPerformed
      
    }//GEN-LAST:event_fourthspaceActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        FC1.setBackground(Color.white);
        FC2.setBackground(Color.white);
        FC3.setBackground(Color.white);
        FC4.setBackground(Color.white);
        firstspace.setText(" ");
        secondspace.setText(" ");
        thirdspace.setText(" ");
        fourthspace.setText(" ");
        resultado.setText(" ");
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FC1;
    private javax.swing.JTextField FC2;
    private javax.swing.JTextField FC3;
    private javax.swing.JTextField FC4;
    private javax.swing.JButton OK;
    private javax.swing.JButton Reset;
    private javax.swing.JButton amarillo;
    private javax.swing.JButton amarillo1;
    private javax.swing.JButton amarillo2;
    private javax.swing.JButton azul;
    private javax.swing.JButton azul1;
    private javax.swing.JButton azul2;
    private javax.swing.JButton blanco;
    private javax.swing.JButton blanco1;
    private javax.swing.JButton cafe;
    private javax.swing.JButton cafe1;
    private javax.swing.JButton cafe2;
    private javax.swing.JTextField firstspace;
    private javax.swing.JTextField fourthspace;
    private javax.swing.JButton gris;
    private javax.swing.JButton gris1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton morado;
    private javax.swing.JButton morado1;
    private javax.swing.JButton naranja;
    private javax.swing.JButton naranja1;
    private javax.swing.JButton naranja2;
    private javax.swing.JButton negro;
    private javax.swing.JButton negro1;
    private javax.swing.JButton negro2;
    private javax.swing.JTextArea resultado;
    private javax.swing.JButton rojo;
    private javax.swing.JButton rojo1;
    private javax.swing.JButton rojo2;
    private javax.swing.JTextArea secciones;
    private javax.swing.JTextArea secciones2;
    private javax.swing.JTextField secondspace;
    private javax.swing.JTextField thirdspace;
    private javax.swing.JTextField titulo;
    private javax.swing.JButton verde;
    private javax.swing.JButton verde1;
    private javax.swing.JButton verde2;
    // End of variables declaration//GEN-END:variables
}
