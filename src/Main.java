import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Пей Пи Вас", 1000054321),
                new Employee("Петров Петух", 60000),
                new Employee("Корч Корч", 35000),
                new Employee("Сидоров Сидор", 55000.01),
                new Employee("Кумыс Николай", 70000.00)
        };
        System.out.println("Отчёт на английском:");
        Report.generateReport(employees, new Locale("en", "US"));
        System.out.println("\n--------------------------------------\n");
        System.out.println("Отчёт на русском:");
        Report.generateReport(employees, new Locale("ru", "RU"));
        System.out.println("\n--------------------------------------\n");
    }
}