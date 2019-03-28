/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiantes
 */
public class Vista extends JFrame {
    
    JPanel p1 = new JPanel();
    JButton b1 = new JButton("Calcular");
    JLabel l1 = new JLabel();
    JTextField t1 = new JTextField();

    public void panelPrincipal() {

        b1.setSize(90, 50);
        b1.setLocation(85, 175);
        l1.setSize(150, 60);
        l1.setLocation(75, 40);
        l1.setText("Ingrese un numero");
        t1.setSize(60, 50);
        t1.setLocation(100, 100);
        p1.setLayout(null);
        p1.add(b1);
        p1.add(l1);
        p1.add(t1);
        
    }

    public void mostrar() {
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panelPrincipal();
        add(p1);
    }

    public void asignaOyentes(Controlador c) {
        b1.addActionListener((ActionListener) c);
    }

}
