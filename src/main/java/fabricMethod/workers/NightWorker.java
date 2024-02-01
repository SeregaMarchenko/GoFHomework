package main.java.fabricMethod.workers;

public class NightWorker implements Worker{
    @Override
    public String work() {
        return "during the night";
    }
}
