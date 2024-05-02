package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceI implements CalculateService {
    @Override
    public String welcomeCalculator() {
        return "<h1>Добро пожаловать в калькулятор!</h1>";
    }
    @Override
    public boolean checkInput(Integer userNum1, Integer userNum2) {
        return userNum1 == null || userNum2 == null;
    }
    @Override
    public String resultPlus(Integer userNum1, Integer userNum2) {
        if (checkInput(userNum1,userNum2)) {
            return "Введены неверные данные";
        } else {
            return userNum1 + " + " + userNum2 + " = " + (userNum1 + userNum2);
        }
    }
    @Override
    public String resultMinus(Integer userNum1, Integer userNum2) {
        if (checkInput(userNum1,userNum2)) {
            return "Введены неверные данные";
        } else {
            return userNum1 + " - " + userNum2 + " = " + (userNum1 - userNum2);
        }
    }

    @Override
    public String resultMultiply(Integer userNum1, Integer userNum2) {
        if (checkInput(userNum1,userNum2)) {
            return "Введены неверные данные";
        } else {
            return userNum1 + " * " + userNum2 + " = " + (userNum1 * userNum2);
        }
    }

    @Override
    public String resultDivide(Integer userNum1, Integer userNum2) {
        if (checkInput(userNum1,userNum2)) {
            return "Введены неверные данные";
        } else if(userNum2 == 0){ return "Деление на ноль"; }
         else {
            return userNum1 + " / " + userNum2 + " = " + ((float) userNum1 / userNum2);
        }
    }
}
