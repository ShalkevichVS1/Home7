import java.util.Scanner;

public class Car extends Vehicle{

private int  doorsCount;

public Car(int wheelCount, int doorsCount){
    super(wheelCount);
    this.doorsCount = doorsCount;
}
public static int scanne (){
    Scanner scanner = new Scanner(System.in);
    int scan = scanner.nextInt();
    return scan;
}

    @Override
    public int getCost() {
        System.out.print("Введите цену");
    int cost = Car.scanne();
        return cost;
}

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Машина\nКоличество дверей: " + doorsCount);
        System.out.println("Количество колес: " + wheelCount);
        System.out.println("Цена: " + getCost());
    }
}
