package tasc.calculator.console;

import java.util.Scanner;

public class InputNumber {
    private RomeNumber rome_number;
    private StringBuilder line_date;
    private char symbol;
    private boolean branch;
    private int number_first,number_second;

    InputNumber(){
        rome_number = new RomeNumber();
    }

    public void actionInputNumber() throws MyException.SymbolException, MyException.ExceedLimitExcemption {
        inputDate();
    }

    /*
    inputDate :
    - метод принимает ввод с клавиатуры,
    - проверяет наличие пробелов : checkSpaces,
    - присваивает int значения и проверяет границы вводимых чисел : assignValue,
    - проверяет знак : aSymbol();
   */
    private void inputDate() throws MyException.SymbolException, MyException.ExceedLimitExcemption {
        String aLine = new Scanner(System.in).nextLine();
        checkSpaces(aLine);
        assignValue();
        if(number_first>10 || number_second>10 ||number_first<1 || number_second<1){
            throw new MyException.ExceedLimitExcemption();
        }
        if(!aSymbol()){throw new MyException.SymbolException();}
    }

    //проверяет на пробелы , если пробелы есть удаляет и возвращает строку без пробелов;
    private void checkSpaces(String date){
        line_date = new StringBuilder(date.replaceAll(" ",""));
    }

    //присваевает знак арифметической операции
    public boolean aSymbol(){
        for(int i=0;i<line_date.length();i++){
            if(line_date.charAt(i) == '*'||line_date.charAt(i) == '/'||line_date.charAt(i) == '+'||line_date.charAt(i) == '-'){
                symbol = line_date.charAt(i);
                return true;
            }
        }
        return false;
    }

    // присваевает int переменным значения;
    private void assignValue() throws NumberFormatException{
        String aLine = String.valueOf(line_date);
        String[] arrLine = aLine.split("\\p{Punct}");
        if(rome_number.checkArg1(arrLine[0]) && rome_number.checkArg2(arrLine[1])){
            number_first = rome_number.getRome_number_first();
            number_second = rome_number.getRome_number_second();
            branch = true;

        } else{
            number_first = Integer.parseInt(arrLine[0]);
            number_second = Integer.parseInt(arrLine[1]);
            branch = true;
        }
    }

    public int getNumber_first(){
        return number_first;
    }

    public int getNumber_second(){
        return number_second;
    }

    public char getSymbol(){
        return symbol;
    }
    public boolean getBranch(){ return branch; }
}
