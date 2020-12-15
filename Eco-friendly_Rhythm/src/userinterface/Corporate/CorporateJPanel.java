/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Corporate;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Organization.HeadquatersOrganization;
import Business.Organization.Organization;
import Business.User.User;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PlantationWorkRequest;
import Business.WorkQueue.SocialWorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import userinterface.Volunteer.InformerJPanel;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class CorporateJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private User user;
    private Organization org;
    EcoSystem system;

    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form CorporateJPanel
     */
    public CorporateJPanel(JPanel userProcessContainer, UserAccount account, Organization org, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        user = account.getUser();
        this.org = org;
        this.system = business;
        txtName.setText(user.getName());
        txtEmail.setText(user.getEmailId());
        txtZipcode.setText(user.getZip());
        dpDoB.setDate(user.getDateOfBirth());
        if (user.getGender() != null) {
            if (user.getGender().equals("Male")) {
                CbGender.setSelectedIndex(0);
            } else {
                CbGender.setSelectedIndex(1);
            }
        }
        txtContact.setText(user.getContactNumber());
        if (user.getProfilePicture() != null) {
            profile.setIcon(new ImageIcon(user.getProfilePicture()));
        }
        username1.setText("Welcome " + user.getUserName() + "!");
        populateCombo();
        populateHistoryTable();
    }

    private void populateCombo() {
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        dm.addElement("Male");
        dm.addElement("Female");
        CbGender.setModel(dm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblName1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblGender1 = new javax.swing.JLabel();
        CbGender = new javax.swing.JComboBox<>();
        lblDoB1 = new javax.swing.JLabel();
        lblZipcode1 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        lblContact1 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnProfile = new javax.swing.JButton();
        profile = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        dpDoB = new org.jdesktop.swingx.JXDatePicker();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        logout2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTrees = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        btnRequest = new javax.swing.JButton();
        dpDate = new org.jdesktop.swingx.JXDatePicker();
        logout3 = new javax.swing.JLabel();

        jTabbedPane1.setBackground(new java.awt.Color(0, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblName1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("Name:");

        txtName.setEnabled(false);

        lblName2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblName2.setForeground(new java.awt.Color(255, 255, 255));
        lblName2.setText("Email:");

        txtEmail.setEditable(false);
        txtEmail.setEnabled(false);

        lblGender1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblGender1.setForeground(new java.awt.Color(255, 255, 255));
        lblGender1.setText("Gender:");

        CbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbGender.setEnabled(false);

        lblDoB1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblDoB1.setForeground(new java.awt.Color(255, 255, 255));
        lblDoB1.setText("Date of Birth:");

        lblZipcode1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblZipcode1.setForeground(new java.awt.Color(255, 255, 255));
        lblZipcode1.setText("Zipcode:");

        txtZipcode.setEnabled(false);

        lblContact1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblContact1.setForeground(new java.awt.Color(255, 255, 255));
        lblContact1.setText("Contact Number:");

        txtContact.setEnabled(false);

        btnProfile.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnProfile.setText("Choose Profile Picture");
        btnProfile.setEnabled(false);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        profile.setOpaque(true);

        username1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setText("Welcome <username>!");

        logout1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblName1)
                                .addComponent(lblName2)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtEmail)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDoB1)
                                    .addComponent(lblZipcode1))
                                .addGap(16, 16, 16))
                            .addComponent(lblContact1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dpDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtContact)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btnProfile)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(111, 111, 111)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout1)
                    .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName2)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender1)
                            .addComponent(CbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoB1)
                    .addComponent(dpDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfile))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipcode1)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContact1))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Profile", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        tblHistory.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "HeadquaterManager Assigned", "Zipcode", "Tree count", "Care taker Assigned", "Status", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblHistory);

        logout2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("History", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Zipcode:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Number of trees(Approx.):");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date:");

        txtTrees.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        txtZip.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        btnRequest.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnRequest.setText("Raise Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        logout3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        logout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel1)
                                .addGap(151, 151, 151)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dpDate, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txtTrees)
                                    .addComponent(txtZip)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(381, 381, 381)
                                .addComponent(btnRequest)))
                        .addGap(0, 300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logout3)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(278, 278, 278)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addContainerGap(487, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout3)
                .addGap(141, 141, 141)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(txtTrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnRequest)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(jLabel2)
                    .addGap(34, 34, 34)
                    .addComponent(jLabel3)
                    .addContainerGap(276, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Social", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        JFileChooser jFC = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());
        jFC.setFileFilter(imageFilter);
        int chosenFile = jFC.showOpenDialog(null);
        if (chosenFile == JFileChooser.APPROVE_OPTION) {
            File file = jFC.getSelectedFile();
            try {
                BufferedImage img = null;
                user.setProfilePicture(file.getAbsolutePath());
                System.out.println(file.getAbsolutePath());
                img = ImageIO.read(file);
                Image resizedImg = img.getScaledInstance(80,
                        60, Image.SCALE_SMOOTH);
                profile.setIcon(new ImageIcon(resizedImg));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnProfileActionPerformed

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logout1MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEnabled(true);
        txtZipcode.setEnabled(true);
        txtContact.setEnabled(true);
        btnProfile.setEnabled(true);
        CbGender.setEnabled(true);
        dpDoB.setEnabled(true);

        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        user.setName(txtName.toString());
        user.setGender(CbGender.toString());
        user.setContactNumber(txtContact.toString());
        user.setZip(txtZipcode.toString());
        user.setDateOfBirth(dpDoB.getDate());
        try {
            int num = Integer.parseInt(txtContact.getText());
            int zip = Integer.parseInt(txtZipcode.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter valid Numbers!", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtName.getText() == null || txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Valid Name!", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (new Date().compareTo(dpDoB.getDate()) < 0) {
            JOptionPane.showMessageDialog(null, "Enter Valid DOB!", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (user.getContactNumber() != null && user.getZip() != null && user.getDateOfBirth() != null && user.getProfilePicture() != null) {
            user.setCompleteProfile(true);
        }
        txtName.setEnabled(false);
        txtZipcode.setEnabled(false);
        txtContact.setEnabled(false);
        btnProfile.setEnabled(false);
        CbGender.setEnabled(false);
        dpDoB.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        if (user.isCompleteProfile() == false) {
            JOptionPane.showMessageDialog(null, "Please complete your profile first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SocialWorkRequest request = new SocialWorkRequest();
        request.setDate(dpDate.getDate());
        request.setOrg(org);
        request.setUser(user);
        request.setStatus("Request Raised.");
        request.setTreeCount(Integer.parseInt(txtTrees.getText().toString()));
        request.setZipcode(txtZip.getText());
        request.setType("Social Work");
        user.addSocialRequest(request);

        Organization org = null;
        for (Enterprise e : user.getNetwork().getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof HeadquatersOrganization) {
                    org = o;
                    break;
                }
            }
        }
        if (org != null) {
            System.out.println(org.getClass());
            org.getWorkQueue().getSocialList().add(request);
            JOptionPane.showMessageDialog(null, "Request Sent Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtZip.setText("");
        txtTrees.setText("");

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnRequestActionPerformed

    private void logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseClicked
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logout2MouseClicked

    private void logout3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout3MouseClicked
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logout3MouseClicked

    public void populateHistoryTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblHistory.getModel();
        dtm.setRowCount(0);
        for (SocialWorkRequest request : user.getSocialRequestList()) {
            System.out.println("inside social loop");
            Object row[] = new Object[6];
            row[0] = request.getManager().getName();
            row[1] = request;
            row[2] = request.getTreeCount();
            row[3] = request.getCareTaker().getName();
            row[4] = request.getStatus();
            row[5] = request.getType();
            dtm.addRow(row);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbGender;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private org.jdesktop.swingx.JXDatePicker dpDate;
    private org.jdesktop.swingx.JXDatePicker dpDoB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblContact1;
    private javax.swing.JLabel lblDoB1;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblZipcode1;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel logout2;
    private javax.swing.JLabel logout3;
    private javax.swing.JLabel profile;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTrees;
    private javax.swing.JTextField txtZip;
    private javax.swing.JTextField txtZipcode;
    private javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables

}
