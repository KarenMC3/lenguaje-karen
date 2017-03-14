/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author T-102
 */
public class Cliente {
      private String nombre;
      private int edad;
      private float sueldo;

    @Override
    public String toString() {
        return "Nombre: "+nombre+ " sueldo: "+sueldo+" edad: "+edad;
    }

    public Cliente(String nombre, int edad, float sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
      

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
}
