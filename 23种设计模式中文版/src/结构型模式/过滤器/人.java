package 结构型模式.过滤器;

public class 人 {
    private String name;
    private String 性别;
    private String 婚姻状态;

    public 人(String name, String 性别, String 婚姻状态) {
        this.name = name;
        this.性别 = 性别;
        this.婚姻状态 = 婚姻状态;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public String get婚姻状态() {
        return 婚姻状态;
    }

    public void set婚姻状态(String 婚姻状态) {
        this.婚姻状态 = 婚姻状态;
    }
}
