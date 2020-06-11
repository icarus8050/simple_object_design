package clean_architecture.dip.app;

public class Application {
    private Service service;

    public Application(ServiceFactory serviceFactory) {
        this.service = serviceFactory.makeSvc();
    }

    public void exec() {
        service.doService();
    }
}
