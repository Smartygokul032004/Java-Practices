public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Yokesh", 25);
        Person person2 = new Person("Sanjai", 30);

        person1.displayInfo();
        person2.displayInfo();
    }
}
