public class person {
   public String name;
   public int age;
   public String occupation;

    public String sayHello() {
        return String.format("Hello, my name is %s, and I am %d years old. I am a %s.", this.name, this.age, this.occupation);
    }

    public person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public person(){
    }

    public static void main(String[] args) {
        person romeo = new person("Romeo", 24, "Linguist/Software Engineer");
//        romeo.name = "Romeo";
//        romeo.age = 24;
//        romeo.occupation = "Linguist/Software Engineer";

        System.out.println(romeo.sayHello());
    }
}
