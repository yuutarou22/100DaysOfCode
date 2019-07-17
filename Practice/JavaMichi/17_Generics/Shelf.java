public class Shelf<T> {
    private T value;

    public void setValue (T value) {
        this.value = value;
    }

    public void getValue () {
        return value;
    }
}