package com.gerson.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistroUsuarioServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");

        // Simple validation
        if (nombre == null || nombre.trim().isEmpty() || correo == null || correo.trim().isEmpty()) {
            request.setAttribute("error", "Todos los campos son obligatorios.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
            dispatcher.forward(request, response);
            return;
        }

        request.setAttribute("nombre", nombre);
        request.setAttribute("correo", correo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
