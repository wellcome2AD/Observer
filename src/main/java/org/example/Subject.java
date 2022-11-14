package org.example;
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> _list_of_observers;
    public Subject()
    {
        _list_of_observers = new ArrayList<>();
    }

    public void Attach(Observer ob)
    {
        _list_of_observers.add(ob);
    }
    public void Detach(Observer ob)
    {
        _list_of_observers.remove(ob);
    }
    public void Notify(Event e)
    {
        for ( var el : _list_of_observers)
        {
            el.Update(e);
        }
    }
}
