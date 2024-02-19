package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if(monthNumber<=12 && monthNumber>=1){
            if((monthNumber == 1) || (monthNumber == 2) || monthNumber==12) System.out.println("Winter");

            if(monthNumber>=3 && monthNumber<=5) System.out.println("Spring");

            if(monthNumber>=6 && monthNumber<=8) System.out.println("Summer");

            if(monthNumber>8 && monthNumber<12) System.out.println("Autumn");
        }
        else System.out.println("Wrong month number");
    }

}
