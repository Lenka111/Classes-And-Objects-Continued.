public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");//First name is set to empty srring
        person.setLastName("");//Last name is set to empty string
        person.setAge(10);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("Full name = " + person.getFullName());


    }
}
