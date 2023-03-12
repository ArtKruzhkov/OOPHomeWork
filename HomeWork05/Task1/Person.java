package HomeWork05.Task1;

public abstract class Person {
    protected int age;
    private String dob;
    private String gender;
    protected String LastName;
    protected String FirstName;
    
    public Person(int age, String dob, String gender, String LastName, String FirstName) {
        this.age = age;
        this.dob = dob;
        this.gender = gender;
        this.LastName = LastName;
        this.FirstName = FirstName;
    }

    public Person() {
        this.LastName = "DefaultLastName";
        this.FirstName = "DefaultFirstName";
    }

    public int getAge() {
        return this.age;
    }

    public String getDOB() {
        return this.dob;
    }

    public String getGender() {
        return this.gender;
    }

    public String getLastName() {
        return this.LastName;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public abstract void setAge(int age);
    public abstract void setLastName(String LastName);
    public abstract void setFirstName(String FirstName);
}
