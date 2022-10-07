package com.contagion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@WebServlet("/game_logic")
public class GameLogic extends HttpServlet {
    private int index;

    private Texts texts;
    private List<String> csrImg = new LinkedList<>();
    private List<String> chooseButton1 = Texts.chooseButton1;
    private List<String> chooseButton2 = Texts.chooseButton2;

    public GameLogic() {
        csrImg.add("images/dead.jpg");
        csrImg.add("images/lock_door.jpg");
        csrImg.add("images/peephole.jpg");
        csrImg.add("images/stranger.jpg");
        csrImg.add("images/quarantine.jpg");
    }

    public String getCsrImg(int index) {
        return csrImg.get(index);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession currentSession = req.getSession();
        index = Integer.parseInt(req.getParameter("number"));
        chooseStory(req);

        if (index == 0) {
            currentSession.setAttribute("isDead", true);
        }

        if (index == -1) {
            currentSession.setAttribute("isDead", true);
            req.setAttribute("story", Texts.getTextsList(5));
            index = 0;
        } else {
            req.setAttribute("story", Texts.getTextsList(index));
        }

        req.setAttribute("imgUrl", getCsrImg(index));

        if (index == csrImg.size() - 1) {
            currentSession.setAttribute("isSurvive", true);
        } else {
            req.setAttribute("btn1", chooseButton1.get(index));
            req.setAttribute("btn2", chooseButton2.get(index));
            req.setAttribute("nxt", index + 1);
        }
        getServletContext().getRequestDispatcher("/game.jsp").forward(req, resp);
    }

    protected void chooseStory(HttpServletRequest req) {
        index = Integer.parseInt(req.getParameter("number"));
        if (index < 3) {
            req.setAttribute("end", 0);
        } else {
            req.setAttribute("end", -1);
        }
    }
}
