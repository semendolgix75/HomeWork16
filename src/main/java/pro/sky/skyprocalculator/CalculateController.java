package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculator.CalculateService;

@RestController
public class CalculateController {
    private final CalculateService calculateService ;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calculateService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String answerHello (@RequestParam(value="num1",required = false) int userNum1,@RequestParam(value="num2",required = false) int userNum2)
    {
        return calculateService.answerHello(userNum1,userNum2);
    }
}
