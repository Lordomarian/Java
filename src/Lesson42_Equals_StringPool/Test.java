package Lesson42_Equals_StringPool;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y);//выдает true
        //      animal1  --->   (1)      //указывает на определенный участок памяти, который у этих обьектов разный
        //      animal2  --->   (1)
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1 == animal2);//выдает false тк сравнивает не сами обьекты а ссылки на эти обьекты
        //а тк у нас два разных обьекта с одинаковой сущностью то ссылки у них разные
        System.out.println(animal1.equals(animal2));// метод equals наследуется от Object, но также сравнивает ссылки
        // как и == чтобы сравнивать структурно нужно переопределить метод в классе Animal
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));//тк строки ссылочный тип данных то он не создает новый обьект
        // а ссылается на существующий , поэтому тут true
        // все созданные строки помещаются в String pool и при создании такой же строки , обьект не создается,
        // а столько создается ссылка на уже созданный обьект
        //Приэтом
        String s3 = new String("Hi");//здесь не включается механизм хеширования
        String s4 = new String("Hi");//и создается два разных обьекта поэтому их сравнение
        System.out.println(s3==s4);//даст результат false
        //лучше всегда искользовать для сравнения строк метод equals
    }
}
class Animal {
    private int id;

    public  Animal(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}