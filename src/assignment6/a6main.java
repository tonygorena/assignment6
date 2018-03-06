package assignment6;

import java.util.Random;

public class a6main {

    public static void main(String[] args) {

        int size = 400000;

        Random random = new Random();
        
        byte[] bytes = new byte[size];
        Byte[] unsortedArray = new Byte[size];
        
        random.nextBytes(bytes);

        for (int i = 0; i < unsortedArray.length; i++){
            Byte b = bytes[i];
            unsortedArray[i] = b;
        }
        
        Sorter quickSorter = new QSorter(unsortedArray);
        System.out.println("quick:  " + quickSorter.sort());

        Sorter bubbleSorter = new BSorter(unsortedArray);
        System.out.println("bubble: " + bubbleSorter.sort());

    }
}
