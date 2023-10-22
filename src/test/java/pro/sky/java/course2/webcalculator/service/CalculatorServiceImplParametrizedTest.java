package pro.sky.java.course2.webcalculator.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    public static Stream<Arguments> plusParams(){
       return Stream.of(
                Arguments.of("2","2","2+2= 4"),
               Arguments.of("30","3","30+3= 33"),
               Arguments.of("12","5","12+5= 17"),
               Arguments.of("0","0","0+0= 0")
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void slogenie(String num1,String num2,String result) {
        assertEquals(result,calculatorService.slogenie(num1,num2));
    }
    public static Stream<Arguments> minusParams(){
        return Stream.of(
                Arguments.of("2","2","2-2= 0"),
                Arguments.of("30","3","30-3= 27"),
                Arguments.of("12","5","12-5= 7"),
                Arguments.of("0","0","0-0= 0")
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void wychitanie(String num1,String num2,String result) {
        assertEquals(result,calculatorService.wychitanie(num1,num2));
    }
    public static Stream<Arguments> umnogenieParams(){
        return Stream.of(
                Arguments.of("2","2","2*2= 4"),
                Arguments.of("30","3","30*3= 90"),
                Arguments.of("12","5","12*5= 60"),
                Arguments.of("0","0","0*0= 0")
        );
    }

    @ParameterizedTest
    @MethodSource("umnogenieParams")
    void umnogenie(String num1,String num2,String result) {
        assertEquals(result,calculatorService.umnogenie(num1,num2));
    }
    public static Stream<Arguments> delenieParams(){
        return Stream.of(
                Arguments.of("2","2","2/2= 1"),
                Arguments.of("30","3","30/3= 10"),
                Arguments.of("10","5","10/5= 2"),
                Arguments.of("0","1","0/1= 0")
        );
    }

    @ParameterizedTest
    @MethodSource("delenieParams")
    void delenie(String num1,String num2,String result) {
        assertEquals(result,calculatorService.delenie(num1,num2));
    }
}