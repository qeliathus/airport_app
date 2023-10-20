package by.it_academy.jd2.Mk_JD2_103_23.airport.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.AircraftDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api.IAircraftDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.data_source.EMFFactory;

public class AircraftDaoFactory {
    private static volatile IAircraftDao instance;

    private AircraftDaoFactory() {
    }

    public static IAircraftDao getInstance() {
        if(instance == null){
            synchronized (AircraftDaoFactory.class){
                if(instance == null){
                    instance = new AircraftDao(EMFFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
