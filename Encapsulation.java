class Human {
    private int age;
    private String name;

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        Human human = new Human();
        human.setAge(25);
        human.setName("Sweta");

        System.out.println(human.getName() + " " + human.getAge());
        
    }
}