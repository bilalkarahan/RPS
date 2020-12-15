package com.bilalkarahan.rockpapperscissors;

import android.graphics.Bitmap;

public class Singleton {
    private Bitmap chosenImage;
    private static Singleton singleton;

    public Bitmap getChosenImage() {
        return chosenImage;
    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
