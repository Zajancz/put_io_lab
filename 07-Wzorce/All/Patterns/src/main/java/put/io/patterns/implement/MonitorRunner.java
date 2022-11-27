package put.io.patterns.implement;

public class MonitorRunner {

    public static void main(String args[]){
        SystemMonitor monitor = new SystemMonitor();
        SystemStateObserver infObserver=new SystemInfoObserver();
        SystemStateObserver usbObserver=new USBDeviceObserver();
        SystemStateObserver memInfObserver=new SystemGarbageCollectorObserver();
        monitor.addSystemStateObserver(infObserver);
        monitor.addSystemStateObserver(memInfObserver);
        monitor.addSystemStateObserver(usbObserver);
        while (true) {

            monitor.probe();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
