public class Radio {
    protected int currentVolume;
    protected int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation(){
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation >9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
            return;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation >0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
}

