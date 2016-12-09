/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author ytaly
 */
public class VisualizaNumeros {
    private int num;
    
    
    
    
    public void visualizaOpares(){
     
      
     num = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número "));
     for(int i=0;num>0;i+=2) {
        
         JOptionPane.showMessageDialog(null,"O resultado e "+(i+num));
     }
         
      
    }   
    
    
    
    public void visualizaBucleNegativo(int num){
        int i= 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número "));
        
        do {
              
      
        JOptionPane.showMessageDialog(null," Os numeros son "+(num+i));
      i-=1;i+=2;i-=3;i+=4;i-=5;i+=6;
        
      
    }while(num>0);
}
    
    
    
    
    
    public void fibonacci(int num){
        
        int i =0;
        
        
        num = Integer.parseInt(JOptionPane.showInputDialog( " Introduce o número "));
        
        do {
            
            
            JOptionPane.showMessageDialog(null,"Os números son " +(num+i));
            i++;i++;i+=3;
            
        }while(num>0);
        
    }
}