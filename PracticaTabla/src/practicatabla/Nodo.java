/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicatabla;

/**
 *
 * @author Usuario
 */
public class Nodo {
     //Atributos
    private int valor;
    public Nodo siguiente;
    
    //Constructor
    public Nodo(int valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    //Getters y Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
}
