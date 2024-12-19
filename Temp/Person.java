package Temp;

import lombok.Data;

@Data
public class Person {
    private final String name;
    private int age;

    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.setAge(25);
        // person.setName("d"); name은 final이라 setter가 생성되지 않음
        System.out.println(person); // 출력: Person(name=Alice, age=25)
    }
}
