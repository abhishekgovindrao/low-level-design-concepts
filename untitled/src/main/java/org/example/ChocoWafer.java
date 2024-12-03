package org.example;

public class ChocoWafer implements Cone{

    private  Cone cone;

    ChocoWafer(){}
    ChocoWafer(Cone cone){
        if(cone == null){
            throw new NullPointerException();
        }
        this.cone = cone;
    }
    @Override
    public int getPrice() {
        int price = 20;
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
        System.out.println("CHOCOWAFER : 20");

    }
}
