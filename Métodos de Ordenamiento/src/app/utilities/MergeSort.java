package app.utilities;

import java.util.ArrayList;

/**
 *
 * @author César Luygi Salcedo Espriella (Luigi Salcedo)
 */
public class MergeSort implements Sorter
{
    // Constructor
    public MergeSort()
    {
        // Nulo
    }
    
    @Override
    public ArrayList<Comparable> sort(ArrayList<Comparable> array)
    {
        // Confirmamos el caso base
        if(array.size() <= 1) return array;
        
        // Creamos las dos sub-listas
        ArrayList<Comparable> left = new ArrayList();
        ArrayList<Comparable> rigth = new ArrayList();
        
        // Comenzamos a dividir la lista en dos sublistas
        
        // Llenamos la izquierda
        for(int i = 0; i < array.size()/2; i++)
        {
            left.add(array.get(i));
        }
        
        // Llenamos la derecha
        for(int i = array.size()/2; i < array.size(); i++)
        {
            rigth.add(array.get(i));
        }
        
        // Ordenamos cada sub-lista usando recursivamente los elementos.
        left = sort(left);
        rigth = sort(rigth);
        
        // Retornamos la mezcla de ambos
        return merge(left, rigth);
    }
    /*
     *  Método "merge(ArrayList<Comparable>, ArrayList<Comparable>)": Retorna un ArrayList con los elementos de otros dos
     *  mezclados y ordenados.   
     */
    private ArrayList<Comparable> merge(ArrayList<Comparable> left, ArrayList<Comparable> rigth)
    {
        ArrayList<Comparable> result = new ArrayList();
        
        int p_left = 0; // Posición de la izquierda
        int p_rigth = 0; // Posición de la derecha
        
        while(p_left < left.size() && p_rigth < rigth.size())
        {
            // Comparamos y vamos agregando los elementos menores primeros
            if(left.get(p_left).compareTo(rigth.get(p_rigth)) < 0)
            {
                result.add(left.get(p_left));
                p_left++;
            }
            else
            {
                result.add(rigth.get(p_rigth));
                p_rigth++;                
            }
        }
        
        // Agregamos los sobrante
        if(p_left < left.size()) // Si sobraron de la izquierda agregamos los sobrantes
        {
            result.addAll(left.subList(p_left, left.size()));
        }
        else // Si no agregamos los sobrante de la derecha
        {
            result.addAll(rigth.subList(p_rigth, rigth.size()));
        }
        
        // Retornamos el resultado
        return result;
    }
}
