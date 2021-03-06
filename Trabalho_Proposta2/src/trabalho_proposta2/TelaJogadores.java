/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_proposta2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel J. Todesco & Rodrigo Schneider
 */
public class TelaJogadores extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     */
    public TelaJogadores() {
        initComponents();
        
        // Começam desabilitados pois por padrão virá marcado apenas dois jogadores
        eJogador3.setEnabled(false);
        eJogador4.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgJogadores = new javax.swing.ButtonGroup();
        DefinaAQuantidadeDeJogadores = new javax.swing.JLabel();
        rbDoisJogadores = new javax.swing.JRadioButton();
        rbTresJogadores = new javax.swing.JRadioButton();
        rbQuatroJogadores = new javax.swing.JRadioButton();
        GENERAL = new javax.swing.JLabel();
        InformeONomeDosJogadores = new javax.swing.JPanel();
        Jogador1 = new javax.swing.JLabel();
        Jogador2 = new javax.swing.JLabel();
        Jogador3 = new javax.swing.JLabel();
        Jogador4 = new javax.swing.JLabel();
        eJogador1 = new javax.swing.JTextField();
        eJogador2 = new javax.swing.JTextField();
        eJogador3 = new javax.swing.JTextField();
        eJogador4 = new javax.swing.JTextField();
        btnComecar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DefinaAQuantidadeDeJogadores.setText("Defina a quantidade de jogadores:");

        bgJogadores.add(rbDoisJogadores);
        rbDoisJogadores.setSelected(true);
        rbDoisJogadores.setText("Dois jogadores");
        rbDoisJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDoisJogadoresActionPerformed(evt);
            }
        });
        rbDoisJogadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rbDoisJogadoresKeyReleased(evt);
            }
        });

        bgJogadores.add(rbTresJogadores);
        rbTresJogadores.setText("Três jogadores");
        rbTresJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTresJogadoresActionPerformed(evt);
            }
        });
        rbTresJogadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rbTresJogadoresKeyReleased(evt);
            }
        });

        bgJogadores.add(rbQuatroJogadores);
        rbQuatroJogadores.setText("Quatro jogadores");
        rbQuatroJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbQuatroJogadoresActionPerformed(evt);
            }
        });
        rbQuatroJogadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rbQuatroJogadoresKeyReleased(evt);
            }
        });

        GENERAL.setText("GENERAL");

        InformeONomeDosJogadores.setBorder(javax.swing.BorderFactory.createTitledBorder("Informe o nome dos jogadores:"));

        Jogador1.setText("Jogador 1:");

        Jogador2.setText("Jogador 2:");

        Jogador3.setText("Jogador 3:");

        Jogador4.setText("Jogador 4:");

        javax.swing.GroupLayout InformeONomeDosJogadoresLayout = new javax.swing.GroupLayout(InformeONomeDosJogadores);
        InformeONomeDosJogadores.setLayout(InformeONomeDosJogadoresLayout);
        InformeONomeDosJogadoresLayout.setHorizontalGroup(
            InformeONomeDosJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeONomeDosJogadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformeONomeDosJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformeONomeDosJogadoresLayout.createSequentialGroup()
                        .addComponent(Jogador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InformeONomeDosJogadoresLayout.createSequentialGroup()
                        .addComponent(Jogador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InformeONomeDosJogadoresLayout.createSequentialGroup()
                        .addComponent(Jogador3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eJogador3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InformeONomeDosJogadoresLayout.createSequentialGroup()
                        .addComponent(Jogador4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eJogador4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InformeONomeDosJogadoresLayout.setVerticalGroup(
            InformeONomeDosJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeONomeDosJogadoresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(InformeONomeDosJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jogador1)
                    .addComponent(eJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InformeONomeDosJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jogador2)
                    .addComponent(eJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InformeONomeDosJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jogador3)
                    .addComponent(eJogador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InformeONomeDosJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jogador4)
                    .addComponent(eJogador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnComecar.setText("COMEÇAR");
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GENERAL)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DefinaAQuantidadeDeJogadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbQuatroJogadores)
                                    .addComponent(rbTresJogadores)
                                    .addComponent(rbDoisJogadores))))
                        .addGap(246, 246, 246))
                    .addComponent(InformeONomeDosJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GENERAL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DefinaAQuantidadeDeJogadores)
                    .addComponent(rbDoisJogadores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTresJogadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbQuatroJogadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InformeONomeDosJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btnComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbQuatroJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbQuatroJogadoresActionPerformed
        eJogador1.setEnabled(true);
        eJogador2.setEnabled(true);
        eJogador3.setEnabled(true);
        eJogador4.setEnabled(true);
    }//GEN-LAST:event_rbQuatroJogadoresActionPerformed

    private void rbDoisJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDoisJogadoresActionPerformed
        eJogador1.setEnabled(true);
        eJogador2.setEnabled(true);
        eJogador3.setEnabled(false);
        eJogador4.setEnabled(false);
    }//GEN-LAST:event_rbDoisJogadoresActionPerformed

    private void rbTresJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTresJogadoresActionPerformed
        eJogador1.setEnabled(true);
        eJogador2.setEnabled(true);
        eJogador3.setEnabled(true);
        eJogador4.setEnabled(false);
    }//GEN-LAST:event_rbTresJogadoresActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed
        
        // Verifica se todos os campos habilitados estão preenchidos
        if(eJogador1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jogador 1 não informado!");
            eJogador1.grabFocus();;
        }else if(eJogador2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jogador 2 não informado!");
            eJogador2.grabFocus();;
        }else if(eJogador3.isEnabled() && eJogador3.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jogador 3 não informado!");
            eJogador3.grabFocus();;
        }else if(eJogador4.isEnabled() && eJogador4.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jogador 4 não informado!");
            eJogador4.grabFocus();;
        }else{
            
            if(eJogador3.isEnabled() == false){
                eJogador3.setText("");
            }
            if(eJogador4.isEnabled() == false){
                eJogador4.setText("");
            }
            
            Jogador j1 = new Jogador();
            Jogador j2 = new Jogador();
            Jogador j3 = new Jogador();
            Jogador j4 = new Jogador();
            
            j1.setNome(eJogador1.getText());
            j2.setNome(eJogador2.getText());
            j3.setNome(eJogador3.getText());
            j4.setNome(eJogador4.getText());
            
            Jogo jogo = new Jogo(j1, j2, j3, j4);
            
            TelaJogo tela = new TelaJogo(null, true);
            
            tela.setJogo(jogo);
            
            tela.setVisible(true);
            
        }
    }//GEN-LAST:event_btnComecarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        eJogador1.setText("");
        eJogador2.setText("");
        eJogador3.setText("");
        eJogador4.setText("");
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void rbTresJogadoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbTresJogadoresKeyReleased
        eJogador1.setEnabled(true);
        eJogador2.setEnabled(true);
        eJogador3.setEnabled(true);
        eJogador4.setEnabled(false);
    }//GEN-LAST:event_rbTresJogadoresKeyReleased

    private void rbDoisJogadoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbDoisJogadoresKeyReleased
        eJogador1.setEnabled(true);
        eJogador2.setEnabled(true);
        eJogador3.setEnabled(false);
        eJogador4.setEnabled(false);
    }//GEN-LAST:event_rbDoisJogadoresKeyReleased

    private void rbQuatroJogadoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbQuatroJogadoresKeyReleased
        eJogador1.setEnabled(true);
        eJogador2.setEnabled(true);
        eJogador3.setEnabled(true);
        eJogador4.setEnabled(true);
    }//GEN-LAST:event_rbQuatroJogadoresKeyReleased

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DefinaAQuantidadeDeJogadores;
    private javax.swing.JLabel GENERAL;
    private javax.swing.JPanel InformeONomeDosJogadores;
    private javax.swing.JLabel Jogador1;
    private javax.swing.JLabel Jogador2;
    private javax.swing.JLabel Jogador3;
    private javax.swing.JLabel Jogador4;
    private javax.swing.ButtonGroup bgJogadores;
    private javax.swing.JButton btnComecar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField eJogador1;
    private javax.swing.JTextField eJogador2;
    private javax.swing.JTextField eJogador3;
    private javax.swing.JTextField eJogador4;
    private javax.swing.JRadioButton rbDoisJogadores;
    private javax.swing.JRadioButton rbQuatroJogadores;
    private javax.swing.JRadioButton rbTresJogadores;
    // End of variables declaration//GEN-END:variables
}
