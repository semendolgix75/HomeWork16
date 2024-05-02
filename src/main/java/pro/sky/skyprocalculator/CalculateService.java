package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculateService {
    String hello();
    String answerHello(@RequestParam("name") int userNum1,@RequestParam("name") int userNum2);
}
