package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО Сотрудника - " + fullName);
        System.out.println();

        String fullNameUpper = fullName.toUpperCase();
        System.out.print("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
        System.out.println();

        String fullName1 = fullName.replace("Ivanov Ivan Ivanovich", "Иванов Семён Семёнович");
        fullName1 = fullName1.replace("ё", "е");
        fullName1 = fullName1.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName1);
    }
}
