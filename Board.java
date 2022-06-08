package Chess;
import java.util.*;
public class Board {
    int cx, cy, fx, fy;
    char []rows = {'A','B','C','D','E','F','G','H'};
    char SetX,SetNewX, f, f2;
    Scanner a = new Scanner(System.in);
    Board(){
        System.out.println("Select figure: (King-K,Queen-Q, Bishop-B, Knight-H, Rook-R, Pawn-P)");
        f = a.next().charAt(0);
        switch(f) {
            case  'K', 'Q', 'B', 'H', 'R', 'P' :
                Start();
                break;
            default :
                System.out.println("Wrong symbol, try again!");
                new Board();
        }
    }
    public void Start() {
        System.out.println("Set initial position for row (A-H) use UPPERCASE:");
        SetX = a.next().charAt(0);
        try {
            for(int i=0; i<= rows.length; i++) {
                if(SetX == rows[i]) {
                    System.out.println("Set initial position for column (1-8):");
                    cy = a.nextInt();
                    while(cy > 8 || cy < 0) {
                        System.out.println("Error, try again!");
                        System.out.println("Set initial position for column (1-8):");
                        cy = a.nextInt();
                    }
                    New(f);
                }
            }
        }
        catch(Exception e) {
            System.out.println("Error, try again!");
            Start();
        }
    }
    public void New(char Piece) {
        System.out.println("Set new position for row (A-H) use UPPERCASE:");
        SetNewX = a.next().charAt(0);
        try {
            for(int i=0; i<= rows.length; i++) {
                if(SetNewX == rows[i]) {
                    System.out.println("Set new position for column(1-8):");
                    fy = a.nextInt();
                    while(fy > 8 || fy < 0) {
                        System.out.println("Error, try again!");
                        System.out.println("Set new position for column(1-8):");
                        fy = a.nextInt();
                    }
                    switch(f) {
                        case 'K' :
                            new King(SetX,cy,SetNewX, fy);
                            break;
                        case 'Q' :
                            new Queen(SetX,cy,SetNewX, fy);
                            break;
                        case 'B' :
                            new Bishop(SetX,cy,SetNewX, fy);
                            break;
                        case 'H' :
                            new Knight(SetX,cy,SetNewX, fy);
                            break;
                        case 'R' :
                            new Rook(SetX,cy,SetNewX, fy);
                            break;
                        case 'P' :
                            new Pawn(SetX,cy,SetNewX, fy);
                            break;

                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println("Error, try again!");
            New(f);
        }
    }
}