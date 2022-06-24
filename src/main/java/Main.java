public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.maxSpeed = 230;
        car2.maxSpeed = 170;

        car1.run();
        car2.run();

    }

}

class Car {
    int maxSpeed;

//    public Car(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }


    void run() {
        System.out.println("자동차가 최고속력 " + maxSpeed +  "으로 달리고 있습니다.");
    }
}