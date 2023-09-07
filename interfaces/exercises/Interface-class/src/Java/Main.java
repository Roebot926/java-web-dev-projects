public class Main {
    public static void main(String[] args) {

        ByTwo two = new ByTwo();
        ByThree three = new ByThree();


        for(int i=0; i<10; i++){
            System.out.println(three.getNext()+" : "+two.getNext());
        }

    }
}
