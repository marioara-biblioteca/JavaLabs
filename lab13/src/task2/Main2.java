package task2;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = new NumberCalculator();
        try {
            System.out.println(calculator.add(2d, 3d));
            System.out.println(calculator.divide(9d, 4d));
            System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));

            // TODO: Test edge cas
           // System.out.println(calculator.divide(5d, 0d));
           // System.out.println(calculator.add(5000d,Double.MAX_VALUE));
            //System.out.println(calculator.add(Double.MIN_VALUE,-100d));
            //System.out.println(calculator.add(5000d,null));
            System.out.println(calculator.average(List.of(1d, null, 3d, 4d)));
        }
        catch (Calculator.NullParameterException | Calculator.OverflowException | Calculator.UnderflowException e ){
            e.printStackTrace();
        }
    }
}
