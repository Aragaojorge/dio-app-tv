public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("TV on?: " + smartTv.tvon);
        System.out.println("Cuurent channel?: " + smartTv.channel);
        System.out.println("Current volume?: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("TV on?: " + smartTv.tvon);

        smartTv.turnOff();
        System.out.println("TV on?: " + smartTv.tvon);

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        System.out.println("Current volume?: " + smartTv.volume);

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        System.out.println("Current volume?: " + smartTv.volume);

        smartTv.changeChannel(13);
        System.out.println("Cuurent channel?: " + smartTv.channel);
        
    }

}
