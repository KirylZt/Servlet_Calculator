package by.tms.servlets;

import by.tms.controllers.CalculationControllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        int oType = Integer.parseInt(req.getParameter("operation"));
        List<Double> values = new ArrayList<>();
        values.add(num1);
        values.add(num2);
        double result = CalculationControllers.calculate(values,oType);
        req.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);

    }
}
