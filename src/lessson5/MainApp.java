package lessson5;

public class MainApp {

    public static void main(String[] args) {

        Student gleb = new Student("Gleb", "Alekseev", 31, 5);
        Student masha = new Student("Masha", "Sokolova", 23, 4);
        Student pasha = new Student("Pasha", "Ivanov", 29, 5);

        String glebInfo = gleb.userInfo();
        String mashaSum = masha.userInfo();
        String pashaSum = pasha.userInfo();

        String glebLessons = gleb.userLessons();
        String mashaLessons = masha.userLessons();
        String pashaLessons = pasha.userLessons();

        System.out.println(glebInfo);
        System.out.println(mashaSum);
        System.out.println(pashaSum);

        System.out.println(glebLessons);
        System.out.println(mashaLessons);
        System.out.println(pashaLessons);
    }
}
