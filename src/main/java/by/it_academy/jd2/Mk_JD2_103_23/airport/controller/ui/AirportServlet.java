package by.it_academy.jd2.Mk_JD2_103_23.airport.controller.ui;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.api.IAirportService;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.factory.AirportServiceFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/airports")
public class AirportServlet extends HttpServlet {

    private final IAirportService service;

    public AirportServlet() {
        this.service = AirportServiceFactory.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Airport> data = this.service.getAll();
        req.setAttribute("data", data);
        req.getRequestDispatcher("/view/airports.jsp").forward(req, resp);
    }
}
