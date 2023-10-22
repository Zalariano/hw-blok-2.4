package pro.sky.java.course2.webcalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void slogenie_succes() {
        String num1 = "1";
        String num2 = "2";

        int i = Integer.parseInt(num1);
        int k = Integer.parseInt(num2);
        int summa = i + k;
        String resultat = Integer.toString(summa);
        String expectedResult = num1 + "+" + num2 + "= " + resultat;
        String actualResult = calculatorService.slogenie(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void wychitanie_succes() {
        String num1 = "4";
        String num2 = "2";

        int i = Integer.parseInt(num1);
        int k = Integer.parseInt(num2);
        int summa = i - k;
        String resultat = Integer.toString(summa);
        String expectedResult = num1 + "-" + num2 + "= " + resultat;
        String actualResult = calculatorService.wychitanie(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void umnogenie_succes() {
        String num1 = "4";
        String num2 = "2";

        int i = Integer.parseInt(num1);
        int k = Integer.parseInt(num2);
        int summa = i * k;
        String resultat = Integer.toString(summa);
        String expectedResult = num1 + "*" + num2 + "= " + resultat;
        String actualResult = calculatorService.umnogenie(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void delenie_succes() {
        String num1 = "4";
        String num2 = "2";

        int i = Integer.parseInt(num1);
        int k = Integer.parseInt(num2);
        int summa = i / k;
        String resultat = Integer.toString(summa);
        String expectedResult = num1 + "/" + num2 + "= " + resultat;
        String actualResult = calculatorService.delenie(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void delenie_withExepion() {
        String num1 = "4";
        String num2 = "0";

        String expectedMessege = "На ноль делить нельзя";

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.delenie(num1, num2));
        assertEquals(expectedMessege, exception.getMessage());
    }

    @Test
    void helloCalculator_succes() {
        String expectedMessege = " Добро пожаловать в калькулятор";
        String actualMessege = calculatorService.helloCalculator();
        assertEquals(expectedMessege, actualMessege);
    }
}