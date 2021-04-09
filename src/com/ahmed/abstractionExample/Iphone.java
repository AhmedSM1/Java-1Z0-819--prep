package com.ahmed.abstractionExample;

public class Iphone extends Phone {


    @Override
    public String phoneName() {
        return "Iphone 12";
    }

    @Override
    public int ramSpaceInGB() {
        return 4;
    }

    @Override
    public String cpuType() {
        return "Apple A14 Bionic (5 nm)";
    }

    @Override
    public String display() {
        return "Super Retina XDR OLED, HDR10, Dolby Vision, 625 nits (typ), 1200 nits (peak)";
    }
}
