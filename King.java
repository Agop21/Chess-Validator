package Chess;
import java.util.*;
public class King  extends Piece{
    public King(char X, int Y, char NewX, int NewY) {
        this.Current = X;
        this.New = NewX;
        this.cy = Y;
        this.fy = NewY;
        Move();
    }
    @Override
    protected void Move() {
        ValidateRow(Current, New);
        if(Math.abs(fx - cx) == 1 && Math.abs(fy - cy) == 1 || fx == cx && Math.abs(fy - cy) == 1 || fy == cy && Math.abs(fx - cx) == 1) {
            System.out.println("Valid move!");
        }
        else
            System.out.println("Wrong move!");
        new Board();
    }
}
