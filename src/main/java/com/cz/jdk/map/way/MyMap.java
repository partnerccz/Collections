package com.cz.jdk.map.way;

/**
 * @author partner
 * @date 2018/5/31 15:36
 */
public interface MyMap<K,V> {
    public V get(K k);

    public V put(K k, V v);


    public interface Entry<K, V>{
        public K getKey();

        public V getValue();
    }
}
