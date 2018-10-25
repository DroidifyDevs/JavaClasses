package Games.Field;

public class Matrix<T> {
    //td array
    private Cell[][] cells;
    //row,cols
    private int rows;
    private int columns;

    //functions
    Matrix() {
        this.cells = new Cell[0][0];
        this.rows = 0;
        this.columns = 0;
    }

    Matrix(Cell[][] _cells) {
        this.cells = _cells;
        this.rows = _cells.length;
        this.columns = _cells[0].length;
    }

    public Matrix(int _row, int _columns) {
        this.cells = new Cell[_row][_columns];
        this.rows = _row;
        this.columns = _columns;
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < columns; j++) {
                this.cells[i][j] = new Cell(i, j, CellTypes.empty, null);
            }
    }
    //Check
    //Get
    //Set
}
