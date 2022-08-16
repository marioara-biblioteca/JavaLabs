package dataprocessing;

import main.Utils;
import storage.DataRepository;
import storage.SensorData;

import java.util.ArrayList;

public class BasicStepCountStrategy implements StepCountStrategy{
    private DataRepository repository;

    public BasicStepCountStrategy(DataRepository repository) {
        this.repository = repository;
    }

    @Override
    public int getTotalSteps() {
        int sum=0;
        for(SensorData sd : repository.getData()){
            sum+=sd.getStepsCount();
        }
        return sum;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.BASIC_STRATEGY;
    }
}
