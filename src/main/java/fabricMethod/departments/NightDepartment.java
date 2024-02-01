package main.java.fabricMethod.departments;

import main.java.fabricMethod.workers.NightWorker;
import main.java.fabricMethod.workers.Worker;

public class NightDepartment implements Department{
    @Override
    public Worker getWorker() {
        return new NightWorker();
    }
}
