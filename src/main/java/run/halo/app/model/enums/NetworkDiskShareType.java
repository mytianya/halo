package run.halo.app.model.enums;

/**
 * @author dsyslove@163.com
 * @createtime 2020/12/31--14:50
 * @description
 **/
public enum NetworkDiskShareType implements ValueEnum<Integer>{
    ABLE(0),
    DISABLE(1);
    private final int value;
    NetworkDiskShareType(Integer value){
        this.value=value;
    }
    @Override
    public Integer getValue() {
        return value;
    }
}
