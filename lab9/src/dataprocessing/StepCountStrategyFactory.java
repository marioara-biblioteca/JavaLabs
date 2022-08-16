package dataprocessing;

import main.Utils;
import storage.DataRepository;

public class StepCountStrategyFactory {
    public StepCountStrategy getStepCountStrategy(String type, DataRepository dataRepository){
        if(!type.isEmpty()) {
            if (type.equals(Utils.BASIC_STRATEGY))
                return new BasicStepCountStrategy(dataRepository);
            else if (type.equals(Utils.FILTERED_STRATEGY))
                return new FilteredStepCountStrategy(dataRepository);
        }
        return null;
    }
}
