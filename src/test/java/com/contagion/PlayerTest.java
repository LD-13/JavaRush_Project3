package com.contagion;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void newPlayerShouldHaveSetName() {
        Player player = new Player();
        player.setName("test");
        assertEquals("test", player.getName());
    }

    @Test
    void newPlayerShouldHaveUnnamedPlayerName() {
        Player player = new Player();
        player.setName("");
        assertEquals("Unnamed player", player.getName());
    }

    @Test
    void getName() {
        Player player = new Player();
        player.setName("Jack");
        assertEquals("Jack", player.getName());
    }

    @Test
    void setName() throws NoSuchFieldException, IllegalAccessException {
        Player player = new Player();
        player.setName("Jack");
        Field field = player.getClass().getDeclaredField("name");
        field.setAccessible(true);
        String name = (String) field.get(player);
        assertEquals(name, player.getName());
    }

    @Test
    void getId()  {
        Player player = new Player();
        assertEquals(2, player.getId());
    }
}