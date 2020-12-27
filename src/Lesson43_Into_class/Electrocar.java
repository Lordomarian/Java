package Lesson43_Into_class;

public class Electrocar {
    private int id;
    //вложенный не статический класс
    //имеет доступ к полям обьекта
    private class Motor{
        public void startMotor(){
            System.out.println("Motor" + id +"is starting");
        }
    }
    //Статический вложенный класс
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id){
        this.id= id;
    }
    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        int x = 1 ;
        class SomeClass{
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }
        System.out.println("Electrocar" + id + "is starting");
    }
}
