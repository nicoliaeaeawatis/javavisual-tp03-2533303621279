
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // Membuat 3 karakter
        Character hero1 = new Character(
            "Arthur", CharacterType.WARRIOR
        );

        Character hero2 = new Character(
            "Merlin", CharacterType.MAGE, 2, 120, 60
        );

        Character hero3 = new Character(
            "Robin", CharacterType.ARCHER
        );

        // Menampilkan 3 karakter
        System.out.println("=== CHARACTER MANAGER ===");
        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);

        // Demo level up
        System.out.println("\n=== LEVEL UP ===");
        System.out.println("Sebelum: " + hero1);

        hero1.setLevel(2);

        System.out.println("Sesudah: " + hero1);

        // Mini-Challenge: mana dan isAlive()
        Character hero4 = new Character(
            "Necro", CharacterType.ASSASSIN
        );

        hero4.setMana(50);

        System.out.println("\n=== MINI-CHALLENGE ===");
        System.out.println(hero4);
        System.out.println(
            "Mana: " + hero4.getMana()
        );
        System.out.println(
            "Apakah Necro masih hidup? " + hero4.isAlive()
        );
    }
}
