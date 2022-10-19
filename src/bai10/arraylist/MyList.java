package bai10.arraylist;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public Object[] getElements() {
        return elements;
    }

    public int size() {
        return size;
    }

    public void ensureCapacity(int minCapacity) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length + minCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public void add(int index, E element) {
        ensureCapacity(1);
        if (index > 0 && index < elements.length) {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
        }
        size++;
    }

    public void addAll(MyList<E> myList) {
        Object[] objects = myList.getElements();
        ensureCapacity(myList.size());
        for (int i = size; i < elements.length; i++) {
            elements[i] = objects[i - size];
            size++;
        }
//        size += myList.size();
    }

    public E remove(int index) {
        E element = null;
        if (index > 0 && index < elements.length) {
            element = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
        }
        size--;
        return element;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity(1);
        elements[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        E element = null;
        if (index > 0 && index < elements.length) {
            element = (E) elements[index];
        }
        return element;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
