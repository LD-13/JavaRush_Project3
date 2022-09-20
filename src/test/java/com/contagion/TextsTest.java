package com.contagion;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TextsTest {

    @Test
    void getIntroduction() throws  URISyntaxException {
        Texts texts = new Texts("Vo");
        String introduction = "username лежал на втором этаже недавно купленной даче. Он представлял как завтра к нему приедут его друзья на шашлыки.\n" +
                "Мясо было замаренованно и водка лежала в морозильнике. Да, завтра будет определенно прекрасный день.\n" +
                "    username знал, что рядом есть биолаборатория. Но сильно низная цена дачи смогла его убедить, что о лаборатории думать не стоит.";
        assertEquals("Vo лежал на втором этаже недавно купленной даче. Он представлял как завтра к нему приедут его друзья на шашлыки.\n" +
                "Мясо было замаренованно и водка лежала в морозильнике. Да, завтра будет определенно прекрасный день.\n" +
                "    Vo знал, что рядом есть биолаборатория. Но сильно низная цена дачи смогла его убедить, что о лаборатории думать не стоит.", texts.getIntroduction());
    }

    @Test
    void chooseButton() {
        Texts texts = new Texts("Vo");
        List<String> chooseButton1 = new LinkedList<>();
        List<String> chooseButton2 = new LinkedList<>();
        chooseButton1.add("Смэрть.");
        chooseButton2.add("Смэрть.");
        assertEquals("Смэрть.", chooseButton1.get(0));
        assertEquals("Смэрть.", chooseButton2.get(0));
    }

    @Test()
    void getTextsList() {
        Texts texts = new Texts("Vo");
        assertEquals("Vo открыл дверь и на него тут же навалилось окровавленное тело которое сразу прокусило Vo горло.", Texts.getTextsList(0));
    }
}