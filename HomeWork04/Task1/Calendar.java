package HomeWork04.Task1;
import java.util.List;
import java.util.ArrayList;

public class Calendar<T extends Task> {
    List<T> c;
    public String month;

    public Calendar(String month) {
        c = new ArrayList<>();
        this.month = month;
    }

    public void add(T task) {
        c.add(task);
    }

    public T get(Integer index) {
        return c.get(index);
    }

    public int count() {
        return c.size();
    }
}
