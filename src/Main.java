public class Main {
    public static void main(String[] args) {

        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Iovanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +firstName +" "+ middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — "  + fullName1);
    }
}

