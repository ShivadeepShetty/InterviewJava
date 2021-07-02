public class Increment {

    private int total = 0;

    private final  int INCREMENT;

    public  Increment(int increment){
        INCREMENT = increment;
    }

    @Override
    public String toString() {
        return  String.format("total = %d",total);
    }

    public void  addIncrementToTotal(){
        total = total + INCREMENT;
    }
}
