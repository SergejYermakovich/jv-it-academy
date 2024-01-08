package test;

public class BelarusRunnerService implements RunnerService {
    @Override
    public void sing() {
        System.out.println("sing belarusian song....");
    }

    @Override
    public void run() {
        System.out.println("run with 40 km/h");
    }
}
