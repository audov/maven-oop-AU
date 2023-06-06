public class Radio {
    public int currentStation;
    public int currentSound;

    public void setNewStation(int newStation) {

        if (newStation <= 9) {
            if (newStation >= 0) {
                currentStation = newStation;
            }
        }
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
}