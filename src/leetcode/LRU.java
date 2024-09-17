package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    class Node {
        Node next, prev;
        int key, value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    int size;
    Map<Integer, Node> map = new HashMap<>();

    public LRU(int size) {
        this.size = size;
        head.next = tail;
        tail.prev = head;


    }


    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node data = map.get(key);
        remove(data);
        insert(data);

        return data.value;
    }

    public void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node) {
    map.put(node.key,node);
    Node headNext= head.next;
    head.next = node;
    node.prev=head;
    headNext.prev = node;
    node.next = headNext;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (size == map.size()) {
            remove(tail.prev);
        }
        insert(new Node(key, value));

    }
}
