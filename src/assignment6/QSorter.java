package assignment6;

class QSorter<E extends Comparable<E>> extends Sorter<E>{

    public QSorter(E[] array) {
        super(array);

    }

    @Override
    public void doSort(E[] A, int i, int j) {
        int pivotIndex = findPivot(A, i, j);
        super.swap(A, pivotIndex, j);

        int k = partition(A, i - 1, j, A[j]);
        super.swap(A, k, j);
        if ((k - i) > 1) {
            doSort(A, i, k - 1);
        }
        if ((j - k) > 1) {
            doSort(A, k + 1, j);
        }
    }

    public int findPivot(E[] A, int i, int j) {
        return (i + j) / 2;
    }

    public int partition(E[] A, int left, int right, E pivot) {
        do {
            while (A[++left].compareTo(pivot) < 0);
            while ((right != 0) && (A[--right].compareTo(pivot) > 0));
            super.swap(A, left, right);
        } while (left < right);
        super.swap(A, left, right);
        return left;

    }

}
