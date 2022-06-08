package Chess;
import java.util.*;
public class Bishop extends Piece{
    public Bishop(char X, int Y, char NewX, int NewY) {
        this.Current = X;
        this.New = NewX;
        this.cy = Y;
        this.fy = NewY;
        Move();
    }
    @Override
    protected void Move() {
        ValidateRow(Current, New);
        if(Math.abs(fx - cx) == Math.abs(cy - fy)){
            System.out.println("Valid move!");
        }
        else
            System.out.println("Wrong move!");
        new Board();
    }
}