package launchcode.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, int storageCapacity, int remainingCapacity, int capacityUsed, String diskType) {
        super(name, storageCapacity, remainingCapacity, capacityUsed, diskType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Would you like to play a game?");

    }

    @Override
    public void destroyMicrowave() {
        System.out.println("Destroys all CDs");

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
