package com.javadub1.organizer.servlet;

import com.javadub1.organizer.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/persons/remove")
public class PersonDeleteServlet extends HttpServlet {

    private PersonService personService = new PersonService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderIdString = req.getParameter(("orderId"));
        Long orderId = Long.parseLong(orderIdString);



        personService.delete(orderId);

        String referer = req.getHeader("referer");
        resp.sendRedirect(referer);
    }
}
