package DMS.asigment2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements MyList<T> {
    private static class MyNode<T> {
        T data;
        MyNode<T> next;
        MyNode<T> prev;

        public MyNode(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private MyNode<T> head;
    private MyNode<T> tail;
    private int length;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void set(int index, T item) {
        MyNode<T> node = getNode(index);
        node.data = item;
    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(item);
        } else if (index == length) {
            addLast(item);
        } else {
            MyNode<T> newNode = new MyNode<>(item);
            MyNode<T> current = getNode(index);

            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;

            length++;
        }
    }

    @Override
    public void addFirst(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    @Override
    public void addLast(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    @Override
    public T getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    @Override
    public void remove(int index) {
        MyNode<T> nodeToRemove = getNode(index);
        removeNode(nodeToRemove);
    }

    @Override
    public void removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        removeNode(head);
    }

    @Override
    public void removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        removeNode(tail);
    }

    private void removeNode(MyNode<T> node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }

        length--;
    }

    @Override
    public void sort() {
        // Implementation of sorting (could be merge sort for linked list)
        // This is a simple bubble sort for demonstration
        if (length <= 1) return;

        boolean swapped;
        do {
            swapped = false;
            MyNode<T> current = head;
            while (current.next != null) {
                if (((Comparable<T>) current.data).compareTo(current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    @Override
    public int indexOf(Object object) {
        MyNode<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(object)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        MyNode<T> current = tail;
        int index = length - 1;
        while (current != null) {
            if (current.data.equals(object)) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[length];
        MyNode<T> current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public int size() {
        return length;
    }

    private MyNode<T> getNode(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }

        MyNode<T> current;
        if (index < length / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = length - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}