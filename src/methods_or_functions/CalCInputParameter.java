package methods_or_functions;

public class CalCInputParameter {

    public void addition(int a, int b){

        int sum=a+b;
        System.out.println("Addition of a and b is "+sum);

    }

    public static void main(String[] args) {

        CalCInputParameter obj = new CalCInputParameter();
        obj.addition(9,8);
    }
}
