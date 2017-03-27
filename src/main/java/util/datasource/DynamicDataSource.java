package util.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by xuweijie on 17-3-26.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * 取得当前使用哪个数据源
     * @return
     */
    protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbType();
    }
}

