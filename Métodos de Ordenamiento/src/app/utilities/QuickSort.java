package app.utilities;

import java.util.ArrayList;

/**
 *
 * @author César Luygi Salcedo Espriella (Luigi Salcedo)
 */
public class QuickSort implements Sorter
{
    // Constructor
    public QuickSort()
    {
        // Nulo
    }
    
    @Override
    public ArrayList<Comparable> sort(ArrayList<Comparable> array)
    {
        // Verificamos el caso base
        if(array.size() < 1) return array;
        
        // Creamos los dos ArrayList que contendrán los elementos
        ArrayList<Comparable> left = new ArrayList(); // Contener elementos de la izquierda
        ArrayList<Comparable> rigth = new ArrayList(); // Contener elementos de la derecha
        
        // Creamos el pivote
        Comparable piv = array.get(0);
        
        // Comenzamos a llenar los vector
        for(int i = 1; i < array.size(); i++)
        {
            // Si P es mayor en comparación al i-ésimo elemento va a la izquierda, si no a la derecha.
            if(piv.compareTo(array.get(i)) > 0)
            {
                left.add(array.get(i));
            }
            else
            {
                rigth.add(array.get(i));
            }
        }
        
        // Terminado esto aplicamos recursivamente el algoritmo para ordenar cada sub-lista
        left = sort(left);
        rigth = sort(rigth);
        
        // Juntamos la lista izquierda + pivote + derecha y retornamos el resultado.
        left.add(piv);
        left.addAll(rigth);
        
        return left;
    }
}
