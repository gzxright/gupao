package 结构型模式.过滤器;

import java.util.ArrayList;
import java.util.List;

public class 标准女性 implements 标准{
    @Override
    public List<人> 满足标准(List<人> persons) {
        List<人> malePersons = new ArrayList<人>();
        for (人 person : persons) {
            if(person.get性别().equalsIgnoreCase("女")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
