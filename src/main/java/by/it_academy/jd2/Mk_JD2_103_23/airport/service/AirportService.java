package by.it_academy.jd2.Mk_JD2_103_23.airport.service;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Aircraft;
import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api.IAirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.api.IAirportService;

import java.util.List;
import java.util.stream.Collectors;

public class AirportService implements IAirportService {
    private final IAirportDao dao;

    public AirportService(IAirportDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Airport> getAll() {
        return this.dao.getAll().stream()
                .map(airportEntity -> new Airport(airportEntity.getAirportCode(), airportEntity.getAirportName(),
                        airportEntity.getCity(), airportEntity.getCoordinates(), airportEntity.getTimezone()))
                .collect(Collectors.toList());
    }
}
