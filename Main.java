public class Main {
    public static void main(String[] args) {
        // create and object person
        Person person = new Person();

        // set the properties of the created object
        person.setFirstName("");//First name is set to empty string
        person.setLastName("");//Last name is set to empty string
        person.setAge(10);

        //print the full name of the person
        System.out.println("Full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        // set first name 
        person.setFirstName("John");
        person.setAge(18);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("Full name = " + person.getFullName());


    }
}
