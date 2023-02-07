package Processor;

public class Processor {
    private String processorBrand;
    private String processGeneration;
    private String cores;
    
    public Processor(String processorBrand, String processGeneration, String cores) {
        this.processorBrand = processorBrand;
        this.processGeneration = processGeneration;
        this.cores = cores;
    }
    
    public String getProcessorBrand() {
        return processorBrand;
    }
    public void setProcessorBrand(String processorBrand) {
        this.processorBrand = processorBrand;
    }
    public String getProcessGeneration() {
        return processGeneration;
    }
    public void setProcessGeneration(String processGeneration) {
        this.processGeneration = processGeneration;
    }
    public String getCores() {
        return cores;
    }
    public void setCores(String cores) {
        this.cores = cores;
    }
}
