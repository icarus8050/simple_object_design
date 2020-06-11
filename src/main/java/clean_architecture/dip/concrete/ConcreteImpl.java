package clean_architecture.dip.concrete;

import clean_architecture.dip.app.Service;

public class ConcreteImpl implements Service {
    @Override
    public void doService() {
        System.out.println("Do something...");
    }
}
