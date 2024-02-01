package main.java.fabricMethod.departments;

import main.java.fabricMethod.workers.DayWorker;
import main.java.fabricMethod.workers.Worker;

public class DayDepartment implements Department{
    @Override
    public Worker getWorker() {
        return new DayWorker();
    }
}
