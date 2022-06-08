package Chess;
abstract class Piece {
    public int cx, cy, fx, fy;
    public char Current, New;
    abstract protected void Move();
    protected void ValidateRow(char Current1,char New1) {
        this.Current = Current1;
        this.New = New1;
        switch(Current) {
            case 'A' :
                cx = 1;
                break;
            case 'B' :
                cx = 2;
                break;
            case 'C' :
                cx = 3;
                break;
            case 'D' :
                cx = 4;
                break;
            case 'E' :
                cx = 5;
                break;
            case 'F' :
                cx = 6;
                break;
            case 'G' :
                cx = 7;
                break;
            case 'H' :
                cx = 8;
                break;
        }
        switch(New) {
            case 'A' :
                fx = 1;
                break;
            case 'B' :
                fx = 2;
                break;
            case 'C' :
                fx = 3;
                break;
            case 'D' :
                fx = 4;
                break;
            case 'E' :
                fx = 5;
                break;
            case 'F' :
                fx = 6;
                break;
            case 'G' :
                fx = 7;
                break;
            case 'H' :
                fx = 8;
                break;
        }
    }
}