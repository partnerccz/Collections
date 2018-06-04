package com.cz.jdk.map;

/**
 * @author partner
 * @date 2018/5/30 19:19
 */
public class TestMap {
    public static void main(String[] args) {
        MyMap map = new MyHashMap(12);
        map.put(1,"111");
        map.put(3,"bbb");
        map.put("3","aaa");
        System.out.println(map.get(1));
    }
}
