package sudoku2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    private String nickname;
    private Logic logic;
    private SudokuGUI sudoku;
    private HyperSudokuGUI hypersudoku;
    private DuiDokuGUI duidoku;

    /**
     * Creates new form GUI
     */
    public GUI() {
        nickname = "null";//Default nickname
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        continueButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        gameSelector = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Game Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        gameSelector.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gameSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Classic Sudoku", "HyperSudoku", "DuiDoku" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Choose Sudoku Type:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Give a Nickname:");

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueButton)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gameSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTextField))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continueButton)
                    .addComponent(exitButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed

        if (!gameSelector.getSelectedItem().toString().equals("DuiDoku")) {
            try {
                logic = new Logic(nickname);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (logic.playerExists()) {//check in nicknames list if this nickname exists

                int option = JOptionPane.showConfirmDialog(null, "Would you like to continue a saved game?",
                        "Saved Games Found", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    String[] options = logic.playerMenu(gameSelector.getSelectedItem().toString());
                    String idOption = (String) JOptionPane.showInputDialog(null, "Choose Game", null, WIDTH, null, options, options[0]);

                    if (gameSelector.getSelectedItem().toString().equals("Classic Sudoku")) {
                        sudoku = new SudokuGUI(idOption, logic);
                    } else if (gameSelector.getSelectedItem().toString().equals("HyperSudoku")) {
                        hypersudoku = new HyperSudokuGUI(idOption, logic);
                    } else {
                        System.out.println("Error in random sudoku intializer");
                    }
                } else if (option == JOptionPane.NO_OPTION) {
                    if (gameSelector.getSelectedItem().toString().equals("Classic Sudoku")) {
                        sudoku = new SudokuGUI(logic.randomSudoku("Classic Sudoku"), logic);//Random Sudoku //
                    } else {
                        hypersudoku = new HyperSudokuGUI(logic.randomSudoku("HyperSudoku"), logic);//Random HypserSudoku

                    }
                }
            } else {//nickname doesn't exist
                if (gameSelector.getSelectedItem().toString().equals("Classic Sudoku")) {
                    sudoku = new SudokuGUI("1", logic);//Default HypserSudoku id Option
                } else if (gameSelector.getSelectedItem().toString().equals("HyperSudoku")) {
                    hypersudoku = new HyperSudokuGUI("1", logic);//Default HypserSudoku id Option                    
                } else {
                    System.out.println("Error in random sudoku intializer");
                }
            }
        } else {
            duidoku = new DuiDokuGUI();
            setVisible(false);
        }
    }//GEN-LAST:event_continueButtonActionPerformed


    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        nickname = nameTextField.getText();
        if (nickname.equals("")) {
            nickname = "null";//Default nickname if no nickname was given
        }
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox gameSelector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables
}
