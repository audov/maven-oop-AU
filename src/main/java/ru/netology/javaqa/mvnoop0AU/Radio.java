package ru.netology.javaqa.mvnoop0AU;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    private int currentSound;

    public int getCurrentSound() {
        return currentSound;
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

        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void switchPrevStation() {

        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
            //break;
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