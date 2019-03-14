/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_proposta2;

/**
 *
 * @author Gabriel J. Todesco & Rodrio Schneider
 */

public class Trabalho_Proposta2 {

    /**'
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Windows".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(TelaJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(TelaJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(TelaJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(TelaJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        new TelaJogadores().setVisible(true);           
    }
}