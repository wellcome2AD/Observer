package org.example;

public class ChangeOfMatrixEvent implements Event {
    private event_type _type;
    private Point[] _changes;
    public ChangeOfMatrixEvent(Point[] changes)
    {
        _type = event_type.ChangeOfMatrix;
        _changes = changes.clone();
    }
    @Override
    public event_type GetEventType()
    {
        return _type;
    }
    @Override
    public Object GetData()
    {
        return _changes;
    }
}
