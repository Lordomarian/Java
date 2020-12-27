package Lesson50_Qutions;

import java.util.Random;

public class sRandom {
    public static void main(String[] args) {
       long before = System.currentTimeMillis();//способ замерить время программы. метод показывает текущее
        // время начиная с какого-то определенного года
        //это обычный способ создания рандомных чисел
        for (int i = 0; i <100 ; i++){
            System.out.println(Math.round(Math.random()*10));//round округляет по мат законам
            //ceil в большую сторону, floor в меньшую сторону
        }
        Random rand = new Random();
        System.out.println();
        for (int i = 0; i < 10 ;i++){
            System.out.println(rand.nextInt(11)-4);//выводит числа от -4 до 7 не вслючая 7
        }
        long after = System.currentTimeMillis();//время после выполнения программы
        System.out.println(((double)(after-before))/1000);//находим разницу чтобы найти время в секундах
    }
}
