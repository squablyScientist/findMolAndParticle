package com.collin.matter;
public enum Molecule{


    H2O("Dihydrogen Monoxide","Water",Element.HYDROGEN,Element.HYDROGEN,Element.OXYGEN),
    NO2("Nitrogen Dioxide","N/A",Element.NITROGEN,Element.OXYGEN,Element.OXYGEN),
    CH3COCH3("Acetone","Acetone",Element.OXYGEN,Element.CARBON,Element.CARBON,Element.CARBON,Element.HYDROGEN,
            Element.HYDROGEN,Element.HYDROGEN,Element.HYDROGEN,Element.HYDROGEN,Element.HYDROGEN),
    C6H8O6("Ascorbic Acid","Vitamin C",Element.CARBON,Element.CARBON,Element.CARBON,Element.CARBON,Element.CARBON,
            Element.CARBON,Element.HYDROGEN,Element.HYDROGEN,Element.HYDROGEN,Element.HYDROGEN,Element.HYDROGEN,
            Element.HYDROGEN,Element.HYDROGEN,Element.HYDROGEN,Element.OXYGEN,Element.OXYGEN,Element.OXYGEN,
            Element.OXYGEN,Element.OXYGEN,Element.OXYGEN);


    public final Element[] elements;
    public final String chemName;
    public final String comName;

    //Construct Molecule
    private Molecule(String chemName, String comName, Element... contents){
        this.chemName = chemName;
        this.elements = contents;
        this.comName = comName;
    }

    public double mass() {
        double mass = 0;
        for(Element e : elements) {
            mass+=e.mass;
        }
        return mass;
    }

    //Get the Chemical Formula
    public String  chemForm(){
        return name();
    }
}
