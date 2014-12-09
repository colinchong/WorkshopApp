package com.colinchong.funfatcs;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by colinchong on 2014-09-13.
 */
public class ColorWheel {

    //Member variables (properties about the object)

    public String[] mColors = {
            "#49add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };
    //Method (abilities the object can do)
    public int getColor() {

        String color = "";
        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct new random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
