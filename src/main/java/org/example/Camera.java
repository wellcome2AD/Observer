package org.example;
import java.util.ArrayList;
import java.util.List;

public class Camera extends Subject {
    private boolean[][] _matrix;
    public Camera()
    {
        _matrix = new boolean[10][10];
    }
    public void SetImage(boolean[][] matrix)
    {
        List<Point> changes = new ArrayList<>();
        for(int i = 0; i < matrix.length; ++i)
        {
            for(int j = 0; j < matrix[i].length; ++j)
            {
                if(matrix[i][j] == true && _matrix[i][j] == false)
                {
                    changes.add(new Point(i, j));
                }
                _matrix[i][j] = matrix[i][j];
            }
        }
        if(!changes.isEmpty())
        {
            Point[] p_changes = new Point[changes.size()];
            Notify(new ChangeOfMatrixEvent(changes.toArray(p_changes)));
        }
    }
}
