import org.joda.time.DateTime;
import org.junit.Test;
import util.DateTime.TimeUtil;

/**
 * Created by xuweijie on 2017/3/8.
 */
public class timetest {

    @Test
    public void testtime(){

        String time=TimeUtil.getInstance().GetTimeAtPoin(2017,3,8,23,33,56);
        System.out.println("某一时刻的时间："+time);
        String currenttime=TimeUtil.getInstance().CurrentTime();
        System.out.println("当前时间："+currenttime);
        String addtime=TimeUtil.getInstance().GetTimeAtPoin(2017,3,8,23,33,56,90);
        System.out.println("某一时刻的时间+加上90天："+addtime);
        String time1=TimeUtil.getInstance().GetTimeAtPoin(2017,3,8);
        System.out.println("某一时刻的时间："+time1);

    }
}
