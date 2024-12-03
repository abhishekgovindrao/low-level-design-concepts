package org.example;

public class VanillaScoop implements Cone{
    private Cone cone;

    public VanillaScoop(Cone cone) {
        this.cone = cone;
    }
    @Override
    public int getPrice() {
        int i = this.cone.getPrice() + 33;
        return  i;
    }

    @Override
    public void printComposition() {
        if (this.cone != null) {
            this.cone.printComposition();
        }
        System.out.println("VanillaScope 33");

    }
}
