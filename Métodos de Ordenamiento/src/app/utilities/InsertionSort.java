package app.utilities;

import java.util.ArrayList;

/**
 *
 * @author Césat Luygi Salcedo Espriella (Luigi Salcedo)
 */
public class InsertionSort implements Sorter
{
    // Constructor
    public InsertionSort()
    {
        // Nulo
    }
    
    @Override
    public ArrayList<Comparable> sort(ArrayList<Comparable> array)
    {
        ArrayList<Comparable> finalArray = new ArrayList(); // El ArrayList que contendrá los elmentos ordenados
        
        finalArray.addAll(array); // Agregamos todos lo elementos al nuevo ArrayList
        
        Comparable aux; // Elemento auxiliar para efectuar los intecambios

        // Inciamos el proceso de organización
        for(int i = 1; i < finalArray.size(); i++)
        {
            for(int j = i; j > 0 && finalArray.get(j).compareTo(finalArray.get(j-1)) < 0; j--)
            {
                    aux = finalArray.get(j-1);
                    finalArray.set(j-1, finalArray.get(j));
                    finalArray.set(j, aux);
            }
        }
        
        // Retornamos el final
        return finalArray;
    }
}
