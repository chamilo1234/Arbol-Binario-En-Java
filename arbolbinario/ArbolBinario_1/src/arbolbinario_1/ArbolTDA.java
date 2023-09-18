/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario_1;

/**
 *
 * @author CAMILO MORALES
 */
public class ArbolTDA {
    private NodoArbol raiz;
    public ArbolTDA() {
    }
/**
Inserta un nuevo nodo con un valor entero dado en el árbol binario.
@param dato el valor del nuevo nodo a insertar
*/
    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }
/**
Inserta un nuevo nodo con un valor entero dado en el árbol.
@param padre el nodo padre a partir del cual se insertará el nuevo nodo.
@param dato el valor del nuevo nodo a insertar.
*/
    
    private void insertar(NodoArbol padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new NodoArbol(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new NodoArbol(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }
/**
* Elimina un nodo del árbol binario dado su valor entero.
* @param b el valor del nodo a eliminar
*/
    public void eliminar(int b) {
        this.raiz = this.eliminar(this.raiz, b);
    }
/**
* Elimina un nodo del árbol binario dado su valor entero.
* @param b el valor del nodo a eliminar
* @param NodoArbol
* @return nodo
*/
    private NodoArbol eliminar(NodoArbol nodo, int b) {
        if (nodo == null) {
            return nodo;
        }
        if (b > nodo.getDato()) {
            nodo.setDerecha(this.eliminar(nodo.getDerecha(), b));
        } else if (b < nodo.getDato()) {
            nodo.setIzquierda(this.eliminar(nodo.getIzquierda(), b));
        } else {
            if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {
                nodo = null;
            } else if (nodo.getDerecha() != null) {
                nodo.setDato(this.sucesor(nodo));
                nodo.setDerecha(this.eliminar(nodo.getDerecha(), nodo.getDato()));
            } else {
                nodo.setDato(this.predecesor(nodo));
                nodo.setIzquierda(this.eliminar(nodo.getIzquierda(), nodo.getDato()));
            }
        }
        return nodo;
    }
/**
Encuentra y devuelve el valor del nodo sucesor de un nodo dado en el árbol binario.
@param nodo el nodo del cual se busca el sucesor
@return el valor del nodo sucesor
*/
    private int sucesor(NodoArbol nodo) {
        nodo = nodo.getDerecha();
        while (nodo.getIzquierda() != null) {
            nodo = nodo.getIzquierda();
        }
        return nodo.getDato();
    }
/**
Encuentra y devuelve el valor del nodo predecesor de un nodo dado en el árbol binario.
@param nodo el nodo del cual se busca el predecesor
@return el valor del nodo predecesor
*/
    private int predecesor(NodoArbol nodo) {
        nodo = nodo.getIzquierda();
        while (nodo.getDerecha() != null) {
            nodo = nodo.getDerecha();
        }
        return nodo.getDato();
    }
/**
Imprime los valores de los nodos del árbol binario en el orden preorden.
@param n el nodo a partir del cual se realizará la impresión.
*/
    private void preorden(NodoArbol n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        } 
    }
/**
Imprime los valores de los nodos del árbol binario en el orden inorden.
@param n el nodo a partir del cual se realizará la impresión.
*/
    private void inorden(NodoArbol n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }
/**
Imprime los valores de los nodos del árbol binario en el orden postorden.
@param n el nodo a partir del cual se realizará la impresión.
*/
    private void postorden(NodoArbol n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
    
    
}
