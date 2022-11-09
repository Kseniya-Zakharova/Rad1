public class Radio {
    private int currentVolume = 20;
    private int currentStation = 0;
    private final int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

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

        if (currentStation > maxStation) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
            return;
        }

        currentStation = 0;
    }
    public void prev() {
        if (currentStation > 0) {
            currentStation--;
            return;
        }

        currentStation = maxStation;
    }

    public void prevV() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextV() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }
}