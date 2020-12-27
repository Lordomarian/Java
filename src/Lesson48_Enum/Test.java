package Lesson48_Enum;
//Enum- перечесления
public class Test {
    //как делали перечисление до появления Enum
    //появляются не определенности. неудобно хранить, нужно каждый раз смотреть куда какой обьект мы записали
    private static final int DOG1 = 0;
    private static final int CAT1 = 1;
    private static final int FROG1 = 2;
    public static void main(String[] args) {
        int animal = DOG1;

        switch (animal){
            case (DOG1):
                System.out.println("Its a dog");
                break;
            case(FROG1) :
                System.out.println("Its a frog");
                break;
            default:
                System.out.println("Its not an animal");
        }
        //Иерархия наследования
        //Object --> Enum --> Season
    ///теперь с помощью Enum
        Animal animal1 = Animal.CAT;//переменная CAT ведет себя как статическая переменная
        //мы не можем поместить сюда что то кроме переменных типа Animal
        //сразу понятно что за сущность вызывается, не надо смотреть на мапинг
        switch (animal1){
            case CAT:
                System.out.println("Its a cat");
                break;
            case DOG:
                System.out.println("its a dog");
                break;
        }
        Season season = Season.SUMMER;
        //проверяем является ли season обьектом класса Season
        System.out.println(season instanceof Season);
        System.out.println(season instanceof Enum);//так же если обьект являеться обьектом дочернего класса,
        // то он являеться и обьектом класса родителя
        switch (season){
            case SUMMER:
                System.out.println("Its warm outside");
                break;
            case WINTER:
                System.out.println("Its cold outside");
                break;
        }
        Season season1 = Season.WINTER;
        System.out.println(season1.getTemperature());
        //После создания конструктора и метода getTranslation в enum Animal мы можем вызвать его
        System.out.println(animal1.getTranslation());
        System.out.println(animal1.toString());
        //полезные методы у enum
        Season season2 = Season.AUTUMN;
        System.out.println(season2.name());//возвращает название константы, используется когда переопределен toString
        Animal frog = Animal.valueOf("FROG");//Пользователь вводит название, мы определяем переменную
        // и можем получить доп информацию о ней
        System.out.println(frog.getTranslation());
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());//выводит порядковый номер обьявления его в enum
    }
}
