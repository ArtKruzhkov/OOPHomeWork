package HomeWork04.Task1;

public class Program {
    public static void main(String[] args) {
        Calendar<MainTask> c1 = new Calendar<>("March");
        c1.add(new MainTask(2.30, 5, "Рабочее_Собрание", "Иван", "ПрезентацияПроекта"));
        c1.get(0).changeTheme("Важное Рабочее Собрание");
        c1.get(0).setName("Важная Презентация Проекта");
        c1.get(0).changeDuration(2.25);
        c1.add(new MainTask(1.30, 2, "Сдача отчетов", "Максим", "Итоговый отчет"));

        Calendar<AdditionalTask> c2 = new Calendar<>("MarchAdTasks");
        c2.add(new AdditionalTask(1.50, 15, "Футбольный матч", "Федор", "Стадион ФК Ястреб", 4));
        c2.get(0).changeResponsible("Петр");
        c2.get(0).setLocation("Стадион ФК Рубин");
        

        
        for (int index = 0; index < c1.count(); index++) {
            System.out.println(c1.get(index));
        }

        for (int index = 0; index < c2.count(); index++) {
            System.out.println(c2.get(index));
        }

    }
}
