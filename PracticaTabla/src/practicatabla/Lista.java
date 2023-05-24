/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicatabla;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Lista {
     //Atributos
    public Nodo lista;
    private int cantidadN;
    
    //Constructor
    public Lista(){
        lista = null;
        cantidadN = 0;
    }
    
    //Método para agregar Nodo
    public void agregarNodo(int v){
        Nodo nuevo = new Nodo(v, null);
        
        if (lista == null) {
            lista = nuevo;
        }
        else{
            Nodo aux = lista;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        cantidadN++;
    }
    
    public int [] imprimirLista2(){
        Nodo aux = lista;
        int [] arreglo = new int [cantidadN];
        int j=0;
        int i=1;
        if(lista == null){
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }else{
            while(aux != null){
                arreglo[j] = aux.getValor();
                aux = aux.siguiente;
                i++;
                j++;
            }
        }
       return arreglo;
    }
    //Getter y Setter
    public int getCantidadN() {
        return cantidadN;
    }

    public void setCantidadN(int cantidadN) {
        this.cantidadN = cantidadN;
    }  
}
