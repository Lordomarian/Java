package Lesson43_Into_class;
//Вложенные классы
//существует три типа вложенных классов
//1.Не статический вложенный класс(обычно приватные)
//нужен чтобы раздлелять сложные классы на несколько подъобектов
//2.Статический вложенный класс
//нужен чтобы связать логически(мысленно) два класса и для удобной записи при вызове
//3. класс находящийся в методе. Имеет доступ к полям (нестат. и только к константам) в классе,
// а так же к полям(final) в методе в котором создан
public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();
        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
