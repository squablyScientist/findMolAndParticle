package com.collin.formula;

import com.collin.matter.Element;
import com.collin.matter.*;


public class hydrateForm {

    //Convert from hydrate mass in g to the empirical formula
    public static String hydrateToFormula(Element anhydride, double hydrateG,double waterG){

        //find the amount of anhydride
        double anhydrideG = hydrateG - waterG,

                //find the moles of the anhydride
                anhydrideMol = mpgForm.gToMoles(anhydrideG, anhydride.mass),

                //find the moles in the water
                waterMol = mpgForm.gToMoles(waterG,Molecule.H2O.mass());


        //calculate the ratio
        double ratio = Math.floor(waterMol / anhydrideMol);
        return(anhydride.name() + " * " + ratio + "H2O");
    }
    public static String hydrateToFormula(Salt anhydride, double hydrateG,double waterG){
        //find the amount of anhydride
        double anhydrideG = hydrateG - waterG,

                //find the moles of the anhydride
                anhydrideMol = mpgForm.gToMoles(anhydrideG, anhydride.mass()),

                //find the moles in the water
                waterMol = mpgForm.gToMoles(waterG,Molecule.H2O.mass());


        //calculate the ratio
        double ratio = Math.floor(waterMol / anhydrideMol);
        return(anhydride.name() + " * " + ratio + "H2O");
    }
    public static String hydrateToFormula(Molecule anhydride, double hydrateG,double waterG){
        //find the amount of anhydride
        double anhydrideG = hydrateG - waterG,

                //find the moles of the anhydride
                anhydrideMol = mpgForm.gToMoles(anhydrideG, anhydride.mass()),

                //find the moles in the water
                waterMol = mpgForm.gToMoles(waterG,Molecule.H2O.mass());


        //calculate the ratio
        double ratio = Math.floor(waterMol / anhydrideMol);
        return(anhydride.name() + " * " + ratio + "H2O");
    }


}
