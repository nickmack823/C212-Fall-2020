package Homework2;

public class Homework2 {

    public static void main(String[] args) {
        int startTime = 1934;
        int endTime = 1256;
        int startMinutes = timeDifference(startTime);
        int endMinutes = timeDifference(endTime);

        // System.out.println(startTime + " (" + startMinutes + ")");
        // System.out.println(endTime + " (" + endMinutes + ")");

        int difference = endMinutes - startMinutes;

        int hourCount = difference / 60;
        int minuteCount = difference % 60;
        
        if(hourCount < 0) {
            hourCount = hourCount * -1;
        }
        if(minuteCount < 0) {
            minuteCount = minuteCount * -1;
        }

        System.out.println("There are " + hourCount + " hours and " + minuteCount + " minutes between " + startTime + " and " + endTime);

    }

    public static int timeDifference(int timeStamp) {
        double time = timeStamp / 100;

        int hours = (int) Math.floor(time);
        int minutes = timeStamp % 100;

        System.out.println(hours + ":" + minutes);

        return (hours * 60) + minutes;
    }

}