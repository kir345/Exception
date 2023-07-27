//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить 
//у пользователя ввод данных.

import java.util.Scanner;

public class Home{
    public static void main(String[] args){
        inputNumber();

    }


public static float inputNumber(){
    try{
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        float num = in.nextFloat();
        System.out.println(num);
        return num;
    } catch (Exception e){
        System.out.println("Вводить только числа");
        inputNumber();
        return 0;
    }
}
}