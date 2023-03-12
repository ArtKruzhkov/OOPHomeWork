package HomeWork05.Task1;

import java.util.ArrayList;
import java.util.List;


public class Company<T extends Person> {
    List<T> c;
    private String companyName;

    public Company(String companyName) {
        c = new ArrayList<T>();
        this.companyName = companyName;
    }

    public Company() {
        c = new ArrayList<T>();
    }
    
    public void add(T worker) {
        c.add(worker);
    }

    public void remove(Company<Worker> list, int i) {
        c.remove(i);
    }

    public T get(int index) {
        return c.get(index);
    }

    public int count() {
        return c.size();
    }

    public String getCompanyName() {
        return this.companyName;
    }

}
