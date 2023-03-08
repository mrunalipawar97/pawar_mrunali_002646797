/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LibrarianWorkArea;

import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.UserAccount;
import BookGenre.Genre;
import Librarian.Librarian;
import LibraryAppSystem.Branch;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class GenreManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GenreManagementJPanel
     */
    
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    private Librarian librarian;
    DefaultTableModel tableModel;
    public GenreManagementJPanel() {
        initComponents();
    }

    GenreManagementJPanel(ApplicationSystem applicationSystem,  UserAccount userAccount, Librarian librarian) {
        initComponents();
        this.setVisible(true);
        this.applicationSystem = applicationSystem;
        this.branch = branch;
        this.librarian = librarian;
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel)Jtable.getModel();
        populateGenrecatelog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genreNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable = new javax.swing.JTable();
        addGenreButton = new javax.swing.JButton();
        AuthorHeaderjLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(genreNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, 30));

        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Genre Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Jtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 230, 210));

        addGenreButton.setText("ADD GENRE");
        addGenreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGenreButtonActionPerformed(evt);
            }
        });
        add(addGenreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 30));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARY MANAGEMENT SYSTEM - GENRE CATELOG ");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel1.setText("Genre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addGenreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGenreButtonActionPerformed
        // TODO add your handling code here:
      ArrayList<Genre> genreList=this.librarian.getGenreDirectory().getGenreLists();
            if(genreList.isEmpty()){
                    this.librarian.getGenreDirectory().createGenre(genreNameTextField.getText());
                    JOptionPane.showMessageDialog(null, "Genre Added");
                    populateGenrecatelog();  
            }else{
                for(Genre genre: genreList){
                    if(genreNameTextField.getText()!= genre.getGenreName()){
                       this.librarian.getGenreDirectory().createGenre(genreNameTextField.getText());
                        JOptionPane.showMessageDialog(null, "Genre Added.");
                        populateGenrecatelog();
                    }
                }
            }
    }//GEN-LAST:event_addGenreButtonActionPerformed

    public void populateGenrecatelog() {
        tableModel.setRowCount(0);
        for (Genre b : this.librarian.getGenreDirectory().getGenreLists()) {
            Object[] row = new Object[1];
            row[0] = b.getGenreName();
            tableModel.addRow(row);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JTable Jtable;
    private javax.swing.JButton addGenreButton;
    private javax.swing.JTextField genreNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
