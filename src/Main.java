public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество колес и дверей в машине");
        Car car = new Car(Car.scanne(), Car.scanne());
            car.printInfo();
        System.out.println("Введите количество колес и скорость матоцикла");
        Motorcycle motorcycle = new Motorcycle(Car.scanne(), Car.scanne());
            motorcycle.printInfo();
    }
}
