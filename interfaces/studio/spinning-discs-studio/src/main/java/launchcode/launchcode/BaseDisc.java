package launchcode.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    public BaseDisc(String name, int storageCapacity, int remainingCapacity, int capacityUsed, String diskType){
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = remainingCapacity;
        this.capacityUsed = capacityUsed;
        this.diskType = diskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getRemainingCapacity() {
        return remainingCapacity;
    }

    public void setRemainingCapacity(int remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }

    public int getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(int capacityUsed) {
        this.capacityUsed = capacityUsed;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }
}
