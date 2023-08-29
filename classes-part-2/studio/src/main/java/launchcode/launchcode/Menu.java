package launchcode.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem newItem){
        this.items.add(newItem);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem newItem){
        this.items.remove(newItem);
        lastUpdated = new Date();
    }

    public void singleItem(int index){
        if(index >= 0 && index < items.size()) {
            MenuItem item = items.get(index);
            item.printMenuItem();
        } else {
            System.out.println("Invalid menu Item.");

        }
    }

    public void printFullMenu(){
        System.out.println("Full Menu: ");
        for (int i = 0; i < items.size(); i++) {
            items.get(i).printMenuItem();
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "lastUpdated=" + lastUpdated +
                "items=" + items;
    }
}


