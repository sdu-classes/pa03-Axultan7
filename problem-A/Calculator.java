import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    int num1, num2;
    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int Add() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Cannot add negative numbers");
        }
        return num1+num2;
    }

    int Subtract() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Cannot subtract negative numbers");
        }
        return num1-num2;
    }

    int Multiplication() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Cannot multiply by zero");
        }
        return num1*num2;
    }
    int Division() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1/num2;
    }
}

