package com.cz.jdk.list;

/**
 * @author partner
 * @date 2018/6/5 10:02
 */
public interface MyList<E> {
    E get(Integer index);

    void add(E e);

    void remove(Integer index);

    void insert(Integer index, E e);

    boolean contains(Object o);

    int size();

    boolean isEmpty();

    void clearAll();
}
