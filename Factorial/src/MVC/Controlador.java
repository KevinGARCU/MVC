/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Controlador implements ActionListener {

    Vista v;
    Modelo m;

    public Controlador(Vista v, Modelo m) {
        this.v = v;
        this.m = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(v.b1)) {
            String num = v.t1.getText();
            if (m.isNumeric(num)) {
                int aux = Integer.parseInt(num);
                if (aux < 0) {
                    JOptionPane.showMessageDialog(v, "No se admiten negativos");
                }
                if (aux > 0) {
                    int resultado = m.factorial(aux);
                    JOptionPane.showMessageDialog(v, "El factorial es " + resultado);
                }
            } else {
                JOptionPane.showMessageDialog(v, "No se admiten letras");
            }

        }

    }

}
