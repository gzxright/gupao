package J2EE模式.拦截过滤器模式;

import java.util.ArrayList;
import java.util.List;

    public class 过滤器链 {
        private List<过滤器> filters = new ArrayList<过滤器>();
        private 请求处理程序 target;

        public void addFilter(过滤器 filter){
            filters.add(filter);
        }

        public void execute(String request){
            for (过滤器 filter : filters) {
                filter.execute(request);
            }
            target.execute(request);
        }

        public void setTarget(请求处理程序 target){
            this.target = target;
        }
    }