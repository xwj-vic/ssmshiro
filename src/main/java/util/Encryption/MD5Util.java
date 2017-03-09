package util.Encryption;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by xuweijie on 2017/3/6.
 * MD5+salt对数据进行加密
 */
public class MD5Util {
    //shiro提供的MD5加密方法，其中salt是自定义的字符串
    public static String md5(String str,String salt){
        return new Md5Hash(str,salt).toString();
    }

}
