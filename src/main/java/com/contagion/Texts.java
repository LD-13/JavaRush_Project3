package com.contagion;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;

public class Texts {
    private static String playerName;
    private static List<String> textsList = new LinkedList<>();

    public static List<String> chooseButton1 = new LinkedList<>();
    public static List<String> chooseButton2 = new LinkedList<>();

    public Texts(String playerName) {
        this.playerName = playerName;
        textsList.clear();
        story();
        chooseButton();
    }

    public String getIntroduction() throws URISyntaxException {
        String introduction = "username лежал на втором этаже недавно купленной даче. Он представлял как завтра к нему приедут его друзья на шашлыки.\n" +
                "Мясо было замаренованно и водка лежала в морозильнике. Да, завтра будет определенно прекрасный день.\n" +
                "    username знал, что рядом есть биолаборатория. Но сильно низная цена дачи смогла его убедить, что о лаборатории думать не стоит.";
//        File file = new File(getClass().getClassLoader().getResource("introduction.txt").toURI());
//        try (FileReader fileReader = new FileReader(file)) {
//            char[] chars = new char[(int) file.length()];
//            fileReader.read(chars);
//            introduction = new String(chars);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        return introduction.replace("username", playerName);
    }

    public void story() {
        String badChoose1 = "username открыл дверь и на него тут же навалилось окровавленное тело которое сразу прокусило username горло.";
        textsList.add(badChoose1.replace("username", playerName));
        String knok = "И как только username заснул, в дверь начали колотить.";
        textsList.add(knok.replace("username", playerName));
        String peephole = "username посмотрел в глазок и увидел женскую фигуру в кровавой одежде.";
        textsList.add(peephole.replace("username", playerName));
        String stranger = "Как только username открыл заднию дверь, то сразу натолкнулся на человека в хим. зашите. Он начал кричать, чтобы username лег на пол.";
        textsList.add(stranger.replace("username", playerName));
        String theEnd = "username начал ложится на пол и сразу получил прикладом по голове. Очнулся он уже в карантиной зоне с татуеровкой на руке\"зараженный\".";
        textsList.add(theEnd.replace("username", playerName));
        String badChoose2 = "username попытался убежать, но тут же получил пулю в голову.";
        textsList.add(badChoose2.replace("username", playerName));

    }

    public void chooseButton() {
        chooseButton1.add("Смэрть.");
        chooseButton2.add("Смэрть.");
        chooseButton1.add("Посмотреть в глазок.");
        chooseButton2.add("Сразу открыть дверь.");
        chooseButton1.add("Уйти из дома через заднию дверь.");
        chooseButton2.add("Открыть дверь.");
        chooseButton1.add("Послушаться.");
        chooseButton2.add("Попытаться убежать.");
    }

    public static String getTextsList(int index) {
        return textsList.get(index);
    }
}
