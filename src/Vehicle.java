public abstract class Vehicle implements Costable {
    protected int wheelCount;



    public Vehicle(int wheelCount){
        this.wheelCount = wheelCount;
    }

    protected abstract void printInfo();


}
