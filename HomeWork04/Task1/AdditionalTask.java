package HomeWork04.Task1;

public class AdditionalTask extends Task {
    private String location;
    private int priority;
    
    public AdditionalTask(double duration, int deadline, String theme, String responsible, String location, int priority) {
        super(duration, deadline, theme, responsible);
        this.location = location;
        this.priority = priority;
        if(priority == 1) {
            System.out.println("Приоритет 1 назначается только для задач основного типа. Приоритет изменен на 2");
            this.priority = 2;
        }
    }

    public AdditionalTask() {
        super();
        this.location = "DefaultLocation";
        this.priority = 2;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getLocation() {
        return this.location;
    }

    public void setPriority(int priority) {
        this.priority = priority;
        if(priority == 1) {
            System.out.println("Приоритет 1 назначается только для задач основного типа. Приоритет изменен на 2");
            this.priority = 2;
        }
    }
    
    public void setLocation(String location) {
        this.location = location;
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
        return String.format("Дополнительная задача. Тема: %s. Длительность: %.2f. Дедлайн: %d дней. Ответственный: %s. Локация: %s", 
        super.theme, super.duration, super.deadline, super.responsible, this.location);
    }

    
}
