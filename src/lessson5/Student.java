package lessson5;

public class Student {

    public String firstName;
    public String lastName;
    public int age;
    public int countLessons;

    public Student (String uFirstName, String uLastName){
        firstName = uFirstName;
        lastName = uLastName;
    }

    public Student (String uFirstName, String uLastName, int uAge){
        firstName = uFirstName;
        lastName = uLastName;
        age = uAge;
    }

    public Student (String uFirstName, String uLastName, int uAge, int uCountLessons){
        firstName = uFirstName;
        lastName = uLastName;
        age = uAge;
        countLessons = uCountLessons;
    }

    public String userInfo () {
        String userInfo = "Name: " + firstName + ", LastName: " + lastName;
        return userInfo;
    }

    public String userLessons () {
        String userLessons = lastName + " poseschaet " + countLessons + " zanyatiy";
        return userLessons;
    }

}
