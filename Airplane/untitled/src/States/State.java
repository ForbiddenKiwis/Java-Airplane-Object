package States;
import AirplaneBuilder.*;
public interface State {
    void start(Airplane airplane);
    void stop(Airplane airplane);
}
