import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        if (iterator.hasNext()) {
            nextElement = iterator.next();
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextElement;
    }

    @Override
    public Integer next() {
        Integer current = nextElement;
        nextElement = iterator.hasNext() ? iterator.next() : null;
        return current;
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }
}
