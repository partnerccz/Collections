package com.cz.jdk.map;

/**
 * @author partner
 * @date 2018/5/30 18:58
 */
public class MyHashMap implements MyMap {
    private Node [] table;
    private Integer initSize;

    public MyHashMap(Integer initSize) {
        this.initSize = initSize;
        this.table = new Node[initSize];
    }

    public Object get(Object key) {
        Integer i = indexOf(key);
        Node node = table[i];
        if (node != null) {
            Object compareKey = node.getKey();
            while (!key.equals(compareKey)) {
                node = node.nextNode;
                if (node != null) {
                    compareKey = node.getKey();
                }else {
                    break;
                }
            }
        }
        if (node != null) {
            return node.getValue();
        }
        return null;
    }

    public void put(Object key, Object value) {
        Integer i = indexOf(key);
        Node thisNode = new Node(key, value);
        if (table[i] != null) {
            Node node = table[i];
            Node next = node.nextNode;
            for (; next != null; ) {
                node = next;
                next = node.nextNode;
            }
            node.setNextNode(thisNode);
        } else {
            table[i] = thisNode;
        }
    }


    private Integer indexOf(Object key) {
        if (key != null) {
            return key.hashCode()%this.initSize;
        }
        return 0;
    }


    private class Node{
        private Object key;
        private Object value;
        private Node nextNode;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }
}
