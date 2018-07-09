/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void createArchivo(String direccion, String Valor){
        File archivo = new File(direccion);
            Formatter Narchivo;
        if(archivo.exists()){
            try {
                System.out.println(" fichero si existe");
                archivo.delete();
                System.out.println(" fichero  borrado");
                Narchivo = new Formatter(direccion);
                System.out.println(" fichero  creado"); 
                Narchivo.format("%s",Valor);
                Narchivo.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
            try {
                Narchivo = new Formatter(direccion); 
                System.out.println(" fichero  creado");
                 Narchivo.format("%s",Valor);
                Narchivo.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
      public String readArchivo(String direccion ){
        String Valor="";
        try {
        FileReader archivo;
        BufferedReader lector;
        archivo=new  FileReader(direccion);
        
        
        if(archivo.ready()){
          lector = new  BufferedReader(archivo);   
          String cadena;
          while((cadena=lector.readLine())!=null){
              Valor=cadena;
              
          }
         archivo.close();
        }else{
            JOptionPane.showConfirmDialog(null, "NO SE PUEDE LEER EL ARCHIVO");
        }
       
        
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
        
        
        
        return Valor;
    }
    
    
    
}
