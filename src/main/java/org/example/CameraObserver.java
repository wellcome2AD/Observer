package org.example;

public class CameraObserver implements Observer {
    public CameraObserver() {}
    public void Enable(Subject s)
    {
        s.Attach(this);
    }
    public void Disable(Subject s)
    {
        s.Detach(this);
    }
    @Override
    public void Update(Event e) {
        System.out.println("Движение в кадрах ");
        Point[] changes = (Point[])e.GetData();
        for(int i = 0; i < changes.length; ++i)
        {
            if(i!= 0 && changes[i].x > changes[i-1].x)
            {
                System.out.println();
            }
            System.out.printf("(%d, %d) ", changes[i].x, changes[i].y);
        }
        System.out.println();
    }
}
