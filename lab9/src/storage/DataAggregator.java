package storage;

import dataprocessing.StepCountStrategy;
import dataprocessing.StepCountStrategyFactory;

import java.util.Observable;
import java.util.Observer;

public class DataAggregator implements Observer {
    private StepCountStrategy strategy;
    private int steps;

    public  DataAggregator(StepCountStrategy strategy){
        this.strategy=strategy;

    }
    @Override
    public void update(Observable o, Object arg) {
        steps=strategy.getTotalSteps();
        System.out.println("strategy name " +  strategy.getStrategyDescription() + " result: " + this.steps);
    }
}
