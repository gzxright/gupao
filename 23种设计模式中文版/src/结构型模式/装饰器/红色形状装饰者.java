package 结构型模式.装饰器;


public class 红色形状装饰者 extends 形状装饰者 {


    public 红色形状装饰者(形状接口 形状接口入参) {
        super(形状接口入参);
    }

    private void 设置红色描边 (形状接口 形状接口入参){
        System.out.println("描边 颜色: 红色");
    }

    public void 画(){
        形状接口_属性.画();
        设置红色描边(形状接口_属性);
        }
    }
