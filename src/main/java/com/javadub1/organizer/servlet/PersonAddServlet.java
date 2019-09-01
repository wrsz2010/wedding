package com.javadub1.organizer.servlet;

import com.javadub1.organizer.model.Person;
import com.javadub1.organizer.service.PersonService;
import com.javadub1.organizer.service.PersonService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/persons/add")
public class PersonAddServlet extends HttpServlet {

    private PersonService personService = new PersonService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/person-addForm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String firstNameString = req.getParameter("firstNameParam");
        String lastNameString = req.getParameter("lastNameParam");
        String ageString = req.getParameter("ageParam");
        String phoneString = req.getParameter("phoneParam");

        int age = Integer.parseInt(ageString);

        Person person = new Person();

        person.setFirstName(firstNameString);
        person.setLastName(lastNameString);
        person.setAge(age);
        person.setPhoneNumber(phoneString);

        personService.add(person);

        resp.sendRedirect("/persons");
    }
}
