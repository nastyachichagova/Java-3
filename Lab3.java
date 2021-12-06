//Пользователь вводит с клавиатуры строчку, являющуюся паролем.
//Проверить, надежно ли составлен пароль. Пароль считается надежным,
//если он состоит из 8 или более символов. Символом может быть цифра,
//английская буква, знак подчеркивания. Пароль должен содержать хотя бы
//одну заглавную букву, одну маленькую букву и одну цифру.

import java.util.Scanner;
import java.util.regex.*;

public class Lab3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пароль: ");

        String password = in.nextLine();
        String pattern1 = "[А-Яа-я@$!?%*&#]+";
        String pattern2 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";

        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(password);
        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(password);

        if (m1.find()){
            System.out.print("Ошибка. Пароль содержит недопустимые символы.");
        }
        else
            if (m2.matches()){
                System.out.print("Пароль надежный.");
            }
            else
                System.out.print("Пароль ненадежный.");
        in.close();
    }
}
