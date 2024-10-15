class Animal {
    protected String name;
    protected double runSpeed;  // м/с
    protected double swimSpeed; // м/с
    protected int endurance;    // условные единицы
    protected boolean tired = false;

    public Animal(String name, double runSpeed, double swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    public double run(int distance) {
        if (tired) {
            System.out.println(name + " слишком устал(а) и не может бежать.");
            return -1;
        }

        int staminaCost = distance; // 1 ед выносливости на метр бега
        if (staminaCost > endurance) {
            tired = true;
            System.out.println(name + " устал(а) и не смог(ла) пробежать " + distance + " метров.");
            return -1;
        }

        double timeTaken = distance / runSpeed;
        endurance -= staminaCost;
        System.out.println(name + " пробежал(а) " + distance + " метров за " + String.format("%.2f", timeTaken) + " секунд.");
        return timeTaken;
    }

    public double swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        return -1;
    }

    public void info() {
        String tiredStatus = tired ? "устал(а)" : "в порядке";
        System.out.println(name + " имеет " + endurance + " ед. выносливости и " + tiredStatus + ".");
    }
}