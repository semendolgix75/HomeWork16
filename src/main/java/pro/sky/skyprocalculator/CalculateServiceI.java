package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceI implements CalculateService {

    public String hello() {
        return "<h1>Добро пожаловать в калькулятор!</h1>";
    }

    public String resultPlus(Integer userNum1, Integer userNum2) {
        return userNum1 + "+" + userNum2 + "=" + (userNum1 + userNum2);
    }

    public String resultMinus(Integer userNum1, Integer userNum2) {

        return userNum1 + "-" + userNum2 + "=" + (userNum1 - userNum2);
    }

    @Override
    public String resultMultiply(Integer userNum1, Integer userNum2) {
        return userNum1 + "*" + userNum2 + "=" + (userNum1 * userNum2);
    }

    @Override
    public String resultDivide(Integer userNum1, Integer userNum2) {
        return userNum1 + "/" + userNum2 + "=" + ((float) userNum1 / userNum2);
    }
}
