import Computer.Computer;
import Harddisk.HardDisk;
import Processor.Processor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Processor m1 = new Processor("Apple M1", "2nd Gen", "8 Cores");
        HardDisk hd = new HardDisk(20000000, false, "Apple");

        Computer appleComputer = new Computer("Apple Monitor", "Magic Keyboard 2", "Magic Mouse", true, "2 TB", hd, m1) ;
    
        Computer c1 = new Computer();

        appleComputer.getComputerInformatio();

        c1.getComputerInformatio();
    }
}
