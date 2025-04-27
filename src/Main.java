public class Main {
    public static void main(String[] args) {


        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);



        String firstName1 = "Ivan";
        String middleName1 = "Ivanovich";
        String lastName1 = "Ivanov";
        String fullName1 = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        String fullName3= "Иванов Семён Семёнович";
        fullName3 = fullName3.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName3);
    }


}