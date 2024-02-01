package main.java.fabricMethod.departments;

import main.java.fabricMethod.workers.Worker;

public interface Department {
    default void info(){
        System.out.println("They work here "+getWorker().work());
    }
    Worker getWorker();
}
