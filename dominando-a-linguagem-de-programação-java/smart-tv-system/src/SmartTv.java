public class SmartTv {
  boolean isOn = false;
  int channel = 1;
  int soundLevel = 1;

  public void powerOn() {
    isOn = true;
  }

  public void powerOff() {
    isOn = false;
  }

  public void volumeUp() {
    if (soundLevel == 99) {
      soundLevel = 99;
    }
    soundLevel++;
  }

  public void volumeDown() {
    if (soundLevel == 0) {
      soundLevel = 0;
    }
    soundLevel--;
  }

  public void channelUp() {
    if (channel == 100) {
      channel = 100;
    }
    soundLevel++;
  }

  public void channelDown() {
    if (channel == 0) {
      channel = 0;
    }
    channel--;
  }

  public void changeChannel(int newChannel) {
    channel = newChannel;
  }
}
