package seminars.second.hw;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
class VehicleTest {
    // Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
    // (используя оператор instanceof).
    @Test
    public void testCarInstance() {
        Car car = new Car("Toyota", "Camry", 2021);
        assertTrue(car instanceof Vehicle);
    }
    // Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarNumWheels() {
        Car car = new Car("Toyota", "Camry", 2021);
        assertEquals(4, car.getNumWheels());
    }
    // Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotorcycle () {
        Motorcycle motorcycle = new Motorcycle("Toyota", "Ямаха", 2000);
        assertEquals(2, motorcycle.getNumWheels());
    }
    // Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarSpeed() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    // (используя метод testDrive()).
    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2019);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // машина останавливается (speed = 0).
    @Test
    public void testCarPark() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2019);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
