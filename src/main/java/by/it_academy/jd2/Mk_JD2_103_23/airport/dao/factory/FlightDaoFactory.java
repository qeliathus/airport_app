package by.it_academy.jd2.Mk_JD2_103_23.airport.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.FlightDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api.IFlightDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.data_source.DBDataSource;

public class FlightDaoFactory {
    private static volatile IFlightDao instance;

    private FlightDaoFactory() {
    }

    public static IFlightDao getInstance() {
        if(instance == null){
            synchronized (FlightDaoFactory.class){
                if(instance == null){
                    instance = new FlightDao(DBDataSource.getInstance());
                }
            }
        }
        return instance;
    }
}
