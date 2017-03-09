package util.DateTime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * Created by xuweijie on 2017/3/8.
 * 日期公共类,单例模式(双重检查加锁，可以大大减少getInstance()的同步问题所带来的时间耗费)
 */
public class TimeUtil {

    private volatile static TimeUtil timeUtil;
    private DateTime dateTime;

    public static TimeUtil getInstance(){
        if(timeUtil==null){
            synchronized (TimeUtil.class){
                if(timeUtil==null){
                    timeUtil=new TimeUtil();
                }
            }
        }
        return timeUtil;
    }

    //自定义表示的某个时刻的时间（具体到时分秒）
    public String GetTimeAtPoin(int year,int month,int day,int hour,int min,int sec){
        dateTime=new DateTime(year,month,day,hour,min,sec);
        return dateTime.toString("yyyy/MM/dd HH:mm:ss EE");
    }

    public String GetTimeAtPoin(int year,int month,int day){
        dateTime=new DateTime(year,month,day,0,0,0);
        return dateTime.toString("yyyy/MM/dd EE");
    }

    //在某个日期上加上xx天（如：在当前日期加上90天）（具体到时分秒）
    public String GetTimeAtPoin(int year,int month,int day,int hour,int min,int sec,int additionalTime){
        dateTime=new DateTime(year,month,day,hour,min,sec);
        return dateTime.plusDays(additionalTime).toString("yyyy/MM/dd HH:mm:ss EE");
    }

    public String GetTimeAtPoin(int year,int month,int day,int additionalTime){
        dateTime=new DateTime(year,month,day,0,0,0);
        return dateTime.plusDays(additionalTime).toString("yyyy/MM/dd EE");
    }


    //获取当前时间
    public String CurrentTime(){
        return dateTime.toString("yyyy/MM/dd HH:mm:ss EE");
    }

}
