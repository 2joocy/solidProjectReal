package solidprojectreal.Interfaces;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import solidprojectreal.Handler.FileHandler;

/**
 * @author Emil Elkjær Nielsen
 * @author William Pfaffe
 */

public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    FileHandler file = new FileHandler();
    
    public int score;
    public int scoreMedium;
    public int scoreHard;

    public index() {
        JOptionPane.showMessageDialog(null, "Welcome! Each correct guess "
                + "will reward you with 2 points!");
        

        if (score <= 17) {

            try {
                file.readScore();
                score = file.scoreFile;
                file.readWordFileEasy(file.scoreFile);

            } catch (IOException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }
            initComponents();

            file.readScore();
            showScore.setText("Current Score: " + file.scoreFile);

            englishWordText.setText(file.getEnglishWord());
        }

        if (score > 18 || score == 18) {

            try {
                file.readScore();
                scoreMedium = file.scoreFileMedium;
                file.readWordFileMedium(file.scoreFileMedium);

            } catch (IOException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }
            initComponents();

            file.readScore();
            showScore.setText("Current Score: " + score);

            englishWordText.setText(file.englishWord);
        }
        
        if(score > 36 || score == 36){
            try {
                file.readScore();
                scoreHard = file.scoreFileHard;
                file.readWordFileMedium(file.scoreFileHard);

            } catch (IOException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }
            initComponents();

            file.readScore();
            showScore.setText("Current Score: " + score);

            englishWordText.setText(file.englishWord);
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

        saveScore = new javax.swing.JButton();
        guess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        danishWordText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        englishWordText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        showScore = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        openShowWords = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addWord = new javax.swing.JButton();
        lookUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveScore.setText("Save");
        saveScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveScoreActionPerformed(evt);
            }
        });

        guess.setText("Guess");
        guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessActionPerformed(evt);
            }
        });
        guess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });

        danishWordText.setColumns(20);
        danishWordText.setRows(5);
        danishWordText.setAutoscrolls(false);
        jScrollPane1.setViewportView(danishWordText);

        englishWordText.setColumns(20);
        englishWordText.setRows(5);
        jScrollPane2.setViewportView(englishWordText);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("------>");

        showScore.setText("jLabel3");

        openShowWords.setText("View All Words");
        openShowWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openShowWordsActionPerformed(evt);
            }
        });

        jLabel4.setText("English word is:");

        jLabel5.setText("Your guess is:");

        addWord.setText("Add Word");
        addWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordActionPerformed(evt);
            }
        });

        lookUp.setText("Look Up");
        lookUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addWord, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openShowWords, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lookUp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(showScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(guess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveScore)
                    .addComponent(addWord)
                    .addComponent(lookUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openShowWords)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveScoreActionPerformed
        file.writeToFile(Integer.toString(score));
        JOptionPane.showMessageDialog(null, "Your Points Has Been Saved! \n \n "
                + "Points Saved: " + score);
    }//GEN-LAST:event_saveScoreActionPerformed

    private void openShowWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openShowWordsActionPerformed
        showWords dd = new showWords();
        dd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openShowWordsActionPerformed

    private void guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessActionPerformed
        englishWordText.setText("");
        englishWordText.setText(file.getEnglishWord());
        System.out.println("easy level score er: " + score);
        System.out.println("medium level score er: " + scoreMedium);
        System.out.println("hard level score er: " + scoreHard);
        System.out.println("Dansk ord er: " + file.danishWord);
        System.out.println("Engelsk ord er: " + file.englishWord);
        englishWordText.setText(file.getEnglishWord());
        if (score == 18) {
            JOptionPane.showMessageDialog(null, "You have now reached Medium Difficulty");
            englishWordText.setText("");
            englishWordText.setText(file.getEnglishWord());
            
        }
        if(score == 34){
            JOptionPane.showMessageDialog(null, "Welcome to Hard level!");
        }
    // EASY LEVEL HER!!!!!!!!!!!!__________________________________________
        if (score <= 17) {
            try {
                file.readScore();
                file.readWordFileEasy(score);

            } catch (IOException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }

            englishWordText.setText(file.getEnglishWord());

            if (danishWordText.getText().equalsIgnoreCase(file.getDanishWord())) {
                score = score + 2;
                JOptionPane.showMessageDialog(null, "Correct! \n \n "
                        + "Current Points: " + score);
                file.setScoreFile(score);
                file.readScore();

                englishWordText.setText("");
                try {
                    file.readScore();
                    file.readWordFileEasy(score);

                } catch (IOException ex) {
                    Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                }
                englishWordText.setText(file.englishWord);

                showScore.setText("Current Score: " + score);

                danishWordText.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Guess!");
                englishWordText.setText(file.getEnglishWord());
            }
        }
        // BRUGER NÅR TIL MEDIUM LEVEL HER!!!___________________________________
        if (score == 18 || score > 18 && score < 33) {
            englishWordText.setText(file.getEnglishWord());
            
            try {
                file.readScore();
                file.readWordFileMedium(scoreMedium);
                file.getDanishWord();
                file.getEnglishWord();
                englishWordText.setText(file.getEnglishWord());

            } catch (IOException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            System.out.println(file.danishWord);
            if (danishWordText.getText().equalsIgnoreCase(file.danishWord)) {
                System.out.println("danish svar er " + file.danishWord);
                score = score + 2;
                file.scoreFileMedium = scoreMedium;
                scoreMedium +=2;
                
                JOptionPane.showMessageDialog(null, "Correct! \n \n "
                        + "Current Points: " + score);
                file.setScoreFile(scoreMedium);
                

                
                try {
                    file.readScore();
                    file.readWordFileMedium(scoreMedium);

                } catch (IOException ex) {
                    Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                }
                englishWordText.setText(file.englishWord);

                showScore.setText("Current Score: " + score);

                danishWordText.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Guess!");
                
                englishWordText.setText(file.getEnglishWord());
            }
        } 
            //BRUGEREN ER NÅET TIL HARD LEVEL!!!!!!____________________________
            if(score > 36 || score == 36){
            englishWordText.setText(file.getEnglishWord());
            try {
                file.readScore();
                file.readWordFileHard(scoreHard);

            } catch (IOException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }
            englishWordText.setText(file.getEnglishWord());
           
            System.out.println(file.danishWord);
            if (danishWordText.getText().equalsIgnoreCase(file.getDanishWord())) {
                System.out.println("danish svar er " + file.danishWord);
                score = score + 2;
                file.scoreFileHard = scoreHard;
                scoreHard +=2;
                
                JOptionPane.showMessageDialog(null, "Correct! \n \n "
                        + "Current Points: " + score);
                file.setScoreFile(scoreHard);
                file.readScore();

                englishWordText.setText("");
                try {
                    file.readScore();
                    file.readWordFileMedium(scoreHard);

                } catch (IOException ex) {
                    Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                }
                englishWordText.setText(file.englishWord);

                showScore.setText("Current Score: " + score);

                danishWordText.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Guess!");
                englishWordText.setText(file.englishWord);
                englishWordText.setText(file.getEnglishWord());
            }
        }


    }//GEN-LAST:event_guessActionPerformed

    private void addWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWordActionPerformed
        addWordIF addWord = new addWordIF();
        addWord.setVisible(true);
    }//GEN-LAST:event_addWordActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        // TODO add your handling code here:
    }//GEN-LAST:event_Enter

    private void lookUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookUpActionPerformed
        file.lookUpWord(file.englishWord);
        
    }//GEN-LAST:event_lookUpActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addWord;
    private javax.swing.JTextArea danishWordText;
    private javax.swing.JTextArea englishWordText;
    private javax.swing.JButton guess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton lookUp;
    private javax.swing.JButton openShowWords;
    private javax.swing.JButton saveScore;
    private javax.swing.JLabel showScore;
    // End of variables declaration//GEN-END:variables
}
