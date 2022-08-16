package storage;

import java.util.ArrayList;

import java.util.Observable;

// Persists sensor data. Observable, its observers are notified when data is added it to.
public class DataRepository extends Observable {
    private ArrayList<SensorData> data=new ArrayList<>();

    public void addData(SensorData dataRecord){
        // TODO
        // store data (e.g. in a List)
        // notifiy observers
        if(!this.data.contains(dataRecord))
            this.data.add(dataRecord);
        setChanged();
        notifyObservers(dataRecord);
    }

    // TODO implement a method to get the stored data (needed by the strategies)
    public ArrayList<SensorData> getData() {
        return data;
    }
}
