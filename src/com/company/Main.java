package com.company;

public class Main {


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(700);
        boss.setDefenceType("strike");
        boss.setHealth(900);

        System.out.println(boss.getHealth() + " - health\n" +
                boss.getDamage() + " -Damage\n" +
                boss.getDefenceType() + " -DefenceType");

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + "  " + createHeroes()[i].getSkill());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero = new Hero(500, 600, "блок");
        Hero hero2 = new Hero(670, 750, "заморозка");
        Hero hero3 = new Hero(570, 840);
        Hero[] rey = {hero, hero2, hero3};
        return rey;
    }
}