package launchcode.launchcode;

public class YERP {
    public static void main(String[] args) {

        CD cd = new CD("Flesh of my Flesh",10,100,25,"CD");
        DVD dvd = new DVD("28 days later", 10,100,25,"DVD");

        cd.spinDisc();
        dvd.destroyMicrowave();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}