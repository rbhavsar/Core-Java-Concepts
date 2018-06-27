public class Expenses {

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;


    public Expenses(){
        this.value=(int)Math.random()*100;
    }

}
