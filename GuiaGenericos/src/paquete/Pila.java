package paquete;

import java.util.LinkedList;

public class Pila<T> {
    LinkedList<T> pila;

    public Pila() {
        this.pila = new LinkedList<T>();
    }

    public LinkedList<T> getPila() {
        return pila;
    }

    public void setPila(LinkedList<T> pila) {
        this.pila = pila;
    }

    public void push(T obj) {
        this.pila.push(obj);

    }

    public T pop() {
        return this.pila.pop();
    }

    public int size() {
        return this.pila.size();
    }
}
