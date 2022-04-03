public class MyArrayDataException extends RuntimeException {
int row;
int column;
public MyArrayDataException(int row, int column){
    super("Некорректные данные в " + " [" + row + ";" + column + "]");
    this.row = row;
    this.column = column;
}
}
