public class PersonLecture {
   private String name;
   public int age;
   public String occupation;
   public String home;

    public PersonLecture(String name) {
        this.name = name;
    }


    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String sayHello() {
        return String.format("Hello, my name is %s, and I am %d years old. I am from %s and I am a %s.", this.name, this.age, this.home, this.occupation);
    }

    public PersonLecture(String name, int age, String home, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer setAge(int age) {
        return this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public PersonLecture() {
    }

    public static void main(String[] args) {
        PersonLecture romeo = new PersonLecture("Romeo", 24, "Washington State", "Linguist/Software Engineer");
        PersonLecture romeo2 = romeo;
        romeo.setName("Rome");
        romeo.getName();
        romeo2.getName();
        System.out.println(romeo.name);
        System.out.println(romeo.name);
        System.out.println(romeo.sayHello());
    }
}
