package BlueHeavenRestaurant;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.print.PrinterException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.prompt.PromptSupport;


public class Order extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operations;
    
    double Bangladesh_taka = 1;
    double Biritish_pound = 0.010459;
    double Nigeria_Naira = 4;
    double Kenyan_Shilling = 1.292155;
    double US_Dollar = 0.012;
    double Philippine_peso = 0.617154;
    double Indian_Rupee = 0.85145;
    double Canadian_Dollar = 0.016753;
    double Brazilian_Real = 0.040856;
    private String tax_burger = null;
    private String tax_bear = null;
    private String total_burger_tk = null;
    private String total_bear_tk = null;
    private double total_price;

    public Order() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jlblCostOfDrinks = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtnMultiply = new javax.swing.JButton();
        jBtnDiv = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnEqual = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jBtnPlusSub = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jcmbCurrency = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setText(" ");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));
        jPanel2.setLayout(null);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setText(" ");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(317, 32, 129, 41);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setText(" ");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(317, 128, 129, 49);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chckenburger", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(10, 30, 92, 40);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(14, 138, 92, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Foods");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(14, 4, 52, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sandwitch", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(10, 80, 90, 40);

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jTextField1);
        jTextField1.setBounds(320, 80, 130, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 190, 460, 190);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));
        jPanel4.setLayout(null);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setText(" ");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jTextField7);
        jTextField7.setBounds(317, 139, 129, 39);

        jlblCostOfDrinks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jlblCostOfDrinks);
        jlblCostOfDrinks.setBounds(320, 30, 129, 36);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bear", "1", "2", "3", "4", "5" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox4);
        jComboBox4.setBounds(14, 42, 141, 36);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Drinks");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(22, 14, 59, 22);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spite", "1", "2", "3", "4", "5" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox5);
        jComboBox5.setBounds(14, 139, 141, 39);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocola", "1", "2", "3", "4", "5" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox6);
        jComboBox6.setBounds(14, 89, 141, 39);

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jTextField5);
        jTextField5.setBounds(320, 80, 130, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 390, 460, 190);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));
        jPanel5.setLayout(null);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setText(" ");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField9);
        jTextField9.setBounds(198, 15, 129, 43);

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField10.setText(" ");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField10);
        jTextField10.setBounds(198, 313, 129, 53);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Total");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(26, 344, 45, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tax");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(26, 156, 33, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Sub Total");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(14, 15, 84, 22);

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField11.setText(" ");
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField11);
        jTextField11.setBounds(198, 143, 129, 49);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(470, 190, 410, 390);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel8.setBackground(new java.awt.Color(204, 204, 0));
        jPanel8.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 287, 420);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1);
        jButton1.setBounds(10, 426, 55, 23);

        jTabbedPane1.addTab("Receipt", jPanel8);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtnMultiply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMultiply.setText("*");
        jBtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplyActionPerformed(evt);
            }
        });

        jBtnDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDiv.setText("/");
        jBtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMinus.setText("-");
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Wingdings 3", 1, 18)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BlueHeavenRestaurant/1475683621_ChevronLeft.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDot.setText(".");
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtnEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnEqual.setText("=");
        jBtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setText("C");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jBtnPlusSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnPlusSub.setText("+/-");
        jBtnPlusSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusSubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDisplay)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPlusSub, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jBtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jBtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(4, 4, 4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPlusSub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calculator", jPanel1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(920, 150, 320, 500);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));
        jPanel9.setLayout(null);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4);
        jButton4.setBounds(352, 18, 83, 31);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Receipt");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5);
        jButton5.setBounds(182, 18, 101, 31);

        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnExit.setText("Exit");
        jPanel9.add(jBtnExit);
        jBtnExit.setBounds(513, 18, 67, 31);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 590, 880, 60);

        jcmbCurrency.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philippine", "Bangladesh" }));
        jcmbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrencyActionPerformed(evt);
            }
        });
        getContentPane().add(jcmbCurrency);
        jcmbCurrency.setBounds(0, 150, 141, 28);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 4));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("BLUE HEAVEN RESTAURANT");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(249, 27, 847, 58);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BlueHeavenRestaurant/leftarrow1.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(4, 8, 79, 56);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BlueHeavenRestaurant/right arrow.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(89, 8, 75, 56);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1240, 140);

        setSize(new java.awt.Dimension(1254, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn7.getText();
        jtxtDisplay.setText(Enternumber);

    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn8.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn9.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn4.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn5.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn6.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn1.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn2.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn3.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn0.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jtxtDisplay.setText(null);

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String backspace = null;

        if (jtxtDisplay.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
            backspace = strB.toString();
            jtxtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtnDot.getText());
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jBtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_jBtnDivActionPerformed

    private void jBtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiplyActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jBtnMultiplyActionPerformed

    private void jBtnPlusSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusSubActionPerformed
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnPlusSubActionPerformed

    private void jBtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualActionPerformed
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if (operations == "+") {
            result = firstnum + secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        } else if (operations == "-") {
            result = firstnum - secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        } else if (operations == "*") {
            result = firstnum * secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        } else if (operations == "/") {
            result = firstnum / secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        } else if (operations == "%") {
            result = firstnum % secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
    }//GEN-LAST:event_jBtnEqualActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jcmbCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrencyActionPerformed


    }//GEN-LAST:event_jcmbCurrencyActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
       
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        
    }//GEN-LAST:event_jTextField10ActionPerformed





                           
    
    
            
            
            
            
                                     



                                        // Finished jcombobox2 for chicken burger
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
            JOptionPane.showMessageDialog(this, "You should select country!");
        } else if (jComboBox1.getSelectedItem().equals("1")) {//if catagory 1
            int conv_nt = Integer.valueOf((String) jComboBox1.getSelectedItem());
            double price = 80;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("USA")) {
                String set_tk1 = String.format("% .2f", total_price * US_Dollar);
                jTextField1.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jTextField1.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jTextField1.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 12.5;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }
        } 
         
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       

        if (jComboBox2.getSelectedItem().equals("Chickenburger")) {
            jTextArea1.setText("Country:\t" + jcmbCurrency.getSelectedItem() + "\nBurger quantity:\t" + jComboBox4.getSelectedItem() + "\nBurger price:\t" + jlblCostOfDrinks.getText() + "\n\nSub total:\t" + jTextField9.getText() + "\n Tax:\t" + jTextField11.getText() + "\nTotal:\t" + jTextField10.getText());

        } 
        else if (jComboBox4.getSelectedItem().equals("Bear")) {
            jTextArea1.setText("Country:\t" + jcmbCurrency.getSelectedItem() + "\nBear quantity:\t" + jComboBox2.getSelectedItem() + "\nBear price:\t" + jTextField2.getText() + "\n\nSub total:\t" + jTextField9.getText() + "\n Tax:\t" + jTextField11.getText() + "\nTotal:\t" + jTextField10.getText());
         }
          
         
         else {
            jTextArea1.setText("Country:\t" + jcmbCurrency.getSelectedItem() + "\nBurger quantity:\t" + jComboBox2.getSelectedItem() + "\nBurger price:\t" + jTextField2.getText() +  "\n\nCountry:\t" + jcmbCurrency.getSelectedItem() + "\nBear quantity:\t" + jComboBox4.getSelectedItem() + "\nBear price:\t" + jlblCostOfDrinks.getText() + "\n\nSub total:\t" + jTextField9.getText() + "\n Tax:\t" + jTextField11.getText() + "\nTotal:\t" + jTextField10.getText());

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

        if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
            JOptionPane.showMessageDialog(this, "You should select country!");
        } else if (jComboBox4.getSelectedItem().equals("1")) {//if catagory 1
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("USA")) {
                String set_tk1 = String.format("% .2f", total_price * US_Dollar);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 12.5;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }
        } else if (jComboBox4.getSelectedItem().equals("2")) {//if catagory 2
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("USA")) {
                String set_tk1 = String.format("% .2f", total_price * US_Dollar);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 12.5;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }

        }
        else if (jComboBox4.getSelectedItem().equals("3")) {//if catagory 3
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("USA")) {
                String set_tk1 = String.format("% .2f", total_price * US_Dollar);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 12.5;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }

        }
          else if (jComboBox4.getSelectedItem().equals("4")) {//if catagory 4
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("USA")) {
                String set_tk1 = String.format("% .2f", total_price * US_Dollar);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 12.5;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }

        }
          else if (jComboBox4.getSelectedItem().equals("5")) {//if catagory 5
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("USA")) {
                String set_tk1 = String.format("% .2f", total_price * US_Dollar);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 12.5;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }

        }
        
        //chosse bangladesh
        if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
            JOptionPane.showMessageDialog(this, "You should select country!");
        } else if (jComboBox4.getSelectedItem().equals("1")) {//if catagory 1
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {
                String set_tk1 = String.format("% .2f", total_price * Bangladesh_taka);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 1000;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }
        } else if (jComboBox4.getSelectedItem().equals("2")) {//if catagory 2
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {
                String set_tk1 = String.format("% .2f", total_price * Bangladesh_taka);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 1000;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }

        }
        else if (jComboBox4.getSelectedItem().equals("3")) {//if catagory 3
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {
                String set_tk1 = String.format("% .2f", total_price * Bangladesh_taka);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 1000;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }

        }
          else if (jComboBox4.getSelectedItem().equals("4")) {//if catagory 4
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {
                String set_tk1 = String.format("% .2f", total_price * Bangladesh_taka);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 1000;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }

        }
          else if (jComboBox4.getSelectedItem().equals("5")) {//if catagory 5
            int conv_nt = Integer.valueOf((String) jComboBox4.getSelectedItem());
            double price = 550;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {
                String set_tk1 = String.format("% .2f", total_price * Bangladesh_taka);
                jlblCostOfDrinks.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jlblCostOfDrinks.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jlblCostOfDrinks.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 12.5;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }

        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jlblCostOfDrinks.setText("");
        jTextField9.setText("");
        jTextField11.setText("");
        jTextField2.setText("");
        jTextField10.setText("");
        jTextField5.setText("");
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField7.setText("");
        jTextArea1.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Boolean b = jTextArea1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
         if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
            JOptionPane.showMessageDialog(this, "You should select country!");
        } else if (jComboBox6.getSelectedItem().equals("1")) {//if catagory 1
            int conv_nt = Integer.valueOf((String) jComboBox6.getSelectedItem());
            double price = 60;
            total_price = price * conv_nt;

            if (jcmbCurrency.getSelectedItem().equals("USA")) {
                String set_tk1 = String.format("% .2f", total_price * US_Dollar);
                jTextField5.setText(set_tk1);

                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField9.setText(jTextField5.getText());//sub total

                    } else {
                        double test = Double.parseDouble(jTextField2.getText()) + Double.parseDouble(jTextField5.getText());//duta jog kore set korlam
                        String test_set = String.format("%.5f", test);
                        jTextField9.setText(test_set);//sub total

                    }
                    double tk = Double.parseDouble(set_tk1);//tax calculate
                    double all_t = tk / 12.5;
                    tax_bear = String.format("%.5f", all_t);
                    if (jTextField2.getText().trim().isEmpty()) {

                        jTextField11.setText(tax_bear);//set tax

                    } else {
                        double test_tax = Double.parseDouble(tax_bear) + Double.parseDouble(tax_burger);//duta jog kore set korlam
                        String tax_set = String.format("%.5f", test_tax);
                        jTextField11.setText(tax_set);//set tax

                    }

                    double convert_tk = Double.parseDouble(set_tk1);
                    double total = convert_tk + all_t;
                    total_bear_tk = String.format("%.5f", total);

                    if (jTextField2.getText().trim().isEmpty()) {
                        jTextField10.setText(total_bear_tk);
                    } else {
                        double total_tk = Double.parseDouble(total_bear_tk) + Double.parseDouble(total_burger_tk);//duta jog kore set korlam
                        String total_taka = String.format("%.5f", total_tk);
                        jTextField10.setText(total_taka);

                    }

                } catch (NumberFormatException err) {
                    err.printStackTrace();
                }

            }
        }        
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          
     HOMEFORM hj=new HOMEFORM();
    hj.setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
     HOMEFORM hj=new HOMEFORM();
    hj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        if (evt.getSource() == jComboBox2) {

            if(jcmbCurrency.getSelectedItem().equals("Choose One")) {
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("1")) {
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() ;
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("2")) {//if catagory 2
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("3")) {//if catagory 3
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("4")) {//if catagory 4
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("5")) {//if catagory 5
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("6")) {//if catagory 6
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("7")) {//if catagory 7
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("8")) {//if catagory 8
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("9")) {//if catagory 9
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("10")) {//if catagory 10
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("USA")) {

                    String set_tk = String.format("% .2f", total_price * US_Dollar);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 12.5;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }

        // choose bangladesh

        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("1")) {//if catagory 1
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("2")) {//if catagory 2
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("3")) {//if catagory 3
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("4")) {//if catagory 4
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("5")) {//if catagory 5
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("6")) {//if catagory 6
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("7")) {//if catagory 7
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("8")) {//if catagory 8
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price *Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("9")) {//if catagory 9
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }
        if (evt.getSource() == jComboBox2) {//check combobox

            if (jcmbCurrency.getSelectedItem().equals("Choose One")) {//check tk is not selected
                JOptionPane.showMessageDialog(this, "You should select country!");
            } else if (jComboBox2.getSelectedItem().equals("10")) {//if catagory 10
                int conv_nt = Integer.valueOf((String) jComboBox2.getSelectedItem());
                double price = 50;
                double total_price = price * conv_nt;

                if (jcmbCurrency.getSelectedItem().equals("Bangladesh")) {

                    String set_tk = String.format("% .2f", total_price * Bangladesh_taka);
                    jTextField2.setText(set_tk);

                    String test = jTextField2.getText() + jlblCostOfDrinks.getText();
                    jTextField9.setText(test);

                    try {

                        double tk = Double.parseDouble(set_tk);//tax calculate
                        double all_t = tk / 1000;
                        tax_burger = String.format("%.5f", all_t);
                        jTextField11.setText(tax_burger);//set tax
                        double convert_tk = Double.parseDouble(set_tk);

                        double total = convert_tk + all_t;
                        total_burger_tk = String.format("%.5f", total);
                        jTextField10.setText(total_burger_tk);

                    } catch (NumberFormatException err) {
                        err.printStackTrace();
                    }

                }
            }
        }

    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Order o = new Order();
                o.setVisible(true);
                o.setSize(1270, 1000);
                o.setLocationRelativeTo(o);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnDiv;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEqual;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMultiply;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jBtnPlusSub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JComboBox<String> jcmbCurrency;
    private javax.swing.JLabel jlblCostOfDrinks;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
