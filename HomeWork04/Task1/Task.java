package HomeWork04.Task1;

public abstract class Task {
    protected double duration;
    protected int deadline;   // например дедлайн через 10 дней, поэтому инт, не знаю как работать с типом дата (
    protected String theme;
    protected String responsible;
   
    public Task(double duration, int deadline, String theme, String responsible) {
        this.duration = duration;
        this.deadline = deadline;
        this.theme = theme;
        this.responsible = responsible;
    }

    public Task() {
        this.duration = 1.30;
        this.deadline = 10;
        this.theme = "DefaultTheme";
        this.responsible = "UserName";
    }

    public double getDuration() {
        return this.duration;
    }

    public int getDeadline() {
        return this.deadline;
    }

    public String getTheme() {
        return this.theme;
    }

    public String getResponsible() {
        return this.responsible;
    }


    public abstract void changeTheme(String theme);

    public abstract void changeDuration(double duration);

    public abstract void changeDeadline(int deadline);

    public abstract void changeResponsible(String responsible);

    
}
