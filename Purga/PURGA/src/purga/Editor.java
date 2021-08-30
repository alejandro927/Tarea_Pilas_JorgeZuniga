/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purga;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Editor {
    
    Pila pila = new Pila();
    
    public void imprimir(ArrayList lista) {
        pila.imprimirPila(lista);
    }
    
    public ArrayList getMeterE(){
        ArrayList lista = new ArrayList<>();        
        lista = pila.MeterP();
        return lista;
    }
    
    public boolean getVacio(ArrayList lista){
        boolean ban;
        ban = pila.Vacio(lista);
        return ban;
    }
    
    public ArrayList getAnula(ArrayList lista) {
        pila.Anula(lista);
        return lista;
    }
    
    public ArrayList EDITA(ArrayList lista) {
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals('#')) {
                lista.remove(i);
                lista.remove(i - 1);
                i = i - 2;
            } else if (lista.get(i).equals('@')) {
                lista = getAnula(lista);
            }
        }
        return lista;
        
    }
    
    
}
