package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
    public String resultPlus (@RequestParam(value="num1",required = false) int userNum1,@RequestParam(value="num2",required = false) int userNum2)
    {
        return calculateService.resultPlus(userNum1,userNum2);
    }
    @GetMapping(path = "/calculator/minus")
    public String resultMinus (@RequestParam(value="num1",required = false) int userNum1,@RequestParam(value="num2",required = false) int userNum2)
    {
        return calculateService.resultMinus(userNum1,userNum2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String resultMultiply (@RequestParam(value="num1",required = false) int userNum1,@RequestParam(value="num2",required = false) int userNum2)
    {
        return calculateService.resultMultiply(userNum1,userNum2);
    }
    @GetMapping(path = "/calculator/divide")
    public String resultDivide (@RequestParam(value="num1",required = false) int userNum1,@RequestParam(value="num2",required = false) int userNum2)
    {
        return calculateService.resultDivide(userNum1,userNum2);
    }
}
