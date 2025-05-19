package DMS.asigment2;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private final MyList<T> list;  // Поле для хранения элементов

    public MyQueue() {
        this.list = new MyLinkedList<>();  // Инициализация (или MyArrayList<>)
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T item = list.getFirst();  // Сначала получаем элемент
        list.removeFirst();        // Затем удаляем
        return item;               // Возвращаем сохраненный элемент
    }

    public T peek() {  // Переименовано с pass() на peek()
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}