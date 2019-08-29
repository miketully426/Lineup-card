package org.launchcode.Lineupcard.models;

import javafx.geometry.Pos;

public enum Positions {

    PITCHER("P"),
    CATCHER("C"),
    FIRSTBASE("1B"),
    SECONDBASE("2B"),
    THIRDBASE("3B"),
    SHORTSTOP("SS"),
    LEFTFIELD("LF"),
    CENTERFIELD("CF"),
    RIGHTFIELD("RF");

    private final String display;

    Positions(String display){
        this.display = display;
    }
    public String getDisplay() {
        return display;
    }

}
