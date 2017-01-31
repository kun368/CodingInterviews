package com.zzkun.T5;


class KListNode<E> {
    E val;
    KListNode<E> next = null;

    public KListNode(E val) {
        this.val = val;
    }
}

public class KList<E> {

    int size = 0;
    KListNode<E> head = null;

    void addTail(E val) {
        KListNode<E> cur = new KListNode<E>(val);
        if(head == null) {
            head = cur;
        } else {
            KListNode<E> p = head;
            while(p.next != null)
                p = p.next;
            p.next = cur;
        }
        ++size;
    }

    void removeNode(E val) {
        if(head == null)
            return;
        if(head.val.equals(val)) {
            head = head.next;
            return;
        }
        KListNode<E> p = head;
        while(p.next != null && !p.next.val.equals(val))
            p = p.next;
        if(p.next != null && p.next.val.equals(val))
            p.next = p.next.next;
        --size;
    }
}
