package CollectionFrameworks.ArrayList;

public interface CarList {
    Car get(index);
    void add(Car car);
    boolean remove(Car car);
    boolean removeAt(index);
    int size();
    void clear();
}
