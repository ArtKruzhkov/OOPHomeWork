package HomeWork04.Task1;

public class MainTask extends Task{

    private String name;
    private int priority = 1;

    public MainTask(double duration, int deadline, String theme, String responsible, String name) {
        super(duration, deadline, theme, responsible);
        this.name = name;
    }

    public MainTask() {
        super();
        this.name = "DefaultMainTask";
    }


    public int getPriority() {
        return this.priority;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void changeTheme(String theme) {
       super.theme = theme;
    }

    @Override
    public void changeDuration(double duration) {
       super.duration = duration;
    }

    @Override
    public void changeDeadline(int deadline) {
       super.deadline = deadline;
    }

    @Override
    public void changeResponsible(String responsible) {
        super.responsible = responsible;
    }

    @Override
    public String toString() {
        return String.format("Главная задача: %s. Тема: %s. Длительность: %.2f. Дедлайн: %d дней. Ответственный: %s", 
        this.name, super.theme, super.duration, super.deadline, super.responsible);
    }
    
    
}
