package DMS.asigment2;

import java.util.NoSuchElementException;

/**
 * Реализация минимальной кучи
 */
public class MyMinHeap<T extends Comparable<T>> {
    private final MyList<T> list;

    public MyMinHeap() {
        // ArrayList лучше для кучи (эффективный доступ по индексу)
        this.list = new MyArrayList<>();
    }

    public void insert(T item) {
        list.add(item);
        siftUp(list.size() - 1);
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Куча пуста");
        }

        T min = list.get(0);
        T last = list.get(list.size() - 1);
        list.set(0, last);
        list.remove(list.size() - 1);

        if (!isEmpty()) {
            siftDown(0);
        }

        return min;
    }

    public T getMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Куча пуста");
        }
        return list.get(0);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void clear() {
        list.clear();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parentIndex)) >= 0) {
                break;
            }
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void siftDown(int index) {
        int leftChild, rightChild, minIndex;
        while (true) {
            leftChild = 2 * index + 1;
            rightChild = 2 * index + 2;
            minIndex = index;

            if (leftChild < list.size() &&
                    list.get(leftChild).compareTo(list.get(minIndex)) < 0) {
                minIndex = leftChild;
            }

            if (rightChild < list.size() &&
                    list.get(rightChild).compareTo(list.get(minIndex)) < 0) {
                minIndex = rightChild;
            }

            if (minIndex == index) {
                break;
            }

            swap(index, minIndex);
            index = minIndex;
        }
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}