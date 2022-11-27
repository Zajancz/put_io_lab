package put.io.patterns.implement;

public class SystemCoolerObserver implements SystemStateObserver{

    @Override
    public void update(SystemMonitor monitor) {
        double temp=monitor.getLastSystemState().getCpuTemp();
        System.out.println(String.format("CPU temperature: %.2f C", temp));
        if (temp > 60.00){
            System.out.println("> Increasing cooling of the CPU...");
        }
    }
}
