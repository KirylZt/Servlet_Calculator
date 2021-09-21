package by.tms.servlets;

import by.tms.dao.UserDAO;
import by.tms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet",urlPatterns = "/reg")
public class RegistrationServlet extends HttpServlet {
    UserDAO userDAO = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/reg.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        User user = new User(0, name, email, password);
        if (UserDAO.getUsers().contains(user)){
            req.setAttribute("message", "User already exist");
        }else {
            userDAO.save(user);
            req.setAttribute("message", "Reg OK");
        }
        getServletContext().getRequestDispatcher("/reg.jsp").forward(req, resp);
    }

}
