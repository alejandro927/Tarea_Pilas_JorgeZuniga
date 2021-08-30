/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purga;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author J.A.Z.F.
 */
public class PURGA {
static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Lista list = new Lista();
        Editor edit = new Editor();
        ArrayList lista1 = new ArrayList<>();
        
        int opcion = 1;
        while(opcion > 0 && opcion < 7){
            opcion = edit.menu();
            switch(opcion){
                case 1:{
                    lista1 = edit.getMeterE();       
                }
                break;
                case 2:{
                    edit.imprimir(lista1);
                }
                break;
                case 3:{
                    lista1 = edit.Purga(lista1);
                }
                break;
                case 4:{
                    System.out.println("1) Lista inicio");
                    edit.imprimir(lista1);
                    lista1 = edit.EDITA(lista1);
                    System.out.println("\n\n2) Lista final");
                    edit.imprimir(lista1);
                }
                break;
                case 5:{
                    
                    lista1.add('a');
                    lista1.add('b');
                    lista1.add('c');
                    lista1.add('#');
                    lista1.add('d');
                    lista1.add('#');
                    lista1.add('#');
                    lista1.add('e');
                    lista1.add('p');
                    lista1.add('q');
                    lista1.add('r');
                    lista1.add('s');
                    lista1.add('t');
                    lista1.add('#');
                    lista1.add('@');
                    System.out.println("1) Lista inicio\n");
                    edit.imprimir(lista1);
                    lista1 = edit.EDITA(lista1);
                    System.out.println("\n\n2) Lista final");
                    edit.imprimir(lista1);
                }
                break;
                case 6:{
                    if (edit.getVacio(lista1)) {
                        System.out.println("La lista ya esta vacia!!!");
                    }else{
                        lista1 = edit.getAnula(lista1);
                        System.out.println("La lista se vacio!!");
                    }
                }
                break;
                case 7:{
                    System.out.println("Gracias por usar el programa, BUEN DIA!!!");
                }
                break;
            }
        }
    }
}
