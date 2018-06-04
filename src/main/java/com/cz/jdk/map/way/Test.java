package com.cz.jdk.map.way;


/**
 * @author partner
 * @date 2018/6/1 9:32
 */
public class Test {
    public static void main(String[] args) {
        MyMap<String, String> map = new MyHashMap<String, String>();

        for (int i = 0; i < 13; i++) {
            map.put("key" + i, "value" + i);
            map.put("key2", "valuebbb");
        }

        for (int i = 0; i < 13; i++) {
            System.out.println("key: " + "key" + i + "  value:"
                    + map.get("key" + i));
        }
    }
}
