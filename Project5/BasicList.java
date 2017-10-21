/**
 * Contains the BasicList interface that extends the java.lang.Iterable
 * interface. Uses generic <E> parameter for elements in the list.
 * 
 * @author Zeph Nord
 * @version Project 5
 * @version CPE102-5
 * @version Fall 2016
 */

public interface BasicList<E> extends java.lang.Iterable<E> {
    /**
     * Adds the specified element to the logical end of the list
     * 
     * @param element the element to be added
     */
    public void add(E element);

    /**
     * Adds (inserts) the specified element at the specified index of the list -
     * note that it does not overwrite any data existing in that location.
     * 
     * @param index the index to add the element
     * @param element the element to be added
     * @throws java.lang.IndexOutOfBoundException when the specified index is
     *             negative or past the logical end of the list
     */
    public void add(int index, E element);

    /**
     * Returns a reference to a BasicListIterator over the elements in this list
     * in the proper sequence (first-to-last order).
     * 
     * @return a reference to the BasicListIterator over the elements in the
     *         list
     */
    public BasicListIterator<E> basicListIterator();

    /**
     * Clears the list of its content - the list should be in the same state it
     * is after being constructed with the default constructor.
     */
    public void clear();

    /**
     * Using the provided element's equals method, the method determines if the
     * list contains the specified element or not.
     * 
     * @param element the element to search for
     * @return true if the list contains the element, otherwise false
     */
    public boolean contains(E element);

    /**
     * Returns a reference to the element at the specified index.
     * 
     * @return E the reference to the element
     */
    public E get(int index);

    /**
     * Using the provided element's equals method, this method returns the index
     * of the first element in the list that is equal to the provided element,
     * if any.
     * 
     * @param element the element to find the index of
     * @return the index of the first matching element, if any
     */
    public int indexOf(E element);

    /**
     * Returns a reference to a java.util.Iterator over the elements in this
     * list in the proper sequence(first-to-last order).
     */
    public java.util.Iterator<E> iterator();

    /**
     * Removes (and returns) the specified element from the list.
     * 
     * @param index the index to remove in the list
     * @return A reference the element that was removed
     */
    public E remove(int index);

    /**
     * Replaces the element at the specified index with the specified element.
     * 
     * @param index the index at which to replace the value of the element
     * @param element the element to replace with
     * @return the old element (before it was changed) at the specified index
     * @throws java.lang.OutOfBoundsException thrown when the specified index is
     *             negative or past the logical end of the list
     */
    public E set(int index, E element);

    /**
     * The logical size of the list (the number of elements that have been added
     * and not removed).
     * 
     * @return the number of elements currently in the list
     */
    public int size();
}
