package app;

import app.utilities.BubbleSort;
import app.utilities.InsertionSort;
import app.utilities.MergeSort;
import app.utilities.QuickSort;
import app.utilities.Sorter;
import java.util.ArrayList;

/**
 *
 * @author César Luygi Salcedo Espriella (Luigi Salcedo)
 */
public class App 
{
    public static void showArrayList(ArrayList<Comparable> array)
    {
        for(Comparable i : array)
        {
            System.out.println(i);
        }        
        System.out.println("______________________\n");
    }
    public static void main(String[] args) 
    {
        ArrayList<Comparable> elements = new ArrayList(); // ArrayList de elementos desordenados
        
        // Generamos números aleatorios
        for(int i = 0; i < 10; i++)
        {
            elements.add((int)(Math.random()*100));
        }
        
        // Mostramos el original
        System.out.println("Original: ");
        showArrayList(elements);
        
        // Organizamos y mostramos los elementos
        ArrayList<Comparable> ordernerd = new BubbleSort().sort(elements);
        
        System.out.println("BubbleSort: ");
        showArrayList(ordernerd);
        
        ordernerd = new InsertionSort().sort(elements);
        System.out.println("InsertionSort: ");
        showArrayList(ordernerd);
        
        ordernerd = new QuickSort().sort(elements);
        System.out.println("QuickSort: ");
        showArrayList(ordernerd);
        
        ordernerd = new MergeSort().sort(elements);
        System.out.println("MergeSort: ");
        showArrayList(ordernerd);
    }
}
