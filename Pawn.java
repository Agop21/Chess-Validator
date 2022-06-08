package Chess;
import java.util.*;
public class Pawn  extends Piece{
    public Pawn(char X, int Y, char NewX, int NewY) {
        this.Current = X;
        this.New = NewX;
        this.cy = Y;
        this.fy = NewY;
        Move();
    }
    @Override
    protected void Move() {
        ValidateRow(Current, New);
        if(cy != 1 && cy != 8) {
            if(cy == 2 || cy == 7) {
                if(Math.abs(cy-fy) == 2 && cx == fx || Math.abs(cy-fy) == 1 && cx == fx)
                    System.out.println("Valid move!");
            }
            else if(cy > 2 || cy < 7) {
                if(Math.abs(cy-fy) == 1 && cx == fx)
                    System.out.println("Valid move!");
                else
                    System.out.println("Wrong move!");
            }
        }
        else
            System.out.println("Wrong move!");
        new Board();

    }
}
