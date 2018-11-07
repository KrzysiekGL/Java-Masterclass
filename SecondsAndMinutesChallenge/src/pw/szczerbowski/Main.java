package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(132,15));
        System.out.println(getDurationString(21579));
        System.out.println(getDurationString(61,1));
    }

    public static String getDurationString(int minutes, int seconds){
        if( (minutes<0) || !(seconds>=0 && seconds<=59) ) return "Invalid value";
        int hours=minutes/60;
        minutes%=60;
        String sHours=timeFormatter(hours);
        String sMinutes=timeFormatter(minutes);
        String sSeconds=timeFormatter(seconds);
        return sHours+"h "+sMinutes+"m "+sSeconds+"s";
    }

    public static String getDurationString(int seconds){
        if(seconds<0) return "Invalid value";
        int minutes=seconds/60;
        seconds%=60;
        return getDurationString(minutes,seconds);
    }

    public static String timeFormatter(int timeInt){
        if(timeInt<10) return "0"+timeInt;
        return ""+timeInt;
    }
}
