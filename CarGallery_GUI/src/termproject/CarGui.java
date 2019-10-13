/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termproject;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author cemal
 */
public class CarGui extends javax.swing.JFrame {

    Adminmenu adminCar;
    Customermenu customerCar;
    Customermenu mssgs;

    public CarGui() {
        initComponents();
        adminCar = new Adminmenu();
        customerCar = new Customermenu();
        mssgs = new Customermenu();
        AdminMenüPanel.setVisible(false);
        CustomerMenüPanel.setVisible(false);

    }

    /**
     * Admin girişi ID = Admin Password = Admin
     * User girisi ID cemal Password = 123
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypeCar = new javax.swing.ButtonGroup();
        AdminPanel = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        AdminLog = new javax.swing.JButton();
        UserLog = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AdminMenüPanel = new javax.swing.JPanel();
        txtVın = new javax.swing.JTextField();
        txtMake = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        txtSıd = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        MessButton = new javax.swing.JButton();
        Returnlog = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        Auto = new javax.swing.JRadioButton();
        Commer = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        CustomerMenüPanel = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        favoriButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        returnLog = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        searchPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        txtSearch = new javax.swing.JTextField();
        searchtxtButton = new javax.swing.JButton();
        favPanel = new javax.swing.JPanel();
        favButton = new javax.swing.JButton();
        txtFav = new javax.swing.JTextField();
        txtFavArea = new javax.swing.JScrollPane();
        txtResultFav = new javax.swing.JTextArea();
        deleteFav = new javax.swing.JButton();
        messagePanel = new javax.swing.JPanel();
        sendMessageButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Second Hand Car ");
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setResizable(false);

        AdminPanel.setMaximumSize(new java.awt.Dimension(1024, 600));
        AdminPanel.setMinimumSize(new java.awt.Dimension(1024, 600));
        AdminPanel.setName(""); // NOI18N
        AdminPanel.setPreferredSize(new java.awt.Dimension(1024, 600));
        AdminPanel.setLayout(null);
        AdminPanel.add(txtUsername);
        txtUsername.setBounds(410, 222, 225, 35);
        AdminPanel.add(txtPassword);
        txtPassword.setBounds(410, 275, 225, 35);

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        usernameLabel.setText("Username :");
        AdminPanel.add(usernameLabel);
        usernameLabel.setBounds(330, 230, 70, 14);

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        passwordLabel.setText("Password:");
        AdminPanel.add(passwordLabel);
        passwordLabel.setBounds(329, 285, 52, 14);

        AdminLog.setText("Admin");
        AdminLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogActionPerformed(evt);
            }
        });
        AdminPanel.add(AdminLog);
        AdminLog.setBounds(410, 328, 100, 51);

        UserLog.setText("Customer");
        UserLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLogActionPerformed(evt);
            }
        });
        AdminPanel.add(UserLog);
        UserLog.setBounds(535, 328, 100, 51);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N
        AdminPanel.add(jLabel2);
        jLabel2.setBounds(0, 0, 1024, 600);

        AdminMenüPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdminMenüPanel.setMaximumSize(new java.awt.Dimension(1024, 600));
        AdminMenüPanel.setMinimumSize(new java.awt.Dimension(1024, 600));
        AdminMenüPanel.setPreferredSize(new java.awt.Dimension(1024, 600));
        AdminMenüPanel.setLayout(null);
        AdminMenüPanel.add(txtVın);
        txtVın.setBounds(66, 31, 90, 25);
        txtVın.getAccessibleContext().setAccessibleName("txtVIN");

        AdminMenüPanel.add(txtMake);
        txtMake.setBounds(66, 79, 90, 25);
        AdminMenüPanel.add(txtModel);
        txtModel.setBounds(66, 134, 90, 25);
        AdminMenüPanel.add(txtYear);
        txtYear.setBounds(66, 184, 90, 25);
        AdminMenüPanel.add(txtKm);
        txtKm.setBounds(255, 31, 90, 25);
        AdminMenüPanel.add(txtSıd);
        txtSıd.setBounds(255, 79, 90, 25);
        AdminMenüPanel.add(txtPrice);
        txtPrice.setBounds(255, 134, 90, 25);

        jLabel3.setText("VIN :");
        AdminMenüPanel.add(jLabel3);
        jLabel3.setBounds(20, 30, 60, 14);

        jLabel4.setText("Make:");
        AdminMenüPanel.add(jLabel4);
        jLabel4.setBounds(20, 80, 110, 14);

        jLabel5.setText("Model:");
        AdminMenüPanel.add(jLabel5);
        jLabel5.setBounds(20, 140, 80, 14);

        jLabel6.setText("Year:");
        AdminMenüPanel.add(jLabel6);
        jLabel6.setBounds(20, 190, 50, 14);

        jLabel7.setText("Kilometer:");
        AdminMenüPanel.add(jLabel7);
        jLabel7.setBounds(174, 34, 80, 14);

        jLabel8.setText("Seller ID:");
        AdminMenüPanel.add(jLabel8);
        jLabel8.setBounds(174, 82, 80, 14);

        jLabel9.setText("Price:");
        AdminMenüPanel.add(jLabel9);
        jLabel9.setBounds(174, 137, 80, 14);

        AddButton.setText("Add ");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        AdminMenüPanel.add(AddButton);
        AddButton.setBounds(468, 78, 90, 23);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        AdminMenüPanel.add(UpdateButton);
        UpdateButton.setBounds(638, 78, 90, 23);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        AdminMenüPanel.add(DeleteButton);
        DeleteButton.setBounds(780, 78, 90, 23);

        MessButton.setText("Messages");
        MessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessButtonActionPerformed(evt);
            }
        });
        AdminMenüPanel.add(MessButton);
        MessButton.setBounds(896, 183, 110, 23);

        Returnlog.setText("Return log in page");
        Returnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnlogActionPerformed(evt);
            }
        });
        AdminMenüPanel.add(Returnlog);
        Returnlog.setBounds(864, 11, 150, 23);

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        AdminMenüPanel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 235, 1004, 300);

        TypeCar.add(Auto);
        Auto.setText("Automobile");
        AdminMenüPanel.add(Auto);
        Auto.setBounds(234, 183, 100, 23);

        TypeCar.add(Commer);
        Commer.setText("Commercial");
        AdminMenüPanel.add(Commer);
        Commer.setBounds(360, 183, 100, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        AdminMenüPanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 600);

        CustomerMenüPanel.setBackground(new java.awt.Color(153, 224, 229));
        CustomerMenüPanel.setMaximumSize(new java.awt.Dimension(1024, 600));
        CustomerMenüPanel.setMinimumSize(new java.awt.Dimension(1024, 600));
        CustomerMenüPanel.setPreferredSize(new java.awt.Dimension(1024, 600));

        searchButton.setText("Search car");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        favoriButton.setText("Add to Favorites");
        favoriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoriButtonActionPerformed(evt);
            }
        });

        sendButton.setText("Send message");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        returnLog.setText("Return Log in page");
        returnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnLogActionPerformed(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(42, 166, 235));
        jLayeredPane1.setMaximumSize(new java.awt.Dimension(824, 600));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(824, 600));

        searchPanel.setBackground(new java.awt.Color(153, 224, 229));
        searchPanel.setPreferredSize(new java.awt.Dimension(824, 600));

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane2.setViewportView(txtResult);

        searchtxtButton.setText("Search");
        searchtxtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                        .addComponent(searchtxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchtxtButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        favPanel.setBackground(new java.awt.Color(153, 224, 229));
        favPanel.setPreferredSize(new java.awt.Dimension(824, 600));

        favButton.setText("Add to Favorites");
        favButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favButtonActionPerformed(evt);
            }
        });

        txtResultFav.setColumns(20);
        txtResultFav.setRows(5);
        txtFavArea.setViewportView(txtResultFav);

        deleteFav.setText("Delete to Favorites");
        deleteFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout favPanelLayout = new javax.swing.GroupLayout(favPanel);
        favPanel.setLayout(favPanelLayout);
        favPanelLayout.setHorizontalGroup(
            favPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(favPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(favPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFavArea)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, favPanelLayout.createSequentialGroup()
                        .addComponent(txtFav, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(favButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(deleteFav, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        favPanelLayout.setVerticalGroup(
            favPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, favPanelLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(favPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, favPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(favButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteFav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFavArea, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        messagePanel.setBackground(new java.awt.Color(153, 224, 229));
        messagePanel.setPreferredSize(new java.awt.Dimension(824, 600));

        sendMessageButton.setText("Send");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane3.setViewportView(txtMessage);

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanelLayout.createSequentialGroup()
                        .addGap(0, 679, Short.MAX_VALUE)
                        .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        messagePanelLayout.setVerticalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane1.setLayer(searchPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(favPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(messagePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(favPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(favPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout CustomerMenüPanelLayout = new javax.swing.GroupLayout(CustomerMenüPanel);
        CustomerMenüPanel.setLayout(CustomerMenüPanelLayout);
        CustomerMenüPanelLayout.setHorizontalGroup(
            CustomerMenüPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerMenüPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(CustomerMenüPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(favoriButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CustomerMenüPanelLayout.setVerticalGroup(
            CustomerMenüPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerMenüPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(searchButton)
                .addGap(60, 60, 60)
                .addComponent(favoriButton)
                .addGap(60, 60, 60)
                .addComponent(sendButton)
                .addGap(60, 60, 60)
                .addComponent(returnLog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AdminMenüPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CustomerMenüPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AdminMenüPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CustomerMenüPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        AdminPanel.getAccessibleContext().setAccessibleName("loginPanel");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void clear() {
        txtVın.setText("");
        txtMake.setText("");
        txtModel.setText("");
        txtYear.setText("");
        txtKm.setText("");
        txtSıd.setText("");
        txtPrice.setText("");
        TypeCar.clearSelection();

    }

    public void cleartwo() {
        txtResult.setText("");
        txtSearch.setText("");
        txtFav.setText("");
    }


    private void AdminLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogActionPerformed
        if (txtUsername.getText().equalsIgnoreCase("Admin") && txtPassword.getText().equalsIgnoreCase("Admin")) {
            AdminPanel.setVisible(false);
            AdminMenüPanel.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(AdminPanel, "Username or Password incorrect");
        }


    }//GEN-LAST:event_AdminLogActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if (txtVın.getText().isEmpty() || txtMake.getText().isEmpty() || txtModel.getText().isEmpty()
                || txtYear.getText().isEmpty() || txtKm.getText().isEmpty() || txtSıd.getText().isEmpty() || txtPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(AdminPanel, "All boxes must fill");
        } else if (Commer.isSelected() == false && Auto.isSelected() == false) {
            JOptionPane.showMessageDialog(AdminPanel, "You must select car type");
        } else {
            if (Auto.isSelected()) {
                adminCar.addCarAuto(txtVın.getText(), txtMake.getText(), txtModel.getText(), parseInt(txtYear.getText()),
                        parseInt(txtKm.getText()), parseInt(txtSıd.getText()), parseDouble(txtPrice.getText()));
                clear();

            } else if (Commer.isSelected()) {
                adminCar.addCarCommer(txtVın.getText(), txtMake.getText(), txtModel.getText(), parseInt(txtYear.getText()),
                        parseInt(txtKm.getText()), parseInt(txtSıd.getText()), parseDouble(txtPrice.getText()));
                clear();

            }

        }
        txtArea.setText(adminCar.display());


    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if (txtVın.getText().isEmpty() || txtMake.getText().isEmpty() || txtModel.getText().isEmpty()
                || txtYear.getText().isEmpty() || txtKm.getText().isEmpty() || txtSıd.getText().isEmpty() || txtPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(AdminPanel, "All boxes must fill");
        } else {
            boolean success = adminCar.updateCar(txtVın.getText(), txtMake.getText(), txtModel.getText(), parseInt(txtYear.getText()),
                    parseInt(txtKm.getText()), parseInt(txtSıd.getText()), parseDouble(txtPrice.getText()));
            if (!success) {
                JOptionPane.showMessageDialog(AdminPanel, "Car could not be updated");
            } else {
                txtArea.setText(adminCar.display());
            }

        }
        clear();

    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if (txtVın.getText().isEmpty()) {
            JOptionPane.showMessageDialog(AdminPanel, "You must enter the VIN");
        } else {
            adminCar.deleteCar(txtVın.getText());
            txtArea.setText(adminCar.display());
            clear();
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void MessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessButtonActionPerformed
        if (customerCar.listsOfmessages().isEmpty()) {
            JOptionPane.showMessageDialog(AdminPanel, "You have currently no messages : 404 ");
        } else {
            txtArea.setText(customerCar.listsOfmessages());
            clear();
        }
    }//GEN-LAST:event_MessButtonActionPerformed

    private void ReturnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnlogActionPerformed
        AdminMenüPanel.setVisible(false);
        AdminPanel.setVisible(true);
        clear();
        txtUsername.setText("");
        txtPassword.setText("");

    }//GEN-LAST:event_ReturnlogActionPerformed

    private void UserLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLogActionPerformed
        if (txtUsername.getText().equalsIgnoreCase("cemal") && txtPassword.getText().equalsIgnoreCase("123")) {
            AdminPanel.setVisible(false);
            CustomerMenüPanel.setVisible(true);
            searchPanel.setVisible(false);
            favPanel.setVisible(false);
            messagePanel.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(AdminPanel, "Username or Password incorrect");
        }

    }//GEN-LAST:event_UserLogActionPerformed

    private void searchtxtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtButtonActionPerformed
        if (customerCar.searchSome(txtSearch.getText()).isEmpty()) {
            txtResult.setText("");
            JOptionPane.showMessageDialog(AdminPanel, "Not Found");
            txtSearch.setText("");

        } else {
            txtResult.setText(customerCar.searchSome(txtSearch.getText()));

        }
    }//GEN-LAST:event_searchtxtButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchPanel.setVisible(true);
        favPanel.setVisible(false);
        messagePanel.setVisible(false);
        cleartwo();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void favoriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoriButtonActionPerformed
        searchPanel.setVisible(false);
        favPanel.setVisible(true);
        messagePanel.setVisible(false);
        cleartwo();
    }//GEN-LAST:event_favoriButtonActionPerformed

    private void favButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favButtonActionPerformed
        favButton.setToolTipText("You must enter a VIN");
        deleteFav.setToolTipText("You must enter a VIN");
        boolean success = customerCar.addFavorites(txtFav.getText());
        if (!success) {
            JOptionPane.showMessageDialog(AdminPanel, "You didn't add to favorites");
            txtFav.setText("");

        } else {
            txtResultFav.setText(customerCar.listOfFavorites());
            txtFav.setText("");
        }
    }//GEN-LAST:event_favButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        searchPanel.setVisible(false);
        favPanel.setVisible(false);
        messagePanel.setVisible(true);
        cleartwo();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void returnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnLogActionPerformed
        CustomerMenüPanel.setVisible(false);
        cleartwo();
        AdminPanel.setVisible(true);
        txtUsername.setText("");
        txtPassword.setText("");

    }//GEN-LAST:event_returnLogActionPerformed

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        mssgs.addmessage(txtMessage.getText());
        txtMessage.setText("");
    }//GEN-LAST:event_sendMessageButtonActionPerformed

    private void deleteFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFavActionPerformed
        boolean success = customerCar.deleteFavorites(txtFav.getText());
        if (!success) {
            JOptionPane.showMessageDialog(AdminPanel, "You didn't delete to favorites");
            txtFav.setText("");

        } else {
            txtResultFav.setText(customerCar.listOfFavorites());
            txtFav.setText("");
        }
    }//GEN-LAST:event_deleteFavActionPerformed

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
            java.util.logging.Logger.getLogger(CarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CarGui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AdminLog;
    private javax.swing.JPanel AdminMenüPanel;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JRadioButton Auto;
    private javax.swing.JRadioButton Commer;
    private javax.swing.JPanel CustomerMenüPanel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton MessButton;
    private javax.swing.JButton Returnlog;
    private javax.swing.ButtonGroup TypeCar;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton UserLog;
    private javax.swing.JButton deleteFav;
    private javax.swing.JButton favButton;
    private javax.swing.JPanel favPanel;
    private javax.swing.JButton favoriButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel messagePanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton returnLog;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton searchtxtButton;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtFav;
    private javax.swing.JScrollPane txtFavArea;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextArea txtResultFav;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSıd;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtVın;
    private javax.swing.JTextField txtYear;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
