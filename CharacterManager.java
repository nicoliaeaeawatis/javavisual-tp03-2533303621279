
package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private final ArrayList<Character> characterList =
        new ArrayList<>();

    private static int totalCharacterCreated = 0;

    public boolean addCharacter(Character character) {
        if (character == null || character.getName() == null
                || character.getName().trim().isEmpty()) {
            return false;
        }

        if (findByName(character.getName()) != null) {
            System.out.println("Nama duplikat ditolak: "
                + character.getName());
            return false;
        }

        characterList.add(character);
        totalCharacterCreated++;
        return true;
    }

    public Character findByName(String name) {
        if (name == null) {
            return null;
        }

        for (Character c : characterList) {
            if (c.getName() != null
                    && c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }

        return null;
    }

    public boolean removeCharacter(String name) {
        Character c = findByName(name);

        if (c == null) {
            return false;
        }

        characterList.remove(c);
        return true;
    }

    public int getTotalCharacters() {
        return characterList.size();
    }

    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characterList);
    }

    public double getAverageLevel() {
        if (characterList.isEmpty()) {
            return 0.0;
        }

        int total = 0;

        for (Character c : characterList) {
            total += c.getLevel();
        }

        return (double) total / characterList.size();
    }

    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();

        if (type == null) {
            return result;
        }

        for (Character c : characterList) {
            if (c.getType() == type) {
                result.add(c);
            }
        }

        return result;
    }

    /**
     * Mencari karakter dengan nilai attack tertinggi.
     *
     * @return karakter terkuat atau null jika daftar kosong.
     */
    public Character findStrongest() {
        if (characterList.isEmpty()) {
            return null;
        }

        Character strongest = characterList.get(0);

        for (Character c : characterList) {
            if (c.getAttack() > strongest.getAttack()) {
                strongest = c;
            }
        }

        return strongest;
    }

    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }
}

