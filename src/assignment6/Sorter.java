package assignment6;

public abstract class Sorter<E extends Comparable<E>> {

    private E[] sortArray;

    public Sorter(E[] array) {
        sortArray = array;

    }

    public long sort() {
        long totalTime = 0;
        long quickStartTime = System.nanoTime();

        this.doSort(sortArray, 0, sortArray.length - 1);

        long quickEndTime = System.nanoTime();
        totalTime = (quickEndTime - quickStartTime);
        return totalTime;
    }

    public void swap(E[] A, int k, int j) {
        E kValue = A[k];
        E jValue = A[j];
        A[k] = jValue;
        A[j] = kValue;
    }

    public abstract void doSort(E[] A, int i, int j);

    public void printArray() {
        for (int i = 0; i < sortArray.length; i++) {
            System.out.println(sortArray[i]);
        }
    }
}
