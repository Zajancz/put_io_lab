package put.io.patterns.implement;

public class SystemInfoObserver implements SystemStateObserver{

    @Override
    public void update(SystemMonitor monitor) {
      SystemState lastSystemState = monitor.getLastSystemState();
        System.out.println(String.format("CPU Load: %2.2f%%", lastSystemState.getCpu()));


    }
}
