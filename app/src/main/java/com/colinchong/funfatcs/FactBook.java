package com.colinchong.funfatcs;

import java.util.Random;

/**
 * Created by colinchong on 2014-09-13.
 */
public class FactBook {

    //Member variables (properties about the object)

    public String[] mFacts = {
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten",
            "NEWELEVEN"};

    //Method (abilities the object can do)
    public String getFact() {

        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
