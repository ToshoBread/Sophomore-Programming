import java.util.Scanner;
public class Train {
    protected static TrainCar engine;

    public Train() {
        engine = new TrainCar(0, "ENGINE", null);
    }

    public static void addCar() {
        TrainCar newCar = new TrainCar(1, null, null);

        TrainCar last = engine;

        while (last.getNextCar() != null) {
            last = last.getNextCar();
        }

        last.setNextCar(newCar);
    }

    public static void removeCar(int carNumber) {

    }

    public static void switchCars(int car1, int car2) {

    }

    public static void loadCargo(int carNumber, String cargo) {

    }

    public static void unloadCargo(int carNumber) {

    }

    public static void displayTrain() {

    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true){
            System.out.println("1. Add a Car");
            System.out.println("2. Remove a Car");
            System.out.println("3. Switch Two Cars");
            System.out.println("4. Load a Car");
            System.out.println("5. Unload a Car");
            System.out.println("6. Display the Train");
            System.out.println("7. Exit");
            System.out.print("Enter an option: ");
            int choice = userInput.nextInt();

            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                default:
            }
        }
    }
}