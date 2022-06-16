public class person {
   private String name;
   public int age;
   public String occupation;
   public String home;

    public String sayHello() {
        return String.format("Hello, my name is %s, and I am %d years old. I am from %s and I am a %s.", this.name, this.age, this.home, this.occupation);
    }

    public person(String name, int age,String home, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.home = home;
    }

    public void getName(String name) {
        this.name = name;
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

    public person() {
    }

    public static void main(String[] args) {
        person romeo = new person("Romeo", 24, "Washington State", "Linguist/Software Engineer");
        person romeo2 = romeo;
        romeo.setName("Rome");
        romeo.getName(romeo.name);
        romeo2.getName(romeo.name);
        System.out.println(romeo.name);
        System.out.println(romeo.name);
        System.out.println(romeo.sayHello());
    }
}
