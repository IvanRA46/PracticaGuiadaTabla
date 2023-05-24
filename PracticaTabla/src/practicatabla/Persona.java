/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicatabla;

/**
 *
 * @author Usuario
 */
public class Persona {
    String nombre, apelluido;
    int edad;

    public Persona(String nombre,
            String apelluido,
            int edad) {
        this.nombre = nombre;
        this.apelluido = apelluido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelluido() {
        return apelluido;
    }

    public void setApelluido(String apelluido) {
        this.apelluido = apelluido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
