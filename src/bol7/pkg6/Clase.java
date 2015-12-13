/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol7.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Clase {
     
    public static float DarNumero(){
        String res= JOptionPane.showInputDialog("Introduzca el numero de ventas anuales: ");
        float num= Float.parseFloat(res);
        return num;    
    }
    public static void CompararNumero(float num){
        if( num<= 100)
            JOptionPane.showConfirmDialog(null, "Las ventas son de articulos de consumo bajo");
        else if (num >100 && num<= 500)
            JOptionPane.showConfirmDialog(null, "Las ventas son de articulos de consumo medio");
        else if (num > 500 && num <= 1000)
            JOptionPane.showConfirmDialog(null, "Las ventas son de articulos de consumo alto");
        else JOptionPane.showConfirmDialog(null, "Las ventas son de productos de primera necesidad");
        }
    }
