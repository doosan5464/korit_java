package chapter07.animalApp;

/*
=== 동물 관리 시스템 ===
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // === 서비스 계층 생성 ===
        AnimalService service = new AnimalService();

        // 동물을 관리하는 List 생성
        ArrayList<Animal> animals = new ArrayList<>();

        // 동적 배열에 객체 추가 - 업캐스팅
        animals.add(new Cat()); // 자동으로 Animal 타입으로 Upcasting. Animal 타입만 들어갈 수 있기 때문에
        animals.add(new Dog());
        animals.add(new Cat());

        // 동적 배열의 모든 동물들을 service 로 처리
        for(Animal animal : animals) {
            service.handleAnimal(animal);
        }
        // 야옹!
        // 멍멍!
        // 야옹!

        // 객체 생성 및 처리
        Animal cat = new Cat();
        Animal dog = new Dog();

        service.handleAnimal(cat); // 야옹!
        service.handleAnimal(dog); // 멍멍!


        // cat.eat();
        if (cat instanceof Cat) {
            Cat onlyCat = (Cat) cat;
            // 다운 캐스팅! - 해당 클래스가 가진 고유 멤버에 접근 가능
            onlyCat.eat(); // 나는 츄르가 좋아
        }
    }
}
