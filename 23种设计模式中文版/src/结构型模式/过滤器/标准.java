package 结构型模式.过滤器;

import java.util.List;

public interface 标准 {
    public List<人> 满足标准(List<人> persons);
}
