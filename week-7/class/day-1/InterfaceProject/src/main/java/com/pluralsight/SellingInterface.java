package com.pluralsight;

public interface SellingInterface {
    double getPrice();

    //the grading near mint is 1.0 - 10.0
    int getGrading();

    void sell();

    default double evaluatePrice() {
        return 100.0;
    }

}
