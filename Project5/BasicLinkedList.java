import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Contains the BasicLinkedList class. Uses generic <E> parameter for elements
 * in the list. Implements the BasicList and java.lang.Iterable interfaces.
 * 
 * @author Zeph Nord
 * @version Project 5
 * @version CPE102-5
 * @version Fall 2016
 */
public class BasicLinkedList<E> implements BasicList<E> {

    // instance variables - should be no more than three
    // Should I use a an arrayList instead of nodes?
    private int count;
    private Node<E> head;
    private Node<E> tail;

    // inner Node class
    private class Node<AnyType> {
        private E data;
        private Node<E> next;
        private Node<E> previous;

        public Node() {
            this.next = null;
            this.previous = null;
        }
    }

    /**
     * Constructs an empty BasicLinkedList
     */
    public BasicLinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = head;
    }
    @Override
    public void add(E element) {
        // TODO Auto-generated method stub
        Node<E> node = new Node<E>();
        node.data = element;
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = tail.next;
        }
        count++;
    }

    @Override
    public void add(int index, E element) {
        Node<E> node = new Node<E>();
        node.data = element;
        Node<E> tmp = head;
        if ((index > count || index < 0) && index != 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        if (index == 0 && count == 0) {
            head = node;
            tail = head;
        } else if (index == 0 && count >= 1) {
            head = node;
            head.next = tmp;
            tmp.previous = head;
        } else if (index == count) {
            tmp.next = node;
            node.previous = tmp;
            tail = node;
        } else {
            node.next = tmp.next;
            node.previous = tmp;
            node.next.previous = node;
            tmp.next = node;
        }
        count++;
    }

    @Override
    public void clear() {
        this.count = 0;
        this.head = null;
    }

    @Override
    public boolean contains(E element) {
        Node<E> tmp = head;
        while (tmp != null) {
            if (tmp.data == null || tmp.data.equals(element)) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    @Override
    public E get(int index) {
        Node<E> tmp = head;
        try {
            if (index == 0 && count >= 1)
                return head.data;
            if (index == 0 && count == 0 || index < 0 || index > count - 1)
                throw new IndexOutOfBoundsException();
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
        if (tmp.data == null) {
            return null;
        }
        return tmp.data;
    }

    @Override
    public int indexOf(E element) {
        Node<E> tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data == null || tmp.data.equals(element)) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        throw new NoSuchElementException();
    }

    @Override
    public E remove(int index) {
        Node<E> current = head;
        Node<E> trailing = head;
        E tmp = null;
        if (count == 0 || index > count - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            if (count == 1) {
                tmp = head.data;
                clear();
                return tmp;
            }
            else {
                trailing = current;
                tmp = trailing.data;
                current = current.next;
                trailing.next = null;
                current.previous = null;
                head = current;
            }
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next; // Current will point at the node to be
            }
            if (index < count - 1) {
                tmp = current.next.data;
                current.next = current.next.next;
                current.next.previous = current;
            } else {
                tmp = current.next.data;
                current.next.previous = null;
                current.next = null;
                tail = current;
            }
        }
        count--;
        return tmp;
    }

    @Override
    public E set(int index, E element) throws IndexOutOfBoundsException {
        Node<E> tmp = head;
        E tmpData;
        if (index > count - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        try {
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
        } catch (IndexOutOfBoundsException ex) {
            throw new IndexOutOfBoundsException();
        }
        tmpData = tmp.data;
        tmp.data = element;

        return tmpData;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BasicListIterator<E> basicListIterator() {
        return new BasicList_Iterator<E>();
    }

    // private inner class BasicList_Iterator
    public class BasicList_Iterator<AnyType> implements BasicListIterator<E> {
        private Node<E> leading;
        private Node<E> trailing;
        private int iter;

        public BasicList_Iterator() {
            leading = head;
            trailing = null;
            iter = 1;
        }

        @Override
        public boolean hasNext() {
            return leading != null;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            E tmp = leading.data;
            // now update the link
            trailing = leading;
            leading = leading.next;
            iter++;
            if (tmp == null) {
                return null;
            }
            return tmp;
        }

        @Override
        public boolean hasPrevious() {
            return trailing != null;
        }

        @Override
        public E previous() {
            if (!hasPrevious())
                throw new NoSuchElementException();
            E tmp = trailing.data;
            leading = trailing;
            trailing = trailing.previous;
            return tmp;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}