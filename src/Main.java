public class Main {
    public static void main(String[] args) {
        Boss bossInfo = new Boss();
        bossInfo.setHealth(700);
        bossInfo.setDamage(158);
        bossInfo.setDefence("MAGIC");
        System.out.println("Boss damage : " + bossInfo.getDamage() + "\nBoss Health : " + bossInfo.getHealth() + "\nBoss Defence : " + bossInfo.getDefence());

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