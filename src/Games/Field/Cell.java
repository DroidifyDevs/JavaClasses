package Games.Field;

/**
 * клетка игрового поля
 */
public class Cell<T> {
    /**
     * horizontal line
     */
    public int row;
    /**
     * vertical line
     */
    public int column;
    /**
     * cell type
     */
    public CellTypes type;
    /**
     * value
     */
    public T value;

    public Cell(){
        this.row = -1;
        this.column = -1;
        this.type = CellTypes.empty;
    }

    public Cell(int _row, int _column, CellTypes _type, T _value) {
        this.row = _row;
        this.column = _column;
        this.type = _type;
        this.value = _value;
    }

    public String toStirng() {
        return this.value.toString();
    }
}
