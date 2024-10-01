public class TrainCar {
    private int carNumber;
    private String cargo;
    private TrainCar nextCar;

    public TrainCar(int carNumber, String cargo, TrainCar nextCar) {
        this.carNumber = carNumber;
        this.cargo = cargo;
        this.nextCar = nextCar;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public String getCargo() {
        return cargo;
    }

    public TrainCar getNextCar() {
        return nextCar;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNextCar(TrainCar nextCar) {
        this.nextCar = nextCar;
    }
}
