package calculator;

public class SimpleCalculator {
    private int result = 0;

    public void add(int a, int b){
        if (a < b)
            result = a + b;
    }
    public void multiply(int a, int b) {
        result = a * b;
    }
    public int getResult(){
        return result;
    }
}
