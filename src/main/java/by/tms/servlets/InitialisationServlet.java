package by.tms.servlets;

import by.tms.dao.UserDAO;
import by.tms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InitialisationServlet",urlPatterns = "/auth")
public class InitialisationServlet extends HttpServlet {
    UserDAO userDAO = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/auth.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User byEmail = userDAO.getByEmail(email);
        UserDAO.setCurrentUser(byEmail);
        if (byEmail != null){
            if (byEmail.getPassword().equals(password)){
                req.getSession().setAttribute("user", byEmail);
                req.setAttribute("message", "Ok");
            } else {
                req.setAttribute("message", "Wrong password!");
            }
        } else {
            req.setAttribute("message", "User not found!");
        }
        getServletContext().getRequestDispatcher("/auth.jsp").forward(req, resp);
    }
}
