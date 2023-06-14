/*
package ru.netology.javaqa.mvnoopAU;

public class RadioFlex {
    public int StationQty;
    public int StationMin;
    public int StationMax;
    public int currentStation;
    public int currentSound;

    public void Station(int a, int b, int c) {
        StationQty = a;
        StationMin = b;
        StationMax = c;
    }

    public void Station() {
        StationQty = 10;
        StationMax = 9;
        StationMin = 0;
    }

    public void setNewStation(int newStation) {

        if (newStation <= StationMax) {
            if (newStation >= StationMin) {
                currentStation = newStation;
            }
        }
    }

    public void switchNextStation() {
        if (currentStation == StationMax) {
            currentStation = StationMin;
        } else
            currentStation = currentStation + 1;
    }

    public void switchPrevStation() {
        if (currentStation == StationMin) {
            currentStation = StationMax;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setSound(int newSound) {

        if (newSound <= 100) {
            if (newSound >= 0) {
                currentSound = newSound;
            }
        }
    }

    public void increaseSound() {

        if (currentSound == 100) {
            currentSound = 100;
        } else {
            currentSound = currentSound + 1;
        }
    }

    public void decreaseSound() {

        if (currentSound == 0) {
            currentSound = 0;
        } else {
            currentSound = currentSound - 1;
        }
    }
}*/
