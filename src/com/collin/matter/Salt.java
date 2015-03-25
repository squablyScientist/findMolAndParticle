package com.collin.matter;

import com.collin.matter.Element;

/**
 * Created by collintod on 3/24/15.
 */
public enum Salt {
    CaCl2("Calcium Chloride","Road Salt", Element.CALCIUM,Element.CHLORINE,Element.CHLORINE),
    NaCl("Sodium Chloride","Table Salt",Element.SODIUM, Element.CHLORINE),
    Na2SO3("Sodium Sulfite","N/A",Element.SODIUM,Element.SODIUM,Element.SULFUR,
            Element.OXYGEN,Element.OXYGEN,Element.OXYGEN),
    FeCl3("Iron(III) Chloride","Molysite",Element.IRON,Element.CHLORINE,Element.CHLORINE,Element.CHLORINE);

    public final Element[] elements;
    public final String chemName;
    public final String comName;

    private Salt(String chemName, String comName, Element... contents){
        this.chemName = chemName;
        this.elements = contents;
        this.comName = comName;
    }

    //Get the molar mass of the ion.
    public double mass(){
        double mass = 0;
        for(Element e : elements){
            mass+=e.mass;
        }
        return mass;
    }

    //Get the chemical formula
    public String getChemForm(){
        return name();
    }
}
