package by.it_academy.jd2.Mk_JD2_103_23.airport.service;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.FlightFilter;
import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Pageable;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api.IFlightDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.api.IFlightService;

import java.time.LocalDate;
import java.util.List;

public class FlightService implements IFlightService {
    private final IFlightDao dao;

    public FlightService(IFlightDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Flight> getAll() {
        return this.dao.getAll();
    }

    @Override
    public List<Flight> getPage(Pageable pageable) {
        return this.dao.getPage(pageable);
    }

    @Override
    public List<Flight> getPage(FlightFilter filter, Pageable pageable) {

        return this.dao.getPage(filter, pageable);
    }
}
