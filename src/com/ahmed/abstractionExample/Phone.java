package com.ahmed.abstractionExample;

public abstract class Phone {

    public void specs(){
        System.out.println("Phone name: "+ phoneName());
        System.out.println("RAM: "+ ramSpaceInGB());
        System.out.println("cpu type: "+ cpuType());
        System.out.println("Display: "+ display());
    }

    public abstract String phoneName();

    public abstract int ramSpaceInGB();

    public abstract String cpuType();

    public abstract String display();

}
