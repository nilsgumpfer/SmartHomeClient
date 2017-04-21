package logger;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Nils on 04.02.2017.
 */
public class SmartHomeClientLogger {
    private static SmartHomeClientLogger instance = new SmartHomeClientLogger();
    private List<String> listOfLogs = new ArrayList<>();

    private SmartHomeClientLogger(){
        //I´m a singleton! I have no public constructor.
    }

    public static void log(String message){
        String timestamp = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss:SSS] : ").format(new Date());
        SmartHomeClientLogger.getInstance().listOfLogs.add(timestamp + message);
        System.out.println(timestamp + message);
    }

    public static void log(Exception e){
        log(e.getMessage() + " (" + e.toString() + ")");
    }

    public static String[] readLogs(int limit){
        String [] array = {};
        try {
            List<String> logs = SmartHomeClientLogger.getInstance().listOfLogs;
            int size = logs.size();
            int end = size - 1;
            int start = end - limit;

            if(logs.size() > limit)
                array = logs.subList(start, end).toArray(array);
            else
                array = logs.toArray(array);
        }
        catch (Exception e)
        {
            SmartHomeClientLogger.log(e);
        }
        return array;
    }

    public static SmartHomeClientLogger getInstance()
    {
        return instance;
    }
}
