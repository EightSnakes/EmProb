/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprob;

import javax.swing.*;

public class TipoConsulta extends JFrame{
    public int consulta(){
        String[] options = {"Individual", "General"};
        int x = JOptionPane.showOptionDialog(null, "¿Qué tipo de consulta quisiera hacer?",
                "Haga click en su selección",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return x;
    }
            
}