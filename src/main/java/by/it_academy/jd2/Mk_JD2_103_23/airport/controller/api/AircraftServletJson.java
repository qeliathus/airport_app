package by.it_academy.jd2.Mk_JD2_103_23.airport.controller.api;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Aircraft;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.api.IAircraftService;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.factory.AircraftServiceFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/api/aircraft")
public class AircraftServletJson extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    private final IAircraftService service;

    public AircraftServletJson() {
        this.service = AircraftServiceFactory.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Aircraft> data = this.service.getAll();
        objectMapper.writeValue(resp.getWriter(), data);
    }
}
