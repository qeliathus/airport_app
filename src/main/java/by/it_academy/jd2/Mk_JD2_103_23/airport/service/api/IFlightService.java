package by.it_academy.jd2.Mk_JD2_103_23.airport.service.api;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.FlightFilter;
import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface IFlightService {
    List<Flight> getAll();

    List<Flight> getPage(Pageable pageable);

    List<Flight> getPage(FlightFilter filter, Pageable pageable);
}
