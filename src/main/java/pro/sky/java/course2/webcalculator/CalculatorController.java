package pro.sky.java.course2.webcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl){
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping()
    public String helloCalculator() {
        return calculatorServiceImpl.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String slogenie(@RequestParam String num1, @RequestParam String num2) {
        return calculatorServiceImpl.slogenie(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String wychitanie(@RequestParam String num1, @RequestParam String num2) {
        return calculatorServiceImpl.wychitanie(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String umnogenie(@RequestParam String num1, @RequestParam String num2) {
        return calculatorServiceImpl.umnogenie(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String delenie(@RequestParam String num1, @RequestParam String num2) {
        return calculatorServiceImpl.delenie(num1, num2);
    }
}
