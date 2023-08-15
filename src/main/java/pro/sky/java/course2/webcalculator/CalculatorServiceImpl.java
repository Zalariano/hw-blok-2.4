package pro.sky.java.course2.webcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalkulatorService{

    public String slogenie(String num1,String num2) {
        int i = Integer.parseInt(num1);
        int k = Integer.parseInt(num2);
        int summa = i+k;
        String resultat = Integer.toString(summa);
        return num1+ "+" + num2 + "= " + resultat;

    }

    public String wychitanie(String num1,String num2) {
        int i = Integer.parseInt(num1);
        int k = Integer.parseInt(num2);
        int summa = i-k;
        String resultat = Integer.toString(summa);
        return num1+ "-" + num2 + "= " + resultat;

    }

    public String umnogenie(String num1,String num2) {
        int i = Integer.parseInt(num1);
        int k = Integer.parseInt(num2);
        int summa = i*k;
        String resultat = Integer.toString(summa);
        return num1+ "*" + num2 + "= " + resultat;

    }

    public String delenie(String num1,String num2) {
        int i = Integer.parseInt(num1);
        int k = Integer.parseInt(num2);
        if (k==0){
            return "На ноль делить нельзя";}else {
        int summa = i/k;
        String resultat = Integer.toString(summa);
        return num1+ "/" + num2 + "= " + resultat;}

    }

    public String helloCalculator() {
        return " Добро пожаловать в калькулятор";
    }
}
