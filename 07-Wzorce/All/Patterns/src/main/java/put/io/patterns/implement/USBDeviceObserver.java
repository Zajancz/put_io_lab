package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver{
    int lastDevices;
    boolean firstRun=true;


    @Override
    public void update(SystemMonitor monitor) {
        int devices=monitor.getLastSystemState().getUsbDevices();
        if(lastDevices!=devices&&!firstRun){
            System.out.println("Liczba urzadzen USB"+devices+"Poprzednia liczba:"+lastDevices);
        }
        else {
            System.out.println("Liczba urzadzen USB"+devices);
        }
        firstRun=false;
        lastDevices=devices;
        }

    }

