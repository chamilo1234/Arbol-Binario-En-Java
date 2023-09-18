/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario_1;

/**
 *
 * @author CAMILO MORALES
 */
public class NodoArbol {
    
        private int dato;
    private NodoArbol izquierda, derecha;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
    
}
