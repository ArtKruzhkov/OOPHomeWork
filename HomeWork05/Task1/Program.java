package HomeWork05.Task1;

public class Program {
    public static void main(String[] args) {
        Company<Worker> c1 = new Company<>("Yandex");
        c1.add(new Worker(24, "10.02.99", "male",
        "Kapin", "Evgeniy", 808, "YandexEda", "ADManager"));
        c1.get(0).setCompany("YandexTaxi");
        c1.get(0).setId(786);

        c1.add(new Worker(25, "14.05.98", "female", 
        "Lapina", "Nadezhda", 989, "YandexEda", "Support"));
        c1.get(1).setLastName("Kapina");
        c1.get(1).setPosition("HeadSupport");
        c1.get(1).setId(991);

        c1.add(new Worker(20, "07.01.03", "male", 
        "Berlov", "Dmitry", 643, "YandexTaxi", "Driver"));
        c1.add(new Worker(19, "19.02.04", "male", 
        "Knigov", "Alexey", 643, "YandexEda", "Courier"));
        c1.add(new Worker(21, "23.03.02", "male", 
        "Metlov", "Philipp", 643, "YandexEda", "Courier"));

        for (int index = 0; index < c1.count(); index++) {
            System.out.println(c1.get(index));
        }

        c1.remove(c1, 4);

        System.out.println("--------------------------");

        for (int index = 0; index < c1.count(); index++) {
            System.out.println(c1.get(index));
        }
    }
}
