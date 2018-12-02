package com.company;

public class Main {

    public static void main(String[] args) {
        String ColoursOfUrine[]={"---","Соломенно-желтая","Темно-желтый", "Бледный, водянистый", "Темно-бурый", "Темный (почти черный)", "Красный",
                "Вид «мясных помоев»", "зеленовато-бурый", "Зеленовато-желтый", "Беловатый","Молочный" };
        String transparency[] = {"---","Полная", "Неполная", "Мутноватая", "Мутная"};
        String cilindresUrine[]={"---","Гиалиновые","Зернистые", "Восковидные", "Эритроцитарные","Лейкоцитарные", "Эпителиальные", "Пигментные", "Цилиндроиды" };
        String slimeUrine[]={"---","+", "++", "+++", "++++"};
        String saltUrine[]={"---","Ураты","Оксалаты","Фосфаты","Мочевая кислота","Смешанные"};
        MainUI mainUI = new MainUI();
        mainUI.build(transparency, ColoursOfUrine, cilindresUrine, slimeUrine, saltUrine);
    }
}
