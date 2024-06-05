public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada: " + smartTv.isOn);
        System.out.println("Canal Atual: " + smartTv.channel);
        System.out.println("Volume Atual: " + smartTv.soundLevel);

        smartTv.powerOn();
        System.out.println("Tv ligada: " + smartTv.isOn);

        smartTv.volumeUp();
        System.out.println("Volume Atual: " + smartTv.soundLevel);

        for (int i = 0; i < 6; i++) {
            smartTv.volumeUp();
        }

        System.out.println("Volume Atual: " + smartTv.soundLevel);

        smartTv.powerOff();
        System.out.println("Tv ligada: " + smartTv.isOn);

        smartTv.changeChannel(69);
        System.out.println("Canal atual: " + smartTv.channel);

        smartTv.channelDown();
        System.out.println("Canal atual: " + smartTv.channel);

    }
}
