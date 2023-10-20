package by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.entity.AirportEntity;

import java.util.List;

public interface IAirportDao {
    List<AirportEntity> getAll();
}
