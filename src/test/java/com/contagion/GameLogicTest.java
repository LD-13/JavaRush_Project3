package com.contagion;

import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class GameLogicTest {

    @Test
    void getCsrImgTest() {
        GameLogic gameLogicTest = new GameLogic();
        assertEquals("images/dead.jpg", gameLogicTest.getCsrImg(0));
    }

    @Test
    void IndexLessThenThreeTest() {
        GameLogic gameLogicTest = new GameLogic();
        HttpServletRequest req = mock(HttpServletRequest.class);
        when(req.getParameter("number")).thenReturn("0");
        gameLogicTest.chooseStory(req);
        verify(req).setAttribute("end", 0);
    }

    @Test
    void IndexThreeTest() {
        GameLogic gameLogicTest = new GameLogic();
        HttpServletRequest req = mock(HttpServletRequest.class);
        when(req.getParameter("number")).thenReturn("3");
        gameLogicTest.chooseStory(req);
        verify(req).setAttribute("end", -1);
    }
}