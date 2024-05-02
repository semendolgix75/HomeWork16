package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;
import pro.sky.skyprocalculator.CalculateService;

@Service
public class CalculateServiceI implements CalculateService {
    public String hello() {
        return "<h1>Добро пожаловать в калькулятор!</h1>";
    }


    public String resultPlus(int userNum1,int userNum2) {
        return userNum1+"+"+userNum2+"="+(userNum1+userNum2);
    }
    public String resultMinus(int userNum1,int userNum2) {
        return userNum1+"-"+userNum2+"="+(userNum1-userNum2);
    }
}
