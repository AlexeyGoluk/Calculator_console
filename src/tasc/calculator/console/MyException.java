package tasc.calculator.console;

public class MyException {
    //выводит исключение некорректных арефметичиских знаков
    static class SymbolException extends Exception{
        SymbolException(){}
        SymbolException(String msg){
            super(msg);
        }
    }

    //выводит исключение при вводе некорректных чисел
    static class ExceedLimitExcemption extends Exception{
        ExceedLimitExcemption(){}
        ExceedLimitExcemption(String msg){
            super(msg);
        }
    }
}
