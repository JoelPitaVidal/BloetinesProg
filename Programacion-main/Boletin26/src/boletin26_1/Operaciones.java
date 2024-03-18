
package boletin26_1;
import java.util.List;

public class Operaciones<T extends Comparable<T>> {

    // calcular  elemento minimo de lista

    public T minimo(List<T> lista) {

        if (lista.isEmpty()) {

            return null;

        }

        T min = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {

            T elemento = lista.get(i);

            if (elemento.compareTo(min) < 0) {

                min = elemento;

            }

        }

        return min;

    }

    // calcular  elemento maximo de lista

    public T maximo(List<T> lista) {

        if (lista.isEmpty()) {

            return null;

        }

        T max = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {

            T elemento = lista.get(i);

            if (elemento.compareTo(max) > 0) {

                max = elemento;

            }

        }

        return max;

    }

    // buscar  objeto en  lista y devolver  posicion
    // Devuelve -1 si el objeto no se encuentra en la lista

    public int buscar(List<T> lista, T objeto) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).equals(objeto)) {

                return i;

            }

        }

        return -1;

    }
    // borrar  primera aparicion de un objeto dado en la lista

    // Devuelve el objeto eliminado o null si no lo encuentra

    public T borrarPrimeraAparicion(List<T> lista, T objeto) {

        int indice = lista.indexOf(objeto);

        if (indice != -1) {

            return lista.remove(indice);

        }

        return null;

    }
    
}
