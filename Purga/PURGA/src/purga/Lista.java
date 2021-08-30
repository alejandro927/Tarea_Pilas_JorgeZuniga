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
 * @author aleja
 */
public class Lista {
    static Scanner entrada = new Scanner(System.in);
    ArrayList listaArreglo = new ArrayList<>();

    public int menu() {
        int opcion = 0;
        System.out.println("//////////////////////////////");
        System.out.println("EXAMEN1 ED1 Jorge A. Zuniga F.");
        System.out.println("//////////////////////////////");
        System.out.println("====MENU====");
        System.out.println("1)Anadir a la lista");
        System.out.println("2)Imprimir lista");
        System.out.println("3)Purga");
        System.out.println("4)Editar");
        System.out.println("5)Emular");
        System.out.println("6)Vaciar lista");
        System.out.println("7)Salida");
        System.out.println("Elija una opcion: ");
        opcion = entrada.nextInt();
        return opcion;
    }

    public void imprimir(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("[" + lista.get(i) + "]");
        }
        System.out.println("");
    }

    public ArrayList agregar( ) {
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

    public ArrayList Purga(ArrayList lista) {

        ArrayList lista2 = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            int cont = 0;
            for (int j = 0; j < lista2.size(); j++) {
                if (lista.get(i) == lista2.get(j)) {
                    cont++;
                }
            }
            if (cont == 0) {
                lista2.add(lista.get(i));
            }
        }
        System.out.println("Purgado exitosamente!!!");
        return lista2;
    }
}
