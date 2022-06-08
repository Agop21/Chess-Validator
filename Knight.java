package Chess;
import java.util.*;
public class Knight extends Piece{
    public Knight(char X, int Y, char NewX, int NewY) {
        this.Current = X;
        this.New = NewX;
        this.cy = Y;
        this.fy = NewY;
        Move();
    }
    @Override
    protected void Move() {
        ValidateRow(Current, New);
        if(Math.abs(fx - cx) == 2 && Math.abs(fy - cy) == 1){
            System.out.println("Valid move!");
        }

        if(Math.abs(fx - cx) == 1 && Math.abs(fy - cy) == 2){
            System.out.println("Valid move!");
        }
        else
            System.out.println("Wrong move!");
        new Board();

    }
}
