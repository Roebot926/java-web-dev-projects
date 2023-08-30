package launchcode.launchcode;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isNew(){
        return isNew;
    }

    public void printMenuItem(){
        System.out.println("Description: " + description);
        System.out.println("Price: $"+ price);
        System.out.println("Category: " + category);
        System.out.println("New: " + isNew);
    }
    @Override
    public String toString() {
        return  "Option: " + description + '\n' +
                "Category: " + category + '\n' +
                "Recently Updated: " + isNew + "\n" +
                "Price: $" + price + '\n' +
                "-*-*-*-*-*-*-*-" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(price, menuItem.price) == 0 && isNew == menuItem.isNew && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, isNew);
    }
}


