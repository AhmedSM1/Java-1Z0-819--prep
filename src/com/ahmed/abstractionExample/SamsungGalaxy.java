package com.ahmed.abstractionExample;

public class SamsungGalaxy extends Phone {

    @Override
    public String phoneName() {
        return "Samsung Galaxy s21";
    }

    @Override
    public int ramSpaceInGB() {
        return 8;
    }

    @Override
    public String cpuType() {
        return "Octa-core (1x2.9 GHz Cortex-X1 & 3x2.80 GHz Cortex-A78 & 4x2.2 GHz Cortex-A55)";
    }

    @Override
    public String display() {
        return "Dynamic AMOLED 2X, 120Hz, HDR10+, 1300 nits (peak)";
    }
}
