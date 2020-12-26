package Lesson35_Anonim_Classes;
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

interface AbleToEat {
    public void eat();
}

class OtherAnimal extends Animal{
    public void eat(){
        System.out.println("Other animal is eating");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();
        //в случае если мы используем переопределенный метод только один раз , то создавать свой класс под него
        //не эффективно и используются анонимные классы
        Animal animal1 = new Animal(){//короткий вариант создания класса с переопределенным методом
            public void eat(){//создается не класс Animal а класс наследник, с переопределнным методом
                System.out.println("Animal2 is eating");
            }
        };
        animal1.eat();
        //для того чтобы эффективно использовать анонимные классы, лучше использовать интерфейсы
        AbleToEat ableToEat = new AbleToEat() {//здесь создается класс который наследует интерфейс,
            @Override                         // а значит и все его методы
            public void eat() {              //создается чтобы использовать один раз и не создавать лишние классы
                System.out.println("Some one is eating");
            }
        };
        ableToEat.eat();
    }
}
