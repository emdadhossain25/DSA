package array;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class Array<T> implements Iterable<T> {

    public static final int DEFAULT_CAPACITY = 1 << 3;  // 1 * 2^3 decimal or 1000 in binary add 3 zeros from left to right
    private T[] arr;
    int length = 0; // what the user thinks size
    int capacity = 0; // actual size

    public Array() {
        this(16); // default constructor with 16 capacity hard coded
    }

    public Array(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity" + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];

    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index) {
        if (index > length - 1 || index < 0) throw new ArrayIndexOutOfBoundsException("index is out of bound");
        return arr[index];
    }

    public T set(int index, T element) {
        if (index > (length - 1) || index < 0) throw new ArrayIndexOutOfBoundsException("index is out of bound");
        arr[index] = element;
        return arr[index];
    }


    public void clear() {
        for (int i = 0; i < capacity; i++)
            arr[i] = null;
        length = 0;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }


}