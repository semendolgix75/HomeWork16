package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculateService {
    String hello();
    String resultPlus(int userNum1,int userNum2);

    String resultMinus(int userNum1, int userNum2);
}
