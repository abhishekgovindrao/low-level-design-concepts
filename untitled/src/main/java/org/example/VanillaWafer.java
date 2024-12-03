package org.example;

public class VanillaWafer implements Cone {
    private Cone cone;
     VanillaWafer(){}
    public VanillaWafer(Cone cone) {
        if(cone == null){
            throw new NullPointerException();
        }
        this.cone = cone;
    }

    @Override
    public int getPrice() {
        int price=30;
        if (cone != null) {
            price+= this.cone.getPrice();
        }
        return price;
    }

    @Override
    public void printComposition() {
        if (this.cone != null) {
            this.cone.printComposition();
        }
        System.out.println("VANILLAWAFER : 30");

    }
}
