import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStationAboveMax() {
        Radio cond = new Radio();
        cond.setNewStation(10);
        int expected = 0;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationBelowMin() {
        Radio cond = new Radio();
        cond.setNewStation(-1);
        int expected = 0;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCustomStation() {
        Radio cond = new Radio();
        cond.setNewStation(5);
        int expected = 5;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() {
        Radio cond = new Radio();
        cond.switchNextStation();
        int expected = 1;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation1() {
        // int newStation = setNewStation();
        Radio cond = new Radio();
        cond.setNewStation(9);
        cond.switchNextStation();
        int expected = 0;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation() {
        Radio cond = new Radio();
        cond.switchPrevStation();
        int expected = 9;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation1() {
        Radio cond = new Radio();
        cond.setNewStation(9);
        cond.switchPrevStation();
        int expected = 8;
        int actual = cond.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSoundAboveMax() {
        Radio cond = new Radio();
        cond.setSound(100);
        cond.increaseSound();
        int expected = 100;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSoundBelowMin() {
        Radio cond = new Radio();
        cond.setSound(0);
        cond.decreaseSound();
        int expected = 0;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundIncrease() {
        Radio cond = new Radio();
        cond.increaseSound();
        int expected = 1;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundDecrease() {
        Radio cond = new Radio();
        cond.setSound(100);
        cond.decreaseSound();
        int expected = 99;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundAboveMax() {
        Radio cond = new Radio();
        cond.setSound(101);
        int expected = 0;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundBelowMin() {
        Radio cond = new Radio();
        cond.setSound(-1);
        int expected = 0;
        int actual = cond.currentSound;
        Assertions.assertEquals(expected, actual);
    }
}