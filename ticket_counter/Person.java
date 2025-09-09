package ticket_counter;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    //using enum for gender
    enum Gender {
        MALE,
        FEMALE,
        OTHER
    };
    Person(String name, int age,Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
