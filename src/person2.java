import javax.xml.stream.StreamFilter;

public class person2 {
    private String firstname;
    private String lastname;

    public person2(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getName(String firstname, String lastname){
//TODO: return the person's name
        String name = firstname + " " + lastname;
        return name;
    }
    public void setName(String firstname, String lastname){
//TODO: change the name field to the passed value
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, my name is %s %s!", firstname, lastname);
    }


    public static void main(String[] args) {
        person2 person = new person2("Sammy", "Man");
        System.out.println(person.firstname);
        System.out.println(person.getName("River", "Run"));
        person.setName("Jack", "Frost");
        System.out.println(person.firstname);
        person.sayHello();


    }
}
