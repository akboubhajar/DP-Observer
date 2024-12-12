package obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl obs) {
            System.out.println("************ Observer impl 1 ***********");
            System.out.println("New State = " + obs.getState());
            System.out.println("************ Observer impl 1 ***********");
        }
    }
}

