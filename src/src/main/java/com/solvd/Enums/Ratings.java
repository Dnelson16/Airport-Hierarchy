package com.solvd.Enums;

import com.solvd.entities.Flight;

public enum Ratings  {
    Delta(5),
    Spirit(3),
    Frontier(3),
    American(4);

    public int flightRatings;



    Ratings(int flightRatings){
        this.flightRatings = flightRatings;
    }
}
