public class ByThree implements Series{

    int val;

    ByThree(){
        val = 0;
    }

    public int getNext(){
        val +=3;
        return val;
    }

}
