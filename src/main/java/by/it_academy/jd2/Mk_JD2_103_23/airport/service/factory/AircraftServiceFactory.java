package by.it_academy.jd2.Mk_JD2_103_23.airport.service.factory;

import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.factory.AircraftDaoFactory;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.AircraftService;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.api.IAircraftService;

public class AircraftServiceFactory {
    private static volatile IAircraftService instance;

    private AircraftServiceFactory() {
    }

    public static IAircraftService getInstance() {
        if(instance == null){
            synchronized (AircraftServiceFactory.class){
                if(instance == null){
                    instance = new AircraftService(AircraftDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
