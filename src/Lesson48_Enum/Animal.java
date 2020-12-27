package Lesson48_Enum;

public enum Animal {
    CAT("Кошка"), DOG("Собака"), FROG("Лягушка") ;
    //когда указан конструктор с аргументами необходимо их указать при перечислении
    //эквивалентно new DOG("Собака")
    private String translation;

   /* private*/ Animal(String translation){ // в enum автамотически конструктор являеться private
       // ТК обьекты автоматически создаются внутри класса и нет необходимости создавать их из вне
        this.translation = translation;
    }
    public String getTranslation(){
       return translation;
    }
    public String toString(){
        return "Перевод на русский язык " + translation;
    }
}
