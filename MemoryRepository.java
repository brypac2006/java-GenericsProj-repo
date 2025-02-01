import java.util.ArrayList;
/**
 * Memory-based implementation of a generic repository.
 */
public class MemoryRepository<T> implements Repository<T> {
    private final ArrayList<T> items = new ArrayList<>();

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public T get(int index) {
        return items.get(index);
    }

    @Override
    public void update(int index, T item) {
        items.set(index, item);
    }

    

    @Override
    public int size() {
        return items.size();
    }
} 