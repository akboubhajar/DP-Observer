package obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newState){
        System.out.println("************ Observer impl 1 ***********");
        System.out.println("New State = "+newState);
        System.out.println("************ Observer impl 1 ***********");
    }
}
