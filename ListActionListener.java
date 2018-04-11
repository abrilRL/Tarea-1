/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author abril
 */
public class ListActionListener implements ItemListener{

    @Override
    public void itemStateChanged(ItemEvent e) {
        label.setText("You selected "+list.getSelectedItem());
    }
    
}
