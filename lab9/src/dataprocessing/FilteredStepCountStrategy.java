package dataprocessing;

import main.Utils;
import storage.DataRepository;
import storage.SensorData;

public class FilteredStepCountStrategy implements StepCountStrategy{
    private DataRepository repository;

    public FilteredStepCountStrategy(DataRepository repository) {
        this.repository = repository;
    }
    @Override
    public int getTotalSteps() {
        int sum=0;
        for(SensorData sd: repository.getData()){
            if(sd.getStepsCount()>0){
                //no more than 1000 steps in less than 1 minute=60sec <=> 100/6
                if(sd.getStepsCount()/(sd.getTimestamp()/1000)<=100/6){
                    sum+=sd.getStepsCount();
                }
            }
        }
        return sum;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.FILTERED_STRATEGY;
    }
}
