public class CPU {
private double price;
private Processor processor;
private RAM ram;
public CPU(double price, Processor processor, RAM ram) {
this.price = price;
this.processor = processor;
this.ram = ram;
}
public double getPrice() {
return price;
}
public Processor getProcessor() {
return processor;
}
public RAM getRam() {
return ram;
}
public static class Processor {
private int numberOfCores;
private String manufacturer;
public Processor(int numberOfCores, String manufacturer) {
this.numberOfCores = numberOfCores;
this.manufacturer = manufacturer;
}
public int getNumberOfCores() {
return numberOfCores;
}
public String getManufacturer() {
return manufacturer;
}
}
public static class RAM {
private int memory;
private String manufacturer;
public RAM(int memory, String manufacturer) {
this.memory = memory;
this.manufacturer = manufacturer;
}
public int getMemory() {
return memory;
}
public String getManufacturer() {
return manufacturer;
}
}
public static void main(String[] args) {
System.out.println("Alex John \n 23MCA011 \n 13/02/2024");
Processor processor = new Processor(4, "Intel");
RAM ram = new RAM(8, "Kingston");
CPU cpu = new CPU(500.0, processor, ram);
System.out.println("CPU Price: " + cpu.getPrice());
System.out.println("Processor: " + cpu.getProcessor().getManufacturer() + " " +
cpu.getProcessor().getNumberOfCores() + " cores");
System.out.println("RAM: " + cpu.getRam().getManufacturer() + " " + cpu.getRam().getMemory() + "GB");
}
}
