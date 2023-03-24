public class Taxi extends Car {
	private double fareCollected;

	public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
		super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
		this.fareCollected = fareCollected;
	}

	public boolean chargeAndDropOffRiders(double farePerRider) {
		int toDrop = getPassengers() - 1;
		if (!dropOffPassengers(toDrop))
			return false;
		fareCollected += farePerRider * toDrop;
		return true;
	}

	public double getFareCollected() {
		return fareCollected;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Total fare collected: " + fareCollected);
	}

	public void printIsTaxi() {
		System.out.println("This is a taxi!");
	}
}
