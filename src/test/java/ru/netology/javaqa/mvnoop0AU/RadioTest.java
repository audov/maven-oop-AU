package ru.netology.javaqa.mvnoop0AU;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStationMax() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        int expected = 9;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMin() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setStationAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentStation(10);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentStation(-1);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCustomStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        int expected = 5;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(3);
        cond.switchNextStation();
        int expected = 4;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation0() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.switchNextStation();
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(7);
        cond.switchPrevStation();
        int expected = 6;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation0() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.switchPrevStation();
        int expected = 9;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchSoundAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentSound(100);
        cond.increaseSound();
        int expected = 100;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSoundBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentSound(0);
        cond.decreaseSound();
        int expected = 0;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSound() {
        Radio cond = new Radio();
        cond.setCurrentSound(3);
        cond.increaseSound();
        int expected = 4;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSound() {
        Radio cond = new Radio();
        cond.setCurrentSound(87);
        cond.decreaseSound();
        int expected = 86;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundMin() {
        Radio cond = new Radio();
        cond.setCurrentSound(0);
        int expected = 0;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundMax() {
        Radio cond = new Radio();
        cond.setCurrentSound(100);
        int expected = 100;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentSound(101);
        int expected = 0;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentSound(-1);
        int expected = 0;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
}