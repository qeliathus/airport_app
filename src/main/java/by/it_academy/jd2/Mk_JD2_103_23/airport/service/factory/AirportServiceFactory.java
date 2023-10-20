package by.it_academy.jd2.Mk_JD2_103_23.airport.service.factory;

import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.factory.AirportDaoFactory;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.AirportService;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.api.IAirportService;

public class AirportServiceFactory {
    private static volatile IAirportService instance;

    private AirportServiceFactory() {
    }

    public static IAirportService getInstance() {
        if(instance == null){
            synchronized (AirportServiceFactory.class){
                if(instance == null){
                    instance = new AirportService(AirportDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
