package pro.sky.skyprocalculator;

public interface CalculateService {
    String welcomeCalculator();

    String resultPlus(Integer userNum1, Integer userNum2);

    String resultMinus(Integer userNum1, Integer userNum2);

    String resultMultiply(Integer userNum1, Integer userNum2);

    String resultDivide(Integer userNum1, Integer userNum2);

}
