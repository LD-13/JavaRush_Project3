package com.contagion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/start")
public class InitServlet extends HttpServlet {
    Player player;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession currentSession = req.getSession(true);
        player = new Player();
        player.setName(req.getParameter("name"));
        Texts texts = new Texts(player.getName());
        currentSession.setAttribute("texts", texts);
        getServletContext().getRequestDispatcher("/introduction.jsp").forward(req, resp);
    }
}
