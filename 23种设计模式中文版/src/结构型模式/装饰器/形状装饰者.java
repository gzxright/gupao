package 结构型模式.装饰器;


public abstract class 形状装饰者 implements 形状接口 {
        protected 形状接口 形状接口_属性;

        public 形状装饰者(形状接口 形状接口入参){
            this.形状接口_属性 = 形状接口入参;
        }

        public void 画(){
            形状接口_属性.画();
        }
    }
