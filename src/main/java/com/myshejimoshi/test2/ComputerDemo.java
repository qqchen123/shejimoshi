package com.myshejimoshi.test2;

public class ComputerDemo {
    public static void main(String[] args) {
        HardDisk hardDisk = new XijieHardDisk();
//        Cpu cpu = new IntelCpu();
        Cpu cpu = new AMDCpu();
        Memory memory = new KingstonMemory();

        Computer computer = new Computer();

        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        computer.run();

    }
}
