package assignment6;

import java.util.Random;

public class a6main {

    public static void main(String[] args) {

        int size = 100;

        Random random = new Random();
        
        byte[] bytes = new byte[size];

        Byte[] unsortedArray = new Byte[size];
        
        random.nextBytes(bytes);

        for (int i = 0; i < unsortedArray.length; i++){
            Byte b = bytes[i];
 
            unsortedArray[i] = b;
        }
        

        Sorter quickSorter = new QSorter();
        System.out.println("quick:  " + quickSorter.sort(unsortedArray));
        quickSorter.printArray(unsortedArray);
        
        for (int i = 0; i < unsortedArray.length; i++){
            Byte b = bytes[i];
            unsortedArray[i] = b;
        }

        Sorter bubbleSorter = new BSorter();
        System.out.println("bubble: " + bubbleSorter.sort(unsortedArray));
        bubbleSorter.printArray(unsortedArray);

    }
}
