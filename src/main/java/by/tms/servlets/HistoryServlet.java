package by.tms.servlets;

import by.tms.dao.CalculationDAO;
import by.tms.dao.UserDAO;
import by.tms.entity.Operation;
import by.tms.entity.OperationEntry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/history")
public class HistoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/history.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<OperationEntry> operations = CalculationDAO.getOperationByUser(UserDAO.getCurrentUser());
        req.setAttribute("operations", operations);
        getServletContext().getRequestDispatcher("/history.jsp").forward(req, resp);
    }
}
