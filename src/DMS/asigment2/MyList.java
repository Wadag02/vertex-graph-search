package DMS.asigment2;

public interface MyList<T> extends Iterable<T> {
    void add(T item);                      // Добавить элемент в конец
    void set(int index, T item);           // Установить элемент по индексу
    void add(int index, T item);           // Добавить элемент по индексу
    void addFirst(T item);                 // Добавить в начало
    void addLast(T item);                  // Добавить в конец
    T get(int index);                      // Получить элемент по индексу
    T getFirst();                         // Получить первый элемент
    T getLast();                          // Получить последний элемент
    void remove(int index);                // Удалить по индексу
    void removeFirst();                    // Удалить первый
    void removeLast();                     // Удалить последний
    void sort();                          // Сортировка
    int indexOf(Object object);           // Индекс первого вхождения
    int lastIndexOf(Object object);       // Индекс последнего вхождения
    boolean exists(Object object);        // Проверка наличия
    Object[] toArray();                   // Преобразовать в массив
    void clear();                         // Очистить список
    int size();                           // Размер списка
}