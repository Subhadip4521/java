public class Inheritance {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
    }
}


class Vehicle {
    int wheelCount;

    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    int wheelCount = 4;
}