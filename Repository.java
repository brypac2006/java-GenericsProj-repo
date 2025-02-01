public interface Repository<T> {
    void add(T item);
    T get(int index);
    void update(int index, T item);
    void delete(int index);
    int size();
}

