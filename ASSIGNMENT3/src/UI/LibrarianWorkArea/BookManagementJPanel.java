/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LibrarianWorkArea;

import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.UserAccount;
import BookAuthor.Author;
import BookGenre.Genre;
import Books.Book;
import Librarian.Librarian;
import Librarian.Branch;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class BookManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookManagementJPanel
     */
    
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    private Librarian librarian;
    DefaultTableModel tableModel;
    
    public BookManagementJPanel() {
        initComponents();
    }

    BookManagementJPanel(ApplicationSystem applicationSystem,  UserAccount userAccount, Librarian librarian) {
        initComponents();
        this.setVisible(true);
        this.applicationSystem = applicationSystem;
        //this.branch = branch;
        this.librarian = librarian;
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel)bookCatelogJtable.getModel();
        populateAuthorDetails();
        populateGenreDetails();
        populateBookCatelog();
    }
    
    public void populateAuthorDetails () {

        authorComboBox.removeAllItems();

        for(Author a: this.librarian.getAuthorDirectory().getAuthorsList()){
            authorComboBox.addItem(a);
        }
    }
    
    public void populateGenreDetails () {
        genreComboBox.removeAllItems();
        for(Genre g : this.librarian.getGenreDirectory().getGenreLists()){
           genreComboBox.addItem(g);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeOfBindingTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookCatelogJtable = new javax.swing.JTable();
        addBookButton = new javax.swing.JButton();
        authorComboBox = new javax.swing.JComboBox();
        genreComboBox = new javax.swing.JComboBox();
        noOfPagesTextField = new javax.swing.JTextField();
        bookNameTextField = new javax.swing.JTextField();
        bookNamejLabel = new javax.swing.JLabel();
        noOfPagesjLabel = new javax.swing.JLabel();
        languagejLabel = new javax.swing.JLabel();
        authorNamejLabel = new javax.swing.JLabel();
        genreNameLabel = new javax.swing.JLabel();
        typeOfBindingjLabel = new javax.swing.JLabel();
        languageTextField = new javax.swing.JTextField();
        AuthorHeaderjLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(typeOfBindingTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 170, 30));

        bookCatelogJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book Name", "No of Pages", "Language", "Type Of Binding", "Author Name", "Genre Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookCatelogJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 650, 210));

        addBookButton.setText("ADD BOOK");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });
        add(addBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, 30));

        add(authorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 170, 30));

        add(genreComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 170, 30));
        add(noOfPagesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 30));
        add(bookNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, 30));

        bookNamejLabel.setText("Book Name");
        add(bookNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 127, -1, 30));

        noOfPagesjLabel.setText("No Of Pages");
        add(noOfPagesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 187, -1, 20));

        languagejLabel.setText("Language");
        add(languagejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        authorNamejLabel.setText("Author Name");
        add(authorNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        genreNameLabel.setText("Genre Name");
        add(genreNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, 20));

        typeOfBindingjLabel.setText("Type Of Binding");
        add(typeOfBindingjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));
        add(languageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 170, 30));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARY MANAGEMENT SYSTEM - BOOK CATELOG ");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setText("Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 90, 30));
        add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        // TODO add your handling code here:
        String bookName = bookNameTextField.getText();
        String noOfPages = noOfPagesTextField.getText();
        String language = languageTextField.getText();
        String typeOfBinding = typeOfBindingTextField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String registrationDate = sdf.format(jDateChooser.getDate());
        Author author = (Author) authorComboBox.getSelectedItem();
        Genre genre = (Genre) genreComboBox.getSelectedItem();
        this.librarian.getBooksDirectory().createBook(bookName, Integer.valueOf(noOfPages),language, typeOfBinding, registrationDate,true, author, genre);
        JOptionPane.showMessageDialog(null, "Book Added.");
        populateBookCatelog();
        
    }//GEN-LAST:event_addBookButtonActionPerformed

    public void populateBookCatelog() {
        tableModel.setRowCount(0);
        for (Book b : this.librarian.getBooksDirectory().getBooklists()) {
            
            Object[] row = new Object[6];
            row[0] = b.getName();
            row[1] = b.getNoOfPages();
            row[2] = b.getLanguage();
            row[3] = b.getTypeOfBinding();
            row[4] = b.getAuthor().getAuthorName();
            row[5] = b.getGenre().getGenreName();
            tableModel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JButton addBookButton;
    private javax.swing.JComboBox authorComboBox;
    private javax.swing.JLabel authorNamejLabel;
    private javax.swing.JTable bookCatelogJtable;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JLabel bookNamejLabel;
    private javax.swing.JComboBox genreComboBox;
    private javax.swing.JLabel genreNameLabel;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField languageTextField;
    private javax.swing.JLabel languagejLabel;
    private javax.swing.JTextField noOfPagesTextField;
    private javax.swing.JLabel noOfPagesjLabel;
    private javax.swing.JTextField typeOfBindingTextField;
    private javax.swing.JLabel typeOfBindingjLabel;
    // End of variables declaration//GEN-END:variables
}
