
public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(WeaponType.SWORD, "Sword of Destiny");
        Weapon bow = new Weapon(WeaponType.BOW, "Bow of Shadows");


        Skeleton skeleton1 = new Skeleton("Skeleton Warrior", 50, sword, 10);
        Skeleton skeleton2 = new Skeleton("Skeleton Archer", 40, bow, 20);

        System.out.println("Skeleton 1 Info:");
        skeleton1.printInfo();
        System.out.println();

        System.out.println("Skeleton 2 Info:");
        skeleton2.printInfo();
    }
}
