package com.company;

public abstract class Sorter <E extends Comparable<E>>{

        private E[] sortArray;



        public  Sorter(E[] array){
               sortArray = array;

        }


        public long sort(){
                long totalTime = 0;
                long quickStartTime = System.nanoTime();

                this.doSort();

                long quickEndTime = System.nanoTime();
                totalTime = quickEndTime - quickStartTime;
                return totalTime;
        }




        public abstract void doSort();


}








