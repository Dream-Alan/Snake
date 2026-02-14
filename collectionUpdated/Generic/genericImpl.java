package collectionUpdated.Generic;

public class genericImpl<T> implements genericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
