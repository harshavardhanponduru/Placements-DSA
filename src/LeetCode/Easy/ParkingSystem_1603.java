package LeetCode.Easy;

public class ParkingSystem_1603
{
    int big;
    int medium;
    int small;

    public ParkingSystem_1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        }
        if (carType == 2 && medium > 0) {
            medium--;
            return true;
        }
        if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem_1603 parkingSystem = new ParkingSystem_1603(1, 1, 0);

        System.out.println(parkingSystem.addCar(1)); // true
        System.out.println(parkingSystem.addCar(2)); // true
        System.out.println(parkingSystem.addCar(3)); // false
        System.out.println(parkingSystem.addCar(1)); // false
    }
}
