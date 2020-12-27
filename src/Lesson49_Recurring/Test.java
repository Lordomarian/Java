package Lesson49_Recurring;
//рекурсия
//Стек - участок памяти где хранятся данные о вызовах методов
//someMethod() --> someMethod() --> someMethod() и до бесконечности
public class Test {
    public static void main(String[] args) {
        someMethod();
        counter(3);
        System.out.println(fac(4));
    }
    public static void someMethod(){
        System.out.println("Hello");
   //     someMethod();//вызываем бесконечную рекурсию выдает ошибку stack overflow
    }
    public static void counter(int n){
        if (n == 0 ) return;//условие выхода их рекурсии
        System.out.println(n);

        counter(n-1);
    }
    public static int fac(int n ){//нахождение факториала
        if (n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }

}
