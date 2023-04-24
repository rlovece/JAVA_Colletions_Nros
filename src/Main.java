import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do{
            opcion = menu();
            switch (opcion){
                case 1:
                    ej1();
                    break;

                case 2:
                    ej2();
                    break;

                case 0:
                    Consola.escribir("Gracias por su visita 👋");
                    break;
                default:
                    Consola.escribir("Opción incorrecta!");
            }
            Consola.escribir("\n\n ENTER para continuar...");
            Consola.leerString();
        } while (opcion!=0);

    }

    public static int menu (){

        Consola.escribir("1. Lista y HashSet con nros aleatorios");
        Consola.escribir("2. Pruebas Math");
        Consola.escribir("Elige una opción 👆 o 0 para salir!");
        int opcion = Consola.leerInt();
        return opcion;
    }


    public static void ej1(){
        ArrayList<Integer>  listaEnteros= new ArrayList<Integer>();
        Random nroRandom = new Random();

        for (int i=0; i<50 ; i++){
            listaEnteros.add(nroRandom.nextInt(0, 100));
        }

        Consola.escribir("\n\n ✔ Lista de 50 nros enteros aleatorios \n" + listaEnteros);

        Collections.sort(listaEnteros);

        Consola.escribir("\n\n ✔ Lista ordenada \n" + listaEnteros);

        HashSet<Integer> hashSetEnteros = new HashSet<Integer>();

        /* FUNCIONA PERO NO ES NECESARIO
        for (int i=0; i<50; i++){
            hashSetEnteros.add(listaEnteros.get(i));
        }*/

        hashSetEnteros.addAll(listaEnteros); /// agrega todos los elementos de la lista.

        Consola.escribir("\n\n ✔ HashSet de nros no repetidos \n" + hashSetEnteros);
    }

    public static void ej2(){
        ArrayList<Integer>  listaEnteros= new ArrayList<Integer>();
        Random nroRandom = new Random();

        for (int i=0; i<50 ; i++){
            listaEnteros.add(nroRandom.nextInt(0, 100));
        }

        Consola.escribir("\n\n ✔ Lista de 50 nros enteros aleatorios \n" + listaEnteros);

        TreeSet<Integer> treeSetNros = new TreeSet<Integer>();

        treeSetNros.addAll(listaEnteros);

        Consola.escribir("\n\n ✔ Arbol ordenado \n" + treeSetNros);

        TreeSet<Integer> treeSetNrosInverso = new TreeSet<Integer>(Comparator.reverseOrder());

        treeSetNrosInverso.addAll(treeSetNros);

        Consola.escribir("\n\n ✔ Arbol ordenado inverso \n" + treeSetNrosInverso);

    }
}