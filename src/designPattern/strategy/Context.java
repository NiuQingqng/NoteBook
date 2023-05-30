package designPattern.strategy;

/**
 * Context
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
