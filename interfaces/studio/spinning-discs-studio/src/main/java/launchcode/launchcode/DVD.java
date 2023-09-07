package launchcode.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, int storageCapacity, int remainingCapacity, int capacityUsed, String diskType) {
        super(name, storageCapacity, remainingCapacity, capacityUsed, diskType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD Spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
    }

    @Override
    public void destroyMicrowave() {
        System.out.println("Destroy all DVDs");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
