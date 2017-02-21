/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author T-102
 */
import java.io.*;
public class ValidacionArchivo {
    public void validarExtencion(File file)throws ExtencionNoValidaExeption{
        //Preguntamos el nombre
        String nombre= file.getName();
        //Como obtener la extencion
        int indice1=    nombre.indexOf(".");
        int indice2=    nombre.length();
        String extencion=nombre.substring(indice1-1, indice2);
        
        if (extencion.equals("txt"))throw new ExtencionNoValidaException();
        
        
       // throw new ExtencionNoValidaException();
        
    
    }
}
