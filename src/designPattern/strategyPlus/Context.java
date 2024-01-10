package designPattern.strategyPlus;

import java.util.*;

/**
 * Context
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class Context {

    Map<String, Strategy> strategyMap = new HashMap<>();

    public Context(){
        // 模拟获取接口的实现类
        List<Strategy> strategyList = new ArrayList<>();
        strategyList.add(new OperationAdd());
        strategyList.add(new OperationMultiply());
        strategyList.add(new OperationSubtract());
        for (Strategy strategy : strategyList) {
            Option annotation = strategy.getClass().getAnnotation(Option.class);
            strategyMap.put(annotation.value(), strategy);
        }
    }

    public int executeStrategy(int num1, int num2, String option){
        Strategy strategy = strategyMap.get(option);
        return strategy.doOperation(num1, num2);
    }
}
