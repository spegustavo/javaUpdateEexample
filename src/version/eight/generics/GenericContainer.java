package version.eight.generics;

public class GenericContainer<T> {

    private T obj;

    public GenericContainer(){
    }

    // Pass type in as parameter to constructor
    public GenericContainer(T t){
        obj = t;
    }

    /**
     * @return the obj
     */
    public T getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T t) {
        obj = t;
    }
}
