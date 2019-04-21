package 结构型模式.过滤器;

import java.util.List;

public class 或标准 implements 标准 {

    private 标准 criteria;
    private 标准 otherCriteria;

    public 或标准(标准 标准, 标准 otherCriteria) {
        this.criteria = 标准;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<人> 满足标准(List<人> persons) {
        List<人> firstCriteriaItems = criteria.满足标准(persons);
        List<人> otherCriteriaItems = otherCriteria.满足标准(persons);

        for (人 人 : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(人)){
                firstCriteriaItems.add(人);
            }
        }
        return firstCriteriaItems;
    }
}
