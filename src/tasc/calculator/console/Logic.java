package tasc.calculator.console;

public class Logic {
    private InputNumber input;
    ArrRomeNumbers arr_numbers[];

    Logic(){
        input = new InputNumber();
        arr_numbers = ArrRomeNumbers.values();
    }

    public void aLogic() throws MyException.SymbolException, NumberFormatException, MyException.ExceedLimitExcemption {
        input.actionInputNumber();
        switch(input.getSymbol()){
            case '*':
                int answer = Operation.aMultiply(input.getNumber_first(), input.getNumber_second());
                System.out.println("Ответ :");
                if(input.getBranch()){
                    System.out.println(arr_numbers[answer-1]);
                } else System.out.println(answer);
                break;
            case '/': answer = Operation.aDivision(input.getNumber_first(),input.getNumber_second());
                System.out.println("Ответ :");
                if(input.getBranch()){
                    System.out.println(arr_numbers[answer-1]);
                } else System.out.println(answer);
                break;
            case '+': answer = Operation.aPlus(input.getNumber_first(),input.getNumber_second());
                System.out.println("Ответ :");
                if(input.getBranch()){
                    System.out.println(arr_numbers[answer-1]);
                } else System.out.println(answer);
                break;
            case '-': answer = Operation.aMinus(input.getNumber_first(),input.getNumber_second());
                System.out.println("Ответ :");
                if(input.getBranch()){
                    System.out.println(arr_numbers[answer-1]);
                } else System.out.println(answer);
                break;
        }
    }


}
