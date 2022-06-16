public class person {
   public String name;
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

    public person(){
    }

    public static void main(String[] args) {
        person romeo = new person("Romeo", 24, "Washington State", "Linguist/Software Engineer");
//        romeo.name = "Romeo";
//        romeo.age = 24;
//        romeo.occupation = "Linguist/Software Engineer";
//          romeo.home = "Washington State"

        System.out.println(romeo.sayHello());
    }
}
