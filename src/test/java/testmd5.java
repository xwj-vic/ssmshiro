import org.junit.Test;
import util.MD5Util;

/**
 * Created by xuweijie on 2017/3/7.
 */
public class testmd5 {

    @Test
    public void md5(){
        String pwd=MD5Util.md5("654321","xuweijie");
        System.out.print("pwd:"+pwd);
    }
}
