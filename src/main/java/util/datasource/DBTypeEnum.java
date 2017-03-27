package util.datasource;

/**
 * Created by xuweijie on 17-3-26.
 */
public enum  DBTypeEnum {
    one("dataSourceOne"),tow("dataSourceTwo");
    private String value;

    DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
