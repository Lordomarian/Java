package com.company;

import java.util.Locale;

public class StringBuilder1 {
    public static void main(String[] args){
        String x = "hello";
       // x.toUpperCase();//Класс String не изменяемый(immutable)все операторы не изменяют эту строку,а возвращают новую
        x = x.toUpperCase(); // переприсваевыем в x новую строку
        System.out.println(x);
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3; // создаются дополнительные строки s4=s1+s2, s5=s4+s3
        //при суммировании множества строк программа начинает тормозить и забирать много памяти
        System.out.println(stringAll);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        //sb.append(" my"); тоже самое что и сверху, тк метод возвращает обратно обьект класса StringBuilder
        // sb.append(" friend");
        System.out.println(sb.toString());
        System.out.printf("\n%.2f This is %s a string, %d", 10.2 ,"NICE", 300);
        // %.2f ограничивает цифры после запятой, а так же округляет.
        //%s показывает куда и какой тип будет вставлен s-string,d-digital, f -float и тд
        System.out.printf("String %10d,\n ",535); // %10d обозначает сколько символов будет выделено под число
        System.out.printf("String %10d,\n ",1000000);// \n переход на другую строку
        System.out.printf("String %-10d,\n ",5); // %-10d числа начинаются слева, без минуса заканчиваются справа
        System.out.printf("String %5d,\n ",1929929292);
    }
}
