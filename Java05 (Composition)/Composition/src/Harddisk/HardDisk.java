package Harddisk;

public class HardDisk {
    private int memory;
    private boolean isDurable;
    private String brand;
    
    public HardDisk(int memory, boolean isDurable, String brand) {
        this.memory = memory;
        this.isDurable = isDurable;
        this.brand = brand;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public boolean getIsDurable() {
        return isDurable;
    }
    public void setIsDurable(boolean isDurable) {
        this.isDurable = isDurable;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
