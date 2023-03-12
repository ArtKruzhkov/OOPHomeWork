package HomeWork05.Task1;

public class Worker extends Person {
    private int id;
    private String companyName;
    private String position;

    public Worker(int age, String dob, String gender, String LastName, String FirstName, int id, String companyName, String position) {
        super(age, dob, gender, LastName, FirstName);
        this.id = id;
        this.companyName = companyName;
        this.position = position;
    }

    public Worker() {
        super();
        this.id = 100;
        this.companyName = "DefaultCompanyName";
        this.position = "DefaultPosition";
    }

    public int getId() {
        return this.id;
    }

    public String getCompany() {
        return this.companyName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.companyName = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void setAge(int age) {
        super.age = age;
    }

    @Override
    public void setLastName(String LastName) {
        super.LastName = LastName;
    }

    @Override
    public void setFirstName(String FirstName) {
        super.FirstName = FirstName;
    }

    @Override
    public String toString() {
        return String.format("Работник компании: %s. Должность: %s. ID: %d. Имя: %s. Фамилия: %s. Возраст: %d", 
        this.companyName, this.position, this.id, super.FirstName, super.LastName, super.age);
    }
}
