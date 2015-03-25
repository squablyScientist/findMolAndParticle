package com.collin.matter;
public enum Element{

    //TODO Add the rest of the main, possible another parameter?
    BLANK(0,null,'n'),
    HYDROGEN(1.008,"H",'G'),HELIUM(4.003,"He",'G'),LITHIUM(6.941,"Li",'S'),BERYLLIUM(9.012,"Be",'S'),
    BORON(10.81,"B",'S'),CARBON(12.011,"C",'S'),NITROGEN(14.007,"N",'G'),OXYGEN(15.999,"O",'G'),
    FLUORINE(18.999,"F",'G'),NEON(20.179,"Ne",'G'),SODIUM(22.99,"Na",'S'),MAGNESIUM(24.305,"Mg",'S'),
    ALUMINUM(26.982,"Al",'S'),SILICON(28.086,"Si",'S'),PHOSPHOROUS(30.974,"P",'S'),SULFUR(32.06,"S",'S'),
    CHLORINE(35.453,"Cl",'G'),ARGON(39.948,"Ar",'G'),POTASSIUM(39.098,"K",'S'),CALCIUM(40.08,"Ca",'S'),
    SCAMDIUM(44.956,"Sc",'S'),TITANIUM(47.88,"Ti",'S'),VANADIUM(50.942,"V",'S'),CHROMIUM(51.996,"Cr",'S'),
    MANGANESE(54.938,"Mn",'S'),IRON(55.847,"Fe",'S'),COBALT(58.933,"Co",'S'),NICKEL(58.693,"Ni",'S'),
    COPPER(63.546,"Cu",'S'),ZINC(65.39,"Zn",'S'),GALLIUM(69.72,"Ga",'S'),GERMANIUM(72.61,"Ge",'S'),
    ARSENIC(74.922,"As",'S'),SELENIUM(78.96,"Se",'S'),BROMINE(79.904,"Br",'L'),KRYPTON(83.8,"Kr",'G'),
    RUBIDIUM(85.468,"Rb",'S'),STRONTIUM(87.62,"Sr",'S'),YTTRIUM(88.906,"Y",'S'),ZIRCONIUM(91.224,"Zr",'S'),
    NIOBIUM(92.906,"Nb",'S'),MOLYBDENUM(95.94,"Mo",'S'),TECHNETIUM(97.907,"Tc",'S'),RUTHENIUM(101.07,"Ru",'S'),
    RHODIUM(102.906,"Rh",'S'),PALLADIUM(106.42,"Pd",'S'),SILVER(107.868,"Ag",'S'),CADMIUM(112.411,"Cd",'S'),
    INDIUM(114.82,"In",'S'),TIN(118.710,"Sn",'S'),ANTIMONY(121.757,"Sb",'S');

    public final double mass;
    public final String symbol;
    public final int atomicNumber;
    public final char phase;

    //constructor
    Element(double mass, String symbol, char phase) {
        this.mass = mass;
        this.symbol = symbol;
        this.atomicNumber = ordinal();
        this.phase = phase;
    }
}