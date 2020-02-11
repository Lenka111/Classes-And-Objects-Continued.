// Elena Voinu
// Object properties and behaviour
public class Person {
    // instance variables (fields)
    private String firstName;
    private String lastName;
    private int age;
    
    //creeate setters and getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
    // if the value of age is less than zero or greater than 100, set the age to zero.
        if(age < 0 || age > 100)
            this.age = 0;
    // else set the value of age to the field age
        else
            this.age = age;
    }
    // check if the person is a teen and return true if age is 12 ->20
    public boolean isTeen(){
        return age > 12 && age < 20;
    }
    public String getFullName(){
        // check if the String is empty and return it 
        if (firstName.isEmpty() && lastName.isEmpty())
            return "";
        // if firstName is empty, return the lastName
        if(firstName.isEmpty())
            return lastName;
        //if lastName is empty, return the firstName;
        if(lastName.isEmpty())
            return firstName;
        // if none of the strings is empty, return the full name
        //String concatenation
        return (firstName + " "+ lastName);
    }
}
