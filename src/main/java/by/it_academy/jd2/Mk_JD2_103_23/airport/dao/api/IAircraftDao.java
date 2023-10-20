package by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api;

import by.it_academy.jd2.Mk_JD2_103_23.airport.core.dto.Aircraft;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.entity.AircraftEntity;

import java.util.List;

public interface IAircraftDao {
    List<AircraftEntity> getAll();
}
