/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasmaximp;

/**
 *
 * @author elias
 */
public class TasMaxImp {


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TasInterface TasInterface= new TasInterface();
                TasInterface.setVisible(true);
                TasInterface.setTitle("Tas Max Implementation");
            }
        });
    }
    
}
