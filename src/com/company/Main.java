package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int size = 10;


        Random random = new Random(4);


        Integer[] unsortedArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            unsortedArray[i] = random.nextInt();
        }

            Sorter quickSorter = new QSorter(unsortedArray);
            System.out.println("quick: " + quickSorter.sort());

            Sorter bubbleSorter = new BSorter(unsortedArray);
            System.out.println("bubble: " + bubbleSorter.sort());

    }


}
