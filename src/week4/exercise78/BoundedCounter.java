package week4.exercise78;

public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value == upperLimit){
            this.value = 0;
        }else{
            this.value++;
        }
    }

    public String toString() {
        if (this.value<10){
            return  ""+ this.value;
        }
        else {
            return  ""+ this.value;
        }

    }
}
