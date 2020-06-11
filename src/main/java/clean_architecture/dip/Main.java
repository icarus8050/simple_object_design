package clean_architecture.dip;

import clean_architecture.dip.app.Application;
import clean_architecture.dip.app.ServiceFactory;
import clean_architecture.dip.concrete.ServiceFactoryImpl;

public class Main {

    private final static ServiceFactory serviceFactory = new ServiceFactoryImpl();

    public static void main(String[] args) {
        Application application = new Application(serviceFactory);
        application.exec();
    }
}
