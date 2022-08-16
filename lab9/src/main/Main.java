package main;

import dataprocessing.StepCountStrategy;
import dataprocessing.StepCountStrategyFactory;
import storage.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose a strategy: type 'basic or 'filtered");
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next();
        scanner.close();

        DataRepository dataRepository = new DataRepository();
        // TODO: use the StepCountStrategyFactory to create a strategy
        StepCountStrategyFactory factory=new StepCountStrategyFactory();
        StepCountStrategy basicStrategy= factory.getStepCountStrategy(Utils.BASIC_STRATEGY,dataRepository);
        StepCountStrategy filteredStrategy=factory.getStepCountStrategy(Utils.FILTERED_STRATEGY,dataRepository);
        // TODO: add observers to the dataRepository
        // don't forget to provide the strategy to the DataAggregator observer
        DataAggregator dataAggregator1=new DataAggregator(basicStrategy);
        dataRepository.addObserver(dataAggregator1);
        DataAggregator dataAggregator2=new DataAggregator(filteredStrategy);
        ConsoleLogger consoleLogger=new ConsoleLogger();
        dataRepository.addObserver(consoleLogger);
        ServerCommunicationController serverCommunicationController=new ServerCommunicationController();
        dataRepository.addObserver(serverCommunicationController);
        // TODO: uncomment
        long baseTimestamp = System.currentTimeMillis();
        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        System.out.println();
        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        System.out.println();
        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        System.out.println();
        // TODO: after the first successful run, change this to baseTimestamp + 40000 and check the result
        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        System.out.println();
        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        System.out.println();
        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        System.out.println();
        dataRepository.addData(new SensorData(500, baseTimestamp + 600));
        System.out.println();


    }
}