
package ru.netology.javaqa.mvnoop1AU;
public class RadioFlex {
    private int currentStationQty;
    private int currentStation;
    private int currentSound;

    public int getCurrentStationQty() {

        return currentStationQty;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentSound() {

        return currentSound;
    }

    public void setCurrentStationQty(int newStationQty) {
        if (newStationQty < 0) {
            return;
        }
        if (newStationQty == 0) {
            currentStationQty = 10;
        } else {
            currentStationQty = newStationQty;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > currentStationQty - 1) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound > 100) {
            return;
        }
        if (newCurrentSound < 0) {
            return;
        }
        currentSound = newCurrentSound;
    }

    public void switchNextStation() {

        if (currentStation == currentStationQty - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void switchPrevStation() {

        if (currentStation == 0) {
            currentStation = currentStationQty - 1;
        } else {
            currentStation = currentStation - 1;
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
}