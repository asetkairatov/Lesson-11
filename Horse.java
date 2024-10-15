class Horse extends Animal {
    public Horse(String name, double runSpeed, double swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public double swim(int distance) {
        if (tired) {
            System.out.println(name + " слишком устал(а) и не может плыть.");
            return -1;
        }

        int staminaCost = distance * 4; // 4 ед выносливости на метр плавания
        if (staminaCost > endurance) {
            tired = true;
            System.out.println(name + " устал(а) и не смог(ла) проплыть " + distance + " метров.");
            return -1;
        }

        double timeTaken = distance / swimSpeed;
        endurance -= staminaCost;
        System.out.println(name + " проплыл(а) " + distance + " метров за " + String.format("%.2f", timeTaken) + " секунд.");
        return timeTaken;
    }
}