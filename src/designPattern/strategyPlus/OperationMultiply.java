package designPattern.strategyPlus;

/**
 * 乘法操作
 *
 * @author Niuniu
 * @date 2023/5/24
 */
@Option("multiply")
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
