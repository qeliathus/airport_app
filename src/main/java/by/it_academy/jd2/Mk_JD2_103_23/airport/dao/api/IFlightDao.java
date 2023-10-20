package by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.FlightFilter;
import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Pageable;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface IFlightDao {
    List<Flight> getAll();

    List<Flight> getPage(Pageable pageable);

    List<Flight> getPage(FlightFilter filter, Pageable pageable);
}
