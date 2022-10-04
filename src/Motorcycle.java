public class Motorcycle extends Vehicle{

    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed ){
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл\nКоличество колес:" + wheelCount);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Цена: " + getCost());
    }

    @Override
    public int getCost() {
        System.out.print("Введите цену");
        int cost = Car.scanne();
        return cost;
    }
}
