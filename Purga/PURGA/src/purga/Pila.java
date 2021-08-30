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
public class Pila extends Lista{
    
    
    public void imprimirPila(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("[" + lista.get(i) + "]");
        }
        System.out.println("");
    }
    
    
    public ArrayList Anula(ArrayList lista) {
        lista.removeAll(lista);
        return lista;
    }
    
    public char Tope(ArrayList lista){
        System.out.println(lista);
        int tam = lista.size();
        char cad;
        cad = (char) lista.get(tam);
        return cad;
    }
    
    public ArrayList MeterP() {
        char opcion ='s';
        char numero ;
        while (opcion == 's' || opcion == 'S') {
            System.out.println("Ingrese un caracter: ");
            numero = entrada.next().charAt(0);
            listaArreglo.add(numero);
            System.out.println("Desea agregar otro? (S/s=SI,otro=NO)");
            opcion = entrada.next().charAt(0);
        }
        return listaArreglo;
    }
    
    public boolean Vacio(ArrayList lista){
        boolean bandera;
        if (lista.isEmpty()) {
            bandera = true;
        }else{
            bandera = false;
        }
        return bandera;
    }
}
