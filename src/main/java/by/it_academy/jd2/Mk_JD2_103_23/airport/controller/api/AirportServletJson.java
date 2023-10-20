package by.it_academy.jd2.Mk_JD2_103_23.airport.controller.api;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.api.IAirportService;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.factory.AirportServiceFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/api/airport")
public class AirportServletJson extends HttpServlet {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final IAirportService service;

    public AirportServletJson() {
        this.service = AirportServiceFactory.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Airport> data = this.service.getAll();
        objectMapper.writeValue(resp.getWriter(), data);
    }
}
