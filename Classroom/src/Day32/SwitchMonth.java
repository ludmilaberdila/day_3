package Day32;

public class SwitchMonth {
    public static void main(String[] args) {
        int month = 8;
        String monthString;
        switch (month) {
            case 1: monthString = "January";
               break;
            case 2: monthString = "February";
                ;
            case 3: monthString = "March";
                ;

            case 4: monthString = "April";
                break;

            case 5: monthString = "May";
                break;

            case 6: monthString = "June";
                break;

            case 7: monthString = "Julay";
                break;

            case 8: monthString = "August";
                break;

            case 9: monthString = "September";
                break;

            case 10: monthString = "October";
                break;

            case 11: monthString = "November";
                break;

            case 12: monthString = "December";
            default: System.out.println("invalide month");
        }
       // System.out.println(monthString);
    }
}
