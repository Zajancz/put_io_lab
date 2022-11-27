package put.io.patterns.implement;

public class SystemGarbageCollectorObserver implements SystemStateObserver{

    @Override
    public void update(SystemMonitor monitor) {
        double memory= monitor.getLastSystemState().getAvailableMemory();


        System.out.println(String.format("Available memory: %.2f MB", memory));
        if (memory < 200.00){
           System.out.println("> Running garbage collector...");
   }
    }
}
