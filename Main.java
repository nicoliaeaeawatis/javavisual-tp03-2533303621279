
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // Membuat tiga karakter
        Character karakter1 = new Character(
            "Arthur", CharacterType.WARRIOR
        );

        Character karakter2 = new Character(
            "Merlin", CharacterType.MAGE, 2, 120, 20
        );

        Character karakter3 = new Character(
            "Robin", CharacterType.ARCHER
        );

        // Menampilkan tiga karakter
        System.out.println("=== DAFTAR KARAKTER ===");
        System.out.println(karakter1);
        System.out.println(karakter2);
        System.out.println(karakter3);

        // Demo level up
        System.out.println("\n=== DEMO LEVEL UP ===");
        karakter1.setLevel(2);
        System.out.println(karakter1);

        // Mini-Challenge: karakter baru
        Character karakter4 = new Character(
            "Luna", CharacterType.MAGE
        );

        karakter4.setMana(50);

        System.out.println("\n=== MINI-CHALLENGE ===");
        System.out.println(karakter4);
        System.out.println(
            "Mana Luna: " + karakter4.getMana()
        );
        System.out.println(
            "Apakah Luna masih hidup? " + karakter4.isAlive()
        );

        // Uji validasi mana
        System.out.println("\n=== UJI VALIDASI ===");

        try {
            karakter4.setMana(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
