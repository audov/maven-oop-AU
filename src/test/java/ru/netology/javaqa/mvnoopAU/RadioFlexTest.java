package ru.netology.javaqa.mvnoopAU;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioFlexTest {

    @Test

    public void setStationQtyDefault() { // проверяем, устанавливается ли дефолтное кол-во станций 10, если нет пользовательского кол-ва станций
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(0);
        int expected = 10;
        int actual = cond.getCurrentStationQty();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setStationQtyAbove0() { // устанавливаем кол-во станций больше 0
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(88);
        int expected = 88;
        int actual = cond.getCurrentStationQty();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setStationQtyBelow0() { // устанавливаем кол-во станций меньше 0
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(-3);
        int expected = 0;
        int actual = cond.getCurrentStationQty();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMax() { // устанавливаем кол-во станций и вводим максимальный номер станции
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(68);
        int expected = cond.getCurrentStationQty() - 1;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMin() { // устанавливаем кол-во станций и вводим минимальный номер станции
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(0);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationAboveMax() { // устанавливаем кол-во станций и вводим номер станции больше максимального
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(69);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationBelowMin() { // устанавливаем кол-во станций и вводим номер станции меньше минимального
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(-1);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCustomStation() { // устанавливаем кол-во станций и вводим номер станции меньше максимального и больше минимального
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(5);
        int expected = 5;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() { // устанавливаем кол-во станций, вводим номер станции меньше максимального и больше минимального и переключаем на следующий
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(3);
        cond.switchNextStation();
        int expected = 4;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStationAboveMax() { // устанавливаем кол-во станций, вводим максимальный номер станции и переключаем на следующий
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(68);
        cond.switchNextStation();
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation() { // устанавливаем кол-во станций, вводим номер станции меньше максимального и больше минимального и переключаем на предыдущий
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(7);
        cond.switchPrevStation();
        int expected = 6;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStationBelowMin() { // устанавливаем кол-во станций, вводим минимальный номер станции и переключаем на предыдущий
        RadioFlex cond = new RadioFlex();
        cond.setCurrentStationQty(69);
        cond.setCurrentStation(0);
        cond.switchPrevStation();
        int expected = cond.getCurrentStationQty() - 1;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSoundAboveMax() { // переключаем звук на следующий за максимальным
        RadioFlex cond = new RadioFlex();
        cond.setCurrentSound(100);
        cond.increaseSound();
        int expected = 100;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSoundBelowMin() { // переключаем звук на предыдущий минимальному
        RadioFlex cond = new RadioFlex();
        cond.setCurrentSound(0);
        cond.decreaseSound();
        int expected = 0;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSound() { // устанавливаем допустимый уровень звука и увеличиваем на 1
        RadioFlex cond = new RadioFlex();
        cond.setCurrentSound(3);
        cond.increaseSound();
        int expected = 4;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSound() { // устанавливаем допустимый уровень звука и уменьшаем на 1
        RadioFlex cond = new RadioFlex();
        cond.setCurrentSound(87);
        cond.decreaseSound();
        int expected = 86;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundMin() { // устанавливаем минимальный уровень звука
        RadioFlex cond = new RadioFlex();
        cond.setCurrentSound(0);
        int expected = 0;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundMax() { // устанавливаем максимальный уровень звука
        RadioFlex cond = new RadioFlex();
        cond.setCurrentSound(100);
        int expected = 100;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundAboveMax() { // устанавливаем уровень звука выше максимального
        RadioFlex cond = new RadioFlex();
        cond.setCurrentSound(101);
        int expected = 0;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundBelowMin() { // устанавливаем уровень звука ниже минимального
        RadioFlex cond = new RadioFlex();
        cond.setCurrentSound(-1);
        int expected = 0;
        int actual = cond.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
}