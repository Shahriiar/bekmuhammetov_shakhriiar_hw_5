public class Hero {
   private int health;
   private int damage;
   private String ultimate;

   public void Heroes (int health , int damage , String ultimate){
      this.health = health;
      this.damage = damage;
      this.ultimate = ultimate;
   }
   public void Heroes (int health , int damage){
      this.health = health;
      this.damage = damage;
   }

   public int getHealth() {
      return health;
   }

   public int getDamage() {
      return damage;
   }

   public String getUltimate() {
      return ultimate;
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