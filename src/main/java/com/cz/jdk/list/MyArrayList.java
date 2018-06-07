package com.cz.jdk.list;

/**
 * @author partner
 * @date 2018/6/5 10:04
 */
public class MyArrayList<E> implements MyList<E> {
    private static Integer defaultLength =10;
    private Object[] elements = null;
    private Integer capacity;
    private Integer current;

    public MyArrayList() {
        this(defaultLength);
    }

    public MyArrayList(Integer size) {
        if (size < 0) {
            throw new RuntimeException("数组下标越界");
        }else {
            this.elements = new Object[size];
            this.current = 0;
            capacity = size;
        }
    }

    private void checkIndex(Integer index) {
        if (index > capacity || index < 0) {
            throw new RuntimeException("数组下标越界");
        }
    }

    private void checkSize() {
        if (this.current.equals(this.capacity)) {
            this.capacity =this.capacity+defaultLength;
            Object[] newElements = new Object[this.capacity];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            this.elements =newElements;
        }
    }

    @Override
    public E get(Integer index) {
        checkIndex(index);
        return (E) elements[index];
    }

    @Override
    public void add(E e) {
        checkSize();
        this.elements[current] =e;
        this.current++;
    }

    @Override
    public void remove(Integer index) {
        checkIndex(index);
        for (int i = index; i < elements.length; i++) {
            if (i + 1 < elements.length) {
                elements[i] = elements[i + 1];
            }
        }
        current--;
    }

    @Override
    public void insert(Integer index, E e) {
        checkSize();
        checkIndex(index);
        for (int i = elements.length; i >= index; i--) {
            if (i + 1 < elements.length) {
                elements[i+1] =elements[i];
            }
        }
        elements[index] = e;
        current++;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]!=null && (o == elements[i] || elements[i].equals(o))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count ++;
                continue;
            }
            break;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        try{
            if (elements[0] != null) {
                return true;
            }
        }catch (NullPointerException e){
            return false;
        }
        return false;
    }

    @Override
    public void clearAll() {
        for (int i = elements.length-1; i >=0; i--) {
            elements[i] = null;
        }
    }
}
