
import java.util.HashMap;

public class MyTime {
    HashMap<String, Integer> tzones = new HashMap<String, Integer>();
    public MyTime(){
        tzones.put("central", +6);
        tzones.put("eastern", +5);
        tzones.put("western", +7);
        tzones.put("moldova", -2);
    }

    static String getUtcTime(String timezone, String time){
        MyTime mt = new MyTime();
        int number = mt.tzones.get(timezone);
        int hour = Integer.parseInt(time.split(":")[0]);
        return "UTC time for \"" + timezone + "\" at " + time +
                " is " + (hour + (number)) + ":" +time.split(":")[1];
    }

    static double calculateSeconds(String startTime, String endTime){
        double totalSeconds = 0;
        String[] startSections = startTime.split(":");
        String[] endSection = endTime.split(":");
        int hours = Integer.parseInt(endSection[0]) - Integer.parseInt(startSections[0]);
        int totalMinutes = Integer.parseInt(endSection[1]) - Integer.parseInt(startSections[1]);

        totalSeconds = hours * 60 * 60;
        totalSeconds += (totalMinutes * 60);
        totalSeconds += (Integer.parseInt(endSection[2]) - Integer.parseInt(startSections[2]));

        return totalSeconds;
    }
}
