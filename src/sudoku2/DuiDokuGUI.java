package sudoku2;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DuiDokuGUI extends javax.swing.JFrame {

    /**
     * Creates new form DuiDokuGUI
     */
    private final JTextField[][] textField;
    private Computer opponent;
    private DuidokuGame game;

    public DuiDokuGUI() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        game = new DuidokuGame();
        opponent = new Computer(game);
        initializeBoard();
        textField = new JTextField[4][4];
        textField[0][0] = jTextField1;
        textField[0][1] = jTextField2;
        textField[0][2] = jTextField3;
        textField[0][3] = jTextField4;
        textField[1][0] = jTextField5;
        textField[1][1] = jTextField6;
        textField[1][2] = jTextField7;
        textField[1][3] = jTextField8;
        textField[2][0] = jTextField9;
        textField[2][1] = jTextField10;
        textField[2][2] = jTextField11;
        textField[2][3] = jTextField12;
        textField[3][0] = jTextField13;
        textField[3][1] = jTextField14;
        textField[3][2] = jTextField15;
        textField[3][3] = jTextField16;
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DuiDoku");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(450, 450));
        setPreferredSize(new java.awt.Dimension(450, 450));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(4, 4, 8, 8));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField3MousePressed(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField4MousePressed(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField5MousePressed(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField6MousePressed(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField7MousePressed(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField8MousePressed(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField9MousePressed(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField10MousePressed(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10);

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField11MousePressed(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11);

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField12MousePressed(evt);
            }
        });
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12);

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField13MousePressed(evt);
            }
        });
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13);

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField14MousePressed(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField14);

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField15MousePressed(evt);
            }
        });
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField15);

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField16MousePressed(evt);
            }
        });
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        click(0, 0);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        click(0, 1);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        click(0, 2);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        click(0, 3);
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        click(1, 0);
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        click(1, 1);
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        click(1, 2);
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        click(1, 3);
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        click(2, 0);
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        click(2, 1);
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        click(2, 2);
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        click(2, 3);
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        click(3, 0);
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        click(3, 1);
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        click(3, 2);
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        click(3, 3);
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(0, 0);
        }
    }//GEN-LAST:event_jTextField1MousePressed

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(0, 1);
        }
    }//GEN-LAST:event_jTextField2MousePressed

    private void jTextField3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(0, 2);
        }
    }//GEN-LAST:event_jTextField3MousePressed

    private void jTextField4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(0, 3);
        }
    }//GEN-LAST:event_jTextField4MousePressed

    private void jTextField5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(1, 0);
        }
    }//GEN-LAST:event_jTextField5MousePressed

    private void jTextField6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(1, 1);
        }
    }//GEN-LAST:event_jTextField6MousePressed

    private void jTextField7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(1, 2);
        }
    }//GEN-LAST:event_jTextField7MousePressed

    private void jTextField8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(1, 3);
        }
    }//GEN-LAST:event_jTextField8MousePressed

    private void jTextField9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(2, 0);
        }
    }//GEN-LAST:event_jTextField9MousePressed

    private void jTextField10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(2, 1);
        }
    }//GEN-LAST:event_jTextField10MousePressed

    private void jTextField11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(2, 2);
        }
    }//GEN-LAST:event_jTextField11MousePressed

    private void jTextField12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(2, 3);
        }
    }//GEN-LAST:event_jTextField12MousePressed

    private void jTextField13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(3, 0);
        }
    }//GEN-LAST:event_jTextField13MousePressed

    private void jTextField14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(3, 1);
        }
    }//GEN-LAST:event_jTextField14MousePressed

    private void jTextField15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(3, 2);
        }
    }//GEN-LAST:event_jTextField15MousePressed

    private void jTextField16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            rightClick(3, 3);
        }
    }//GEN-LAST:event_jTextField16MousePressed

    /**
     * Method called on Enter for user input
     *
     * @param x
     * @param y
     */
    private void click(int x, int y) {
        char c = textField[x][y].getText().charAt(0);
        String s = Character.toString(c);

        ArrayList<String> allowed = game.help(new Cell(s, x, y));

        if (textField[x][y].isEditable() && allowed.contains(s)) {
            textField[x][y].setText(s);
            textField[x][y].setEditable(false);
            textField[x][y].setFocusable(false);

            game.getSudokuBoard()[x][y].setValue(s);//update board

            checkUser(false);
            oppMove();
        } else {
            JOptionPane.showMessageDialog(this, "You can't put this number here!",
                    "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Method called on Right mouse click provides a list of available choices
     *
     * @param x
     * @param y
     */
    private void rightClick(int x, int y) {
        if (textField[x][y].isEditable()) {

            ArrayList<String> allowed = game.help(new Cell("0", x, y));
            StringBuilder message = new StringBuilder();
            message.append("Your allowed moves are: ");
            if (!allowed.isEmpty()) {
                for (String st : allowed) {
                    message.append(st).append(",");
                }
            }
            JOptionPane.showMessageDialog(this, message,
                    "Help", JOptionPane.INFORMATION_MESSAGE);//JOptionPane Help allowed numbers
        }
    }

    /**
     * Random opponent move
     */
    private void oppMove() {
        boolean flag = true;
        Cell tempCell = new Cell("10", 0, 0);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (textField[i][j].isEditable() && flag) {
                    tempCell = opponent.random(new Cell("0", i, j));
                    if (!tempCell.getValue().equals("10")) {
                        flag = false;
                    }
                }
            }
        }
        String tempValue = tempCell.getValue();
        if (!"10".equals(tempValue)) {
            textField[tempCell.getX()][tempCell.getY()].setText(tempValue);
            textField[tempCell.getX()][tempCell.getY()].setEditable(false);
            textField[tempCell.getX()][tempCell.getY()].setFocusable(false);
            game.getSudokuBoard()[tempCell.getX()][tempCell.getY()].setValue(tempValue);
            checkUser(true);
        } else {
            JOptionPane.showMessageDialog(this, "Congratulations! You won!",
                    "Game Ended", JOptionPane.INFORMATION_MESSAGE);//Winner Message
            System.exit(0);

        }

    }

    /**
     * Checks for available moves and prints the suitable message
     *
     * @param a
     */
    private void checkUser(boolean a) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (textField[i][j].isEditable()) {
                    c1++;
                    ArrayList<String> mylist;

                    mylist = game.help(new Cell("0", i, j));
                    if (mylist.isEmpty()) {
                        c2++;
                    }
                }
            }
        }
        if (c1 == c2) {
            if (a) {
                JOptionPane.showMessageDialog(this, "Oh no!! You lost!",
                        "Game Ended", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Cogratulations! You won!",
                        "Game Ended", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

    /**
     * Loads sudoku board with empty cells
     */
    private void initializeBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                game.getSudokuBoard()[i][j] = new Cell(" ", i, j); //Initialize Cell[][] with empty cells
            }
        }
        game.setSectors(2);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}