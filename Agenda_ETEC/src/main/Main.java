/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import View.Inicio2_GUI;
import View.Inicio_GUI;

/**
 *
 * @author manager
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller.Testa_DB.conecta();
        new Inicio2_GUI().setVisible(true);
    }
    
}
