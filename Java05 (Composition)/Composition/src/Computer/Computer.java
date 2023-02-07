package Computer;

import Harddisk.HardDisk;
import Processor.Processor;

public class Computer {
    private String monitor;
    private String keyboard;
    private String mouse;
    private boolean hasCoolingFan;
    private String ram;
    private HardDisk hd;
    private Processor processor;


    // Default Values
    public Computer() {
        this.processor = new Processor("Intel", "5th Gen","4 Cores");
        this.hd = new HardDisk(1000000, true, "AMD");
    }

    public Computer(String monitor, String keyboard, String mouse, boolean hasCoolingFan, String ram, HardDisk hd,
            Processor processor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.hasCoolingFan = hasCoolingFan;
        this.ram = ram;
        this.hd = hd;
        this.processor = processor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public boolean isHasCoolingFan() {
        return hasCoolingFan;
    }

    public void setHasCoolingFan(boolean hasCoolingFan) {
        this.hasCoolingFan = hasCoolingFan;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public HardDisk getHd() {
        return hd;
    }

    public void setHd(HardDisk hd) {
        this.hd = hd;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void getComputerInformatio() {
        System.out.println("Following are your computer's specs: ");
        System.out.println("Monitor : " + this.getMonitor());
        System.out.println("Keyboard : " + this.getKeyboard());
        System.out.println("Mouse : " + this.getMouse());
        System.out.println("Has Cooling Fan : " + this.isHasCoolingFan());
        System.out.println("Processor Brand " + this.processor.getProcessorBrand());
        System.out.println("Processor Generation " + this.processor.getProcessGeneration());
        System.out.println("Hard Disk Brand " + this.getHd().getBrand());
        System.out.println("Hard Disk Memory " + this.getHd().getMemory());


    }
}
