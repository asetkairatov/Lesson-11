class Cat extends Animal {
    public Cat(String name, double runSpeed, int endurance) {
        super(name, runSpeed, 0, endurance); // Коты не умеют плавать
    }

    @Override
    public double swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        return -1;
    }
}