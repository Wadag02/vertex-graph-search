package DMS.asigment2;

import java.util.NoSuchElementException;

public class MyStack<T> {  // Добавлен generic тип <T>
    private final MyList<T> list;  // Добавлено поле для хранения элементов

    public MyStack() {
        this.list = new MyArrayList<>();  // Инициализация (или new MyLinkedList<>())
    }

    public void push(T item) {  // Исправлен параметр (было [])
        list.addLast(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T item = list.getLast();
        list.removeLast();
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}