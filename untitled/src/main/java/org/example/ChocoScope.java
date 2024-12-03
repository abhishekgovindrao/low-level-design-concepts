package org.example;

public class ChocoScope implements Cone {
    private Cone cone;

    public ChocoScope(Cone cone) {
        this.cone = cone;
    }

    @Override
    public int getPrice() {
        int i = this.cone.getPrice() + 35;
        return  i;
    }

    @Override
    public void printComposition() {
        if (this.cone != null) {
            this.cone.printComposition();
        }
        System.out.println("ChocoScope 35");
    }
}
