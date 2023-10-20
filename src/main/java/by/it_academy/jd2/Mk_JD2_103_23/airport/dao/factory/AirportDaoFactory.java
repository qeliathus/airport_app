package by.it_academy.jd2.Mk_JD2_103_23.airport.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.AirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api.IAirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.data_source.EMFFactory;

public class AirportDaoFactory {
    private static volatile IAirportDao instance;

    private AirportDaoFactory() {
    }

    public static IAirportDao getInstance() {
        if(instance == null){
            synchronized (AirportDaoFactory.class){
                if(instance == null){
                    instance = new AirportDao(EMFFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
