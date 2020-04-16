package tasc.calculator.console;

public class UserAction {
    private Logic logic;

    UserAction() {
        System.out.println("Введите данные : ");
        logic = new Logic();
        userDisplay();
    }

    private void userDisplay() {
        try {
            try {
                try {
                    logic.aLogic();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректные данные");
                }
            }catch (MyException.ExceedLimitExcemption e){
                System.out.println("Введите числа 1-10");
            }
        }catch (MyException.SymbolException e) {
            System.out.println("Некорректная операция используйте : [*,/,+,-]");
        }
    }
}
