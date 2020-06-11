package clean_architecture.dip.concrete;

import clean_architecture.dip.app.Service;
import clean_architecture.dip.app.ServiceFactory;

public class ServiceFactoryImpl implements ServiceFactory {
    @Override
    public Service makeSvc() {
        return new ConcreteImpl();
    }
}
