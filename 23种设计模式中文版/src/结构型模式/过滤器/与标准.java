package 结构型模式.过滤器;

import java.util.List;

public class 与标准 implements 标准 {

    private 标准 criteria;
    private 标准 otherCriteria;

    public 与标准(标准 标准, 标准 otherCriteria) {
        this.criteria = 标准;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<人> 满足标准(List<人> persons) {
        List<人> firstCriteriaPersons = criteria.满足标准(persons);
        return otherCriteria.满足标准(firstCriteriaPersons);
    }
}
