package Chess;
import java.util.*;
public class Queen  extends Piece{
    public Queen(char X, int Y, char NewX, int NewY) {
        this.Current = X;
        this.New = NewX;
        this.cy = Y;
        this.fy = NewY;
        Move();
    }
    @Override
    protected void Move() {
        ValidateRow(Current, New);
        if(Math.abs(fx - cx) == Math.abs(cy - fy))
            new Bishop(Current, cy, New, fy);
        if(cx == fx && cy != fy)
            new Rook(Current, cy, New, fy);
        if(cx != fx && cy == fy)
            new Rook(Current, cy, New, fy);
        else
            System.out.println("Wrong move!");
        new Board();

    }
}
