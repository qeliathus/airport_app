package by.it_academy.jd2.Mk_JD2_103_23.airport.service.factory;

import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.factory.FlightDaoFactory;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.FlightService;
import by.it_academy.jd2.Mk_JD2_103_23.airport.service.api.IFlightService;

public class FlightServiceFactory {
    private static volatile IFlightService instance;

    private FlightServiceFactory() {
    }

    public static IFlightService getInstance() {
        if(instance == null){
            synchronized (FlightServiceFactory.class){
                if(instance == null){
                    instance = new FlightService(FlightDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
