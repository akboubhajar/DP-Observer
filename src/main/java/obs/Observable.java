package obs;

import java.util.ArrayList;
import java.util.List;

public interface Observable{

    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers();
}