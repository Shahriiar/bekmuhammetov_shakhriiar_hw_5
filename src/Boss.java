public class Boss {
    private int health;
    private int damage;
    private String defence;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }
}
//1. Создать класс Героя (Hero), с приватными полями здоровье, урон и
//суперспособность. Написать 2 разных конструктора для создания объекта. В одном
//конструкторе задаются все поля, в другом только здоровье и урон. Добавить в
//класс Hero геттеры для всех полей.
//2. Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
//Добавить в класс геттеры и сеттеры для всех полей.
//3. В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//полям). Затем распечатать всю информацию о боссе.
