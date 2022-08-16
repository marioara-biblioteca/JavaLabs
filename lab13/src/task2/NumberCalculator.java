package task2;

import java.util.Collection;

public class NumberCalculator implements Calculator{
    @Override
    public Double add(Double nr1, Double nr2) {
        if(nr1==null | nr2==null)throw new NullParameterException();
        Double sum= nr1+nr2;
        if(sum>Double.MAX_VALUE)throw new OverflowException();
        if(sum<Double.MIN_VALUE)throw  new UnderflowException();
        return sum;
    }

    @Override
    public Double divide(Double nr1, Double nr2) {
        if(nr1==null | nr2==null)throw new NullParameterException();
        if(nr2==0.0d) throw  new OverflowException();
        Double div=nr1/nr2;
        if(div>Double.MAX_VALUE)throw new OverflowException();
        if(div<Double.MIN_VALUE)throw  new UnderflowException();
        return div;
    }

    @Override
    public Double average(Collection<Double> numbers) {
        if(numbers==null)throw new NullParameterException();
        Double average=0.0d;
        for(Double elem:numbers) {
            if(elem==null )throw new NullParameterException();
            average += elem;
        }
        average/=numbers.size();
        if(average>Double.MAX_VALUE)throw new OverflowException();
        if(average<Double.MIN_VALUE)throw  new UnderflowException();
        return average;
    }
}
