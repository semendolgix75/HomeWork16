package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;
import pro.sky.skyprocalculator.CalculateService;

@Service
public class CalculateServiceI implements CalculateService {
    public String hello() {
        return "<h1>Добро пожаловать в калькулятор!</h1>";
    }


    public String answerHello( int userNum1,int userNum2) {
        return "Ответ="+userNum1+"+"+userNum2;
    }
}
