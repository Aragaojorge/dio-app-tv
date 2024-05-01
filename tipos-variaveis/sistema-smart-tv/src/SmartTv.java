public class SmartTv {

    boolean tvon = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        tvon = true;
    }

    public void turnOff() {
        tvon= false;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }

    public void increaseChannel() {
        channel++;
    }

    public void decreaseChannel() {
        channel--;
    }

    public void changeChannel(int novoCanal) {
        channel = novoCanal;
    }

}
