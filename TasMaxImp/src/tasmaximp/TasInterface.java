/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasmaximp;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author elias
 */
public class TasInterface extends javax.swing.JFrame {

    //My Code .......
    static int i = 0, j = 0, x = 408, y = 30, nbr = 0, x_save;
    int a, b;

    public void MyFathers(int position) {
        if (position != 0) {
            System.err.println(tas.list.get(position).getText());
            tas.list.get(position).setForeground(Color.BLUE);
            if (position % 2 == 0) {
                position = (position / 2) - 1;
            } else {
                position = position / 2;
            }
            MyFathers(position);
        } else {
            tas.list.get(position).setForeground(Color.BLUE);
        }
    }

    public void Refrech(int count) {
        if (count < tas.list.size()) {
            tas.list.get(count).setForeground(Color.BLACK);
            count++;
            Refrech(count);
        }
    }

    public int Where_Is(String value) {
        int k = 0;
        boolean logic = false;
        while (k < tas.list.size() && !logic) {
            if (tas.list.get(k).getText().equals(value)) {
                logic = true;
            }
            k++;
        }
        k--;
        if (logic) {
            return k;
        } else {
            return -1;
        }
    }

    public void draw_noad() {

        if (nbr == 0) {
            x_save = x;
            x = x - 20;
        }

        nd.setBounds(x, y, 30, 30);
        panel.add(nd);
        panel.updateUI();
        nbr++;
        x = x + 40;
    }

    public void Delete_Max(int indice) throws InterruptedException {

        if (indice < (tas.list.size() - 1) / 2) {
            int max = Math.max(Integer.parseInt(tas.list.get(2 * indice + 1).getText()),
                    Integer.parseInt(tas.list.get(2 * indice + 2).getText()));
            tas.list.get(indice).setForeground(Color.BLUE);
            tas.list.get(indice).setText(max + "");
            if (max + "" == tas.list.get(2 * indice + 1).getText()) {
                indice = 2 * indice + 1;
            } else {
                indice = 2 * indice + 2;
            }

            Thread.sleep(1000);
            Delete_Max(indice);
        }
        tas.list.get(indice).setText("-1");
        tas.list.remove(indice);

    }

    public void ChengePostion(int argOne, int argTow, String TextargOne) {
        try {
            Thread.sleep(100);
            tas.list.get(argOne).setText(tas.list.get(argTow).getText());
            tas.list.get(argTow).setText(TextargOne);
        } catch (InterruptedException ex) {
            Logger.getLogger(TasInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //..............
    public TasInterface() {
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

        jButton4 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        nd = new javax.swing.JLabel();
        Val_Insert = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        ExtMin = new javax.swing.JButton();
        Val_x = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SommeLebel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SupperX = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        ExtMax = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        InferX = new javax.swing.JLabel();
        MaxsLable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        valSearch = new javax.swing.JTextField();
        Existe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(920, 450));
        setMinimumSize(new java.awt.Dimension(920, 450));
        setResizable(false);

        jButton4.setText("Ajouter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        panel.setMinimumSize(new java.awt.Dimension(278, 212));
        panel.setPreferredSize(new java.awt.Dimension(278, 212));

        nd.setBackground(new java.awt.Color(152, 8, 8));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nd)
                .addGap(422, 422, 422))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nd)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        Val_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Val_InsertActionPerformed(evt);
            }
        });

        jButton7.setText("Refrech");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        ExtMin.setText("Extraire Min");
        ExtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtMinActionPerformed(evt);
            }
        });

        jButton8.setText("Random");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setText("Afficher Max's");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("X :");

        jButton6.setText("<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        ExtMax.setText("Extraire Max");
        ExtMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtMaxActionPerformed(evt);
            }
        });

        jButton3.setText("Afficher Somme");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText(">");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Garuda", 1, 12)); // NOI18N
        jLabel4.setText("Devloped By .:FerhatHamza:. ");

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(SommeLebel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton3))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(MaxsLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(Val_x, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SupperX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InferX, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExtMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExtMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addComponent(valSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addGap(3, 3, 3)
                        .addComponent(Existe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(Val_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(356, 356, 356))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton1)
                        .addComponent(jButton9)
                        .addComponent(valSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Existe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Val_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SommeLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaxsLable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ExtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExtMax)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton5)
                                .addComponent(Val_x, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SupperX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(InferX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Somme ....................

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int k = 0, some = 0;
        while (k < tas.list.size()) {
            some = some + Integer.parseInt(tas.list.get(k).getText());
            k++;
        }
        SommeLebel.setText("S = " + some);
    }//GEN-LAST:event_jButton3ActionPerformed

// End Somme ....................

    private void Val_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Val_InsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Val_InsertActionPerformed

//  InsertValeur ..........................

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Val = "";
        int La, Espace = 0;
        for (La = 0; La < tas.list.size(); La++) {
            Val = tas.list.get(La).getText();
            if (Val == " ") {
                Espace = La;
                break;
            }
        }
        if (Espace != 0) {
            tas.list.get(Espace).setText(Val_Insert.getText());
        } else {
            int size = 0, id = 0;
            if (!Val_Insert.getText().isEmpty()) {
                nd = new JLabel(Val_Insert.getText());
                tas.list.add(nd);
                int k = 0;
                tas.list.get(tas.list.size() - 1).setForeground(Color.red);
                while (k <= tas.list.size() - 2) {
                    tas.list.get(k).setForeground(Color.BLACK);
                    k++;
                }
                if (tas.list.size() >= 1) {
                    size = tas.list.size() - 1;
                    b = Integer.parseInt(tas.list.get(size).getText());

                    if (size % 2 == 0) {
                        id = (size / 2) - 1;
                    } else {
                        id = (size / 2);
                    }

                    if (i > 0) {

                        a = Integer.parseInt(tas.list.get(id).getText());

                        if (a < b) {
                            tas.list.get(id).setText(b + "");
                            tas.list.get(size).setText(a + "");
                        }
                    }

                }

                if (i == 0) {
                    nd.setText(tas.list.get(0).getText());
                    nd.setBounds(x, y - 30, 30, 30);
                    panel.add(nd);
                    panel.updateUI();
                    i++;
                } else {
                    if (nbr < Math.pow(2, i)) {
                        draw_noad();
                    } else {
                        nbr = 0;
                        x = x_save;
                        y = 50 + y;
                        x = x - 40 * i;
                        i++;
                        draw_noad();
                    }
                }
                panel.updateUI();
            }

            
        }
        Val_Insert.setText("");
        panel.updateUI();
    }//GEN-LAST:event_jButton4ActionPerformed

//  End..InsertValeur ..........................
//  UpDate ...............................

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            int k = 0;
            
            boolean logicOne = true, logicTow = true;
            while (k < (tas.list.size() - 1) / 2) {
                if (Integer.parseInt(tas.list.get(k).getText()) < Integer.parseInt(tas.list.get(2 * k + 1).getText())) {
                    logicOne = false;
                }
                if (!logicOne) {
                    tas.list.get(k).setForeground(Color.blue);
                    tas.list.get(2 * k + 1).setForeground(Color.blue);
                    ChengePostion(k, 2 * k + 1, tas.list.get(k).getText());
                    break;
                } else {
                    if (Integer.parseInt(tas.list.get(k).getText()) < Integer.parseInt(tas.list.get(2 * k + 2).getText())) {
                        logicTow = false;
                    }
                    if (!logicTow) {
                        tas.list.get(k).setForeground(Color.blue);
                        tas.list.get(2 * k + 2).setForeground(Color.blue);
                        ChengePostion(k, 2 * k + 2, tas.list.get(k).getText());
                        break;
                    }
                }
                k++;
            }
            panel.updateUI();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton7ActionPerformed

// End .. UpDate .......................
// Extrair Min ........................

    private void ExtMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtMinActionPerformed

        int k = (tas.list.size() - 1) / 2, save_min = k;
        int min = Integer.parseInt(tas.list.get(k).getText());

        while (k < tas.list.size()) {
            if (min > Integer.parseInt(tas.list.get(k).getText())) {
                min = Integer.parseInt(tas.list.get(k).getText());
                save_min = k;
            }
            k++;
        }
        int Al = save_min;
        int i = Al + 1;
        String ParmString = "";
        System.out.println("ExtrairMin" + save_min);

        while (Al < tas.list.size() - 1 && i < tas.list.size()) {
            ParmString = tas.list.get(Al).getText();
            tas.list.get(Al).setText(tas.list.get(i).getText());
            tas.list.get(i).setText(ParmString);
            i++;
            Al++;
        }
        tas.list.get(i - 1).setText(" ");
        System.out.println("ExtrairMin" + tas.list.size());
    }//GEN-LAST:event_ExtMinActionPerformed
    // End Extrair Min ....................

// Les Valure Max De Tas ..................

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int IndiceMoyneTab = (tas.list.size()) / 2;
        int Length = tas.list.size();
        String Max_s = "";
        for (int cmp = 0; cmp < IndiceMoyneTab; cmp++) {
            Max_s = Max_s + tas.list.get(cmp).getText() + ",";
        }
        MaxsLable.setText("    " + Max_s);
    }//GEN-LAST:event_jButton2ActionPerformed

// End  Les Valure Max De Tas ..............   
//  Les Valure Max a X ..............    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int Length = tas.list.size(), cmp = 0, X = Integer.parseInt(Val_x.getText());
        String Max_sX = "";

        while (cmp < Length) {
            int NodeVal = Integer.parseInt(tas.list.get(cmp).getText());
            if (X < NodeVal) {
                Max_sX = Max_sX + tas.list.get(cmp).getText() + ",";
                cmp++;
            } else {
                cmp++;
            }
        }
        SupperX.setText("    " + Max_sX);
    }//GEN-LAST:event_jButton5ActionPerformed
// End Les Valure Max a X .............. 

// Les Valure Min a X ..................    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int Length = tas.list.size(), cmp = 0, X = Integer.parseInt(Val_x.getText());
        String Min_sX = "";

        while (cmp < Length) {
            int NodeVal = Integer.parseInt(tas.list.get(cmp).getText());
            if (X > NodeVal) {
                Min_sX = Min_sX + tas.list.get(cmp).getText() + ",";
                cmp++;
            } else {
                cmp++;
            }
        }
        InferX.setText("    " + Min_sX);
    }//GEN-LAST:event_jButton6ActionPerformed
// End Les Valure Min a X ..............

// Creat Random Tas ............ 
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Random randNum = new Random();      
        for (int s = 0; s < 7; s++) {
            int randomNum = randNum.nextInt((100 - s) + 1) + s;
            int rand = randomNum;
            String val = String.valueOf(rand);
            int size = 0, id = 0;
            nd = new JLabel(val);
            tas.list.add(nd);
            int k = 0;
            tas.list.get(tas.list.size() - 1).setForeground(Color.red);
            while (k <= tas.list.size() - 2) {
                tas.list.get(k).setForeground(Color.BLACK);
                k++;
            }
            if (tas.list.size() >= 1) {
                size = tas.list.size() - 1;
                b = Integer.parseInt(tas.list.get(size).getText());
                if (size % 2 == 0) {
                    id = (size / 2) - 1;
                } else {
                    id = (size / 2);
                }

                if (i > 0) {
                    a = Integer.parseInt(tas.list.get(id).getText());
                    if (a < b) {
                        tas.list.get(id).setText(b + "");
                        tas.list.get(size).setText(a + "");
                    }
                }

            }

            if (i == 0) {
                nd.setText(tas.list.get(0).getText());
                nd.setBounds(x, y - 20, 30, 30);
                panel.add(nd);
                panel.updateUI();
                i++;
            } else {
                if (nbr < Math.pow(2, i)) {
                    draw_noad();
                } else {
                    nbr = 0;
                    x = x_save;
                    y = 50 + y;
                    x = x - 40 * i;
                    i++;
                    draw_noad();
                }
            }
            
            panel.updateUI();
            
        }
   
    }//GEN-LAST:event_jButton8ActionPerformed

// End Creat Random Tas ...........

    private void ExtMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtMaxActionPerformed

        int Al = 0;
        int i = Al + 1;
        String ParmString = "";
        while (Al < tas.list.size() - 1 && i < tas.list.size()) {
            ParmString = tas.list.get(Al).getText();
            tas.list.get(Al).setText(tas.list.get(i).getText());
            tas.list.get(i).setText(ParmString);
            i++;
            Al++;
        }
        tas.list.get(i - 1).setText(" ");
    }//GEN-LAST:event_ExtMaxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String Valsearch = valSearch.getText();
        int x = Where_Is(Valsearch);
        if (x != -1) {
            Existe.setText("  Valeur exist in indice " + (x + 1));
            tas.list.get(x).setForeground(Color.MAGENTA);
            valSearch.setText("");

        } else {
            Existe.setText("  Valeur " + Valsearch + " n'exist pas. ");
            valSearch.setText("");
        }

    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TasInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TasInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TasInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TasInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TasInterface TasInterface = new TasInterface();
                TasInterface.setVisible(true);
                TasInterface.setTitle("Tas Max Implementation");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Existe;
    private javax.swing.JButton ExtMax;
    private javax.swing.JButton ExtMin;
    private javax.swing.JLabel InferX;
    private javax.swing.JLabel MaxsLable;
    private javax.swing.JLabel SommeLebel;
    private javax.swing.JLabel SupperX;
    private javax.swing.JTextField Val_Insert;
    private javax.swing.JTextField Val_x;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nd;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField valSearch;
    // End of variables declaration//GEN-END:variables
}
