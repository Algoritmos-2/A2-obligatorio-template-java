package tads;

public class AVL {
    private NodoAVL raiz;
    private boolean vario_h;

    //PRE: -
    //POS: Crea un AVL vacío
    public AVL() {
        raiz = null;
    }

    //PRE: -
    //POS: Agrega el elemento x al AVL
    public void agregar(int x) {
        System.out.println("Invocación a 'agregar(" + x  + ")' del archivo AVL.java que debe ser implementada!");
    }

    private class NodoAVL {
        // Incompleto
        int dato;
        NodoAVL izq;
        NodoAVL der;
    }
}