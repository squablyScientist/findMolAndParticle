package com.collin.formula;
public class mpgForm {

    final static double AVANUM = (6.02e23);

    //Convert Grams to Moles
    public static double gToMoles(double grams, double molMass){
        double mol = grams / molMass;
        return mol;
    }

    //Convert Moles to Particles
    public static double molToPart(double mol){
        double part = mol * AVANUM;
        return part;
    }

    //Convert from Grams to Particles
    public static double gToPart(double grams, double molMass){
        double moles = gToMoles(grams,molMass);
        double part = moles * AVANUM;
        return part;
    }

    //Convert from Moles to Grams
    public static double molToGrams(double mol, double molMass){
       double grams = mol * molMass;
        return grams;
    }

    //Convert from Particles to Grams
    public static double partToGrams(double part, double molMass){
        double mol = part / AVANUM;
        double grams = mol * molMass;
        return grams;
    }

}
