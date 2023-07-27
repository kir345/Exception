//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        inputText();

    }

    public static void inputText(){
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(str.isEmpty()){
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        }else{
            System.out.println(str);
        }
    }
        
}

