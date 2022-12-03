package app.utilities;

import java.util.ArrayList;

/**
 *
 * @author César Luigi Salcedo Espriella (Luigi Salcedo)
 */
public class BubbleSort implements Sorter
{
    // Constructor
    public BubbleSort()
    {
        // Nulo
    }
    
    @Override
    public ArrayList<Comparable> sort(ArrayList<Comparable> array)
    {
        ArrayList<Comparable> finalArray = new ArrayList(); // El ArrayList que contendrá los elmentos ordenados
        
        finalArray.addAll(array); // Agregamos todos lo elementos al nuevo ArrayList
        
        Comparable aux; // Elemento auxiliar para efectuar los intecambios
        
        // Iniciamos el proceso de organización
        for(int i = 0; i < finalArray.size(); i++)
        {
            for(int j = i + 1; j < finalArray.size(); j++)
            {
                // Verificamos si el actual es i-ésimo es mayor al j-ésimo y de ser así lo intercambiamos.
                if(finalArray.get(i).compareTo(finalArray.get(j)) > 0)
                {
                    aux = finalArray.get(i);
                    finalArray.set(i, finalArray.get(j));
                    finalArray.set(j, aux);
                }
            }
        }
        
        // Retornamos el final
        return finalArray;
    }
}
