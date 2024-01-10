package designPattern.strategyPlus;

/**
 * Demo
 * 把不同的策略的交给Context，使用不同的算法
 *
 * @author Niuniu
 * @date 2023/5/24
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5, "add"));

        System.out.println("10 - 5 = " + context.executeStrategy(10, 5, "subtract"));

        System.out.println("10 * 5 = " + context.executeStrategy(10, 5, "multiply"));
    }
}
