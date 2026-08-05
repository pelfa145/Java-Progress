public class Main {
    public static void main(String[]args) {
        Car car1 = new Car("Gallardo", "Yellow");
        Car car2 = new Car("Corvette", "Red");
        Car car3 = new Car("BMW","Blue");

        Car[] cars = {car1,car2,car3};

        for(Car car : cars){
            car.color = "black";
            car.drive();
        }
    }
}
