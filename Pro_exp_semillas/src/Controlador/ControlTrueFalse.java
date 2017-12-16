/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class ControlTrueFalse {

    public ControlTrueFalse() {
    }

    public void ButtonTrue(JButton Btn) {
        Btn.setEnabled(true);
    }

    public void ButtonFalse(JButton Btn) {

        Btn.setEnabled(false);
    }

    public void TxtTrue(JTextField txt) {
        txt.setEditable(true);
    }

    public void TxtFalse(JTextField txt) {
        txt.setEditable(false);
    }

}
