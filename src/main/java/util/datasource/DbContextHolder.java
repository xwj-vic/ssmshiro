package util.datasource;

import com.baomidou.mybatisplus.enums.DBType;

/**
 * Created by xuweijie on 17-3-26.
 */
public class DbContextHolder {

    private static final ThreadLocal contextHolder = new ThreadLocal<>();

    /**
     * 设置数据源
     */
    public static void setDbType(DBTypeEnum dbTypeEnum) {
        contextHolder.set(dbTypeEnum.getValue());
    }

    /**
     * 取得当前数据源
     */
    public static String getDbType() {
        return (String) contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clearDbType() {
        contextHolder.remove();
    }
}
