import java.util.List;

public interface IObservable {
    //Subscribe an Observer to an Observable
    void subscribe(List<IObserver> observer) throws Twitter.SubscriberAlreadyExistsException;

    //Unsubscribe an Observer from an Observable
    void unsubscribe(IObserver observer) throws Twitter.EmptyListOfSubscribersException, Twitter.SubscriberNotFoundException;

    //Notify all Observers about a post, an event and any kind of updates
    void notifyObservers() throws Twitter.EmptyListOfSubscribersException;
}
