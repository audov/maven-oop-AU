/*
package ru.netology.javaqa.mvnoopAU;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTestFlex {

    @Test
    public void setStationAboveMax() {
        RadioFlex cond = new RadioFlex();
        cond.setNewStation(10);
        int expected = 0;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationBelowMin() {
        RadioFlex cond = new RadioFlex();
        cond.setNewStation(-1);
        int expected = 0;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCustomStation() {
        RadioFlex cond = new RadioFlex();
        cond.setNewStation(5);
        int expected = 5;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() {
        RadioFlex cond = new RadioFlex();
        cond.switchNextStation();
        int expected = 0;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation1() {
        // int newStation = setNewStation();
        RadioFlex cond = new RadioFlex();
        cond.setNewStation(9);
        cond.switchNextStation();
        int expected = 0;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation() {
        RadioFlex cond = new RadioFlex();
        cond.switchPrevStation();
        int expected = 9;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation1() {
        RadioFlex cond = new RadioFlex();
        cond.setNewStation(9);
        cond.switchPrevStation();
        int expected = 8;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSoundAboveMax() {
        RadioFlex cond = new RadioFlex();
        cond.setSound(100);
        cond.increaseSound();
        int expected = 100;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSoundBelowMin() {
        RadioFlex cond = new RadioFlex();
        cond.setSound(0);
        cond.decreaseSound();
        int expected = 0;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundIncrease() {
        RadioFlex cond = new RadioFlex();
        cond.increaseSound();
        int expected = 1;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundDecrease() {
        RadioFlex cond = new RadioFlex();
        cond.setSound(100);
        cond.decreaseSound();
        int expected = 99;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundAboveMax() {
        RadioFlex cond = new RadioFlex();
        cond.setSound(101);
        int expected = 0;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundBelowMin() {
        RadioFlex cond = new RadioFlex();
        cond.setSound(-1);
        int expected = 0;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }
}
*/
