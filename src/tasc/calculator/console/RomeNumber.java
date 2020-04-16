package tasc.calculator.console;

public class RomeNumber {
    private String arr_numbers[] = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    private int rome_number_first,rome_number_second;
    private boolean check_arg1 = false,
            check_arg2 = false;

    /*
    checkArg1 и checkArg2:
    - проверяют строку на римские цифры
    - присваевают значения int переменным
     */
    public boolean checkArg1(String arg1 ) {
        for (int i = 0; i < arr_numbers.length; i++) {
            if (arg1.equals(arr_numbers[i])) {
                rome_number_first = i + 1;
                return check_arg1 = true;
            }
        }
        return check_arg1;
    }

    public boolean checkArg2(String arg2) {
        for (int i = 0; i < arr_numbers.length; i++) {
            if (arg2.equals(arr_numbers[i])) {
                rome_number_second = i + 1;
                return check_arg2 = true;
            }
        }
        return check_arg2;
    }


    public int getRome_number_first(){
        return rome_number_first;
    }

    public int getRome_number_second(){
        return rome_number_second;
    }
}
