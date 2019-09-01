package com.javadub1.organizer.servlet;

import com.javadub1.organizer.model.Person;
import com.javadub1.organizer.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/persons")
public class PersonListServlet extends HttpServlet {

    private final PersonService personService;

    public PersonListServlet() {
        this.personService = new PersonService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Person> personList = personService.getAllPersons();

        req.setAttribute("personListAttribute", personList);

        req.getRequestDispatcher("/person-list.jsp").forward(req, resp);
    }

}