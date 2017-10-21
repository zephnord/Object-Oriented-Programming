/**
 * Contains the BasicListIterator interface that extends the java.util.Iterator
 * interface. Uses Generic parameter <E> for elements in the list.
 * 
 * @author Zeph Nord
 * @version Project 5
 * @version CPE102-5
 * @version Fall 2016
 */

public interface BasicListIterator<E> extends java.util.Iterator<E> {
    /*
     * Methods inherited from java.util.Iterator: hasNext, next, remove.
     */

    /**
     * Returns true if the iterator has a previous element. This method does not
     * change the state of the iterator. Calling this method on a new
     * BasicListIterator before any calls to next() will always return false.
     * 
     * @return true if the iterator has a previous element, otherwise false.
     */
    public boolean hasPrevious();

    /**
     * Returns the previous element and moves the iterator backward one position
     * with O(1) performance.
     * 
     * @return the previous element.
     * @throws java.util.NoSuchElementException if there is no previous element.
     */
    public E previous();    
    public boolean hasNext();
    public E next();
    public void remove();
}
