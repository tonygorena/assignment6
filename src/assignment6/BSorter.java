package assignment6;

class BSorter<E extends Comparable<E>> extends Sorter {

    public BSorter(E[] array) {
        super(array);
    }

    @Override
    public void doSort(E[] A, int i, int j) {
        for (; i < A.length - 1; i++) {
            for (; j > i; j--) {
                if ((A[j].compareTo(A[j - 1]) < 0)) {
                    super.swap(A, j, j - 1);
                }
            }
        }

    }

}
