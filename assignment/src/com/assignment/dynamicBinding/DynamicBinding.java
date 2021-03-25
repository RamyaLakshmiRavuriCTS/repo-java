package com.assignment.dynamicBinding;

public class DynamicBinding extends Dynamic{

    @Override
    public void getChoices() {
        super.getChoices();
    }

    @Override
    public void printMessage() {
        super.printMessage();
    }

    public static void main(String args[]) {
        System.out.println("Choices Available :\n1.Black and White TV\n2.Color TV");
        Dynamic d = new DynamicBinding();
        d.getChoices();
        d.printMessage();
    }

}
