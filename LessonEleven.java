public class LessonEleven {

    public static void main(String[] args) {
        Cat cat = new Cat("Гарфилд", 5, 100);
        Dog dog = new Dog("Хатико", 8, 2, 200);
        Horse horse = new Horse("Болашақ қазы", 15, 3, 300);

        cat.run(10);
        cat.swim(6);
        cat.info();

        dog.run(60);
        dog.swim(30);
        dog.info();

        horse.run(200);
        horse.swim(40);
        horse.info();
    }
}