package collectionUpdated.Generic;

public class generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public T show(){
        System.out.println(t);
        return t;
    }
}
