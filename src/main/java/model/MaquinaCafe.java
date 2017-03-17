/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author marta
 */
public class MaquinaCafe {

    /**Instanciamos las otras dos clases y hacemos un menu 
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Monedero mon=new Monedero();
    
    Display dis=new Display();
    int op=0;
    
      do{
  
            try{
        op = Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1. Introduce dinero \n2. Elige bebida \n3. Imprimir \n4. Salir"));
        op = 0;
            }catch(Exception e){
                System.out.println(e.getMessage());
                op = 0;
            }
                switch (op) {

            case 1:
                mon.IntroducirDinero();
                break;
            case 2:
                dis.elegirBebida();
                break;
            case 3:
               dis.imprimir();
                break;
            case 4:
                System.exit(0);
        
                }
    }while (op<4);
}

    }
    

