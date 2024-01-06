public class Main {
    public static void main(String[] args){
        String utcTime;
        utcTime = MyTime.getUtcTime("central", "5:30");
        System.out.println(utcTime);
        utcTime = MyTime.getUtcTime("moldova", "5:30");
        System.out.println(utcTime);

        double seconds;
        seconds = MyTime.calculateSeconds("11:14:20", "12:14:20");
        System.out.println(seconds);
        seconds = MyTime.calculateSeconds("11:15:20", "12:14:20");
        System.out.println(seconds);
        seconds = MyTime.calculateSeconds("11:15:30", "12:14:20");
        System.out.println(seconds);
    }
}
