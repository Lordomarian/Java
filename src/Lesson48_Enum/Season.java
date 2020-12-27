package Lesson48_Enum;

public enum Season {//обычно обозначаются в единственном числе
    SUMMER(35),WINTER(-30),SPRING(10),AUTUMN(20); // Java автоматически создает обьекты этого класса
    //Так же обычно имя переменных указывают большими буквами тк они константы
    private int temperature;
    Season (int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
}
