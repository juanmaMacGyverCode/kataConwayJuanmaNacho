public class World {

    Cell cells[][] = new Cell[10][10];

    public World() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell(0);
            }
        }
    }

    public void addCell(Cell cell, int x, int y) {
        this.cells[x][y] = cell;
    }

    public boolean isEmpty() {
        int aliveCells = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                aliveCells += cells[i][j].getAlive();
            }
        }

        return aliveCells == 0;
    }

    public int countAliveCells() {
        int aliveCells = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                aliveCells += cells[i][j].getAlive();
            }
        }

        return aliveCells;
    }
}
